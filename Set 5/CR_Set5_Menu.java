/*Ryan Chang
October 16, 2018
ICS2O3-03
Set 5 Programs and Menu by Ryan Chang
Putting the set 5 programs into a menu as well as calling each program to run by putting them into their own class and calling the class.
*/

import java.awt.*;
import hsa.Console;

public class CR_Set5_Menu
{
    private static Console c;

    //********************************InputReals***************************************
    private static void InputReals ()
    {
	//Adding Real Numbers
	double num1, num2;
	c.println ("Type in a Real Number");
	num1 = c.readDouble ();
	c.println ("Type in another Real Number");
	num2 = c.readDouble ();
	c.print ("\n");
	c.clear ();
	c.println ("The first real number entered was " + num1);
	c.println ("The second real number enetered was " + num2);
	c.print ("The sum of the 2 numbers is ");
	c.println ((num1 + num2), 0, 1);

	//Subtracting Real Numbers
	c.print ("\n");
	double num3, num4;
	c.println ("Type in a Real Number");
	num3 = c.readDouble ();
	c.println ("Type in another Real Number");
	num4 = c.readDouble ();
	c.print ("\n");
	c.clear ();
	c.println ("The first real number entered was " + num3);
	c.println ("The second real number enetered was " + num4);
	c.println ("The difference of the 2 numbers is " + (num3 - num4));

	//Multiplying Real Numbers
	c.print ("\n");
	double num5, num6;
	c.println ("Type in a Real Number");
	num5 = c.readDouble ();
	c.println ("Type in another Real Number");
	num6 = c.readDouble ();
	c.print ("\n");
	c.clear ();
	c.println ("The first real number entered was " + num5);
	c.println ("The second real number enetered was " + num6);
	c.println ("The product of the 2 numbers is " + (num5 * num6));
    }


    //**********************************Division*************************************
    private static void Division ()
    {
	c.println ("INTEGER DIVISION");
	c.println ();
	int num1, num2;
	c.println ("Type in an integer");
	num1 = c.readInt ();
	c.println ("Type in an integer");
	num2 = c.readInt ();
	c.print ("\n");
	c.println ("The answer to " + num1 + " divided by " + num2 + " is " + (num1 / num2));
    }


    //**********************************Remainder**************************************
    private static void Remainder ()
    {
	c.println ("FINDING THE REMAINDER");
	c.println ();
	double num1, num2;
	c.println ("Type in an integer");
	num1 = c.readDouble ();
	c.println ("Type in an integer");
	num2 = c.readDouble ();
	c.print ("\n");
	c.println ("The remainder when " + num1 + " is divided by " + num2 + " is " + (num1 % num2));
    }


    //***********************************Division2***************************************
    private static void Division2 ()
    {
	c.println ("REAL NUMBER DIVISION");
	c.println ();
	int num1;
	double num2;
	c.println ("Type in an integer");
	num1 = c.readInt ();
	c.println ("Type in a real number");
	num2 = c.readDouble ();
	c.print ("\n");
	c.print ("The answer to " + num1 + " divided by " + num2 + " is ");
	c.println ((num1 / num2), 0, 3);
    }


    //*************************************Incrementing***********************************
    private static void Incrementing ()
    {
	int num1, num2;

	c.print ("Enter an integer: ");
	num1 = c.readInt ();
	c.print ("Enter another integer: ");
	num2 = c.readInt ();

	c.println ("The first integer is " + num1 + ".");
	c.println ("The second integer is " + num1 + ".");

	num1++;
	num2++;

	c.println ("After incrementing:");
	c.println ("The first integer is now " + num1 + ".");
	c.println ("The second integer is now " + num2 + ".");
    }


    //*************************************ThreeWords****************************************
    private static void ThreeWords ()
    {
	String word1, word2, word3;

	c.print ("Enter a word: ");
	word1 = c.readString ();
	c.print ("Enter another word: ");
	word2 = c.readString ();
	c.print ("Enter a third word: ");
	word3 = c.readString ();

	c.print ("In total, there are ");
	c.print (word1.length () + word2.length () + word3.length ());
	c.println (" characters in the three words.");

	c.println ("There are " + word1.length () + " characters in " + word1 + ".");
	c.println ("There are " + word2.length () + " characters in " + word2 + ".");
	c.println ("There are " + word3.length () + " characters in " + word3 + ".");
    }


    //**********************************NumberOfDigits************************************
    private static void NumberOfDigits ()
    {
	int wholeNum;

	c.print ("Enter an integer: ");
	wholeNum = c.readInt ();

	c.print ("There are ");
	c.print (Integer.toString (wholeNum).length ()); // who said I lacked
	c.println (" digits in the number.");         // the skills to do it?
    }


    //************************************Marks********************************************
    private static void Marks ()
    {
	c.println ("123456789012345678901234567890");
	c.print ("Refiloe");
	c.println (82, 25 - "Refiloe".length ());
	c.print ("Anna");
	c.println (67, 25 - "Anna".length ()); // Anna you disgrace!
	c.print ("Timothy");
	c.println (75, 25 - "Timothy".length ());
    }


    //*********************************ShoppingList****************************************
    private static void ShoppingList ()
    {
	c.println ("123456789012345678901234567890");
	c.println ("    SHOPPING LIST");
	c.print ("Box of disks");
	c.println (43.95, 25 - "Box of disks".length ());
	c.print ("Computer");
	c.println (4999.99, 25 - "Computer".length ());
	c.print ("Printer");
	c.println (899.99, 25 - "Printer".length ());
	c.print ("MS Works");
	c.println (450.00, 25 - "MS Works".length ());
	c.println ("                  --------");
	c.print ("TOTAL");
	c.println (43.95 + 4999.99 + 899.50 + 450.00, 25 - "TOTAL".length (), 2);
    }


    //***********************************CenterDisplay***************************************
    private static void CenterDisplay ()
    {
	String sent;

	c.print ("Enter a sentence: ");
	sent = c.readLine ();

	c.println ("12345678901234567890123456789012345678901234567890123456789012345678901234567890");
	c.print (" ", 40 - (sent.length () / 2));
	c.println (sent);
    }


    //**************************************Flyer*********************************************
    private static void Flyer ()
    {
	c.println ("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
	c.print (" ", 22 - ("ETHNIK".length () / 2));
	c.println ("ETHNIK");
	c.print (" ", 22 - ("AFRIKA".length () / 2));
	c.println ("AFRIKA");
	c.print (" ", 22 - ("Ethnic gear at low prices".length () / 2));
	c.println ("Ethnic gear at low prices");
	c.println ("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
	c.print ("WEDNESDAY");
	c.print (" ", 43 - "WEDNESDAY".length () - "Fleamarket".length ());
	c.println ("Fleamarket");
	c.print ("SATURDAY");
	c.print (" ", 43 - "SATURDAY".length () - "Bruma Lake".length ());
	c.println ("Bruma Lake");
	c.print ("SUNDAY");
	c.print (" ", 43 - "SUNDAY".length () - "Stand 43".length ());
	c.println ("Stand 43");
	c.println ("/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\");
    }


    //***************************************ComputerMenu****************************************
    private static void ComputerMenu ()
    {
	c.print (" ", 40 - ("MEGABYTE MENU".length () / 2));
	c.println ("MEGABYTE MENU");
	c.println ();
	c.print (" ", 40 - ("STARTERS".length () / 2));
	c.println ("STARTERS");
	c.print (" ", 40 - ("Hot keys - hot Mexican chilli chips".length () / 2));
	c.println ("Hot keys - hot Mexican chilli chips");
	c.print (" ", 40 - ("Data - be surprised and try this starter".length () / 2));
	c.println ("Data - be surprised and try this starter");
	c.println ();
	c.print (" ", 40 - ("MAIN COURSE".length () / 2));
	c.println ("MAIN COURSE");
	c.print (" ", 40 - ("Root directory - vegetarian platter".length () / 2));
	c.println ("Root directory - vegetarian platter");
	c.print (" ", 40 - ("RAM - grilled to perfection in BBQ sauce".length () / 2));
	c.println ("RAM - grilled to perfection in BBQ sauce");
	c.println ();
	c.print (" ", 40 - ("DRINKS".length () / 2));
	c.println ("DRINKS");
	c.print (" ", 40 - ("Tabs - Caffeine-free, sugar-free cola".length () / 2));
	c.println ("Tabs - Caffeine-free, sugar-free cola");
	c.print (" ", 40 - ("Copy - imitation fruit juice".length () / 2));
	c.println ("Copy - imitation fruit juice");
    }


    //*****************************************VarValues*******************************************
    private static void VarValues ()
    {
	// Declaring variables
	int num1, num2, num3;

	// Assigning values to variables
	num1 = 7;
	num2 = 15;

	// Getting a value into a variable from the keyboard
	c.print ("Type in any integer and <Enter>: ");
	num3 = c.readInt ();

	// Displaying output
	c.println ();
	c.println ("The first integer is " + num1);
	c.println ("The second integer is " + num2);
	c.println ("The third integer is " + num3);

	// Declaring and assigning in one statement
	int sum = num1 + num2 + num3;

	// More output
	c.println ("The sum of the three integers is " + sum + ".");
    }


    //********************************************Eggs**********************************************
    private static void Eggs ()
    {
	int eggs;

	c.print ("How many eggs are in the box? ");
	eggs = c.readInt ();
	c.println ("There are " + (eggs / 12) + " full dozen in the box.");
    }


    //*******************************************Date100*********************************************
    private static void Date100 ()
    {
	int year;

	c.print ("Enter the year (YYYY): ");
	year = c.readInt ();

	int century = year / 100;
	int shortYear = year % 100;

	century++;
	c.println ("In one hundred years, it will be " + century + shortYear + ".");
	// c.println("In one hundred years, it will be " (year + 100) + "."); 
	// ^ the easier way 
    }


    //*****************************************Menu Program Here*******************************************
    public static void main (String[] args)
    {
	c = new Console ();
	int choice;

	do
	{
	    c.println ("Choose a program from the menu:\n");
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, or 15");
	    c.println ("1  - InputReal");
	    c.println ("2  - Division");
	    c.println ("3  - Remainder");
	    c.println ("4  - Division2");
	    c.println ("5  - Incrementing");
	    c.println ("6  - ThreeWords");
	    c.println ("7  - NumberOfDigits");
	    c.println ("8  - Marks");
	    c.println ("9  - ShoppingLIst");
	    c.println ("10 - CenterDisplay");
	    c.println ("11 - Flyer");
	    c.println ("12 - ComputerMenu");
	    c.println ("13 - VarValues");
	    c.println ("14 - Eggs");
	    c.println ("15 - Date100");
	    c.println ();
	    c.println ("Enter 0 to exit");

	    choice = c.readInt ();

	    c.clear ();
	    if (choice == 0)
	    {
		continue;
	    }
	    else if (choice == 1)
	    {
		InputReals ();
	    }
	    else if (choice == 2)
	    {
		Division ();
	    }
	    else if (choice == 3)
	    {
		Remainder ();
	    }
	    else if (choice == 4)
	    {
		Division2 ();
	    }
	    else if (choice == 5)
	    {
		Incrementing ();
	    }
	    else if (choice == 6)
	    {
		ThreeWords ();
	    }
	    else if (choice == 7)
	    {
		NumberOfDigits ();
	    }
	    else if (choice == 8)
	    {
		Marks ();
	    }
	    else if (choice == 9)
	    {
		ShoppingList ();
	    }
	    else if (choice == 10)
	    {
		CenterDisplay ();
	    }
	    else if (choice == 11)
	    {
		Flyer ();
	    }
	    else if (choice == 12)
	    {
		ComputerMenu ();
	    }
	    else if (choice == 13)
	    {
		VarValues ();
	    }
	    else if (choice == 14)
	    {
		Eggs ();
	    }
	    else if (choice == 15)
	    {
		Date100 ();
	    }

	    c.print ("Press enter to continue");
	    c.getChar ();

	    c.clear ();
	    //This will loop until user enters 0
	}
	while (choice != 0);

	c.println ("The program has terminated.");
    } // main method
} // Menu Set 5 Class
