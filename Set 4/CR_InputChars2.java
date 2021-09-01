/*Ryan Chang
October 11
ICS203-03
The Input Chars Java Class*/

// The "CR_InputChars2" class.
import java.awt.*;
import hsa.Console;

public class CR_InputChars2
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String ch1, ch2, ch3;
	c.println ("Type in any three characters on the keyboard");
	c.println ("Press <Enter> after each.");
	ch1 = c.readString ();
	ch2 = c.readString ();
	ch3 = c.readString ();
	c.println ();
	c.print ("Togethter these 3 letters spell: " + ch1 + ch2 + ch3);


    } // main method
} // CR_InputChars2 class
