package h02;

import java.awt.*;
import java.applet.*;

public class Opdracht2 extends Applet
{
    public void init()
    {
        setBackground(Color.WHITE);
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.drawString("Naam: Anil", 50, 60);
        g.setColor(Color.RED);
        g.drawString("Achternaam: Kucuk", 50, 80);
    }
}