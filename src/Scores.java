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
                    {
                        compte = compte + 1;
                    }
                }
            }
        }
        return (compte);
    }
    private static int vies = 3;

    public static int Vies() {

        int[] pos = Pacman.getPos();

        int[][] caractF = Fantome.getCaractF();

        for (int k = 0; k < 4; k++) {
            if ((caractF[2][k] == pos[0]) && (caractF[3][k] == pos[1])) {
                vies = vies - 1;
                System.out.println("Le nombre de vies est de " + vies);
            }
        }
        return (vies);
    }

}

