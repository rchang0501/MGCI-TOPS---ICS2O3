// The "CR_MaxNums" class.
import java.awt.*;
import hsa.Console;

public class CR_MaxNums
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int num, max, nums;
	c.println ("Enter how many numbers there are");
	num = c.readInt ();
	c.println ("Enter the first number");
	max = c.readInt ();

	for (int i = 1 ; i <= (num - 1) ; i++)
	{
	    c.println ("Enter a number");
	    nums = c.readInt ();
	    if (nums > max)
	    {
		nums = max;
	    }
	}
	c.println ("The biggest number is " + max);

    } // main method
} // CR_MaxNums class


