/*The RealNumberOutput Java Class
Ryan Chang
Date
ICS203-03
RealNumberOutput
*/
// The "CR_RealNumberOutput" class.
import java.awt.*;
import hsa.Console;

public class CR_RealNumberOutput
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//2.7.3

	c.println (45.23);
	c.println (45.23 + 8765.37);

	c.println (17.5 * 123.45);
	c.println (875.99 / 54.49);
	c.println (17.25 - 7.89 * 145.11 + 0.375 / 23.986);
	c.println (45.23 + 7.876);

	//2.7.4
	c.print ("\n");
	c.println (75.375, 4);
	c.println (75.375, 2);
	c.println (75.375, 10);
	c.println (75.375, 10);
	c.println (75.375, 0, 4);
	c.println (75.375, 0, 2);
	c.println (75.375, 0, 1);
	c.println ();
	
	c.println (63.97567, 10, 2);
	c.println (63.97567, 10, 3);
	c.println (63.97567, 10, 4);
	//the , 4 at the end determines the decimal place
	//c.println (r[realnumber], fw[field width], d[decimal])

    } // main method
} // CR_RealNumberOutput class
