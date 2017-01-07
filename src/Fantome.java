import java.util.Random;

/**
 * Created by rivie_000 on 07/01/2017.
 */
public class Fantome {
    private static int[][] caractF;

    public static int[][] initialisationF() {
        caractF = new int[4][4];
        for (int i = 0; i < 4; i++) {
            caractF[0][i] = 0;
        }
        caractF[2][0] = 11;
        for (int i = 1; i < 4; i++) {
            caractF[2][i] = 15;
        }
        caractF[3][0] = 14;
        caractF[3][1] = 11;
        caractF[3][2] = 13;
        caractF[3][3] = 15;
        //fant => choix du fantome (entre 0 et 3)
        //ancienneDir = caractF[0][fant]
        // dir =caractF[1][fant]
        //position y = caractF[2][fant]
        //position x = caractF[3][fant]
        return caractF;
    }


    //static Random random = new Random(System.currentTimeMillis());
    private static Random random = new Random();

    // Direction :
    // z = 0
    // s = 1
    // q = 2
    // d = 3
    public static int directionFantome(){
        int dir = random.nextInt(4);
        return dir;
    }


    public static void TestDeplacementF(boolean labybool[][], int fant) {
        caractF[1][fant] = directionFantome();

        int x = caractF[2][fant];
        int y = caractF[3][fant];

        boolean res = false;
        if (caractF[1][fant] == 0 && caractF[0][fant] != 1 ) {
            if (labybool[x - 1][y]) {
                res = true;
            }
        }
        if (caractF[1][fant] == 1 && caractF[0][fant] != 0) {
            if (labybool[x + 1][y]) {
                res = true;
            }
        }
        if (caractF[1][fant] == 2 && caractF[0][fant] != 3 ) {
            if (labybool[x][y - 1]) {
                res = true;
            }
            if( x == 15 && y == 0){
                res = true;
            }
        }
        if (caractF[1][fant] == 3 && caractF[0][fant] != 2 ) {
            if (labybool[x][y + 1]) {
                res = true;
            }
            if( x == 15 && y == 27){
                res = true;
            }
        }

        if (res == false){
            directionFantome();
            TestDeplacementF(Laby.getLabybool(), fant);
        }
    }
    public static void DeplacementF(int fant) {
        TestDeplacementF(Laby.getLabybool(),fant);

        caractF[0][fant] = caractF[1][fant];

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
    public static void deplacementDesFantomes() {
        for (int k = 0; k < 4; k++){
            DeplacementF(k);
        }
    }
    public static int [][] getCaractF(){
        return caractF;
    }
}
