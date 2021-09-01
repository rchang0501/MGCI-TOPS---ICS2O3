/*Ryan Chang
October 11
ICS203-03
The Personal Details Java Class*/

// The "CR_PersonalDetails" class.
import java.awt.*;
import hsa.Console;

public class CR_PersonalDetails
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	String firstname, surname;
	int telephonenumber, birthyear;
	double height;
	c.println ("Type in your first name");
	firstname = c.readString ();
	c.println ("Type in your sur name");
	surname = c.readString ();
	c.println ("Type in your phone number");
	telephonenumber = c.readInt ();
	c.println ("Type in your year of brith");
	birthyear = c.readInt ();
	c.println ("Type in your height in meters");
	height = c.readDouble ();
	c.clear ();
	c.println ("PERSONAL DETAILS");
	c.print ("NAME:");
	c.println (firstname + surname);
	c.println ("YEAR OF BIRTH:" + birthyear);
	c.print ("HEIGHT:");
	c.println (height, 0, 1);
	c.println ("TELEPHONE NUMBER:" + telephonenumber);

    } // main method
} // CR_PersonalDetails class
