/*The Circles Java Class
Ryan Chang
September 20
ICS203-03
Making circles with java
*/

// The "CR_Circles" class.
import java.awt.*;
import hsa.Console;

public class CR_Circles
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c.setColor (Color.magenta);
	c.fillOval (225,150,250,250);
	//c.drawOval is just the outline of the circle 

    } // main method
} // CR_Circles class
