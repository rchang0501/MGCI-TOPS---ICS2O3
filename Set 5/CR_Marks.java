// The "CR_Marks" class.
import java.awt.*;
import hsa.Console;

public class CR_Marks
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	c.println ("123456789012345678901234567890");
	c.print ("Refiloe Bob");
	c.println (82, 25 - "Refiloe Bob".length() );
	c.print ("Anna");
	c.println (67,25 - "Anna".length() );
	c.print ("Timothy");
	c.println(75,25 - "Timothy".length() );

	
	} // main method
} // CR_Marks class
