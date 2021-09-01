/*The PrintOutput Java Class
Ryan Chang
September 12, 2018
ICS203-03
PrintOutput
*/

// The "PrintOutput" class.
import java.awt.*;
import hsa.Console;

public class RC_PrintOutput
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c.print ("12345678901234567890 ");
	c.print ("Hello ");
	c.print ("How are you");
	c.println ("XXXXXXXXXXXXXXX");
    } // main method
} // PrintOutput class
