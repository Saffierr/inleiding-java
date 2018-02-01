package h04;

import java.awt.*;
import java.applet.Applet;

public class Opdracht6 extends Applet
{
    public void paint(Graphics g)
    {
        setSize(1000, 1000);
        g.setColor(Color.GRAY);
        g.fillRect(210, 270, 15, 100);
        g.drawRect(210, 270, 15, 100);


        g.setColor(Color.BLACK);
        g.fillRect(200, 150, 35, 120);
        g.drawRect(200, 150, 35, 120);

        g.setColor(Color.RED);
        g.fillOval(210, 150, 15, 25);
        g.drawOval(210, 150, 15, 25);

        g.setColor(Color.ORANGE);
        g.fillOval(210, 195, 15, 25);
        g.drawOval(210, 195, 15, 25);

        g.setColor(Color.GREEN);
        g.fillOval(210, 240, 15, 25);
        g.drawOval(210, 240, 15, 25);
    }
}
