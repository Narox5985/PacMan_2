import java.util.Scanner;

public class Joueur {
	static Scanner clavier = new Scanner(System.in);
	
	private static char dep;
	
    public static boolean testClavier (char lettre){
    	if (lettre == 'z'){
    		return false;
    	}
    	if (lettre == 's'){
    		return false;
    	}
    	if (lettre == 'q'){
    		return false;
    	}
    	if (lettre == 'd'){
    		return false;
    	}
    	else 
    		return true;
    }
    
	public static void cmdPacman(){

    	System.out.print("entrez direction ?");
    	String depus = clavier.nextLine();
       	dep = depus.charAt(0);
       	
       	while (testClavier(dep) ){
       		System.out.println("Erreur appuyez sur z, s, q ou d ");
       		System.out.print("entrez direction ?");
       		depus = clavier.nextLine();
           	dep = depus.charAt(0);
           	
       	}
	}
	
	public static char getDep(){
		return dep;
	}
}
