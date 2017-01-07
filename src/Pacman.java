/**
 * Created by rivie_000 on 07/01/2017.
 */
public class Pacman {

    private static char dep;
    private static int[] npos;
    private static char ancienDep;
    private static  boolean res;

    public static void setPos(int[] npos) {
        Pacman.npos = npos;
    }

    public static boolean Testdeplacement(boolean labybool[][]) {
        dep = Joueur.getDep();
        int x = npos[0];
        int y = npos[1];
        res = true;
        if (dep == 'z') {
            if (labybool[x - 1][y]) {
                res = true;
            }
            if (!labybool[x - 1][y]) {
                res = false;
            }
        }
        if (dep == 's') {
            if (labybool[x + 1][y]) {
                res = true;
            }
            if (!labybool[x + 1][y]) {
                res = false;
            }
        }
        if (dep == 'q') {
            if (labybool[x][y - 1]) {
                res = true;
            }
            if (!labybool[x][y - 1]) {
                res = false;
            }
        }

        if (dep == 'd') {
            if (labybool[x][y + 1]) {
                res = true;
            }
            if (!labybool[x][y + 1]) {
                res = false;
            }
        }
        return res;
    }
    public static boolean getRes() {
        return res;
    }
    private static boolean erreur;
    public static boolean getErreur(){
        return erreur;
    }

    public static int[] Deplacement(boolean test) {
        ancienDep = Joueur.getAncienDep();

        if (dep == 'z' && test == true) {
            npos[0] = npos[0] - 1;
        }
        if (dep == 's' && test == true) {
            npos[0] = npos[0] + 1;
        }
        if (dep == 'q' && test == true) {
            npos[1] = npos[1] - 1;
        }
        if (dep == 'd' && test == true) {
            npos[1] = npos[1] + 1;
        }
        erreur = false;
        if (test == false && ancienDep != dep) {

            if (ancienDep == 'z') {
                npos[0] = npos[0] - 1;
            }
            if (ancienDep == 's') {
                npos[0] = npos[0] + 1;
            }
            if (ancienDep == 'q') {
                npos[1] = npos[1] - 1;
            }
            if (ancienDep == 'd') {
                npos[1] = npos[1] + 1;
            }
            erreur = true;
        }

        return (npos);
    }

    public static int [] getPos(){
        return npos;
    }
}