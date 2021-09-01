// The "CR_PrintStars" class.
import java.awt.*;
import hsa.Console;

public class CR_PrintStars
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	int num;
	char character;
	c.println ("Input num");
	num = c.readInt ();

	for (int i = 1 ; i <= num ; i++)
	{
	    c.println ("*");
	    c.println ("Enter anything to continue");
	    character = c.readChar ();

	}
	c.println ("the program has ended");

    } // main method
} // CR_PrintStars class
