/**
 * Created by benoit on 13/01/2017.
 */
public class FantomeRouge {

    public static boolean [] TestDeplacementR(boolean labybool [][]){

        int [][] caractF = Fantome.getCaractF();

        int x = caractF[2][0];
        int y = caractF[3][0];



        boolean [] test = {false,false,false,false};

        //System.out.println("========" + x + "=========" + y + "========");
        if (labybool[x - 1][y]){
            test[0] = true;
        }

        if (labybool[x + 1][y]){
            test[1] = true;
        }
        if (y != 0){
            if (labybool[x][y - 1]) {
                test[2] = true;
            }
        }

        if( x == 14 && y == 0){
            test[2] = true;
        }
        if  (y != 27) {
            if ((labybool[x][y + 1])) {
                test[3] = true;
            }
        }
        if( x == 14 && y == 27){
            test[3] = true;
        }

        if (!test[0] && test[1] && !test[2] && !test[3]){
            TestDeplacementR(Laby.getLabybool());
        }

        return(test);
    }

    public static int FuturDepR(){
        boolean [][] labybool = Laby.getLabybool();
        boolean [] test = TestDeplacementR(labybool);

        int[] npos = Pacman.getNPos();
        int[][] caractF = Fantome.getCaractF();
        int dir = caractF[0][0];
        int diffHauteur = npos[0] - caractF[2][0];
        int diffLargeur = npos[1] - caractF[3][0];

        int diffHautLarg = Math.abs(diffHauteur) - Math.abs(diffLargeur);

        if(Pacman.invincibilite()== false) {
            if (diffHautLarg > 0) {
                if (diffHauteur > 0) {
                    if (test[1]) {
                        dir = 1;
                    } else {
                        dir = caractF[0][0];
                    }
                }
                if (diffHauteur < 0) {
                    if (test[0]) {
                        dir = 0;
                    } else {
                        dir = caractF[0][0];
                    }
                }
            }

            if (diffHautLarg < 0) {
                if (diffLargeur > 0) {
                    if (test[3]) {
                        dir = 3;
                    } else {
                        dir = caractF[0][0];
                    }
                }
                if (diffLargeur < 0) {
                    if (test[2]) {
                        dir = 2;
                    } else {
                        dir = caractF[0][0];
                    }
                }
            }
        }
        if(Pacman.invincibilite() == true) {
            if (diffHautLarg < 0) {
                if (diffHauteur > 0) {
                    if (test[1]) {
                        dir = 1;
                    } else {
                        dir = caractF[0][0];
                    }
                }
                if (diffHauteur < 0) {
                    if (test[0]) {
                        dir = 0;
                    } else {
                        dir = caractF[0][0];
                    }
                }
            }

            if (diffHautLarg > 0) {
                if (diffLargeur > 0) {
                    if (test[3]) {
                        dir = 3;
                    } else {
                        dir = caractF[0][0];
                    }
                }
                if (diffLargeur < 0) {
                    if (test[2]) {
                        dir = 2;
                    } else {
                        dir = caractF[0][0];
                    }
                }
            }
        }
        return (dir);

    }

}
