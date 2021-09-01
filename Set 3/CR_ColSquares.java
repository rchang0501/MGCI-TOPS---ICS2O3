/*The ColSquares Java Class
Ryan Chang
September 20
ICS203-03
Making overlapping coloured squares in java
*/

// The "CR_ColSquares" class.
import java.awt.*;
import hsa.Console;

public class CR_ColSquares
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();

	c.setColor (Color.blue);
	c.fillRect (0,0, 500, 500);
	c.setColor (Color.yellow);
	c.fillRect (50,50, 400, 400);
	c.setColor (Color.green);
	c.fillRect (100, 100, 300, 300);
	c.setColor (Color.red);
	c.fillRect (150, 150, 200, 200);
    } // main method
} // CR_ColSquares class
