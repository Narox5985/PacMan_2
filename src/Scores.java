import javax.swing.*;

/**
 * Created by benoit on 08/01/2017.
 */
public class Scores {


    public static int Compte() {
        int compte = 0;
        char[][] laby = Laby.getLaby();
        for (int k = 0; k < 31; k++) {
            for (int j = 0; j < 28; j++) {
                if (laby[k][j] == 'V') {
                        compte = compte + 1;
                }
            }
        }

        return (compte);
    }
private static int vic =0;
    public static boolean CompteurVictoire(){
        boolean plusdeP = false;
    char[][] laby = Laby.getLaby();
        for (int k = 0; k < 31; k++) {
        for (int j = 0; j < 28; j++) {
            if (laby[k][j] == 'P') {
                vic = vic + 1;
            }
        }
    }
    if (vic == 0){
            plusdeP = true;
    }

    return (plusdeP);
}

    private static int vies = 3;

    public static int Vies() {

        int[] pos = Pacman.getPos();

        int[][] caractF = Fantome.getCaractF();

        for (int k = 0; k < 4; k++) {
            if ((caractF[2][k] == pos[1]) && (caractF[3][k] == pos[0])) {
                vies = vies - 1;
            }
        }

        if (vies == 0){
                        // ferme les fenetres
        }

        return (vies);
    }

}

