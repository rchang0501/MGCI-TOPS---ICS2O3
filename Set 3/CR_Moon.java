/*The Moon Java Class
Ryan Chang 
September 20
ICS203-03
Making a moon with java
*/

// The "CR_Moon" class.
import java.awt.*;
import hsa.Console;

public class CR_Moon
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	c.setColor (Color.black); 
	c.fillRect (0,0, 10000000, 100000);
	c.setColor (Color.yellow);
	c.fillOval (135, 150, 200, 200);
	c.fillStar (50, 50, 50, 50);
	c.fillStar (260, 30, 50, 50);
	c.fillStar (550, 350, 50, 50);
	c.fillStar (500, 150, 50, 50);
	c.fillStar (400, 400, 50, 50);
	c.fillStar (70, 370, 50, 50);
	c.setColor (Color.black);
	c.fillOval (195, 175, 150, 150);
	

	} // main method
} // CR_Moon class
