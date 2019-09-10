package view;

import java.awt.HeadlessException;
import javax.swing.JFrame;

public class AnaEkran extends JFrame {
    
    public AnaEkran(String title) throws HeadlessException {
        super(title);
    }
    
    public static void main(String[] args) {
        GrafikKullanimi grafikKullanimi = new GrafikKullanimi();
        AnaEkran anaEkran = new AnaEkran("Grafik Kullanımı");
        
        anaEkran.setVisible(true);
        anaEkran.setResizable(true);
        anaEkran.setSize(1024, 720);
        anaEkran.setLocationRelativeTo(null);
        anaEkran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        anaEkran.add(grafikKullanimi);
    }
}
