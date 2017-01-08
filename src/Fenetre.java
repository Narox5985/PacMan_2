
import edu.princeton.cs.introcs.StdDraw;

public class Fenetre{
    public static char val = 'q';
    static char [][] laby;

    public static void draw() {
        laby = Laby.getLaby();
        StdDraw.setPenColor(0,39,218);
        for (int k=0; k<31; k++) {
            for (int j = 0; j < 28; j++) {
                if (laby[k][j] == '#') {
                    StdDraw.rectangle(j + 0.5, -k - 0.5, 0.5, 0.5);
                }
                if (laby[k][j] == 'D') {
                    StdDraw.picture(j + 0.5, -k - 0.5, "imagepacman.png", 2, 2);

                }
                if (laby[k][j] == 'P') {
                    StdDraw.picture(j + 0.5, -k - 0.5, "pastille.png", 0.2, 0.2);
                }
                if (laby[k][j] == 'R') {
                    StdDraw.picture(j + 0.5, -k - 0.5, "fantomerouge.png", 1.1, 1.1);
                }
                if (laby[k][j] == 'F') {
                    StdDraw.picture(j + 0.5, -k - 0.5, "fantomebleu.png", 1.1, 1.1);
                }
                if (laby[k][j] == 'G') {
                    StdDraw.picture(j + 0.5, -k - 0.5, "fantomeblanc.png", 1, 1);
                }
                if (laby[k][j] == 'O') {
                    StdDraw.picture(j + 0.5, -k - 0.5, "fantomevert.jpg", 1.1, 1.1);
                }
                if (laby[k][j] == 'M') {
                    StdDraw.rectangle(j + 0.5, -k - 0.5, 0.3, 0.3);
                }
            }
        }
        //Laby.Afficher(laby);
        StdDraw.show(0);
    }
    //private static char ancienneDir = 'z';




    public static void main(String[] args)  {
        int [] pos = {23,14};
        //int [] posfr = {11,14};
        StdDraw.setCanvasSize(1200,1200);
        StdDraw.setXscale(0, 28);
        StdDraw.setYscale(-31, 0);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledRectangle(14,-16, 14,16);
        StdDraw.enableDoubleBuffering();


        //StdDraw.show(0);
        Pacman.setPos(pos);
        //Fantome.setPosfr(posfr);
        //Fantome.setAncienneDir(ancienneDir);
        int [][] caractF = Fantome.initialisationF();
        Laby.Afficher(Laby.Gene(pos, caractF,false));
        draw();
        StdDraw.show(200);
        StdDraw.pause(10);
        StdDraw.clear(StdDraw.BLACK);

        char [][] laby = Laby.Gene(pos, caractF,false);
        boolean [][] labybool = Laby.GeneBool(laby);

        Joueur.ini(val);

        for (int k=1; k<=3; k++) {
            int i=0;
            long t = System.currentTimeMillis();
            long end = t + 3000;
            while (System.currentTimeMillis() < end) {
                Joueur.cmdPacman();
                int[] npos = Pacman.Deplacement(Pacman.Testdeplacement(labybool));
                if(k!=1 && i!=0) {
                    Fantome.deplacementDesFantomes(0, k - 1);
                }
                if (k==1){
                    Fantome.DeplacementF(1,0);
                    Fantome.DeplacementF(0,3);

                }
                if (k==2 && i ==0){
                    Fantome.DeplacementF(2,3);
                    i=i+1;
                }
                if(k==2 && i !=0){
                    Fantome.DeplacementF(2,0);
                }
                if (k==3 && i ==0){
                    Fantome.DeplacementF(3,2);
                    i=i+1;
                }
                if(k==3 && i !=0){
                    Fantome.DeplacementF(3,0);
                }
                caractF = Fantome.getCaractF();
                Laby.Gene(npos, caractF,false);
                Fenetre.draw();
                StdDraw.show(200);
                StdDraw.pause(10);
                StdDraw.clear(StdDraw.BLACK);
            }
        }
        while(true){
            Joueur.cmdPacman();
            int[] npos = Pacman.Deplacement(Pacman.Testdeplacement(labybool));
            Fantome.deplacementDesFantomes(0,3);
            caractF = Fantome.getCaractF();
            Laby.Gene(npos, caractF, true);
            labybool = Laby.GeneBool(laby);
            Fenetre.draw();
            StdDraw.show(200);
            StdDraw.pause(10);
            StdDraw.clear(StdDraw.BLACK);
        }
    }

}
