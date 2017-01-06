import java.util.Scanner;

public class Pacman {

	private static int [] npos;
	
	
    public static boolean [] Testdeplacement(boolean labybool[][]){

        int x = npos[0];
        int y = npos[1];

        boolean [] test = new boolean [4];
        
        if (labybool[x - 1][y]){
        	test[0]= true;
        }        
        if (!labybool[x - 1][y]){
        	test[0] = false;
        }

        if (labybool[x + 1][y]){
        	test[1]= true;
        }
        if (!labybool[x + 1][y]){
        	test[1] = false;    
        }
            
        if (labybool[x][y - 1]){
        	test[2]= true;
        }
        if (!labybool[x][y - 1]){
        	test[2] = false;
        }
          
        if (labybool[x][y + 1]){
        	test[3]= true;
        }
        if (!labybool[x][y + 1]){
        	test[3] = false;     
        }

        for(int k=0; k<4; k++){
        	if (k != 3){
        	System.out.print( test[k] + "\t");
        	}
        	else
        		System.out.println( test [k]);
        }
        return(test);

    }
    

    public static int [] Deplacement(boolean [] test) throws InterruptedException{

    	Scanner clavier = new Scanner(System.in);
        StdDraw.enableDoubleBuffering();

        char [][] laby = Laby.getLaby();
        boolean [][] labybool = Laby.GeneBool(laby);
        Joueur.cmdPacman();
        int [] nposfr = Fantome.DeplacementFantR(Fantome.TestdeplacementFantR(labybool));
        int [] nposfb = Fantome.DeplacementFantB(Fantome.TestdeplacementFantB(labybool));
        int [] nposfv = Fantome.DeplacementFantV(Fantome.TestdeplacementFantV(labybool));

       char dep = Joueur.getDep();
       System.out.print(dep);   	
           	if (dep == 'z'){
                while(test[0]){
                	npos[0] = npos[0]-1;
                    System.out.println("x =   " + npos[0] + "   " + "y =   " + npos[1]);
                    Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                    Fenetre.draw();
                    StdDraw.show();
                    StdDraw.pause(60);

                    test = Testdeplacement(labybool);
                }
            }
           	
           	if (dep == 's'){
                while(test[1]){
                	npos[0] = npos[0]+1;
                    System.out.println("x =   " + npos[0] + "   " + "y =   " + npos[1]);
                    Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                    Fenetre.draw();
                    StdDraw.show();
                    StdDraw.pause(60);
                    test = Testdeplacement(labybool);
                }
            }
           	
           	if (dep == 'q'){
                while(test[2]){
                	npos[1] = npos[1]-1;
                    System.out.println("x =   " + npos[0] + "   " + "y =   " + npos[1]);
                    Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                    Fenetre.draw();
                    StdDraw.show();
                    StdDraw.pause(60);
                    test = Testdeplacement(labybool);
                }
            }
           	
           	if (dep == 'd'){
                while(test[3]){
                	System.out.println( "=======" + test[3] + "========");
                	npos[1] = npos[1]+1;
                    System.out.println("x =   " + npos[0] + "   " + "y =   " + npos[1]);
                    Laby.Afficher(Laby.Gene(npos, nposfr, nposfb, nposfv));
                    Fenetre.draw();
                    StdDraw.show();
                    StdDraw.pause(60);
                    test = Testdeplacement(labybool);
                }
            }
           	System.out.println("Pacman ne peut plus ou pas aller dans cette direction");
           	

           	
           	return (npos);
    }
    
    public static int [] getPos(){
    	return npos;
    }
    
    public static void setPos(int [] npos){
    	Pacman.npos = npos;
    }
}
