package h04;

import java.awt.*;
import java.applet.Applet;

public class PraktijkOpdracht extends Applet
{
    public void paint(Graphics g)
    {
        setSize(1000, 1000);

        // Lijn
        int messi = 90;
        Color lol = Color.MAGENTA;
        g.drawLine(messi, 50, 20, 50);
        g.drawString("Lijn", 20, 65);

        // Rechthoek
        g.drawRect(20, 80, 180, 90);
        g.drawString("Rechthoek", 20, 185);

        // Gevulde rechthoek met ovaal
        g.setColor(lol);
        g.fillRect(20, 230, 180, 90);
        g.setColor(Color.BLACK);
        g.drawRect(20, 230, 180, 90);
        g.drawOval(20, 230, 180, 90);
        g.drawString("Gevulde rechthoek met ovaal", 20, 335);

        // Taartpunt met ovaal eromheen
        g.drawOval(20, 360, 180, 90);
        g.setColor(Color.MAGENTA);
        g.fillArc(30, 366, 110, 50, 845, 45);
        g.setColor(Color.BLACK);
        g.drawString("Taartpunt met ovaal eromheen", 20, 470);

        // Afgeronde rechthoek
        g.drawRoundRect(20, 500, 180, 90, 30, 30);
        g.setColor(Color.BLACK);
        g.drawString("Afgeronde rechthoek", 20, 605);

        // Gevulde ovaal
        g.setColor(Color.MAGENTA);
        g.fillOval(300, 80, 180, 90);
        g.drawOval(300, 80, 180, 90);
        g.setColor(Color.BLACK);
        g.drawString("Gevulde ovaal", 350, 185);

        // Cirkel
        g.drawOval(330, 210, 90, 90);
        g.drawString("Cirkel", 360, 320);
    }
}
