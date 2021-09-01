/*Ryan Chang
October 11
ICS203-03
The Overwrite Jave Class*/

// The "CR_Overwrite" class.
import java.awt.*;
import hsa.Console;

public class CR_Overwrite
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	String name;

	c.println ("Type in a name and <Enter>");
	name = c.readString ();
	c.println ("Type in antoher name and <Enter>");
	name = c.readString ();

	c.println ("The name is " + name);
	
	//c.
	/*int num;
	num = 4;
	c.println ("num is " + num);
	num = 10;*/

	//d.
	/*int num;
	num = 4;
	c.println ("num is " + num);
	c.print ("Enter a number ");
	num = c.readInt ();
	c.println ("num is " + num);*/

    } // main method
} // CR_Overwrite class
