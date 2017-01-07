import java.util.Random;


/**
 * Created by benoit on 06/01/2017.
 */
public class Fantome {

    private static int [] nposfr;
    private static int aposfr;


    public static boolean [] TestdeplacementFantR(boolean labybool[][]) {


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


    public static int [] DeplacementFantR(boolean [] testfr) {

        Random rand = new Random();
        int nombreAleatoire = rand.nextInt(3 - 0 + 1) + 0;
        boolean[][] labybool = Laby.GeneBool(Laby.Gene(Pacman.getPos(), Fantome.getPosfr()));



        if (nombreAleatoire == 0 && testfr[0]){
                aposfr = 0;
                nposfr[0] = nposfr[0]-1;
        }if (nombreAleatoire != 0 && !testfr[0]){
            DeplacementFantR(TestdeplacementFantR(labybool));
        }

        if (nombreAleatoire == 1 && testfr[1]){
                aposfr = 1;
                nposfr[0] = nposfr[0]+1;
        }if (nombreAleatoire != 1 && !testfr[1]){
            DeplacementFantR(TestdeplacementFantR(labybool));
        }

        if (nombreAleatoire == 2 && testfr[2]){
                aposfr = 2;
                nposfr[1] = nposfr[1]-1;
        }if (nombreAleatoire != 2 && !testfr[2]){
            DeplacementFantR(TestdeplacementFantR(labybool));
        }

        if (nombreAleatoire == 3 && testfr[3]){
                aposfr = 3;
                nposfr[1] = nposfr[1]+1;
        }if (nombreAleatoire != 3 && !testfr[3]){
            DeplacementFantR(TestdeplacementFantR(labybool));
        }

        return (nposfr);
    }



    public static void setPosfr(int [] nposfr){
        Fantome.nposfr = nposfr;
    }

    public static int [] getPosfr(){
        return nposfr;
    }



}
