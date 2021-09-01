/*Ryan Chang
Sept 25, 2018
ICS203-03
Working with the first loop*/

// The "CR_FirstLoop" class.
import java.awt.*;
import hsa.Console;

public class CR_FirstLoop
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.setColor (Color.black);
	c.fillRect (0, 0, 10000, 10000);

	int x1;
	int y1;
	for (x1 = 1, y1 = 20 ; x1 > 0 ; x1++, y1 += 1)
	{
	    c.setColor (Color.black);
	    c.fillRect (0, 0, 10000, 10000);
	    /*c.setColor (Color.yellow);
	    c.fillStar (100, 10, 20, 20);
	    c.fillStar (40, 300, 20, 20);
	    c.fillStar (300, 175, 20, 20);
	    c.fillStar (500, 375, 20, 20);
	    c.fillStar (600, 75, 20, 20);*/
	    c.setColor (Color.yellow);
	    c.fillStar (x1 + 304, y1 + 50, 50, 50);
	    //c.setColor (Color.orange);
	    //c.fillStar (x1 + 44, y1 + 10, 50, 50);
	    try
	    {
		Thread.sleep (20);
	    }
	    catch (InterruptedException ie)
	    {
		ie.printStackTrace ();
	    }
	}
    } // main method
} // CR_FirstLoop class
