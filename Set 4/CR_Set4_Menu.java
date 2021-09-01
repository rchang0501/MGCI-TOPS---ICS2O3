/*Ryan Chang
October 11, 2018
ICS203-03
RC_Set4_Menu
Putting each program from set 4 into their own class and calling them with a menu.
*/

import java.awt.*;
import hsa.Console;

public class CR_Set4_Menu
{
    static Console c;

    //*******************************MakeLabels**********************************************************************************


    public static void MakeLabels ()
    {
	c.clear (); // clear the screen
	// Display message
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

    }


    //*******************************InOutWord*************************************************************************************


    public static void InOutWord ()
    {
	c.clear (); // clear the screen
	// Display message

	String word;

	c.println ("Type in any word, then <Enter> ");
	word = c.readString ();

	c.println ();
	c.println ("The word that was input is " + word);


    }


    //*******************************InputRect**************************************************************************************


    public static void InputRect ()
    {
	c.clear (); // clear the screen
	// Display message

	int length, breadth;
	c.println ("RECTANGLE PROGRAM");
	c.print ("Type in the length of the rectangle and <Enter>: ");
	length = c.readInt ();
	c.print ("Type in the breadth of the rectangel and <Enter>: ");
	breadth = c.readInt ();
	c.setColor (Color.green);
	c.fillRect (100, 100, length, breadth);

    }


    //*******************************InputReals*****************************************************************************************


    public static void InputReals ()
    {
	c.clear (); // clear the screen
	// Display message

	double num1, num2;
	c.println ("Type in a Real Number");
	num1 = c.readDouble ();
	c.println ("Type in another Real Number");
	num2 = c.readDouble ();
	c.print ("\n");
	c.print ("The first real number entered was ");
	c.println (num1, 0, 3);
	c.print ("The second real number entered was ");
	c.println (num2, 0, 3);
	c.print ("\n");
	c.print ("The cost is $");
	c.println (123.7567, 0, 2);

    }


    //*******************************PersonalDetails**********************************************************************************


    public static void PersonalDetails ()
    {
	c.clear (); // clear the screen
	// Display message

	String firstname, surname;
	int telephonenumber, birthyear;
	double height;
	c.println ("Type in your first name");
	firstname = c.readString ();
	c.println ("Type in your sur name");
	surname = c.readString ();
	c.println ("Type in your phone number");
	telephonenumber = c.readInt ();
	c.println ("Type in your year of birth");
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


    }


    //*******************************ColoredCircles************************************************************************************


    public static void ColoredCircles ()
    {
	c.clear (); // clear the screen
	// Display message
	int red, blue;
	c.println ("This program will draw one red and one blue circle.");
	c.println ();
	c.println ("Insert a value between 100-300 for the size of the red circle.");
	red = c.readInt ();
	c.println ("Insert a value between 50-150 for the size of the blue circle.");
	blue = c.readInt ();
	c.clear ();
	c.setColor (Color.red);
	c.drawOval (50, 100, red, red);
	c.setColor (Color.blue);
	c.drawOval (400, 100, blue, blue);
    }


    //*******************************Prices*************************************************************************************************


    public static void Prices ()
    {
	c.clear (); // clear the screen
	// Display message
	String name1, name2, name3;
	double price1, price2, price3;

	c.println ("MAKE A SHOPPING LIST");
	c.println ();
	c.println ("Insert a product name");
	name1 = c.readString ();
	c.println ("Inset price");
	price1 = c.readDouble ();
	c.println ("Insert a product name");
	name2 = c.readString ();
	c.println ("Inset price");
	price2 = c.readDouble ();
	c.println ("Insert a product name");
	name3 = c.readString ();
	c.println ("Inset price");
	price3 = c.readDouble ();

	c.clear ();

	c.println ();
	c.println ("SHOPPING LIST");
	c.print (name1 + "\t");
	c.println (price1, 0, 2);
	c.print (name2 + "\t");
	c.println (price2, 0, 2);
	c.print (name3 + "\t");
	c.println (price3, 0, 2);

    }


    //******************************InputChars***************************************************************************************************


    public static void InputChars ()
    {
	c.clear (); // clear the screen
	// Display message
	char ch1, ch2, ch3;
	c.println ("Type in any three characters on the keyboard");
	//c.println ("Press <Enter> after each.");
	ch1 = c.getChar ();
	ch2 = c.getChar ();
	ch3 = c.getChar ();
	c.println ();
	c.println ("Togethter these 3 letters spell: " + ch1 + ch2 + ch3);

    }


    //******************************InputChars2***********************************************************************************************


    public static void InputChars2 ()
    {
	c.clear (); // clear the screen
	// Display message
	String ch1, ch2, ch3;
	c.println ("Type in any three characters on the keyboard");
	c.println ("Press <Enter> after each.");
	ch1 = c.readString ();
	ch2 = c.readString ();
	ch3 = c.readString ();
	c.println ();
	c.println ("Togethter these 3 letters spell: " + ch1 + ch2 + ch3);
    }


    //******************************Overwrite**************************************************************************************************


    public static void Overwrite ()
    {
	c.clear (); // clear the screen
	// Display message
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

    }


    //***********************************Menu Program Here*************************************************************************************
    public static void main (String[] args)
    {

	c = new Console ();

	//variable delclaration for user's choice
	int choice;

	do
	{
	    //Prompting for choice

	    c.println ();
	    c.println ("Choose from the following menu:\n");
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, 10");
	    c.println ("1 - The MakeLabels Program");
	    c.println ("2 - The InOutWord Program");
	    c.println ("3 - The InputRect Program");
	    c.println ("4 - The InputReals Program");
	    c.println ("5 - The PersonalDetails Program");
	    c.println ("6 - The ColoredCircles Program");
	    c.println ("7 - The Prices Program");
	    c.println ("8 - The InputChars Program");
	    c.println ("9 - The InputChars2");
	    c.println ("10 - The Overwrite Program");

	    c.println ();
	    c.println ("Enter 0 to exit");
	    choice = c.readInt ();

	    if (choice == 1)
	    {
		MakeLabels ();
	    }
	    else
		if (choice == 2)
		{
		    c.clear ();

		    InOutWord ();
		}
		else
		    if (choice == 3)
		    {
			c.clear ();
			InputRect ();
		    }
		    else
			if (choice == 4)
			{
			    InputReals ();
			}
			else
			    if (choice == 5)
			    {
				c.clear ();
				PersonalDetails ();
			    }
			    else
				if (choice == 6)
				{
				    c.clear ();
				    ColoredCircles ();
				}
				else
				    if (choice == 7)
				    {
					c.clear ();
					Prices ();
				    }
				    else
					if (choice == 8)
					{
					    c.clear ();
					    InputChars ();
					}
					else
					    if (choice == 9)
					    {
						c.clear ();
						InputChars2 ();
					    }
					    else
						if (choice == 10)
						{
						    c.clear ();
						    Overwrite ();
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


