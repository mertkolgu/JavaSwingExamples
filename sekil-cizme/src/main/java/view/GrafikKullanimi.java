package view;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class GrafikKullanimi extends JPanel {
    
    public GrafikKullanimi() {
        setBackground(Color.black);
    }
    
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);

        // içi boş dikdörtgen çizer
        g.drawRect(100, 10, 60, 80);

        // içi dolu diktörgen çizer
        g.fillRect(200, 100, 60, 80);
        
        g.setColor(Color.blue);
        
        // içi boş daire çizer
        g.drawOval(200, 200, 60, 60);
        
        // içi dolu daire çizer
        g.fillOval(300, 300, 60, 60);
        
        g.setColor(Color.yellow);
        
        // çizgi çizer
        g.drawLine(100, 100, 300, 300);
    }
}
