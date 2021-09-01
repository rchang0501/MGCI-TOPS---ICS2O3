/*Ryan Chang
October 16, 2018
ICS203-03
The Division Java Class*/

// The "CR_Divison" class.
import java.awt.*;
import hsa.Console;

public class CR_Divison
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("INTEGER DIVISION");
	c.println ();
	int num1, num2;
	c.println ("Type in an integer");
	num1 = c.readInt ();
	c.println ("Type in an integer");
	num2 = c.readInt ();
	c.print ("\n");
	c.println ("The answer to " + num1 + " divided by " + num2 + " is " + (num1 / num2));


    } // main method
} // CR_Divison class
