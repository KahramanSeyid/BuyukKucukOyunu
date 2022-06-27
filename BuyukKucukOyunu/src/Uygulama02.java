
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Uygulama02 {
  public static void main(String[] args) {
    String resimYol = "src/iskambil/";
    ImageIcon resim = new ImageIcon(resimYol + "k15.png");
    JLabel etiket = new JLabel("Karo 2");
    etiket.setIcon(resim);
    JOptionPane.showMessageDialog(null, etiket);
  }
}
