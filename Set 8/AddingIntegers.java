// The "AddingIntegers" class.
import java.awt.*;
import hsa.Console;

public class AddingIntegers
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//declare the variable
	int sum = 0;
	//declare the variable number
	int number;
	//use a counter (i) which starts at 1 and goes up to 8 in seteps of 1
	for (int i = 1 ; i <= 8 ; i = i + 1)
	{
	    c.println ("Type in an integer, <enter> ");
	    number = c.readInt ();
	    sum = sum + number;
	} //end for loop
	c.println ("the sum of the 8 integers is " + sum);

    } // main method
} // AddingIntegers class
