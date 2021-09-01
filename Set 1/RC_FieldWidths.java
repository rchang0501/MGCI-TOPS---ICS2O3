/*The FieldWidths Java Class
Ryan Chang
September 12, 2018
ICS203-03
FieldWidths
*/

// The "RC_FieldWidths" class.
import java.awt.*;
import hsa.Console;

public class RC_FieldWidths
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c.print ("1234567890");
	c.println ("123456789012345");
	//First, display column numbers
	c.print ("Hello", 6);
	c.print ("Hello", 6);
	c.print ("Hello", 6);
	c.print ("Hello");
	c.println ();
	c.println ();
	c.println ("1234567890123456789012345678901234567890");
	c.print ("Hello", 12);
	c.print ("Hello", 12);
	c.print ("Hello");
	c.println ();
	c.println ();
	c.println ("12345678901234567890");
	c.print ("", 5);

	c.println ("COMPUTER STUDIES");
	c.println ();
	c.print ("", 5);
	c.print ("Theory", 15);
	c.println ("Practical");
    } // main method
} // RC_FieldWidths class
