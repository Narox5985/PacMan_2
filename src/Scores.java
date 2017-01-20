import javax.swing.*;
import java.awt.*;

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
                        compte = compte + 10;
                }
            }
        }

        return (compte);
    }


    private static boolean plusdeP = false;

    public static boolean CompteurVictoire(){
    char[][] laby = Laby.getLaby();
    int vic =0;
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
    private static int vies;

    public static void setVies (int x){
        vies = x;
    }
    private static boolean changement;

    public static boolean getChangement(){
        return changement;
    }

    public static int Vies() {
        changement = false;
        int[] npos = Pacman.getNPos();

        int[][] caractF = Fantome.getCaractF();

        for (int k = 0; k < 4; k++) {
            if ((caractF[2][k] == npos[0]) && (caractF[3][k] == npos[1])) {
                vies = vies - 1;
                changement = true;
            }
            if ((caractF[4][k] == npos[0]) && (caractF[5][k] == npos[1])) {
                vies = vies - 1;
                changement = true;
            }
        }



        return (vies);
    }

}

