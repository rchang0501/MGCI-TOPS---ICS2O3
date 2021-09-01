/*The StringsAndNumbers Java Class
Ryan Chang
Date
ICS203-03
StringsAndNumbers
*/

// The "CR_StringsAndNumbers" class.
import java.awt.*;
import hsa.Console;

public class CR_StringsAndNumbers
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//2.8
	c.println ("An example of an integer is " + 4);
	c.println ("An example of a real number is " + 7.25);
	c.print ("Adding an integer to a real number, such as 4 + 7.25");
	c.print (" gives real result: ");
	c.println (4 + 7.25);
	//these are 2 statements in the previous section of code that include: 4+7.25
	//The one statement displays 4 + 7.25 as is, while the other statement performs arithmetic and displays the result 11.25
	c.println ();
	c.print ("The result is ");
	c.println (765.5678, 0, 2);

	//Exercise 2F:
	c.print ("\n");
	//1.
	c.println (17 - 7 + 33 * 2);
	c.println (20 * 4 - 9 * 7);
	//2.
	c.println ("123456789012345");
	c.println (34567, 10);
	c.println (34567, 7);
	c.println (34567, 3);
	//3
	c.println ("123456789012345");
	c.println (123.456, 10);
	c.println (123.456, 5);
	c.println (123.456, 4);
	c.println (123.456, 3);
	c.println (123.456, 2);
	//4
	c.println ("123456789012345");
	c.println (54.375, 8, 2);
	c.println (54.375, 8, 0);
	c.println (54.375, 0, 8);


    } // main method
} // CR_StringsAndNumbers class
