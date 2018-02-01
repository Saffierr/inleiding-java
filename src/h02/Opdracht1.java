package h02;

import java.awt.*;
import java.applet.Applet;

public class Opdracht1 extends Applet
{
    public void init()
    {
        setBackground(Color.BLUE);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.drawString("Anil Küçük!", 70, 160);
    }
}


