/*Ryan Chang
October 11
ICS203-03
The Prices Java Class*/

// The "CR_Prices" class.
import java.awt.*;
import hsa.Console;

public class CR_Prices
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	String name1, name2, name3;
	double price1, price2, price3;

	c.println ("MAKE A SHOPPING LIST");
	c.println ();
	c.println ("Insert a product name");
	name1 = c.readString ();
	c.println ("Inset price");
	price1 = c.readDouble ();
	c.println ("Insert a product name");
	name2 = c.readString ();
	c.println ("Inset price");
	price2 = c.readDouble ();
	c.println ("Insert a product name");
	name3 = c.readString ();
	c.println ("Inset price");
	price3 = c.readDouble ();

	c.clear ();

	c.println ();
	c.println ("SHOPPING LIST");
	c.print (name1 + "\t");
	c.println (price1, 0, 2);
	c.print (name2 + "\t");
	c.println (price2, 0, 2);
	c.print (name3 + "\t");
	c.println (price3, 0, 2);

    } // main method
} // CR_Prices class
