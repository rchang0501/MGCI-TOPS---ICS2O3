// The "CR_Stocks" class.
import java.awt.*;
import hsa.Console;

public class CR_Stocks
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.println ("Col 1           Col23           Col41");
	c.print ("ITEM          ");
	c.print ("ITEM CODE         ");
	c.println ("QUANTITY");
	c.print ("T-shirt");
	c.print (537, 0 + "T-shirt Quantity".length ());
	//c.println(537, 16);

    } // main method
} // CR_Stocks class
