// The "CR_VarValues" class.
import java.awt.*;
import hsa.Console;

public class CR_VarValues
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();

	int num1, num2, num3;
	
	num1=7;
	num2=15;
	
	c.println("Type in any integer");
	num3 = c.readInt();
	
	c.println();
	c.println ("The first integer is " + num1);
	c.println ("The second integer is " + num2);
	c.println ("The third integer is " + num3);
	
	int sum = num1 + num2 + num3;
	
	c.println ("The sum of the 3 integer is " + sum);
	
	int product = num1*num2*num3;
	
	c.println ("The product of the 3 integers is " + product);
	
    } // main method
} // CR_VarValues class
