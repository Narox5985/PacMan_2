
import javax.swing.JFrame;

public class Fenetre extends JFrame {
    public static Panneau pan = new Panneau();

    public Fenetre() {
        this.setTitle("PACMAN TOTO BEN");
        this.setSize(565, 800);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setContentPane(pan);
    }

    public static void main(String[] args) throws InterruptedException {
        Fenetre fen = new Fenetre();
        int[] pos = {24, 14};
        int[] posfb = {15, 11};
        int[] posfr = {15, 13};
        int[] posfv = {15, 15};
        Fantome.setPosfb(posfb);
        Fantome.setPosfr(posfr);
        Fantome.setPosfv(posfv);
        Pacman.setPos(pos);
        char[][] laby = Laby.Gene(pos, posfb, posfr, posfv);
        boolean[][] labybool = Laby.GeneBool(laby);
        Laby.Afficher(Laby.Gene(pos, posfb, posfr, posfv));


        Pacman.Deplacement(Pacman.Testdeplacement(labybool));
        Fantome.DeplacementFantR(Fantome.TestdeplacementFantR(labybool));
        Fantome.DeplacementFantB(Fantome.TestdeplacementFantB(labybool));
        Fantome.DeplacementFantV(Fantome.TestdeplacementFantV(labybool));



    }
}
