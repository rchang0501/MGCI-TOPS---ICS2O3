// The "CR_StringLengths" class.
import java.awt.*;
import hsa.Console;

public class CR_StringLengths
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String name1, name2, message;

	name1 = "Jane";

	name2 = "Sam Nkomo";
	message = "Computers are great fun!";

	String name3;
	c.println ("Type in a name");
	name3 = c.readString ();

	c.println (name1 + " has " + name1.length () + " characers in it ");
	c.println (name2 + " has " + name2.length () + " characers in it ");
	c.println (message + " has " + message.length () + " characers in it ");
	c.println (name3 + " has " + name3.length () + " characers in it ");

    } // main method
} // CR_StringLengths class
