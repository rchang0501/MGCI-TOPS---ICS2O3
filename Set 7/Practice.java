// The "Practice" class.
import java.awt.*;
import hsa.Console;

public class Practice
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int sales;
	double commission;
	c.print ("Enter you total sales: ");
	sales = c.readInt ();
	if (sales > 0 && sales <= 500)
	{
	    commission = (sales * 0.02);
	}
	else
	    if (sales > 500 && sales <= 5000)
	    {
		commission = (sales * 0.05);
	    }

	else
	{
	    commission = (sales * 0.08);
	}
	c.println ("you saels are $" + sales);
	c.print ("Your comission is $");
	c.println (commission, 0, 2);
	c.print ("Your total income is $");
	c.println ((commission + sales), 0, 2);

    } // main method
} // Practice class
