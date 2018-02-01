package h04;

import java.awt.*;
import java.applet.Applet;

public class Opdracht5 extends Applet
{
    public void paint(Graphics g)
    {
        setBackground(Color.BLUE);
        g.setColor(Color.YELLOW);
        g.fillArc(150, 150, 300, 150, 0, 360);
    }
}
