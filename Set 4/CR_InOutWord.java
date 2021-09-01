/*The In Out Word Java Class
Ryan Chang
September 2018
ICS203-03
Coding a Java program which asks for any word to be entered, and then displays a message using the words that was typed in
*/

// The "CR_InOutWord" class.
import java.awt.*;
import hsa.Console;

public class CR_InOutWord
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String word;

	c.println ("Type in any word, then <Enter> ");
	word = c.readString ();

	c.println ();
	c.println ("The word that was input is "+ word);
    } // main method
} // CR_InOutWord class
