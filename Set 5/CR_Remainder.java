/*Ryan Chang
October 16, 2018
ICS203-03
The Remainder Java Class*/

// The "CR_Remainder" class.
import java.awt.*;
import hsa.Console;

public class CR_Remainder
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("FINDING THE REMAINDER");
	c.println ();
	double num1, num2;
	c.println ("Type in an integer");
	num1 = c.readDouble ();
	c.println ("Type in an integer");
	num2 = c.readDouble ();
	c.print ("\n");
	c.println ("The remainder when " + num1 + " is divided by " + num2 + " is " + (num1 % num2));


    } // main method
} // CR_Remainder class
