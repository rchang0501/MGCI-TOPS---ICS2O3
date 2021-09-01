/*Ryan Chang
October 11
ICS203-03
The InputRect Java Class*/

// The "CR_InputRect" class.
import java.awt.*;
import hsa.Console;

public class CR_InputRect
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	int length, breadth;
	c.println ("RECTANGLE PROGRAM");
	c.print ("Type in the length of the rectangle and <Enter>: ");
	length = c.readInt ();
	c.print ("Type in the breadth of the rectangel and <Enter>: ");
	breadth = c.readInt ();
	c.setColor (Color.green);
	c.fillRect (100, 100, length, breadth);
    } // main method
} // CR_InputRect class
