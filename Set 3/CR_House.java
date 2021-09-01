/*The House Java Class
Ryan Chang 
September 20
ICS203-03
Making a house with java
*/

// The "CR_House" class.
import java.awt.*;
import hsa.Console;

public class CR_House
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	//3B
	c.setColor (Color.blue);
	c.fillRect (200, 200, 200, 200);
	c.setColor (Color.green);
	c.fillRect (275, 325, 50, 75);
	c.setColor (Color.yellow);
	c.fillRect (235, 250, 40, 40);
	c.fillRect (325, 250, 40, 40);
	c.setColor (Color.red);
	c.fillRect (175, 160, 250, 40);
	c.setColor (Color.black);
	c.fillRect (235, 120, 30, 40);
	c.setColor (Color.cyan);
	c.fillOval (160, 60, 50, 50);
	c.fillOval (100, 50, 40, 40);
	c.fillOval (40, 40, 30, 30);

	} // main method
} // CR_House class
