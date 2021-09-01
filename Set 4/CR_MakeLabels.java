/*The Make Labels Java Class
Ryan Chang
September 2018
ICS203-03
Making Labels with Java
*/

// The "CR_MakeLabels" class.
import java.awt.*;
import hsa.Console;

public class CR_MakeLabels
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	String subject, name;

	c.println ("Type in the person's name and <Enter>");
	name = c.readLine ();

	c.println ("Type in the subject and <Enter>");
	subject = c.readLine ();

	c.println ();
	c.println ("****************");
	c.println ("Name : " + name);

	c.println ("Subject : " + subject);
	c.println ("****************");

    } // main method
} // CR_MakeLabels class
