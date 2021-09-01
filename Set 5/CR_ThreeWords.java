// The "CR_ThreeWords" class.
import java.awt.*;
import hsa.Console;

public class CR_ThreeWords
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String word1, word2, word3;

	c.println ("Type in any word");
	word1 = c.readString ();
	c.println ("Type in any word");
	word2 = c.readString ();
	c.println ("Type in any word");
	word3 = c.readString ();

	c.clear ();

	c.println ("The number of characers in " + word1 + " is " + word1.length ());
	c.println ("The number of characers in " + word2 + " is " + word2.length ());
	c.println ("The number of characers in " + word3 + " is " + word3.length ());

    } // main method
} // CR_ThreeWords class
