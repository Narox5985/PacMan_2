
import edu.princeton.cs.introcs.StdDraw;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;


public class Fenetre {
        public static char val = 'q';
        static char[][] laby;
        private static Icon Jouer;


        public static void draw(String nom) {
            laby = Laby.getLaby();
            int[][] caractF = Fantome.getCaractF();
            int compte = Scores.Compte();
            int vies = Scores.Vies();


            StdDraw.enableDoubleBuffering();
            for (int k = 0; k < 31; k++) {
                for (int j = 0; j < 28; j++) {
                    StdDraw.setPenColor(0, 39, 218);
                    if (laby[k][j] == '#') {
                        StdDraw.rectangle(j + 0.5, -k - 0.5, 0.5, 0.5);
                    }
                    if (laby[k][j] == 'D') {
                        StdDraw.picture(j + 0.5, -k - 0.5, "imagepacman.png", 2, 2);
                    }
                    if (laby[k][j] == 'P') {
                        StdDraw.picture(j + 0.5, -k - 0.5, "pastille.png", 0.2, 0.2);
                    }
                    if (k == caractF[2][0] && j == caractF[3][0]) {
                        StdDraw.picture(j + 0.5, -k - 0.5, "fantomerouge.png", 1.1, 1.1);
                    }
                    if (k == caractF[2][1] && j == caractF[3][1]) {
                        StdDraw.picture(j + 0.5, -k - 0.5, "fantomebleu.png", 1.1, 1.1);
                    }
                    if (k == caractF[2][2] && j == caractF[3][2]) {
                        StdDraw.picture(j + 0.5, -k - 0.5, "fantomeblanc.png", 1, 1);
                    }
                    if (k == caractF[2][3] && j == caractF[3][3]) {
                        StdDraw.picture(j + 0.5, -k - 0.5, "fantomevert.jpg", 1.1, 1.1);
                    }
                    if (laby[k][j] == 'M') {
                        StdDraw.rectangle(j + 0.5, -k - 0.5, 0.3, 0.3);
                    }
                }
            }
            StdDraw.setPenColor(StdDraw.BLUE);
            StdDraw.filledRectangle(24, -38, 28, 5);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.textLeft(2, -35, "Vies : " + vies);
            StdDraw.picture(1, -35, "cerises.png", 1, 1);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.textLeft(10, -35, "Score : " + compte);
            StdDraw.picture(8, -35, "Pastille.png", 1, 1);
            StdDraw.setPenColor(StdDraw.WHITE);
            StdDraw.textLeft(19, -35, "Le PACMAN de");
            StdDraw.textLeft(21, -36, nom);


            StdDraw.show(200);
            StdDraw.pause(10);

            //Laby.Afficher(laby);
            //StdDraw.show(0);
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


            StdDraw.setCanvasSize(700, 700);
            StdDraw.setXscale(0, 28);
            StdDraw.setYscale(-38, 0);
            StdDraw.setPenColor(StdDraw.BLACK);
            StdDraw.filledRectangle(14, -16, 14, 16);


            Pacman.setPos(pos);
            int[][] caractF = Fantome.initialisationF();
            Laby.Afficher(Laby.Gene(pos, caractF, false));
            draw(nom);
            boolean plusdeP = Scores.CompteurVictoire();
            System.out.println(plusdeP);


            //StdDraw.show(200);
            //StdDraw.pause(10);
            StdDraw.clear(StdDraw.BLACK);

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
                    StdDraw.clear(StdDraw.BLACK);

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
                StdDraw.clear(StdDraw.BLACK);

            }

        }

        }






