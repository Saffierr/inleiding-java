package h04;

import java.awt.*;
import java.applet.Applet;

public class Opdracht4 extends Applet
{
    public void paint(Graphics g)
    {
        setSize(1000,1000);

        g.drawLine(310, 100, 310, 430);
        g.drawLine(310, 430, 630, 430);

        /* Legenda links */
        g.drawString("KG", 290, 430);
        g.drawString("20", 290, 370);
        g.drawString("40", 290, 300);
        g.drawString("60", 290, 230);
        g.drawString("80", 290, 160);
        g.drawString("100", 287, 110);

        /* Namen */
        g.setColor(Color.BLUE);
        g.drawString("Jeroen", 310, 445);
        g.setColor(Color.GREEN);
        g.drawString("Hans", 450, 445);
        g.setColor(Color.RED);
        g.drawString("Valerie", 590, 445);

        /* staven */
        g.setColor(Color.BLUE);
        g.drawRect(315, 100, 30, 330);
        g.fillRect(315, 100, 30, 330);

        g.setColor(Color.GREEN);
        g.drawRect(455, 155, 30, 275);
        g.fillRect(455, 155, 30, 275);

        g.setColor(Color.RED);
        g.drawRect(595, 290, 30, 140);
        g.fillRect(595, 290, 30, 140);
    }
}
