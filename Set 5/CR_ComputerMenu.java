// The "CR_ComputerMenu" class.
import java.awt.*;
import hsa.Console;

public class CR_ComputerMenu
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.print ("", 40 - "MEGABYTE MENU".length () / 2);
	c.println ("MEGABYTE MENU");
	c.print ("\n");
	c.print ("", 40 - "STARTERS".length () / 2);
	c.println ("STARTERS");
	c.print ("", 40 - "Hot keys - hot Mexicain chilli chips".length () / 2);
	c.println ("Hot keys - hot Mexicain chilli chips");
	c.print ("", 40 - "Data - be surprised and try this starter".length () / 2);
	c.println ("Data - be surprised and try this starter");

    } // main method
} // CR_ComputerMenu class
