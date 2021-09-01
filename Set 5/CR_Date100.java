// The "CR_Date100" class.
import java.awt.*;
import hsa.Console;

public class CR_Date100
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int shortyear;
	int century;
	century = (1977/100);
	century++;
	shortyear = (1977%100);
	c.clear ();
	c.println ("The year is: " + century + shortyear);


    } // main method
} // CR_Date100 class
