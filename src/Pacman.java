import edu.princeton.cs.introcs.StdDraw;


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

        StdDraw.enableDoubleBuffering();

        Joueur.cmdPacman();

       char dep = Joueur.getDep();
       System.out.print(dep);   	
           	if (dep == 'z' && test[0]){
                	npos[0] = npos[0]+1;
                }
           	
           	if (dep == 's' && test[1]){
                	npos[0] = npos[0]-1;
                }

           	
           	if (dep == 'q' && test[2]){
                	npos[1] = npos[1]-1;
            }
           	
           	if (dep == 'd' && test[3]){
                	npos[1] = npos[1]+1;
                }


           	return (npos);
    }
    
    public static int [] getPos(){
    	return npos;
    }
    
    public static void setPos(int [] npos){
    	Pacman.npos = npos;
    }
}
