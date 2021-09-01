/*Ryan Chang
September 18, 2018
ICS203-03
RC_Set2_Menu
Practicing inputing subprograms into a menu from set 2.
*/

import java.awt.*;
import hsa.Console;

public class CR_Set2_Menu
{
    static Console c;

    //*******************************Intro*********************************


    public static void Intro ()
    {
	c.clear (); // clear the screen
	// Display message
	c.println ("Hi!");
	c.println ("This is where you can find all my programs from Set 2.");
	c.println ("Have fun browsing!");
    }


    //*******************************NumberOutput*********************************


    public static void NumberOutput ()
    {
	c.clear (); // clear the screen
	// Display message
	//Exercise 2.7.1

	c.println (7);
	c.println ("7");
	c.println (489);
	c.println ("0");
	c.println (-44);
	c.println ("4+3");
	c.println (4 + 3);
	c.println ("38-9+25");
	c.println (38 - 9 + 25);

	//Exercise 2E

	c.println (18 - 7);
	c.println (12 * 12);
	c.println ((4 + 5) * (13 - 9));
	c.println (7 - 4 * 3 + 1);
	c.println (24 / 6);
	c.println ((32 - 6 * 2) / 5);

    }


    //*******************************IntegersInFields*********************************


    public static void IntegersInFields ()
    {
	c.clear (); // clear the screen
	// Display message

	//2.7.2
	c.println ("12345678901234567890");
	c.print ("35", 7);
	c.print ("999", 5);
	c.println ();
	c.println ("12345678901234567890");
	c.print (35, 7);
	c.print (999, 5);
	c.println ();
	c.println ("Strings are left justified, but numbers are right justified in a field.");

    }


    //*******************************RealNumberOutput*********************************


    public static void RealNumberOutput ()
    {
	c.clear (); // clear the screen
	// Display message

	//2.7.3

	c.println (45.23);
	c.println (45.23 + 8765.37);

	c.println (17.5 * 123.45);
	c.println (875.99 / 54.49);
	c.println (17.25 - 7.89 * 145.11 + 0.375 / 23.986);
	c.println (45.23 + 7.876);

	//2.7.4
	c.print ("\n");
	c.println (75.375, 4);
	c.println (75.375, 2);
	c.println (75.375, 10);
	c.println (75.375, 10);
	c.println (75.375, 0, 4);
	c.println (75.375, 0, 2);
	c.println (75.375, 0, 1);
	c.println ();

	c.println (63.97567, 10, 2);
	c.println (63.97567, 10, 3);
	c.println (63.97567, 10, 4);
	//the , 4 at the end determines the decimal place
	//c.println (r[realnumber], fw[field width], d[decimal])

    }


    //*******************************StringsAndNumbers*********************************


    public static void StringsAndNumbers ()
    {
	c.clear (); // clear the screen
	// Display message

	//2.8
	c.println ("An example of an integer is " + 4);
	c.println ("An example of a real number is " + 7.25);
	c.print ("Adding an integer to a real number, such as 4 + 7.25");
	c.print (" gives real result: ");
	c.println (4 + 7.25);
	//these are 2 statements in the previous section of code that include: 4+7.25
	//The one statement displays 4 + 7.25 as is, while the other statement performs arithmetic and displays the result 11.25
	c.println ();
	c.print ("The result is ");
	c.println (765.5678, 0, 2);

	//Exercise 2F:
	c.print ("\n");
	//1.
	c.println (17 - 7 + 33 * 2);
	c.println (20 * 4 - 9 * 7);
	//2.
	c.println ("123456789012345");
	c.println (34567, 10);
	c.println (34567, 7);
	c.println (34567, 3);
	//3
	c.println ("123456789012345");
	c.println (123.456, 10);
	c.println (123.456, 5);
	c.println (123.456, 4);
	c.println (123.456, 3);
	c.println (123.456, 2);
	//4
	c.println ("123456789012345");
	c.println (54.375, 8, 2);
	c.println (54.375, 8, 0);
	c.println (54.375, 0, 8);

    }


    //*******************************MyArithmetic*********************************


    public static void MyArithmetic ()
    {
	c.clear (); // clear the screen
	// Display message
	c.println ("12345678901234567890123456789012345678901234567890");
	c.setCursor (10, 1);
	c.println (57.654, 1, 1);
	c.setCursor (10, 20);
	c.println (-17);
	c.println ("\n");
	c.setCursor (12, 10);
	c.println ("Integers are a subset of Real numbers");
	c.println ();
	c.setCursor (14, 30);
	c.println (8754.77 - 652.876 + 423.754 * 0.5, 1, 3);
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
	    c.println ("1 - About the contents in this menu");
	    c.println ("2 - The Number Output Program");
	    c.println ("3 - The Integers in Fields Program");
	    c.println ("4 - The Real Number Output Program");
	    c.println ("5 - The Strings and Numbers Program");
	    c.println ("6 - The My Arithmetic Program");

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

		    NumberOutput ();
		}
		else
		    if (choice == 3)
		    {
			c.clear ();
			IntegersInFields ();
		    }
		    else
			if (choice == 4)
			{
			    RealNumberOutput ();
			}
			else
			    if (choice == 5)
			    {
				c.clear ();
				StringsAndNumbers ();
			    }
			    else
				if (choice == 6)
				{
				    c.clear ();
				    MyArithmetic ();
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


