package h05;

import java.awt.*;
import java.applet.Applet;

public class Opdracht1 extends Applet
{
    public void paint(Graphics g)
    {
        setSize(1000, 1000);

        // Kleuren Variables
        Color zwart = Color.BLACK, roze = Color.MAGENTA;

        // Integers variables
        int x = 90, y = 50, xx = 20, yy = 50, yyy = 65;

        g.drawLine(x, y, xx, yy);
        g.drawString("Lijn", xx, yyy);


    }
}
