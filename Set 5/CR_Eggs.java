// The "CR_Eggs" class.
import java.awt.*;
import hsa.Console;

public class CR_Eggs
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	int eggs;
	c.println("How many eggs does the shop have?");
	eggs = c.readInt();
	c.clear();
	c.print ("The number of dozens in the box is ");
	c.println ((eggs/12));

	} // main method
} // CR_Eggs class
