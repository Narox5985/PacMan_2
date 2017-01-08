/**
 * Created by benoit on 08/01/2017.
 */
public class Scores {


    public static int Compte() {
        int [] pos = Pacman.getPos();
        char[][] laby = Laby.getLaby();
        int compte = 0;
        for (int k = 0; k < 31; k++) {
            for (int j = 0; j < 28; j++) {
                if ((laby[k][j] == 'P') && (pos[0] == k) && (pos[1] == j)){
                    compte += compte;
                }
            }
        }

    return(compte);
    }

    public static int Vies(){
        int [] pos = Pacman.getPos();
        int[][] caractF = Fantome.getCaractF();
        int vies = 3;
        for (int k = 0; k < 31; k++) {
            for (int j = 0; j < 28; j++) {
                if (((caractF[3][0] == pos[0]) && (caractF[2][0] == pos[1]))
                        || ((caractF[3][1] == pos[0]) && (caractF[2][1] == pos[1]))
                        || ((caractF[3][2] == pos[0]) && (caractF[2][2] == pos[1]))
                        || ((caractF[3][3] == pos[0]) && (caractF[2][3] == pos[1]))){
                    vies -= vies;
                }
            }
        }
        return(vies);
    }


}