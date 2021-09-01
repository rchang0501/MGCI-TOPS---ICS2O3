/*Ryan Chang
September 14, 2018
ICS203-03
RC_Menu
Getting used to creating a menu and running sub-programs within the menu. 
*/

import java.awt.*;
import hsa.Console;

public class CR_Set1_Menu
{
    static Console c;

    //*******************************Intro*********************************


    public static void Intro ()
    {
	c.clear (); // clear the screen
	// Display message
	c.println ("Hi!");
	c.println ("This is where you can find all my other programs from this year.");
	c.println ("Have fun browsing!");
    }


    //*******************************Print Name*********************************


    public static void PrintName ()
    {
	c.clear (); // clear the screen
	// Display message
	c.println ("My name is Ryan");
	c.println ("I am in grade 10");
	c.println ("I am from Marc Garneau C.I. for the TOPS program");
	c.println ("I am from North York, Ontario");
    }


    //*******************************Name and Address*********************************


    public static void NameAddress ()
    {
	c.clear (); // clear the screen
	// Display message
	c.println ("\t\t\t\tNAME AND ADDRESS");
	c.println ();
	c.println ("\t\t\t\tRyan Chang");
	c.println ("\t\t\t\t12 Logandale Rd.");
	c.println ("\t\t\t\tNorth York");
	c.println ("\t\t\t\tOntario");
	c.println ("\t\t\t\tM2N4H4");
    }


    //*******************************Output*********************************


    public static void Output ()
    {
	c.clear (); // clear the screen
	// Display message
	c.print ("12345678901234567890 ");
	c.print ("Hello ");
	c.print ("How are you ");
	c.println ("XXXXXXXXXXXXXXX");
    }


    //*******************************OutputB*********************************


    public static void OutputB ()
    {
	c.clear (); // clear the screen
	// Display message
	c.println ("Hello. " + "How are you today?");
    }


    //*******************************Music*********************************


    public static void Music ()
    {
	c.clear (); // clear the screen
	// Display message
	c.println ("123456789012345");
	c.println ("  Rock and Roll");
	c.println ("      Metal    ");
	c.println ();
	c.println ("    The Blues  ");
	c.println ();
    }


    //*******************************Shopping*********************************


    public static void Shopping ()
    {
	c.clear (); // clear the screen
	// Display message
	c.print ("I am going ");
	c.println ("to the");
	c.println ("shopping mall.");
	c.println ();
	c.println ("There is no bus");
	c.println ("may I have a lift?");
    }


    //*******************************FieldWidths*********************************


    public static void FieldWidths ()
    {
	c.clear (); // clear the screen
	// Display message
	c.print ("1234567890");
	c.println ("123456789012345");
	//First, display column numbers
	c.print ("Hello", 6);
	c.print ("Hello", 6);
	c.print ("Hello", 6);
	c.print ("Hello");
	c.println ();
	c.println ();
	c.println ("1234567890123456789012345678901234567890");
	c.print ("Hello", 12);
	c.print ("Hello", 12);
	c.print ("Hello");
	c.println ();
	c.println ();
	c.println ("12345678901234567890");
	c.print ("", 5);

	c.println ("COMPUTER STUDIES");
	c.println ();
	c.print ("", 5);
	c.print ("Theory", 15);
	c.println ("Practical");
    }


    //*******************************VirusWarning*********************************


    public static void VirusWarning ()
    {
	c.clear (); // clear the screen
	// Display message
	c.println ("\t" + "WARNING" + "\n");
	c.println ("\tPossible virus detected \n\tReboot and run antivirus software");
    }


    //***********************************Menu Program Here*************************
    public static void main (String[] args)
    {

	c = new Console ();

	//variable delclaration for user's choice
	int choice;

	do
	{
	    //Promting for choice

	    c.println ();
	    c.println ("Choose from the following menu:\n");
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9");
	    c.println ("1 - Introduction and Information");
	    c.println ("2 - The My Name Program");
	    c.println ("3 - The Name and Address Program");
	    c.println ("4 - The Print Output Program");
	    c.println ("5 - The Print Output-b Program");
	    c.println ("6 - The Music Program");
	    c.println ("7 - The Shopping Program");
	    c.println ("8 - The Field Widths Program");
	    c.println ("9 - The Virus Warning Program");


	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt ();

	    if (choice == 1)
	    {
		Intro ();
	    }
	    else
		if (choice == 2)
		{
		    c.clear ();

		    PrintName ();
		}
		else
		    if (choice == 3)
		    {
			c.clear ();
			NameAddress ();
		    }
		    else
			if (choice == 4)
			{
			    Output ();
			}
			else
			    if (choice == 5)
			    {
				c.clear ();
				OutputB ();
			    }
			    else
				if (choice == 6)
				{
				    c.clear ();
				    Music ();
				}
				else
				    if (choice == 7)
				    {
					c.clear ();
					Shopping ();
				    }
				    else
					if (choice == 8)
					{
					    c.clear ();
					    FieldWidths ();
					}
					else
					    if (choice == 9)
					    {
						c.clear ();
						VirusWarning ();
					    }
	    c.print ("Press enter to continue");
	    c.getChar ();

	    c.clear ();
	    //This will loop until user enters 0
	}

	while (choice != 0);
	c.println ("The program has terminated");

    } // main method
} // Menu Demo class


