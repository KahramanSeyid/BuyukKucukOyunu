
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BuyukKucukOyunu {
  public static void main(String[] args) {
    JLabel[] deste = new JLabel[53];
    for(int no=0; no<deste.length; no++) {
      deste[no] = new JLabel(new ImageIcon("src/iskambil/k"+no+".png"));
    }
    int puan = 0;
    boolean oyunDevam = true;
    Object dugmeler[] = {"Küçük", "Büyük", "ÇIKIŞ"};
    int eskiKagitNo = (int)(Math.random() * 52) + 1; // ilk kağıt
    int yeniKagitNo = 0;
    do {
      Object ekran[] = new Object[2]; // kağıtlar için
      ekran[0] = deste[eskiKagitNo];
      ekran[1] = deste[yeniKagitNo];
      int cevap = JOptionPane.showOptionDialog(null, ekran, 
              "Küçük Büyük Oyunu PUAN = " + puan, 
              JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE,
              null, dugmeler, dugmeler[2]);
      int mod = eskiKagitNo % 13; // bir seride 13 kağıt var
      int eskiKagitDeger = mod == 0 ? 13 : mod;
      eskiKagitNo = yeniKagitNo;
      yeniKagitNo = (int)(Math.random() * 52) + 1;
      mod = yeniKagitNo % 13;
      int yeniKagitDeger = mod == 0 ? 13 : mod;
      if(cevap == 0){
        if(yeniKagitDeger < eskiKagitDeger){
          puan += 10;
        } else {
          puan -= 5;
        }              
      } 
      if(cevap == 1){
        if(yeniKagitDeger > eskiKagitDeger){
          puan += 10;
        } else {
          puan -= 5;
        }              
      } 
      if(cevap == 2) oyunDevam = false;      
    } while(oyunDevam);
    JOptionPane.showMessageDialog(null, "Oyun Bitti!\nPuan = " + puan);
  }
}
