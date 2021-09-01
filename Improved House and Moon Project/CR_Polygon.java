/* Ryan Chang
ICS2O3-03
Sep 24 2018
Polygon and Colours Program
Using colours and working with Horizontal and vertical*/

import java.awt.*;
import hsa.Console;

public class CR_Polygon
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	Color col = new Color (100, 100, 100);
	c.setColor (col);

	Color col2 = (Color.cyan);
	c.setColor (col2);
	int Horizontal3[] = {300, 500, 400, 200, 100};
	int Vertical3[] = {0, 175, 375, 375, 175};
	c.fillPolygon (Horizontal3, Vertical3, 5);

    }
}
