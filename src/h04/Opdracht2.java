package h04;

import java.awt.*;
import java.applet.Applet;

public class Opdracht2 extends Applet
{
    public void init()
    {

    }
    public void paint(Graphics g)
    {

        /* Opdracht 4.2 - Huis met raam en deur */
        g.drawRect(265, 320, 150, 150);
        g.drawRect(355, 420, 30, 50);
        g.drawRect(290, 350, 35, 35);
        g.drawLine(265, 320, 330, 190);
        g.drawLine(415, 320, 330, 188);
    }
}
