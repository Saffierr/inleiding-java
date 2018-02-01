package h04;

import java.awt.*;
import java.applet.Applet;

public class Opdracht1 extends Applet
{
    public void init()
    {

    }
    public void paint(Graphics g)
    {
        /* Opdracht 4.1 - Gelijkbenige driehoek */
        setBackground(Color.blue);
        g.setColor(Color.yellow);

        g.drawLine(185, 150, 220, 240);
        g.drawLine(185, 150, 150, 240);
        g.drawLine(220, 240, 150, 240);
    }
}
