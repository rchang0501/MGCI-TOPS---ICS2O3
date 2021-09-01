/*Ryan Chang 
October 16, 2018
ICS203-03
The Incrementing Java Class*/

// The "CR_Incrementing" class.
import java.awt.*;
import hsa.Console;

public class CR_Incrementing
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	
	int num1, num2;
	num1 = 7;
	num2 = 10;
	c.println("The first integer is " + num1);
	c.println("The second integer is " + num2);
	num1++;
	num2++;
	c.println ("After incrementing:");
	c.println ("the first integer is now " + num1);
	c.println ("The second integer is now " + num2);
	
	
	} // main method
} // CR_Incrementing class
