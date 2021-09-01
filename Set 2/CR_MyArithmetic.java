/*The MyArithmetic Java Class
Ryan Chang
Sept 18
ICS203-03
MyArtithmetic
*/

// The "CR_MyArithmetic" class.
import java.awt.*;
import hsa.Console;

public class CR_MyArithmetic
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("12345678901234567890123456789012345678901234567890");
	c.print (57.654, 10, 1);
	c.println (-17, 23);
	c.println ("\n");
	c.setCursor (4, 10);
	c.println ("Integers are a subset of Real numbers");
	c.println ();
	c.println (8754.77 - 652.876 + 423.754 * 0.5, 30, 3);

    } // main method
} // CR_MyArithmetic class
