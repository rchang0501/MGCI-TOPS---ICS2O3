// The "CR_DollarTri" class.
import java.awt.*;
import hsa.Console;

public class CR_DollarTri
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	for (int row = 1 ; row <= 10 ; row++)
	{
	c.print ("", 10-row); 
	    for (int column = 1 ; column < row+1; column++)
	    {
		c.print ("$");
	    }
	    c.println ();
	}

    } // main method
} // CR_DollarTri class
