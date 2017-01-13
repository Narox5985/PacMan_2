import java.util.Random;

import static sun.swing.MenuItemLayoutHelper.max;

/**
 * Created by rivie_000 on 07/01/2017.
 */
public class Fantome {
    private static int[][] caractF;

    public static int[][] initialisationF() {
        caractF = new int[6][4];
        //caractF[0][0] = 1;
        for (int i = 0; i < 4; i++) {
            caractF[0][i] = 0;
        }
        caractF[2][0] = 11;
        caractF[4][0] = 11;
        for(int k =2; k<=4; k = k +2) {
            for (int i = 1; i < 4; i++) {
                caractF[k][i] = 14;
            }
        }
        for(int k =3; k<=5; k = k +2) {
            caractF[k][0] = 14;
            caractF[k][1] = 13;
            caractF[k][2] = 12;
            caractF[k][3] = 15;
        }
        return caractF;
    }


    // public static void setPosfr(int[] nposfr) {
    //     Fantome.nposfr = nposfr;
    // }
    //  public static int [] getPosfr (){
    //    return nposfr;
    //}

    // public static void setAncienneDir(char ancienneDir){
    //     Fantome.ancienneDir = ancienneDir;
    // }

    //static Random random = new Random(System.currentTimeMillis());
    private static Random random = new Random();
    // private static char dir;
    //private static char ancienneDir;

    // Direction :
    // z = 0
    // s = 1
    // q = 2
    // d = 3

    public static int directionFantome(){
        int dir = random.nextInt(4);
        return dir;
    }


    public static void TestDeplacementF(boolean labybool[][], int fant, int directionFantome) {
        caractF[1][fant] = directionFantome;

        int x = caractF[2][fant];
        int y = caractF[3][fant];

        boolean res = false;
        if (caractF[1][fant] == 0 && caractF[0][fant] != 1) {
            if (labybool[x - 1][y]) {
                res = true;
            }
            if (!labybool[x - 1][y]) {
                res = false;
            }
            if(caractF[2][fant]==13 && caractF[3][fant]==13) {
                res = true;
            }
            if(caractF[2][fant]==13 && caractF[3][fant]==14) {
                res = true;
            }

        }
        if (caractF[1][fant] == 1 && caractF[0][fant] != 0) {
            if (labybool[x + 1][y]) {
                res = true;
            }
            if (!labybool[x + 1][y]) {
                res = false;
            }
        }
        if (caractF[1][fant] == 2 && caractF[0][fant] != 3 ) {
            if (labybool[x][y - 1]) {
                res = true;
            }
            if (!labybool[x][y - 1]) {
                res = false;
            }
            if( x == 15 && y == 0){
                res = true;
            }
        }
        if (caractF[1][fant] == 3 && caractF[0][fant] != 2 ) {
            if (labybool[x][y + 1]) {
                res = true;
            }
            if (!labybool[x][y + 1]) {
                res = false;
            }
            if( x == 15 && y == 27){
                res = true;
            }
        }

        if (res == false){
            TestDeplacementF(Laby.getLabybool(), fant, directionFantome());
        }
    }

    public static void DeplacementF(int fant, int dir) {

        caractF[4][fant] = caractF[2][fant];
        caractF[5][fant] = caractF[3][fant];

        TestDeplacementF(Laby.getLabybool(),fant, dir);
        char [][] laby = Laby.getLaby();
        //ancienneDir = dir;
        caractF[0][fant] = caractF[1][fant];

        //0eme ligne = ancienne direction
        //1ere ligne = direction
        //2eme ligne = y
        //3eme ligne = x
        //4eme ligne = ancien y
        //5eme ligne = ancien x

        //0 = R
        //1 = B
        //2 = Bl
        //3 = V

        if (caractF[1][fant] == 0) {

            caractF[2][fant] =  caractF[2][fant] - 1;
        }
        if (caractF[1][fant] == 1 ) {

            caractF[2][fant] = caractF[2][fant] + 1;
        }
        if (caractF[1][fant] == 2 ) {

            caractF[3][fant] = caractF[3][fant] - 1;
        }
        if (caractF[1][fant] == 3 ) {

            caractF[3][fant] = caractF[3][fant] + 1;
        }

        if(caractF[1][fant] == 2 && caractF[2][fant]==14 && caractF[3][fant] == 0 ){
            caractF[3][fant] = 27;
        }
        if(caractF[1][fant] == 3 && caractF[2][fant]==14 && caractF[3][fant] == 27 ){
            caractF[3][fant] = 0;
        }

    }


    public static void deplacementDesFantomes(int numFantDeb, int numFantFin) {
        for (int k = numFantDeb; k <= numFantFin; k++){

            int dir = directionFantome();
            DeplacementF(k, dir);
        }

    }


    public static int [][] getCaractF(){
        return caractF;
    }



}
