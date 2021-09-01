/*The MoveCursor Java Class
Ryan Chang
Date
ICS203-03
MoveCursor
*/

// The "CR_MoveCursor" class.
import java.awt.*;
import hsa.Console;

public class CR_MoveCursor
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c.setCursor (1, 45);
	//(x, y) x=the line that the text will be on, y=the space it will be on in that line 
	c.print ("Hello");

    } // main method
} // CR_MoveCursor class
