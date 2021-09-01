// The "CR_CentreDisplay" class.
import java.awt.*;
import hsa.Console;

public class CR_CentreDisplay
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("12345678901234567890123456789012345679901234567890123456789012345678901234567890");
	String sent;
	sent = "SALE! ALL GOODS HALF PRICE TODAY";
	c.print (" ", 40 - sent.length () / 2);
	c.println (sent);

    } // main method
} // CR_CentreDisplay class
