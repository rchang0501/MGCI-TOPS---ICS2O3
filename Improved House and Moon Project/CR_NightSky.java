/*Ryan Chang
September 28, 2018
ICS203-03
Making a very boss moon*/

// The "CR_NightSky" class.
import java.awt.*;
import hsa.Console;

public class CR_NightSky
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//Night Sky Gradient
	c.setColor (new Color (35, 19, 113));
	c.fillRect (0, 0, 640, 480);
	for (int i = 0 ; i < 113 ; i++)
	{
	    if (i <= 10)
		c.setColor (new Color (35 - i, 19 - i, 113 - i));
	    if (i > 25 && i <= 19)
		c.setColor (new Color (0, 19 - i, 113 - i));
	    if (i > 0)
		c.setColor (new Color (0, 0, 113 - i));

	    c.fillRect (0, 0, c.getWidth (), c.getHeight () - i * 5);
	}

	//Mobster Moon
	c.setColor (Color.gray);
	c.fillOval (5, 5, 100, 100);



    } // main method
} // CR_NightSky class
