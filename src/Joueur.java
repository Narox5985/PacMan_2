/**
 * Created by rivie_000 on 06/01/2017.
 */
import java.awt.event.KeyEvent;
import java.util.Scanner;

import edu.princeton.cs.introcs.StdDraw;

public class Joueur {

	private static char dep;
	public static char getDep(){
		return dep;
	}
	public static void setDep(char dirDep){
		dep = dirDep;
	}

	private static char ancienDep;
	public static char getAncienDep(){
		return ancienDep;
	}
	public static void ini(char dirDep){
		dep = dirDep;
		ancienDep = dep;
	}


	public static void cmdPacman(){
		if (!Pacman.getErreur() && Pacman.getRes()) {
			ancienDep = dep;
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_DOWN)) {
			dep = 's';
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_UP)) {
			dep = 'z';
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_LEFT)) {
			dep = 'q';
		}
		if (StdDraw.isKeyPressed(KeyEvent.VK_RIGHT)) {
			dep = 'd';
		}

	}



}
