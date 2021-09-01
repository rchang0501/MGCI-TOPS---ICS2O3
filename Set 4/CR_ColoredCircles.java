/*Ryan Chang
October 11
ICS203-03
The Colored Circles Java Class*/

// The "CR_ColoredCircles" class.
import java.awt.*;
import hsa.Console;

public class CR_ColoredCircles
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int red, blue;
	c.println ("This program will draw one red and one blue circle.");
	c.println ();
	c.println ("Insert a value between 100-300 for the size of the red circle.");
	red = c.readInt ();
	c.println ("Insert a value between 50-150 for the size of the blue circle.");
	blue = c.readInt ();
	c.clear ();
	c.setColor (Color.red);
	c.drawOval (50, 100, red, red);
	c.setColor (Color.blue);
	c.drawOval (400, 100, blue, blue);

    } // main method
} // CR_ColoredCircles class
