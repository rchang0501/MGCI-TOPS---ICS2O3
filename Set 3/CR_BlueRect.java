/*The BlueRect Java Class
Ryan Chang
September 20
BlueRect
Making rectangles and setting them at locations
*/

// The "CR_BlueRect" class.
import java.awt.*;
import hsa.Console;

public class CR_BlueRect
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//3.1.1 and 3.1.2 and 3.1.3
	c.setColor (Color.blue);
	c.fillRect (635, 0, 5, 5);
	//(x,y,l,h)
	c.setColor (Color.red);
	c.fillRect (0, 495, 5, 5);
	c.setColor (Color.green);
	c.fillRect (0, 0, 5, 5);
	c.setColor (Color.yellow);
	c.fillRect (635, 495, 5, 5);
	c.setColor (Color.pink);
	c.fillRect (312, 215, 5, 5);

    } // main method
} // CR_BlueRect class
