/**
 * Created by rivie_000 on 07/01/2017.
 */
public class Pacman {

    private static char dep;
    private static int[] npos;
    private static  boolean res;
    private static char ancienDep;
    private static char dirpac;
    private static int[] anciennePos = new int[2];


    public static void setPos(int[] npos) {
        Pacman.npos = npos;
    }
    public static void setAncPos(int[] npos) {
        Pacman.anciennePos = npos;
    }

    public static boolean Testdeplacement(boolean labybool[][]) {
        dep = Joueur.getDep();
        int x = npos[0];
        int y = npos[1];
        res = false;
        if (dep == 'z') {
            if (labybool[x - 1][y]) {
                res = true;
            }
        }
        if (dep == 's') {
            if (labybool[x + 1][y]) {
                res = true;
            }
        }
        if (dep == 'q') {
            if (labybool[x][y - 1]) {
                res = true;
            }
            if( x == 14 && y == 0){
                res = true;
            }
        }
        if (dep == 'd') {
            if (labybool[x][y + 1]) {
                res = true;
            }
            if( x == 14 && y == 27){
                res = true;
            }
        }
        return res;
    }
    public static boolean getRes() {
        return res;
    }
    public static char getDirPac() {
        return dirpac;
    }

    public static int[] getAnciennePos() {
        return anciennePos;
    }
    public static int[] getNPos() {
        return npos;
    }
    private static boolean erreur;

    public static boolean getErreur(){
        return erreur;
    }

    public static int[] Deplacement(boolean test) {
        dirpac = 'r';
        anciennePos[0] = npos[0];
        anciennePos[1] = npos[1];
        ancienDep = Joueur.getAncienDep();

        if (dep == 'z' && test) {
            npos[0] = npos[0] - 1;
            dirpac = 'z';
        }
        if (dep == 's' && test) {
            npos[0] = npos[0] + 1;
            dirpac = 's';
        }
        if (dep == 'q' && test) {
            npos[1] = npos[1] - 1;
            dirpac = 'q';
        }
        if (dep == 'd' && test) {
            npos[1] = npos[1] + 1;
            dirpac = 'd';
        }

        if (dep == 'q' && npos[0] == 14 && npos[1] == 0 && test) {
            npos[1] = 27;
            dirpac = 'q';
        }
        if (dep == 'd' && npos[0] == 14 && npos[1] == 27 && test) {
            npos[1] = 0;
            dirpac = 'd';
        }
        erreur = false;

        if (!test && ancienDep != dep) {

            if (ancienDep == 'z') {
                npos[0] = npos[0] - 1;
                dirpac = 'z';
            }
            if (ancienDep == 's') {
                npos[0] = npos[0] + 1;
                dirpac = 's';
            }
            if (ancienDep == 'q') {
                if (npos[1] == 0) {
                    npos[1] = 27;
                } else {
                    npos[1] = npos[1] - 1;
                }
                dirpac = 'q';
            }
            if (ancienDep == 'd') {
                if (npos[1] == 27) {
                    npos[1] = 0;
                } else {
                    npos[1] = npos[1] + 1;
                }
                dirpac = 'd';
            }
            erreur = true;

        }

        return (npos);
    }
    private static long timeInv;
    public static long getTimeInv(){
        return timeInv;
    }

    public static boolean invincibilite(){
        if (npos[0] == 3 && npos[1] == 26) {
            timeInv= System.currentTimeMillis();
        }
        if (npos[0] == 3 && npos[1] == 1) {
            timeInv= System.currentTimeMillis();
        }
        if (npos[0] == 23 && npos[1] == 26) {
            timeInv= System.currentTimeMillis();
        }
        if (npos[0] == 23 && npos[1] == 1) {
            timeInv= System.currentTimeMillis();
        }
        if(System.currentTimeMillis() < timeInv + 10000){
            return true;
        }
        else{
            return false;
        }
    }
}