package h04;

import java.awt.*;
import java.applet.Applet;

public class Opdracht3 extends Applet
{
    public void paint(Graphics g)
    {
        int lol = 83, messi = 33;
        /* colours */
        g.setColor(Color.RED);
        g.fillRect(325, 50, 200, 33);

        g.setColor(Color.BLUE);
        g.fillRect(325, 117, 200, 33);

        g.setColor(Color.GRAY);
        g.fillRect(310, 50, 15, 220);


        /* design */
        g.drawRect(310, 50, 15, 220);
        g.drawRect(325, 50, 200, 100);
        g.drawRect(325, 50, 200, 33);
        g.drawRect(325, lol, 200, messi);
    }
}
