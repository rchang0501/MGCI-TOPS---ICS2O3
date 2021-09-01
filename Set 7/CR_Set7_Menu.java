/*Ryan Chang
November 1, 2018
ICS2O3-03
Set 7 Programs and Menu by Ryan Chang
Putting the set 7 programs into a menu as well as calling each program to run by putting them into their own class and calling the class.
*/

import java.awt.*;
import hsa.Console;

public class CR_Set7_Menu
{
    private static Console c;

    //********************************CheckDivision***************************************
    private static void CheckDivision ()
    {
	//Variable
	double a, b, result;
	//Input
	c.println ("Enter a value for a");
	a = c.readDouble ();
	c.println ("Enter a value for b");
	b = c.readDouble ();
	//Boolean
	if (b != 0)
	{
	    result = a / b;
	    c.print ("The result is ");
	    c.println (result, 0, 2);
	}
	else
	{
	    c.println ("Error");
	}
    }


    //*********************************NumChars*************************************
    private static void NumChars ()
    {
	//Variables
	String wrd;
	int num, posn;
	//Input
	c.println ("Type any word <Enter> ");
	wrd = c.readString ();
	num = wrd.length ();
	//Output
	if (num % 2 != 0)
	{
	    c.println (wrd + " has an odd number of letters.");
	    posn = num / 2 + 1;
	    c.println ("The middle letter is at position " + posn);
	}
	else
	{
	    c.println (wrd + " has an even number of letters.");
	}
    }


    //**********************************MaxMinNum**************************************
    private static void MaxMinNum ()
    {
	//Variables
	int max, min, num;
	max = 60;
	min = 21;
	c.println ("Enter any whole number: ");
	num = c.readInt ();
	//Output
	if (num > 0)
	{
	    c.println ("Your number " + num + " is larger than zero");
	}
	else
	{
	    c.println ("Your number is negative or zero");
	}

	if (num > max)
	{
	    c.println ("Your number " + num + " is larger than " + max);
	}

	if (num < min)
	{
	    c.println ("Your number " + num + " is smaller than " + min);
	}
    }


    //***********************************CheckDivision2***************************************
    private static void CheckDivision2 ()
    {
	//Variable
	double a, b, result;
	//Input
	c.println ("Enter a value for a");
	a = c.readDouble ();
	c.println ("Enter a value for b");
	b = c.readDouble ();
	//Boolean
	if (b == 0)
	{
	    c.println ("Error");
	}
	else
	{
	    result = a / b;
	    c.print ("The result is ");
	    c.println (result, 0, 2);
	}
    }


    //*************************************EvenOddNum***********************************
    private static void EvenOddNum ()
    {
	//variable
	int num1;
	//Input
	c.println ("Type in an integer");
	num1 = c.readInt ();
	//Output
	if (num1 % 2 != 0)
	{
	    c.println ("The Number is odd");
	}
	else
	{
	    c.println ("The Number is even");
	}
	if (num1 % 5 == 0)
	{
	    c.println ("The number is a mutliple of 5");
	}
	else
	{
	    c.println ("The number is not a multiple of 5");
	}
    }


    //*************************************Discount****************************************
    private static void Discount ()
    {
	//Variables
	double cost, discount;
	//Input
	c.println ("Type in the cost of the purchase");
	cost = c.readDouble ();
	//Ouput
	if (cost > 100)
	{
	    discount = cost * 0.9;
	    c.print ("the cost is: $");
	    c.println (discount, 0, 2);
	}
	else
	{
	    c.print ("the cost is $");
	    c.println (cost, 0, 2);
	}

    }


    //**********************************TestNumber************************************
    private static void TestNumber ()
    {
	//variable
	int num;
	//Input
	c.println ("Type in a number");
	num = c.readInt ();
	//Output
	if (num >= 0)
	{
	    c.println ("The number is positive");
	}
	else
	{
	    c.println ("The number is negative");
	}
	if (num % 2 == 0)
	{
	    c.println ("The number is even");
	}
	else
	{
	    c.println ("The number is odd");
	}
	if (num % 7 == 0)
	{
	    c.println ("The number is a multiple of 7");
	}
	else
	{
	    c.println ("The number is not a multiple of 7");
	}
    }


    //************************************Driving********************************************
    private static void Driving ()
    {
	//Variables
	int age;
	//Input
	c.println ("Type in your age");
	age = c.readInt ();
	//Output
	if (age <= 18)
	{
	    c.println ("sorry, you're too young to drive");
	}
	else
	    if (age > 18 & age <= 75)
	    {
		c.println ("ok show me your license");
	    }
	    else
		if (age > 75)
		{
		    c.println ("Sorry you're too old to drive");
		}
    }


    //*********************************MarkSymbol****************************************
    private static void MarkSymbol ()
    {
	//Variable
	int mark;
	//Input
	c.println ("Type in your mark");
	mark = c.readInt ();
	//Output
	if (mark >= 80)
	{
	    c.println ("A");
	}
	else
	    if (mark < 80 & mark >= 70)
	    {
		c.println ("B");
	    }
	    else
		if (mark < 70 & mark >= 60)
		{
		    c.println ("C");
		}
		else
		    if (mark < 60 & mark >= 50)
		    {
			c.println ("D");
		    }
		    else
			c.println ("F");

    }


    //***********************************CompareNumChars***************************************
    private static void CompareNumChars ()
    {
	//Variables
	String wrd1, wrd2;
	int num1, num2;
	//Input
	c.println ("Type in a word");
	wrd1 = c.readString ();
	num1 = wrd1.length ();
	c.println ("Type in another word");
	wrd2 = c.readString ();
	num2 = wrd2.length ();
	if (num1 > num2)
	{
	    c.clear ();
	    c.println ("wrd1");
	    c.println ("wrd2");
	}
	else
	{
	    c.clear ();
	    c.println (wrd2);
	    c.println (wrd1);
	}
    }


    //**************************************SportingEvents*********************************************
    private static void SportingEvents ()
    {
	//Variables
	int year;
	//Input
	c.println ("Type in the year");
	year = c.readInt ();
	//Output
	if (year % 4 == 0)
	{
	    c.println ("The olympics are being held");
	}
	else
	    if (year % 4 == 2)
	    {
		c.println ("The cricket cup is this year");
	    }
	    else
		if (year % 4 == 3)
		{
		    c.println ("The rubgy cup is this year");
		}
		else
		{
		    c.println ("There are no games this year");
		}
    }


    //*****************************************Menu Program Here*******************************************
    public static void main (String[] args)
    {
	c = new Console ();
	int choice;

	do
	{
	    c.println ("Choose a program from the menu:\n");
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, or 11");
	    c.println ("1  - CheckDivision");
	    c.println ("2  - NumChars");
	    c.println ("3  - MaxMinNum");
	    c.println ("4  - CheckDivision2");
	    c.println ("5  - EvenOddNum");
	    c.println ("6  - Discount");
	    c.println ("7  - TestNumber");
	    c.println ("8  - Driving");
	    c.println ("9  - MarkSymbol");
	    c.println ("10 - CompareNumChars");
	    c.println ("11 - SportingEvents");
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
		CheckDivision ();
	    }
	    else if (choice == 2)
	    {
		NumChars ();
	    }
	    else if (choice == 3)
	    {
		MaxMinNum ();
	    }
	    else if (choice == 4)
	    {
		CheckDivision2 ();
	    }
	    else if (choice == 5)
	    {
		EvenOddNum ();
	    }
	    else if (choice == 6)
	    {
		Discount ();
	    }
	    else if (choice == 7)
	    {
		TestNumber ();
	    }
	    else if (choice == 8)
	    {
		Driving ();
	    }
	    else if (choice == 9)
	    {
		MarkSymbol ();
	    }
	    else if (choice == 10)
	    {
		CompareNumChars ();
	    }
	    else if (choice == 11)
	    {
		SportingEvents ();
	    }

	    c.print ("Press enter to continue");
	    c.getChar ();

	    c.clear ();
	    //This will loop until user enters 0
	}
	while (choice != 0);

	c.println ("The program has terminated.");
    } // main method
} // Menu Set 6 Class


