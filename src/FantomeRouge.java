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

        for(int k=0; k<4; k++){
            System.out.print(test[k] + "    ");
        }
        System.out.println( "     ");
        int[] npos = Pacman.getNPos();
        int[][] caractF = Fantome.getCaractF();
        int dir = caractF[0][0];
        int diffHauteur = npos[0] - caractF[2][0];
        int diffLargeur = npos[1] - caractF[3][0];

        int diffHautLarg = Math.abs(diffHauteur) - Math.abs(diffLargeur);


        if( diffHautLarg > 0){
            if (diffHauteur > 0){
                if (test[1]){
                    dir = 1;
                }
                else{
                    dir = caractF[0][0];
                }
            }
            if (diffHauteur < 0){
                if (test[0]){
                    dir = 0;
                }
                else{
                    dir = caractF[0][0];
                }
            }
        }

        if( diffHautLarg < 0){
            if (diffLargeur > 0){
                if (test[3]){
                    dir = 3;
                }
                else{
                    dir = caractF[0][0];
                }
            }
            if (diffLargeur < 0){
                if (test[2]){
                    dir = 2;
                }
                else{
                    dir = caractF[0][0];
                }
            }
        }
        if (diffHautLarg == 0){

        }
        return (dir);



       /* int[] apos = Pacman.getNPos();
        boolean [] test = TestDeplacementR(Laby.getLabybool());
        int yn = 0,xn = 0,ys=0,xs=0,ye=0,xe=0,yo=0,xo=0;
        int w;
        int min = 0;
        int dep = 0;

       int[][] caractF = Fantome.getCaractF();


        if (test[0]){

            yn = apos[0] - caractF[2][0];
            xn = apos[1] - (caractF[3][0]-1);
        }

        if (test[1]){

            ys = apos[0] - caractF[2][0];
            xs = apos[1] - (caractF[3][0]+1);
        }

        if (test[2]){

            yo = apos[0] - (caractF[2][0]-1);
            xo = apos[1] - caractF[3][0];
        }

        if (test[3]){

            ye = apos[0] - (caractF[2][0]+1);
            xe = apos[1] - caractF[3][0];
        }

        int [] s = {xn+yn, xs+ys, xo+yo, xe+ye};

        /*for (w = 0; w<3; w++){
            if (s[w]<s[w+1]){
                min = s[w];
            }
        }
       min = Math.min(s[0], s[1], s[2], s[3]);
        if (min == s[0]){
            dep = 0; //nord
        }

        if (min == s[1]){
            dep = 1; //sud
        }

        if (min == s[2]){
            dep = 2; //ouest
        }

        if (min == s[3]){
            dep = 3; //est
        }

        return(dep);
        */
    }

}
