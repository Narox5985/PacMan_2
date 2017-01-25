/**
 * Created by rivie_000 on 03/01/2017.
 */

import edu.princeton.cs.introcs.StdDraw;
import javax.swing.*;
import java.awt.*;
import javax.swing.JOptionPane;


public class Fenetre {
    public static char val = 'q';
    static char[][] laby;
    private static char t = 'w';
    private static boolean changement = Scores.getChangement();
    private static boolean reset;


    public static void affichePacman(char[][] laby, int k, int j, int w) {
        char dirpac = Pacman.getDirPac();
        int[] anciennePos = Pacman.getAnciennePos();
        int nk = anciennePos[0];
        int nj = anciennePos[1];

        if (k == anciennePos[0] && j == anciennePos[1]) {
            if (w >= 5) {
                if (dirpac == 'z') {
                    StdDraw.picture(j * 10 + 5, -10 * k - 5 + w, "imagepacmanH.png", 8, 8);
                    t = 'z';
                }
                if (dirpac == 's') {
                    StdDraw.picture(10 * j + 5, -10 * k - 5 - w, "imagepacmanB.png", 8, 8);
                    t = 's';
                }
                if (dirpac == 'q') {
                    StdDraw.picture(10 * j + 5 - w, -10 * k - 5, "imagepacmanG.png", 8, 8);
                    t = 'q';
                }
                if (dirpac == 'd') {
                    StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "imagepacmanD.png", 8, 8);
                    t = 'd';
                }
            }
            if (dirpac == 'r') {
                if (t == 'z') {
                    StdDraw.picture(nj * 10 + 5, -10 * nk - 5, "imagepacmanH.png", 8, 8);
                }
                if (t == 's') {
                    StdDraw.picture(10 * nj + 5, -10 * nk - 5, "imagepacmanB.png", 8, 8);
                }
                if (t == 'q') {
                    StdDraw.picture(10 * nj + 5, -10 * nk - 5, "imagepacmanG.png", 8, 8);
                }
                if (t == 'd') {
                    StdDraw.picture(10 * nj + 5, -10 * nk - 5, "imagepacmanD.png", 8, 8);
                }
            }
            if (w < 5) {
                if (dirpac == 'z') {
                    StdDraw.picture(j * 10 + 5, -10 * k - 5 + w, "imagepacman.png", 8, 8);
                    t = 'z';
                }
                if (dirpac == 's') {
                    StdDraw.picture(10 * j + 5, -10 * k - 5 - w, "imagepacman.png", 8, 8);
                    t = 's';
                }
                if (dirpac == 'q') {
                    StdDraw.picture(10 * j + 5 - w, -10 * k - 5, "imagepacman.png", 8, 8);
                    t = 'q';
                }
                if (dirpac == 'd') {
                    StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "imagepacman.png", 8, 8);
                    t = 'd';
                }
            }
        }
    }

    private static int vies;
    private static int compte;

    public static void drawInv(String nom) {
        laby = Laby.getLaby();
        boolean plusdeP = Scores.CompteurVictoire();
        int[][] caractF = Fantome.getCaractF();
        char dir = Joueur.getDep();

        StdDraw.setPenColor(0, 39, 218);
       // int w =10;
        for (int w = 1; w <= 10; w++) {
            for (int k = 0; k < 31; k++) {
                for (int j = 0; j < 28; j++) {
                    StdDraw.setPenColor(0, 39, 218);
                    if (laby[k][j] == '#') {
                        StdDraw.rectangle(j * 10 + 5, -10 * k - 5, 5, 5);
                    }
                    if (laby[k][j] == 'P') {
                        StdDraw.picture(10 * j + 5, -10 * k - 5, "pastille.png", 2, 2);
                    }
                    if (laby[k][j] == 'Y') {
                        StdDraw.picture(10 * j + 5, -10 * k - 5, "pastille.png", 4, 4);
                    }


                    affichePacman(laby, k, j, w);

                    for(int fant =0; fant <4; fant ++) {
                        if (caractF[6][fant] == 0) {
                            if(System.currentTimeMillis() < Pacman.getTimeInv () + 7000) {
                                if (k == caractF[4][fant] && j == caractF[5][fant]) {
                                    if (caractF[1][fant] == 0) {
                                        StdDraw.picture(10 * j + 5, -10 * k + w - 5, "FantomeVul.jpg", 11, 11);
                                    }
                                    if (caractF[1][fant] == 1) {
                                        StdDraw.picture(10 * j + 5, -10 * k - w - 5, "FantomeVul.jpg", 11, 11);
                                    }
                                    if (caractF[1][fant] == 2) {
                                        StdDraw.picture(10 * j + 5 - w, -10 * k - 5, "FantomeVul.jpg", 11, 11);
                                    }
                                    if (caractF[1][fant] == 3) {
                                        StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "FantomeVul.jpg", 11, 11);
                                    }
                                }
                            }
                            if(System.currentTimeMillis() > Pacman.getTimeInv () + 7000) {
                                if (k == caractF[4][fant] && j == caractF[5][fant]) {
                                    if (w < 4) {
                                        if (caractF[1][fant] == 0) {
                                            StdDraw.picture(10 * j + 5, -10 * k + w - 5, "FantomeVulFin.jpg", 11, 11);
                                        }
                                        if (caractF[1][fant] == 1) {
                                            StdDraw.picture(10 * j + 5, -10 * k - w - 5, "FantomeVulFin.jpg", 11, 11);
                                        }
                                        if (caractF[1][fant] == 2) {
                                            StdDraw.picture(10 * j + 5 - w, -10 * k - 5, "FantomeVulFin.jpg", 11, 11);
                                        }
                                        if (caractF[1][fant] == 3) {
                                            StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "FantomeVulFin.jpg", 11, 11);
                                        }
                                    }
                                    if (w > 4) {
                                        if (caractF[1][fant] == 0) {
                                            StdDraw.picture(10 * j + 5, -10 * k + w - 5, "FantomeVul.jpg", 11, 11);
                                        }
                                        if (caractF[1][fant] == 1) {
                                            StdDraw.picture(10 * j + 5, -10 * k - w - 5, "FantomeVul.jpg", 11, 11);
                                        }
                                        if (caractF[1][fant] == 2) {
                                            StdDraw.picture(10 * j + 5 - w, -10 * k - 5, "FantomeVul.jpg", 11, 11);
                                        }
                                        if (caractF[1][fant] == 3) {
                                            StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "FantomeVul.jpg", 11, 11);
                                        }
                                    }
                                }
                            }
                        }
                        if (caractF[6][fant] == 1) {
                            if (k == caractF[4][fant] && j == caractF[5][fant]) {
                                if (caractF[1][fant] == 0) {
                                    StdDraw.picture(10 * j + 5, -10 * k + w - 5, "fantomeInv.png", 11, 11);
                                }
                                if (caractF[1][fant] == 1) {
                                    StdDraw.picture(10 * j + 5, -10 * k - w - 5, "fantomeInv.png", 11, 11);
                                }
                                if (caractF[1][fant] == 2) {
                                    StdDraw.picture(10 * j + 5 - w, -10 * k - 5, "fantomeInv.png", 11, 11);
                                }
                                if (caractF[1][fant] == 3) {
                                    StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "fantomeInv.png", 11, 11);
                                }
                            }
                        }
                    }

                    if (laby[k][j] == 'M') {
                        StdDraw.rectangle(10 * j + 5, -10 * k - 5, 3, 3);
                    }

                }
            }

            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledRectangle(240, -380, 280, 50);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.textLeft(20, -350, "Vies : " + vies);
            StdDraw.picture(10, -350, "cerises.png", 10, 10);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.textLeft(100, -350, "Score : " + compte);
            StdDraw.picture(80, -350, "Pastille.png", 10, 10);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.textLeft(190, -350, "Le PACMAN de");
            StdDraw.textLeft(210, -360, nom);


            compte = Scores.Compte(true, false);
            StdDraw.show(10);
            StdDraw.pause(20);
            StdDraw.clear(StdDraw.BLACK);
        }

        if (plusdeP == true) {
            JOptionPane jop3 = new JOptionPane();
            ImageIcon img1 = new ImageIcon("win.jpg");
            ImageIcon resultat3 = new ImageIcon(img1.getImage().getScaledInstance(275, 275, Image.SCALE_DEFAULT));
            jop3.showMessageDialog(null, "Vous avez gagné! ", "Pacman", JOptionPane.INFORMATION_MESSAGE, resultat3);

            JOptionPane jop4 = new JOptionPane();
            int n = jop4.showConfirmDialog(null, "Voulez-vous jouer à nouveau ? ", "Pacman", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                Scores.setVies (3);
                reset = true;

            } else {
                System.exit(0);
            }
        }
    }






    public static void draw(String nom) {
        laby = Laby.getLaby();
        boolean plusdeP = Scores.CompteurVictoire();
        int[][] caractF = Fantome.getCaractF();
        char dir = Joueur.getDep();

        StdDraw.setPenColor(0, 39, 218);
        // int w =10;
        vies = Scores.Vies();


        for (int w = 1; w <= 10; w++) {
            for (int k = 0; k < 31; k++) {
                for (int j = 0; j < 28; j++) {
                    StdDraw.setPenColor(0, 39, 218);
                    if (laby[k][j] == '#') {
                        StdDraw.rectangle(j * 10 + 5, -10 * k - 5, 5, 5);
                    }
                    if (laby[k][j] == 'P') {
                        StdDraw.picture(10 * j + 5, -10 * k - 5, "pastille.png", 2, 2);
                    }
                    if (laby[k][j] == 'Y') {
                        StdDraw.picture(10 * j + 5, -10 * k - 5, "pastille.png", 4, 4);
                    }


                    affichePacman(laby, k, j, w);
                    if (k == caractF[4][0] && j == caractF[5][0]) {
                        if (caractF[1][0] == 0) {
                            StdDraw.picture(10 * j + 5, -10 * k + w - 5, "fantomerouge.png", 11, 11);
                        }
                        if (caractF[1][0] == 1) {
                            StdDraw.picture(10 * j + 5, -10 * k - w - 5, "fantomerouge.png", 11, 11);
                        }
                        if (caractF[1][0] == 2) {
                            StdDraw.picture(10 * j + 5 - w, -10 * k - 5, "fantomerouge.png", 11, 11);
                        }
                        if (caractF[1][0] == 3) {
                            StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "fantomerouge.png", 11, 11);
                        }
                    }


                    if (k == caractF[4][1] && j == caractF[5][1]) {
                        if (caractF[1][1] == 0) {
                            StdDraw.picture(10 * j + 5, -10 * k + w - 5, "fantomebleu.png", 11, 11);
                        }
                        if (caractF[1][1] == 1) {
                            StdDraw.picture(10 * j + 5, -10 * k - w - 5, "fantomebleu.png", 11, 11);
                        }
                        if (caractF[1][1] == 2) {
                            StdDraw.picture(10 * j + 5 - w, -10 * k - 5, "fantomebleu.png", 11, 11);
                        }
                        if (caractF[1][1] == 3) {
                            StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "fantomebleu.png", 11, 11);
                        }
                    }
                    if (k == caractF[4][2] && j == caractF[5][2]) {
                        if (caractF[1][2] == 0) {
                            StdDraw.picture(10 * j + 5, -10 * k + w - 5, "fantomeblanc.png", 10, 10);
                        }
                        if (caractF[1][2] == 1) {
                            StdDraw.picture(10 * j + 5, -10 * k - w - 5, "fantomeblanc.png", 10, 10);
                        }
                        if (caractF[1][2] == 2) {
                            StdDraw.picture(10 * j + 5 - w, -10 * k - 5, "fantomeblanc.png", 10, 10);
                        }
                        if (caractF[1][2] == 3) {
                            StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "fantomeblanc.png", 10, 10);
                        }
                    }

                    if (k == caractF[4][3] && j == caractF[5][3]) {
                        if (caractF[1][3] == 0) {
                            StdDraw.picture(10 * j + 5, -10 * k + w - 5, "fantomevert.jpg", 9, 9);
                        }
                        if (caractF[1][3] == 1) {
                            StdDraw.picture(10 * j + 5, -10 * k - w - 5, "fantomevert.jpg", 9, 9);
                        }
                        if (caractF[1][3] == 2) {
                            StdDraw.picture(10 * j + 5 - w, -10 * k - 5, "fantomevert.jpg", 9, 9);
                        }
                        if (caractF[1][3] == 3) {
                            StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "fantomevert.jpg", 9, 9);
                        }
                    }
                    if (laby[k][j] == 'M') {
                        StdDraw.rectangle(10 * j + 5, -10 * k - 5, 3, 3);
                    }

                }
            }

            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledRectangle(240, -380, 280, 50);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.textLeft(20, -350, "Vies : " + vies);
            StdDraw.picture(10, -350, "cerises.png", 10, 10);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.textLeft(100, -350, "Score : " + compte);
            StdDraw.picture(80, -350, "Pastille.png", 10, 10);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.textLeft(190, -350, "Le PACMAN de");
            StdDraw.textLeft(210, -360, nom);


            compte = Scores.Compte(false, false);
            StdDraw.show(10);
            StdDraw.pause(13);
            StdDraw.clear(StdDraw.BLACK);
        }

        if (vies == 0) {
            JOptionPane jop3 = new JOptionPane();
            ImageIcon img1 = new ImageIcon("Lots.jpg");
            ImageIcon resultat1 = new ImageIcon(img1.getImage().getScaledInstance(250, 250, Image.SCALE_DEFAULT));
            jop3.showMessageDialog(null, "Vous avez perdu! ", "Pacman", JOptionPane.INFORMATION_MESSAGE, resultat1);

            JOptionPane jop4 = new JOptionPane();
            int n = jop4.showConfirmDialog(null, "Voulez-vous jouer à nouveau ? ", "Pacman", JOptionPane.YES_NO_OPTION);

            if (n == JOptionPane.YES_OPTION) {
                Scores.setVies (3);
                reset = true;

            } else {
                System.exit(0);
            }

        }
        if (plusdeP == true) {
            JOptionPane jop3 = new JOptionPane();
            ImageIcon img1 = new ImageIcon("win.jpg");
            ImageIcon resultat3 = new ImageIcon(img1.getImage().getScaledInstance(275, 275, Image.SCALE_DEFAULT));
            jop3.showMessageDialog(null, "Vous avez gagné! ", "Pacman", JOptionPane.INFORMATION_MESSAGE, resultat3);

            JOptionPane jop4 = new JOptionPane();
            int n = jop4.showConfirmDialog(null, "Voulez-vous jouer à nouveau ? ", "Pacman", JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                Scores.setVies (3);
                reset = true;

            } else {
                System.exit(0);
            }
        }
    }





    public static void drawIni(String nom) {
        laby = Laby.getLaby();
        int[][] caractF = Fantome.getCaractF();
        char dir = Joueur.getDep();

        StdDraw.setPenColor(0, 39, 218);
        int [] npos = Pacman.getNPos();

        for (int k = 0; k < 31; k++) {
            for (int j = 0; j < 28; j++) {
                StdDraw.setPenColor(0, 39, 218);
                if (laby[k][j] == '#') {
                    StdDraw.rectangle(j * 10 + 5, -10 * k - 5, 5, 5);
                }
                if (laby[k][j] == 'P') {
                    StdDraw.picture(10 * j + 5, -10 * k - 5, "pastille.png", 2, 2);
                }
                if (laby[k][j] == 'Y') {
                    StdDraw.picture(10 * j + 5, -10 * k - 5, "pastille.png", 4, 4);
                }

                if (k == npos[0] && j == npos[1]) {
                    StdDraw.picture(10 * j + 5 , -10 * k - 5, "imagepacmanG.png", 8, 8);
                }
                if (k == caractF[4][0] && j == caractF[5][0]) {
                    StdDraw.picture(10 * j + 5, -10 * k  - 5, "fantomerouge.png", 11, 11);
                }
                if (k == caractF[4][1] && j == caractF[5][1]) {
                    StdDraw.picture(10 * j + 5, -10 * k - 5, "fantomebleu.png", 11, 11);
                }
                if (k == caractF[4][2] && j == caractF[5][2]) {
                    StdDraw.picture(10 * j + 5, -10 * k  - 5, "fantomeblanc.png", 10, 10);
                }
                if (k == caractF[4][3] && j == caractF[5][3]) {
                    StdDraw.picture(10 * j + 5, -10 * k - 5, "fantomevert.jpg", 9, 9);
                }

                if (laby[k][j] == 'M') {
                    StdDraw.rectangle(10 * j + 5, -10 * k - 5, 3, 3);
                }

            }
        }

        StdDraw.setPenColor(StdDraw.BLUE);
        StdDraw.filledRectangle(240, -380, 280, 50);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.textLeft(20, -350, "Vies : " + vies);
        StdDraw.picture(10, -350, "cerises.png", 10, 10);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.textLeft(100, -350, "Score : " + compte);
        StdDraw.picture(80, -350, "Pastille.png", 10, 10);
        StdDraw.setPenColor(StdDraw.WHITE);
        StdDraw.textLeft(190, -350, "Le PACMAN de");
        StdDraw.textLeft(210, -360, nom);

        compte = Scores.Compte(false, false);
        StdDraw.show(10);
        StdDraw.pause(13);
        StdDraw.clear(StdDraw.BLACK);
    }






    public static void execution(int[] pos, int[][] caractF, char[][] laby, boolean[][] labybool) {
        boolean invincibilite = false;
        int cmpt = 0;
        for (int k = 1; k <= 3; k++) {
            int i = 0;
            long t = System.currentTimeMillis();
            long end = t + 3000;
            while (System.currentTimeMillis() < end && changement == false) {
                    Joueur.cmdPacman();
                    pos = Pacman.Deplacement(Pacman.Testdeplacement(labybool));
                    Fantome.DeplacementF(0, FantomeRouge.FuturDepR());
                    if (k > 1 && i != 0) {
                        Fantome.deplacementDesFantomes(1, k - 1);
                    }
                    if (k == 1) {
                        Fantome.DeplacementF(1, 0);
                    }
                    if (k == 2 && i == 0) {
                        Fantome.DeplacementF(2, 3);
                        i = i + 1;
                    }
                    if (k == 2 && i != 0) {
                        Fantome.DeplacementF(2, 0);
                    }
                    if (k == 3 && i == 0) {
                        Fantome.DeplacementF(3, 2);
                        i = i + 1;
                    }
                    if (k == 3 && i != 0) {
                        Fantome.DeplacementF(3, 0);
                    }
                    caractF = Fantome.getCaractF();
                    Laby.Gene(pos, caractF, false, false);
                    invincibilite = Pacman.invincibilite();
                if (invincibilite == false){
                    Fenetre.draw(nom);
                    changement = Scores.getChangement();
                    cmpt =0;
                }
                if (invincibilite == true){
                    cmpt = cmpt +1;
                    if (cmpt == 1) {
                        for(int fant =0; fant < 4; fant ++) {
                            Fantome.setCaractFInv(0, fant);
                        }
                    }
                    Fenetre.drawInv(nom);
                }


            }
        }

        while (changement == false) {
                Joueur.cmdPacman();
                pos = Pacman.Deplacement(Pacman.Testdeplacement(labybool));
                Fantome.deplacementDesFantomes(1, 3);
                Fantome.DeplacementF(0, FantomeRouge.FuturDepR());
                caractF = Fantome.getCaractF();
                Laby.Gene(pos, caractF, true, false);
                labybool = Laby.GeneBool(laby);

                invincibilite = Pacman.invincibilite();
            if (invincibilite == false) {
                Fenetre.draw(nom);
                cmpt =0;
                changement = Scores.getChangement();
            }

            if (invincibilite == true){
                cmpt = cmpt +1;
                if (cmpt == 1) {
                    for(int fant =0; fant < 4; fant ++){
                        Fantome.setCaractFInv(0, fant);
                    }
                }
                Fenetre.drawInv(nom);
            }
        }
    }

    private static String nom;
    public static void main(String[] args) {

        JOptionPane jop2 = new JOptionPane();
        ImageIcon img = new ImageIcon("logo.jpg");
        ImageIcon resultat = new ImageIcon(img.getImage().getScaledInstance(250, 100, Image.SCALE_DEFAULT));
        jop2.showMessageDialog(null, "Bienvenue sur PACMAN ", "PACMAN", JOptionPane.INFORMATION_MESSAGE, resultat);

        JOptionPane jop = new JOptionPane();
        ImageIcon toto = new ImageIcon("Toto.jpg");
        ImageIcon resultat2 = new ImageIcon(toto.getImage().getScaledInstance(250, 100, Image.SCALE_DEFAULT));
        nom = jop.showInputDialog(null, "Veuillez entrer un pseudo !", "PACMAN", JOptionPane.QUESTION_MESSAGE);

        StdDraw.setCanvasSize(700, 700);
        StdDraw.setXscale(0, 280);
        StdDraw.setYscale(-380, 0);
        StdDraw.setPenColor(StdDraw.BLACK);
        StdDraw.filledRectangle(140, -160, 140, 160);
        StdDraw.enableDoubleBuffering();

        Scores.setVies(3);
        int[] pos = {23, 14};
        int[][] caractF = Fantome.initialisationF();
        Laby.Afficher(Laby.Gene(pos, caractF, false, false));
        Pacman.setPos(pos);

        vies = Scores.Vies();
        drawIni(nom);
        Joueur.ini(val);
        char[][] laby = Laby.Gene(pos, caractF, false, false);
        boolean[][] labybool = Laby.GeneBool(laby);


        while (true) {
            execution(pos, caractF, laby, labybool);

            pos[0] = 23;
            pos[1] = 14;
            Pacman.setPos(pos);
            caractF = Fantome.initialisationF();
            vies = Scores.Vies();
            if (reset == false) {
                changement = Scores.getChangement();
                laby = Laby.Gene(pos, caractF, false, false);
                Joueur.ini(val);
                drawIni(nom);
                StdDraw.pause(1000);
            }

            if (reset == true) {
                int [] Ancpos = {23,14};
                Pacman.setAncPos(Ancpos);
                Scores.setVies(3);
                Scores.Compte(false, true);
                laby = Laby.Gene(pos, caractF, false, true);
                Laby.Afficher(Laby.Gene(pos, caractF, false, true));
                Joueur.ini(val);
                labybool = Laby.GeneBool(laby);
                drawIni(nom);
                reset = false;
            }
        }
    }
}











