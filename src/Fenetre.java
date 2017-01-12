
import edu.princeton.cs.introcs.StdDraw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


public class Fenetre {
        public static char val = 'q';
        static char[][] laby;
        private static char t= 'w';
        private static Icon Jouer;


    public static void affichePacman(char [][] laby, int k, int j, int w) {
        char dirpac = Pacman.getDirPac();
        int[] anciennePos = Pacman.getAnciennePos();
        int nk = anciennePos[0];
        int nj = anciennePos[1];
        int [] npos = Pacman.getNPos();


        if (k == anciennePos[0] && j == anciennePos[1]) {
            if(w %4 !=0) {
                if (dirpac == 'z') {
                    StdDraw.picture(j * 10 + 5, -10 * k - 5 + w, "imagepacmanH.png", 18, 18);
                    t = 'z';
                }
                if (dirpac == 's') {
                    StdDraw.picture(10 * j + 5, -10 * k - 5 - w, "imagepacmanB.png", 18, 18);
                    t = 's';
                }
                if (dirpac == 'q') {
                    StdDraw.picture(10 * j + 5 - w, -10 * k - 5, "imagepacmanG.png", 18, 18);
                    t = 'q';
                }
                if (dirpac == 'd') {
                    StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "imagepacmanD.png", 18, 18);
                    t = 'd';
                }
                if (dirpac == 'r') {
                    if (t == 'z') {
                        StdDraw.picture(nj * 10 + 5, -10 * nk - 5, "imagepacmanH.png", 18, 18);
                    }
                    if (t == 's') {
                        StdDraw.picture(10 * nj + 5, -10 * nk - 5, "imagepacmanB.png", 18, 18);
                    }
                    if (t == 'q') {
                        StdDraw.picture(10 * nj + 5, -10 * nk - 5, "imagepacmanG.png", 18, 18);
                    }
                    if (t == 'd') {
                        StdDraw.picture(10 * nj + 5, -10 * nk - 5, "imagepacmanD.png", 18, 18);
                    }
                }
            }
            if( w %4 ==0){
                StdDraw.setPenColor(254, 254, 0);
                if (dirpac == 'z') {
                    StdDraw.filledCircle(j * 10 + 5, -10 * k - 5 + w, 4);
                    t = 'z';
                }
                if (dirpac == 's') {
                    StdDraw.filledCircle(j * 10 + 5, -10 * k - 5 - w, 4);
                    t = 's';
                }
                if (dirpac == 'q') {
                    StdDraw.filledCircle(j * 10 + 5 -w, -10 * k - 5, 4);
                    t = 'q';
                }
                if (dirpac == 'd') {

                    StdDraw.filledCircle(j * 10 + 5 + w, -10 * k - 5 , 4);
                    t = 'd';
                }
                if(dirpac =='r'){
                    if (t == 'z') {
                        StdDraw.filledCircle(j * 10 + 5, -10 * k - 5 + w, 4);
                    }
                    if (t == 's') {
                        StdDraw.filledCircle(j * 10 + 5, -10 * k - 5 - w, 4);
                    }
                    if (t == 'q') {
                        StdDraw.filledCircle(j * 10 + 5 -w, -10 * k - 5, 4);
                    }
                    if (t == 'd') {
                        StdDraw.filledCircle(j * 10 + 5 + w, -10 * k - 5 , 4);
                    }
                }
            }
        }


    }


    public static void draw(String nom) {
        laby = Laby.getLaby();
        int[][] caractF = Fantome.getCaractF();
        int compte = Scores.Compte();
        int vies = Scores.Vies();
        char dir = Joueur.getDep();

        StdDraw.setPenColor(0, 39, 218);
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


                    affichePacman(laby, k, j, w);
                    if (k == caractF[4][0] && j == caractF[5][0]) {
                        if(caractF[1][0] == 0) {
                            StdDraw.picture(10 * j + 5, -10 * k + w - 5, "fantomerouge.png", 11, 11);
                        }
                        if(caractF[1][0] == 1) {
                            StdDraw.picture(10 * j + 5, -10 * k - w - 5, "fantomerouge.png", 11, 11);
                        }
                        if(caractF[1][0] == 2) {
                            StdDraw.picture(10 * j + 5 -w , -10 * k - 5, "fantomerouge.png", 11, 11);
                        }
                        if(caractF[1][0] == 3) {
                            StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "fantomerouge.png", 11, 11);
                        }
                    }


                    if (k == caractF[4][1] && j == caractF[5][1]) {
                        if(caractF[1][1] == 0) {
                            StdDraw.picture(10 * j + 5, -10 * k + w - 5, "fantomebleu.png", 11, 11);
                        }
                        if(caractF[1][1] == 1) {
                            StdDraw.picture(10 * j + 5, -10 * k - w - 5, "fantomebleu.png", 11, 11);
                        }
                        if(caractF[1][1] == 2) {
                            StdDraw.picture(10 * j + 5 -w , -10 * k - 5, "fantomebleu.png", 11, 11);
                        }
                        if(caractF[1][1] == 3) {
                            StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "fantomebleu.png", 11, 11);
                        }
                    }
                    if (k == caractF[4][2] && j == caractF[5][2]) {
                        if(caractF[1][2] == 0) {
                            StdDraw.picture(10 * j + 5, -10 * k + w - 5, "fantomeblanc.png", 10, 10);
                        }
                        if(caractF[1][2] == 1) {
                            StdDraw.picture(10 * j + 5, -10 * k - w - 5, "fantomeblanc.png", 10, 10);
                        }
                        if(caractF[1][2] == 2) {
                            StdDraw.picture(10 * j + 5 -w , -10 * k - 5, "fantomeblanc.png", 10, 10);
                        }
                        if(caractF[1][2] == 3) {
                            StdDraw.picture(10 * j + 5 + w, -10 * k - 5, "fantomeblanc.png", 10, 10);
                        }
                    }

                    if (k == caractF[4][3] && j == caractF[5][3]) {
                        if(caractF[1][3] == 0) {
                            StdDraw.picture(10 * j + 5, -10 * k + w - 5, "fantomevert.jpg", 9, 9);
                        }
                        if(caractF[1][3] == 1) {
                            StdDraw.picture(10 * j + 5, -10 * k - w - 5, "fantomevert.jpg", 9, 9);
                        }
                        if(caractF[1][3] == 2) {
                            StdDraw.picture(10 * j + 5 -w , -10 * k - 5, "fantomevert.jpg", 9, 9);
                        }
                        if(caractF[1][3] == 3) {
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
            // StdDraw.picture(1, -35, "cerises.png", 1, 1);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.textLeft(100, -350, "Score : " + compte);
            StdDraw.picture(80, -350, "Pastille.png", 1, 1);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.textLeft(190, -350, "Le PACMAN de");
            StdDraw.textLeft(210, -360, nom);

            StdDraw.show(10);
            StdDraw.pause(20);
            StdDraw.clear(StdDraw.BLACK);

            //Laby.Afficher(laby);
            //StdDraw.show(0);
        }
    }
        //private static char ancienneDir = 'z';




        public static void main(String[] args) {

            int[] pos = {23, 14};

            JOptionPane jop2 = new JOptionPane();
            ImageIcon img = new ImageIcon("logo.jpg");
            ImageIcon resultat = new ImageIcon(img.getImage().getScaledInstance(250, 100, Image.SCALE_DEFAULT));
            jop2.showMessageDialog(null, "Bienvenue sur PACMAN ", "Pacman", JOptionPane.INFORMATION_MESSAGE, resultat);



            JOptionPane jop = new JOptionPane();
            ImageIcon toto = new ImageIcon("Toto.jpg");
            ImageIcon resultat2 = new ImageIcon(toto.getImage().getScaledInstance(250, 100, Image.SCALE_DEFAULT));
            String nom = jop.showInputDialog(null, "Veuillez entrer un pseudo !", "PACMAN", JOptionPane.QUESTION_MESSAGE);


            StdDraw.setCanvasSize(1200, 1200);
            StdDraw.setXscale(0, 280);
            StdDraw.setYscale(-380, 0);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledRectangle(140, -160, 140, 160);
            StdDraw.enableDoubleBuffering();


            Pacman.setPos(pos);
            int[][] caractF = Fantome.initialisationF();
            Laby.Afficher(Laby.Gene(pos, caractF, false));
            draw(nom);
            boolean plusdeP = Scores.CompteurVictoire();
            System.out.println(plusdeP);


            //StdDraw.show(200);
            //StdDraw.pause(10);
            //StdDraw.clear(StdDraw.BLACK);

            char[][] laby = Laby.Gene(pos, caractF, false);
            boolean[][] labybool = Laby.GeneBool(laby);

            Joueur.ini(val);

            for (int k = 1; k <= 3; k++) {
                int i = 0;
                long t = System.currentTimeMillis();
                long end = t + 3000;
                while (System.currentTimeMillis() < end) {

                    Joueur.cmdPacman();
                    int[] npos = Pacman.Deplacement(Pacman.Testdeplacement(labybool));
                    if (k != 1 && i != 0) {
                        Fantome.deplacementDesFantomes(0, k - 1);
                    }
                    if (k == 1) {
                        Fantome.DeplacementF(1, 0);
                        Fantome.DeplacementF(0, 3);

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
                    Laby.Gene(npos, caractF, false);


                    Fenetre.draw(nom);
                   // StdDraw.clear(StdDraw.BLACK);

                }
            }
            while (true) {

                Joueur.cmdPacman();
                int[] npos = Pacman.Deplacement(Pacman.Testdeplacement(labybool));
                Fantome.deplacementDesFantomes(0, 3);
                caractF = Fantome.getCaractF();
                Laby.Gene(npos, caractF, true);
                labybool = Laby.GeneBool(laby);
                Fenetre.draw(nom);
                //StdDraw.clear(StdDraw.BLACK);

            }

        }

        }






