package h04;

import java.awt.*;
import java.applet.Applet;

public class Opdracht7 extends Applet
{
    public void paint(Graphics g)
    {
        setSize(1000, 1000);
        setBackground(Color.GRAY);
        g.setColor(Color.BLACK);
        g.fillRect(150, 200, 150, 110);
        g.drawRect(150, 200, 150, 110);

        g.setColor(Color.WHITE);
        g.fillOval(155, 205, 20, 20);
        g.drawOval(155, 205, 20, 20);

        g.setColor(Color.WHITE);
        g.fillOval(275, 205, 20, 20);
        g.drawOval(275, 205, 20, 20);

        g.setColor(Color.WHITE);
        g.fillOval(155, 285, 20, 20);
        g.drawOval(155, 285, 20, 20);

        g.setColor(Color.WHITE);
        g.fillOval(275, 285, 20, 20);
        g.drawOval(275, 285, 20, 20);
    }
}
