import java.util.Random;


/**
 * Created by benoit on 06/01/2017.
 */
public class Fantome {

    private static int [] nposfr;
    private static int aposfr;

    private static int [] nposfb;
    private static int aposfb;

    private static int [] nposfv;
    private static int aposfv;

    public static boolean [] TestdeplacementFantR(boolean labybool[][]){

        int x = nposfr[0];
        int y = nposfr[1];


        boolean [] testfr = new boolean [4];




        if (labybool[x - 1][y]){
            testfr[0]= true;
        }
        if (!labybool[x - 1][y]){
            testfr[0] = false;
        }

        if (labybool[x + 1][y]){
            testfr[1]= true;
        }
        if (!labybool[x + 1][y]){
            testfr[1] = false;
        }

        if (labybool[x][y - 1]){
            testfr[2]= true;
        }
        if (!labybool[x][y - 1]){
            testfr[2] = false;
        }

        if (labybool[x][y + 1]){
            testfr[3]= true;
        }
        if (!labybool[x][y + 1]){
            testfr[3] = false;
        }

        if (aposfr == 0){
            testfr[0] = false;
        }

        if(aposfr == 1){
            testfr[1] = false;
        }

        if(aposfr == 2){
            testfr[3] = false;
        }

        if(aposfr == 3){
            testfr[2] = false;
        }

        for(int k=0; k<4; k++){
            if (k != 3){
                System.out.print( testfr[k] + "\t");
            }
            else
                System.out.println( testfr [k]);
        }

        return(testfr);

    }

    public static boolean [] TestdeplacementFantB(boolean labybool[][]){

        int x = nposfb[0];
        int y = nposfb[1];


        boolean [] testfb = new boolean [4];




        if (labybool[x - 1][y]){
            testfb[0]= true;
        }
        if (!labybool[x - 1][y]){
            testfb[0] = false;
        }

        if (labybool[x + 1][y]){
            testfb[1]= true;
        }
        if (!labybool[x + 1][y]){
            testfb[1] = false;
        }

        if (labybool[x][y - 1]){
            testfb[2]= true;
        }
        if (!labybool[x][y - 1]){
            testfb[2] = false;
        }

        if (labybool[x][y + 1]){
            testfb[3]= true;
        }
        if (!labybool[x][y + 1]){
            testfb[3] = false;
        }

        if (aposfb == 0){
            testfb[0] = false;
        }

        if(aposfb == 1){
            testfb[1] = false;
        }

        if(aposfb == 2){
            testfb[3] = false;
        }

        if(aposfb == 3){
            testfb[2] = false;
        }

        for(int k=0; k<4; k++){
            if (k != 3){
                System.out.print( testfb[k] + "\t");
            }
            else
                System.out.println( testfb [k]);
        }

        return(testfb);

    }

    public static boolean [] TestdeplacementFantV(boolean labybool[][]){

        int x = nposfv[0];
        int y = nposfv[1];


        boolean [] testfv = new boolean [4];




        if (labybool[x - 1][y]){
            testfv[0]= true;
        }
        if (!labybool[x - 1][y]){
            testfv[0] = false;
        }

        if (labybool[x + 1][y]){
            testfv[1]= true;
        }
        if (!labybool[x + 1][y]){
            testfv[1] = false;
        }

        if (labybool[x][y - 1]){
            testfv[2]= true;
        }
        if (!labybool[x][y - 1]){
            testfv[2] = false;
        }

        if (labybool[x][y + 1]){
            testfv[3]= true;
        }
        if (!labybool[x][y + 1]){
            testfv[3] = false;
        }

        if (aposfv == 0){
            testfv[0] = false;
        }

        if(aposfv == 1){
            testfv[1] = false;
        }

        if(aposfv == 2){
            testfv[3] = false;
        }

        if(aposfv == 3){
            testfv[2] = false;
        }

        for(int k=0; k<4; k++){
            if (k != 3){
                System.out.print( testfv[k] + "\t");
            }
            else
                System.out.println( testfv [k]);
        }

        return(testfv);

    }


    public static int [] DeplacementFantR(boolean [] testfr) throws InterruptedException{

        char depfant;
        char [][] laby = Laby.getLaby();
        boolean [][] labybool = Laby.GeneBool(laby);
        int [] npos = Pacman.Deplacement(Pacman.Testdeplacement(labybool));

        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(3 - 0 + 1) + 0;




        if (nombreAleatoire == 0){
            depfant = 'z';
            while(testfr[0]){
                aposfr = 0;
                nposfr[0] = nposfr[0]-1;
                System.out.println("x =   " + nposfr[0] + "   " + "y =   " + nposfr[1]);
                Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                testfr = TestdeplacementFantR(labybool);
            }
        }

        if (nombreAleatoire == 1){
            depfant = 's';
            while(testfr[1]){
                aposfr = 1;
                nposfr[0] = nposfr[0]+1;
                System.out.println("x =   " + nposfr[0] + "   " + "y =   " + nposfr[1]);
                Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                testfr = TestdeplacementFantR(labybool);
            }
        }

        if (nombreAleatoire == 2){
            depfant = 'q';
            while(testfr[2]){
                aposfr = 2;
                nposfr[1] = nposfr[1]-1;
                System.out.println("x =   " + nposfr[0] + "   " + "y =   " + nposfr[1]);
                Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                testfr = TestdeplacementFantR(labybool);
            }
        }

        if (nombreAleatoire == 3){
            depfant = 'd';
            while(testfr[3]){
                aposfr = 3;
                System.out.println( "=======" + testfr[3] + "========");
                nposfr[1] = nposfr[1]+1;
                System.out.println("x =   " + nposfr[0] + "   " + "y =   " + nposfr[1]);

                Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                testfr = TestdeplacementFantR(labybool);
            }
        }


        System.out.println("Pacman ne peut plus ou pas aller dans cette direction");

        DeplacementFantR(testfr);

        return (nposfr);
    }

    public static int [] DeplacementFantB(boolean [] testfb) throws InterruptedException{

        char depfant;
        char [][] laby = Laby.getLaby();
        boolean [][] labybool = Laby.GeneBool(laby);
        int [] npos = Pacman.Deplacement(Pacman.Testdeplacement(labybool));

        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(3 - 0 + 1) + 0;




        if (nombreAleatoire == 0){
            depfant = 'z';
            while(testfb[0]){
                aposfb = 0;
                nposfb[0] = nposfb[0]-1;
                System.out.println("x =   " + nposfb[0] + "   " + "y =   " + nposfb[1]);
                Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                testfb = TestdeplacementFantB(labybool);
            }
        }

        if (nombreAleatoire == 1){
            depfant = 's';
            while(testfb[1]){
                aposfb = 1;
                nposfb[0] = nposfr[0]+1;
                System.out.println("x =   " + nposfb[0] + "   " + "y =   " + nposfb[1]);
                Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                testfb = TestdeplacementFantB(labybool);
            }
        }

        if (nombreAleatoire == 2){
            depfant = 'q';
            while(testfb[2]){
                aposfb = 2;
                nposfb[1] = nposfb[1]-1;
                System.out.println("x =   " + nposfb[0] + "   " + "y =   " + nposfb[1]);
                Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                testfb = TestdeplacementFantB(labybool);
            }
        }

        if (nombreAleatoire == 3){
            depfant = 'd';
            while(testfb[3]){
                aposfb = 3;
                System.out.println( "=======" + testfb[3] + "========");
                nposfb[1] = nposfb[1]+1;
                System.out.println("x =   " + nposfb[0] + "   " + "y =   " + nposfb[1]);

                Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                testfb = TestdeplacementFantB(labybool);
            }
        }


        System.out.println("Pacman ne peut plus ou pas aller dans cette direction");

        DeplacementFantB(testfb);

        return (nposfb);
    }

    public static int [] DeplacementFantV(boolean [] testfv) throws InterruptedException{

        char depfant;
        char [][] laby = Laby.getLaby();
        boolean [][] labybool = Laby.GeneBool(laby);
        int [] npos = Pacman.Deplacement(Pacman.Testdeplacement(labybool));

        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(3 - 0 + 1) + 0;




        if (nombreAleatoire == 0){
            depfant = 'z';
            while(testfv[0]){
                aposfv = 0;
                nposfv[0] = nposfv[0]-1;
                System.out.println("x =   " + nposfv[0] + "   " + "y =   " + nposfv[1]);
                Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                testfv = TestdeplacementFantV(labybool);
            }
        }

        if (nombreAleatoire == 1){
            depfant = 's';
            while(testfv[1]){
                aposfv = 1;
                nposfv[0] = nposfv[0]+1;
                System.out.println("x =   " + nposfv[0] + "   " + "y =   " + nposfv[1]);
                Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                testfv = TestdeplacementFantR(labybool);
            }
        }

        if (nombreAleatoire == 2){
            depfant = 'q';
            while(testfv[2]){
                aposfv = 2;
                nposfv[1] = nposfv[1]-1;
                System.out.println("x =   " + nposfv[0] + "   " + "y =   " + nposfv[1]);
                Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                testfv = TestdeplacementFantR(labybool);
            }
        }

        if (nombreAleatoire == 3){
            depfant = 'd';
            while(testfv[3]){
                aposfv = 3;
                System.out.println( "=======" + testfv[3] + "========");
                nposfv[1] = nposfv[1]+1;
                System.out.println("x =   " + nposfv[0] + "   " + "y =   " + nposfv[1]);

                Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                testfv = TestdeplacementFantR(labybool);
            }
        }


        System.out.println("Pacman ne peut plus ou pas aller dans cette direction");

        DeplacementFantV(testfv);

        return (nposfv);
    }


    public static void setPosfr(int [] nposfr){
        Fantome.nposfr = nposfr;
    }

    public static int [] getPosfr(){
        return nposfr;
    }

    public static void setPosfb(int [] nposfb){
        Fantome.nposfb = nposfb;
    }

    public static int [] getPosfb(){
        return nposfb;
    }

    public static void setPosfv(int [] nposfv){
        Fantome.nposfv = nposfv;
    }

    public static int [] getPosfv(){
        return nposfv;
    }
}
