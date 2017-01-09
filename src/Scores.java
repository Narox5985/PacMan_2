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

    public static int Vies() {

        int[] pos = Pacman.getPos();

        int[][] caractF = Fantome.getCaractF();

        int vies = 3;

        if ((caractF[2][0] == pos[0]) && (caractF[3][0] == pos[1])) {
            vies = vies - 1;
            System.out.println("Le nombre de vies est de " + vies);
        }
        if ((caractF[2][1] == pos[0]) && (caractF[3][1] == pos[1])) {
            vies = vies - 1;
            System.out.println("Le nombre de vies est de " + vies);
        }
        if ((caractF[2][2] == pos[0]) && (caractF[3][2] == pos[1])) {
            vies = vies - 1;
            System.out.println("Le nombre de vies est de " + vies);
        }
        if ((caractF[2][3] == pos[0]) && (caractF[3][3] == pos[1])) {
            vies = vies - 1;
            System.out.println("Le nombre de vies est de " + vies);
        }

        return (vies);
    }

}

