/**
 * Created by benoit on 13/01/2017.
 */
public class FantomeRouge {

    public static boolean [] TestDeplacementR(boolean labybool [][]){

        int [][] caractF = Fantome.getCaractF();

        int y = caractF[2][0];
        int x = caractF[3][0];



        boolean [] test = {false,false,false,false};

        if (labybool[x - 1][y]){
            test[0] = true;
        }

        if (labybool[x + 1][y]){
            test[1] = true;
        }

        if (labybool[x][y + 1]){
            test [2] = true;
        }

        if (labybool[x][y - 1]){
            test [3] = true;
        }

        if (!test[0] && test[1] && !test[2] && !test[3]){
            TestDeplacementR(Laby.getLabybool());
        }

        return(test);
    }

    public static int FuturDepR(){

        int[] apos = Pacman.getAnciennePos();
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

        for (w = 0; w<3; w++){
            if (s[w]<s[w+1]){
                min = s[w];
            }
        }

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
    }
}
