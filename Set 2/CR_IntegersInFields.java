/*The IntegersInFields Java Class
Ryan Chang
Date
ICS203-03
IntegersInFields
*/

// The "CR_IntegersInFields" class.
import java.awt.*;
import hsa.Console;

public class CR_IntegersInFields
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//2.7.2
	c.println ("12345678901234567890");
	c.print ("35", 7);
	c.print ("999", 5);
	c.println ();
	c.println ("12345678901234567890");
	c.print (35, 7);
	c.print (999, 5);
	c.println ();
	c.print ("Strings are left justified, but numbers are right justified in a field.");

    } // main method
} // CR_IntegersInFields class
