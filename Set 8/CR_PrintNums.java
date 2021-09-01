// The "CR_PrintNums" class.
import java.awt.*;
import hsa.Console;

public class CR_PrintNums
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int num = 0;

	for (int loop = 1 ; loop >= 0 && loop <=5 ; loop = loop + 1)
	{
	    c.println ("I love pencils"); 
	}
	c.println ("the loop has ended now.");

    } // main method
} // CR_PrintNums class
