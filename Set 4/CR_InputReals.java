/*Ryan Chang
October 11
ICS203-03
The Input Reals Java Class*/

// The "CR_InputReals" class.
import java.awt.*;
import hsa.Console;

public class CR_InputReals
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	double num1, num2;
	c.println ("Type in a Real Number");
	num1 = c.readDouble ();
	c.println ("Type in another Real Number");
	num2 = c.readDouble ();
	c.print ("\n");
	c.print ("The first real number entered was ");
	c.println (num1, 0, 3);
	c.print ("The second real number entered was ");
	c.println (num2, 0, 3);
	c.print ("\n");
	c.print ("The cost is $");
	c.println (123.7567, 0, 2);

    } // main method
} // CR_InputReals class
