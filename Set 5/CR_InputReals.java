/*Ryan Chang
October 12, 2018
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
	//Adding Real Numbers 
	double num1, num2;
	c.println ("Type in a Real Number");
	num1 = c.readDouble ();
	c.println ("Type in another Real Number");
	num2 = c.readDouble ();
	c.print ("\n");
	c.clear ();
	c.println ("The first real number entered was " + num1);
	c.println ("The second real number enetered was " + num2);
	c.print ("The sum of the 2 numbers is "); 
	c.println ((num1 + num2), 0, 1);

	//Subtracting Real Numbers 
	c.print ("\n");
	double num3, num4;
	c.println ("Type in a Real Number");
	num3 = c.readDouble ();
	c.println ("Type in another Real Number");
	num4 = c.readDouble ();
	c.print ("\n");
	c.clear ();
	c.println ("The first real number entered was " + num3);
	c.println ("The second real number enetered was " + num4);
	c.println ("The difference of the 2 numbers is " + (num3 - num4));

	//Multiplying Real Numbers 
	c.print ("\n");
	double num5, num6;
	c.println ("Type in a Real Number");
	num5 = c.readDouble ();
	c.println ("Type in another Real Number");
	num6 = c.readDouble ();
	c.print ("\n");
	c.clear ();
	c.println ("The first real number entered was " + num5);
	c.println ("The second real number enetered was " + num6);
	c.println ("The product of the 2 numbers is " + (num5 * num6));

    } // main method
} // CR_InputReals class
