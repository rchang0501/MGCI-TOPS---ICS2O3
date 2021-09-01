// The "CR_ConvertTemp" class.
import java.awt.*;
import hsa.Console;

public class CR_ConvertTemp
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int C, hi, bye;
	double F;
	C = 100;
	hi = 1;
	bye = 1;

	do
	{
	    F = (9.0 / 5.0 * C + 32);
	    int f = (int) (F);
	    c.print (C);
	    c.print ("°C");
	    c.print (f, 20);
	    c.print ("°F");
	    c.println ();
	    C++;
	}
	while (C <= 280);
    } // main method
} // CR_ConvertTemp class


