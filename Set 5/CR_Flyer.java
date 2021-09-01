// The "CR_Flyer" class.
import java.awt.*;
import hsa.Console;

public class CR_Flyer
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
	c.print ("", 20 - "ETHNIK".length () / 2);
	c.println ("ETHNIK");
	c.print ("", 20 - "AFRIKA".length () / 2);
	c.println ("AFRIKA");
	c.print ("", 20 - "Ethnic gear at low prices".length () / 2);
	c.println ("Ethnic gear at low prices");
	c.println ("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
	c.print ("WEDNESDAY");
	c.print ("", 40 - "Fleamarket".length ());
	c.println ("Fleamarket");
	c.print ("SATURDAY");
	c.print ("", 40 - "Bruma Lake".length ());
	c.println ("Bruma Lake");
	c.print ("SUNDAY");
	c.print ("", 40 - "Stand43".length ());
	c.println ("Stand43");
	c.println ("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");


    } // main method
} // CR_Flyer class
