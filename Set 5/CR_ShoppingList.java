// The "CR_ShoppingList" class.
import java.awt.*;
import hsa.Console;

public class CR_ShoppingList
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("123456789012345678901234567890");
	c.setCursor (2, 5);
	c.println ("SHOPPING LIST");
	c.print ("\n");
	c.print ("Box of disks");
	c.println (43.95, 26 - "Box of disks".length ());
	c.print ("Computer");
	c.println (4999.99, 26 - "Computer".length ());
	c.print ("Printer");
	c.println (899.50, 26 - "Printer".length ());
	c.print ("MS Works");
	c.println (450.00, 26 - "MS Works".length ());
	c.setCursor (8, 20);
	c.println ("--------");
	c.print ("TOTAL AMOUNT: "); 
	c.println((43.95 + 4999.99 + 899.50 + 450.00), 25 - "TOTAL AMOUNT".length ());

    } // main method
} // CR_ShoppingList class
