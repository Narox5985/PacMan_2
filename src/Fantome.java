import java.util.Random;

/**
 * Created by rivie_000 on 07/01/2017.
 */
public class Fantome {

    private static int[] nposfr;



    public static void setPosfr(int[] nposfr) {
        Fantome.nposfr = nposfr;
    }
    public static int [] getPosfr (){
        return nposfr;
    }

    public static void setAncienneDir(char ancienneDir){
        Fantome.ancienneDir = ancienneDir;
    }

    //static Random random = new Random(System.currentTimeMillis());
    public static Random random = new Random();
    private static char dir;
    private static char ancienneDir;

    public static void DirectionFantome(){
        int nombre = random.nextInt(4);
        if (nombre == 0){
            dir = 'z';
        }
        if (nombre == 1){
            dir = 's';
        }
        if (nombre == 2){
            dir = 'q';
        }
        if (nombre == 3){
            dir = 'd';
        }
    }

    public static void TestDeplacementFr(boolean labybool[][]) {
        DirectionFantome();
        int x = nposfr[0];
        int y = nposfr[1];

        boolean res = false;
        if (dir == 'z' && ancienneDir != 's') {
            if (labybool[x - 1][y]) {
                res = true;
            }
        }
        if (dir == 's'&& ancienneDir != 'z') {
            if (labybool[x + 1][y]) {
                res = true;
            }
        }
        if (dir == 'q'&& ancienneDir != 'd') {
            if (labybool[x][y - 1]) {
                res = true;
            }
            if( x == 15 && y == 0){
                res = true;
            }
        }
        if (dir == 'd'&& ancienneDir != 'q') {
            if (labybool[x][y + 1]) {
                res = true;
            }
            if( x == 15 && y == 27){
                res = true;
            }
        }

        if (res == false){
            DirectionFantome();
            TestDeplacementFr(Laby.getLabybool());
        }
    }
    public static int[] DeplacementFr() {
        TestDeplacementFr(Laby.getLabybool());
        ancienneDir = dir;

        if (dir == 'z') {
            nposfr[0] = nposfr[0] - 1;
        }
        if (dir == 's' ) {
            nposfr[0] = nposfr[0] + 1;
        }
        if (dir == 'q' ) {
            nposfr[1] = nposfr[1] - 1;
        }
        if (dir == 'd' ) {
            nposfr[1] = nposfr[1] + 1;
        }

        if(dir == 'q' && nposfr[0]==15 && nposfr[1] == 0 ){
            nposfr[1] = 27;
        }
        if(dir == 'd' && nposfr[0]==15 && nposfr[1] == 27 ){
            nposfr[1] = 0;
        }

        return (nposfr);
    }

}
