/*Ryan Chang
October 16, 2018
ICS203-03
The Division2 Java Class*/

// The "CR_Divison2" class.
import java.awt.*;
import hsa.Console;

public class CR_Divison2
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("REAL NUMBER DIVISION");
	c.println ();
	int num1;
	double num2;
	c.println ("Type in an integer");
	num1 = c.readInt ();
	c.println ("Type in a real number");
	num2 = c.readDouble ();
	c.print ("\n");
	c.print ("The answer to " + num1 + " divided by " + num2 + " is ");
	c.println ((num1 / num2), 0, 3);


    } // main method
} // CR_Divison class
