// The "CR_NestedTrace" class.
import java.awt.*;
import hsa.Console;

public class CR_NestedTrace
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int num = 1;
	for (int r = 1 ; r <= 3 ; r++)
	{
	    for (int C = 1 ; C <= r ; C++)
	    {
		c.print (num);
		num++;
	    }
	    c.println ();
	}

    } // main method
} // CR_NestedTrace class
