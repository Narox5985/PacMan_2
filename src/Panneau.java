import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Image;

import java.io.File;

import java.io.IOException;

import javax.imageio.ImageIO;

public class Panneau extends JPanel {

    private static int X;
    private static int Y;

    public int getX() {
        return X;
    }

    public int getY() {
        return Y;
    }

    public static void setX(int defX) {
        X = defX;
    }

    public static void setY(int defY) {
        Y = defY;
    }


    //char laby [][] = Laby.Gene(pos);
    private char laby[][] = Laby.getLaby();
    //boolean laby[][] = Laby.GeneBool(lab);

    public void paintComponent(Graphics g) {
        //x1, y1, width, height, arcWidth, arcHeight
        // g.drawRoundRect(10, 10, 30, 50, 10, 10);
        //g.fillRoundRect(j*100, k*100, 100, 100, 5, 5);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, this.getWidth(), this.getHeight());
        g.setColor(Color.darkGray);

        for (int k = 0; k < 32; k++) {
            for (int j = 0; j < 28; j++) {
                if (laby[k][j] == '#') {

                    g.fillRect(j * 20, k * 20, 20, 20);
                }
                if (laby[k][j] == 'D') {
                    try {
                        Image img = ImageIO.read(new File("imagepacman.png"));
                        g.drawImage(img, j * 20 - 10, k * 20 - 10, 40, 40, this);
                        //Pour une image de fond

                        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (laby[k][j] == 'P') {
                    try {
                        Image img = ImageIO.read(new File("pastille.png"));
                        g.drawImage(img, j * 20 + 7, k * 20 + 7, 3, 3, this);
                        //Pour une image de fond

                        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                if (laby[k][j] == 'B') {
                    try {
                        Image img = ImageIO.read(new File("Fantomebleu.png"));
                        g.drawImage(img, j * 20 + 7, k * 20 + 7, 16, 16, this);
                        //Pour une image de fond

                        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                }
                if (laby[k][j] == 'R') {
                    try {
                        Image img = ImageIO.read(new File("Fantomerouge.png"));
                        g.drawImage(img, j * 20 + 7, k * 20 + 7, 13, 13, this);
                        //Pour une image de fond

                        //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    if (laby[k][j] == 'V') {
                        try {
                            Image img = ImageIO.read(new File("fantomevert.png"));
                            g.drawImage(img, j * 20 + 7, k * 20 + 7, 40, 40, this);
                            //Pour une image de fond

                            //g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        }
    }
}