
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Uygulama01 {
  public static void main(String[] args) {
    Font font = new Font("Serif", Font.BOLD, 48);
    JLabel etiket = new JLabel("JAVA");
    etiket.setFont(font);
    Color renk = new Color(255, 100, 0); // RGB kodları
    etiket.setOpaque(true); // matlaştırma
    etiket.setBackground(renk);
    etiket.setForeground(Color.white);
    JOptionPane.showMessageDialog(null, etiket);
  }
}
