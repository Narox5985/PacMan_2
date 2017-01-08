/**
 * Created by rivie_000 on 07/01/2017.
 */
public class Pacman {

    private static char dep;
    private static int[] npos;
    private static  boolean res;

    public static void setPos(int[] npos) {
        Pacman.npos = npos;
    }
    public static int [] getPos (){
        return npos;
    }

    public static boolean Testdeplacement(boolean labybool[][]) {
        dep = Joueur.getDep();
        int x = npos[0];
        int y = npos[1];
        System.out.println(x + "=========" + y);
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
            if( x == 15 && y == 0){
                res = true;
            }
        }
        if (dep == 'd') {
            if (labybool[x][y + 1]) {
                res = true;
            }
            if( x == 15 && y == 27){
                res = true;
            }
        }
        System.out.println(res);
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
        char ancienDep = Joueur.getAncienDep();

        if (dep == 'z' && test) {
            npos[0] = npos[0] - 1;
        }
        if (dep == 's' && test) {
            npos[0] = npos[0] + 1;
        }
        if (dep == 'q' && test) {
            npos[1] = npos[1] - 1;
        }
        if (dep == 'd' && test) {
            npos[1] = npos[1] + 1;
        }

        if(dep == 'q' && npos[0]==15 && npos[1] == 0 && test){
            npos[1] = 27;
        }
        if(dep == 'd' && npos[0]==15 && npos[1] == 27 && test){
            npos[1] = 0;
        }
        erreur = false;

        if (!test && ancienDep != dep) {

            if (ancienDep == 'z') {
                npos[0] = npos[0] - 1;
            }
            if (ancienDep == 's') {
                npos[0] = npos[0] + 1;
            }
            if (ancienDep == 'q') {
                if(npos[1]==0){
                    npos[1] = 27;
                }
                else {
                    npos[1] = npos[1] - 1;
                }
            }
            if (ancienDep == 'd') {
                if (npos[1] == 27){
                    npos[1] = 0;
                }
                else {
                    npos[1] = npos[1] + 1;
                }
            }
            erreur = true;
        }

        return (npos);
    }
}