
import edu.princeton.cs.introcs.StdDraw;

public class Fenetre{
    public static char val = 'q';
    static char [][] laby;

    public static void draw() {
        laby = Laby.getLaby();
        StdDraw.setPenColor(0,39,218);
        for (int k=0; k<32; k++) {
            for (int j = 0; j < 28; j++) {
                if (laby[k][j] == '#') {
                    StdDraw.rectangle(j + 0.5, -k - 0.5, 0.5, 0.5);
                }
                if (laby[k][j] == 'D') {
                    StdDraw.picture(j + 0.5, -k - 0.5, "imagepacman.png", 1.7, 1.7);

                }
                if (laby[k][j] == 'P') {
                    StdDraw.picture(j + 0.5, -k - 0.5, "pastille.png", 0.2, 0.2);
                }
                if (laby[k][j] == 'R') {
                    StdDraw.picture(j + 0.5, -k - 0.5, "fantomerouge.png", 0.8, 0.8);
                }
            }
        }
        //Laby.Afficher(laby);
        StdDraw.show(0);
    }
    private static char ancienneDir = 'z';

    public static void main(String[] args)  {
        int [] pos = {24,14};
        int [] posfr = {11,14};
        StdDraw.setCanvasSize(1200,1200);
        StdDraw.setXscale(0, 28);
        StdDraw.setYscale(-32, 0);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledRectangle(14,-16, 14,16);
        StdDraw.enableDoubleBuffering();


        //StdDraw.show(0);
        Pacman.setPos(pos);
        Fantome.setPosfr(posfr);
        Fantome.setAncienneDir(ancienneDir);
        Laby.Afficher(Laby.Gene(pos, posfr));
        draw();

        char [][] laby = Laby.Gene(pos, posfr);
        boolean [][] labybool = Laby.GeneBool(laby);

        Joueur.ini(val);
        while(true) {
            Joueur.cmdPacman();
            int [] npos = Pacman.Deplacement(Pacman.Testdeplacement(labybool));
            int []nposfr=Fantome.DeplacementFr();
            Laby.Gene(npos, nposfr);
            Fenetre.draw();
            StdDraw.show(200);
            StdDraw.pause(10);
            StdDraw.clear(StdDraw.BLACK);
        }

        //Laby.Afficher(Laby.Gene(pos));
    }

}