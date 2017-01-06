
import edu.princeton.cs.introcs.StdDraw;

public class Fenetre{

    static char [][] laby;

    public static void draw() {
        laby = Laby.getLaby();
        StdDraw.setPenColor(0,39,218);
        for (int k=0; k<32; k++){
            for (int j=0; j < 28; j++){
                if (laby[k][j] == '#'){
                    StdDraw.rectangle(j+0.5, -k-0.5,0.5,0.5);
                }
                if (laby[k][j] == 'D'){
                    StdDraw.picture(j+0.5, - k-0.5, "imagepacman.png", 1.7, 1.7);

                }
                if(laby[k][j] == 'P'){
                    StdDraw.picture(j + 0.5, - k-0.5, "pastille.png", 0.2, 0.2);
                }
            }
        }
        System.out.println("test");
        Laby.Afficher(laby);
        StdDraw.show(0);
    }

    public static void main(String[] args) throws InterruptedException {
        StdDraw.setCanvasSize(1200,1200);
        StdDraw.setXscale(0, 28);
        StdDraw.setYscale(-32, 0);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledRectangle(14,-16, 14,16);
        StdDraw.enableDoubleBuffering();

        int [] pos = {24,14};
        int [] posfr = {14,11};
        int [] posfb = {14, 13};
        int [] posfv = {14, 15};

        StdDraw.show(0);
        Pacman.setPos(pos);
        Laby.Afficher(Laby.Gene(pos, posfr, posfb, posfv));
        draw();

        char [][] laby = Laby.Gene(pos, posfr, posfb, posfv);
        boolean [][] labybool = Laby.GeneBool(laby);

        Pacman.Deplacement(Pacman.Testdeplacement(labybool));
        Pacman.Deplacement(Pacman.Testdeplacement(labybool));


        //Laby.Afficher(Laby.Gene(pos));
    }

}