// The "CR_NumberofDigits" class.
import java.awt.*;
import hsa.Console;

public class CR_NumberofDigits
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String num1;
	int wholeNum;

	c.println ("Enter any number");
	num1 = c.readString ();
	
	c.println ("Enter any integer");
	wholeNum = c.readInt ();
	
	c.println ("The number of digits in " + num1 + " is " + num1.length());
	
    } // main method
} // CR_NumberofDigits class
