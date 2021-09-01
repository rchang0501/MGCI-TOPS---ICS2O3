/*Ryan Chang
October 25, 2018
ICS2O3-03
Set 6 Programs and Menu by Ryan Chang
Putting the set 6 programs into a menu as well as calling each program to run by putting them into their own class and calling the class.
*/

import java.awt.*;
import hsa.Console;

public class CR_Set6_Menu
{
    private static Console c;

    //********************************NameAge***************************************
    private static void NameAge ()
    {
	//Variable
	String firstname, lastname;
	int birthyear;
	//Declaration
	c.println ("Type in your first name");
	firstname = c.readString ();
	c.println ("Type in your last name");
	lastname = c.readString ();
	c.println ("Type in the year you were born");
	birthyear = c.readInt ();
	//Output
	c.clear ();
	c.println ("Your name is: " + firstname + " " + lastname);
	c.println ("You were born in the year " + birthyear);
	c.println ("You are " + (2018 - birthyear) + " years old");
    }


    //*********************************Chocs*************************************
    private static void Chocs ()
    {
	//Variables
	String chocolate;
	int quantity;
	double price;
	price = 0.99;
	//Variable Prompt
	c.println ("Type in the brand of chocolate you would like");
	chocolate = c.readString ();
	c.println ("Combien de cette chocolate est-ce que tu voudrais");
	quantity = c.readInt ();
	//Output window
	c.clear ();
	c.println ("CHOC BAR");
	c.println (chocolate);
	c.setCursor (1, 30);
	c.println ("QUANTITY");
	c.setCursor (2, 30);
	c.println (quantity);
	c.setCursor (1, 60);
	c.println ("COST");
	c.setCursor (2, 60);
	c.println (quantity * price, 0, 2);
    }


    //**********************************Supermarket**************************************
    private static void Supermarket ()
    {
	//Variables
	String food1, food2;
	double price1, price2;
	//Declaration
	c.println ("Type in the name of the food");
	food1 = c.readString ();
	c.println ("Type in the price of the food");
	price1 = c.readDouble ();
	c.println ("Type in the name of the food");
	food2 = c.readString ();
	c.println ("Type in the price of the food");
	price2 = c.readDouble ();
	//Output
	c.clear ();
	c.println ("RECEIPT");
	c.println ();
	c.println (food1);
	c.setCursor (3, 30);
	c.println (price1);
	c.println (food2);
	c.setCursor (4, 30);
	c.println (price2);
	c.setCursor (5, 30);
	c.println ("-----");
	c.println ("TOTAL");
	c.setCursor (6, 30);
	c.println ((price1 + price2), 0, 2);
    }


    //***********************************RoundedMarks***************************************
    private static void RoundedMarks ()
    {
	//Variables
	String name;
	double mark;
	//Declaration
	c.println ("Type in your name");
	name = c.readString ();
	c.println ("Type in your mark out of 43");
	mark = c.readDouble ();
	//Output
	c.clear ();
	c.println ("TEST RESULTS");
	c.println ("NAME OF STUDENT: " + name);
	c.print ("Mark OUT OF 43: ");
	c.print (mark, 0, 0);
	c.println ("/43");
	c.print ("PERCENTAGE: ");
	c.print (((mark / 43) * 100), 0, 0);
	c.println ("%");
    }


    //*************************************Playcosts***********************************
    private static void Playcosts ()
    {
	//variable
	int adults1, adults2, pupils1, pupils2, adultstotal, pupilstotal, total;
	//Declarations (Prompt)
	adults1 = 235;
	adults2 = 278;
	pupils1 = 309;
	pupils2 = 415;
	adultstotal = (15 * (adults1 + adults2));
	pupilstotal = (10 * (pupils1 + pupils2));
	total = (adultstotal + pupilstotal);
	//Output
	c.println ("Number of adults on night 1: " + adults1);
	c.println ("Number of pupils on night 1: " + pupils1);
	c.println ("Number of adults on night 2: " + adults2);
	c.println ("Number of pupils on night 2: " + pupils2);
	c.println ("The adults on both nights: " + (adults1 + adults2));
	c.println ("The pupils on both nights: " + (pupils1 + pupils2));
	c.setCursor (5, 40);
	c.println ("Cost for the adults: " + adultstotal);
	c.setCursor (6, 40);
	c.println ("Cost for the pupils: " + pupilstotal);
	c.setCursor (8, 40);
	c.println ("Total proceeds: $" + total);
	c.setCursor (9, 40);
	c.println ("Profit made: $" + (total - 9000));
    }


    //*************************************Swimmers****************************************
    private static void Swimmers ()
    {
	//Variables
	String name1, name2;
	double time1, time2;
	//Prompt
	c.println ("Type in the name of the athlete");
	name1 = c.readString ();
	c.println ("Type in their time");
	time1 = c.readDouble ();
	c.println ("Type in the name of the athlete");
	name2 = c.readString ();
	c.println ("Type in their time");
	time2 = c.readDouble ();
	//Output
	c.clear ();
	c.println ("100M BREASTSTROKE FINAL");
	c.println ();
	c.println ("NAME");
	c.println (name1);
	c.println (name2);
	c.setCursor (3, 30);
	c.println ("TIME");
	c.setCursor (4, 30);
	c.println (time1, 0, 2);
	c.setCursor (5, 30);
	c.println (time2, 0, 2);
	c.println ();
	c.println ("Difference in times " + (time1 - time2));
    }


    //**********************************Rings************************************
    private static void Rings ()
    {
	c.setColor (Color.blue);
	c.drawOval (0, 30, 30, 30);
	c.setColor (Color.black);
	c.drawOval (40, 30, 30, 30);
	c.setColor (Color.red);
	c.drawOval (80, 30, 30, 30);
	c.setColor (Color.yellow);
	c.drawOval (20, 45, 30, 30);
	c.setColor (Color.green);
	c.drawOval (60, 45, 30, 30);
    }


    //************************************MarkAverage********************************************
    private static void MarkAverage ()
    {
	//Variables
	String name1;
	double mark1, mark2, total, perc;
	//Prompt
	c.println ("Type in your full name");
	name1 = c.readLine ();
	c.println ("Type in your first mark out of 25.0");
	mark1 = c.readDouble ();
	c.println ("Type in your second mark out of 55.0");
	mark2 = c.readDouble ();
	total = (mark1 + mark2);
	perc = ((total / 80) * 100);
	//Output
	c.clear ();
	c.println ("NAME: " + name1);
	c.println ("MARK # 1: " + mark1 + "/25");
	c.println ("MARK # 2: " + mark2 + "/55");
	c.print ("TOTAL PERCENT: ");
	c.print (perc, 0, 2);
	c.println ("%");
    }


    //*********************************FoodStall****************************************
    private static void FoodStall ()
    {
	//Variable
	int coke, chips;
	double cokeprice, chipsprice, cost1, cost2;
	//Prompt
	c.println ("Type in the cans of coke you want");
	coke = c.readInt ();
	c.println ("Type in the price of coke");
	cost1 = c.readDouble ();
	c.println ("Type in the bags of chips you want");
	chips = c.readInt ();
	c.println ("Type in the price of chips");
	cost2 = c.readDouble ();
	cokeprice = (coke * cost1);
	chipsprice = (chips * cost2);
	//Output
	c.clear ();
	c.println ("Cokes");
	c.println (coke);
	c.setCursor (1, 30);
	c.println ("Packets of Chips");
	c.setCursor (2, 30);
	c.println (chips);
	c.setCursor (1, 60);
	c.println ("Amount to be paid");
	c.setCursor (2, 60);
	c.print ("$");
	c.println ((cokeprice + chipsprice), 0, 2);
    }


    //***********************************StarInBox***************************************
    private static void StarInBox ()
    {
	c.setColor (Color.blue);
	c.fillStar (100, 0, 500, 500);
	c.setColor (Color.red);
	c.fillStar (110, 10, 480, 480);
    }


    //**************************************ColdDrinks*********************************************
    private static void ColdDrinks ()
    {
	//Variables
	double price;
	int quantity;
	//Prompt
	c.println ("Type in the numebr of drinks you want");
	quantity = c.readInt ();
	c.println ("Type in the price of the drink");
	price = c.readDouble ();
	//Output
	c.clear ();
	c.println ("DRINKS ORDER");
	c.println ();
	c.println ("NUMEBR OF DRINKS: " + quantity);
	c.print ("TOTAL PRICE: ");
	c.println ((quantity * price), 0, 2);
    }


    //***************************************DiceThrow****************************************
    private static void DiceThrow ()
    {
	int randomNumber = (int) (Math.random () * 6) + 1;
	c.println (randomNumber);
    }


    //*****************************************RandomShapes*******************************************
    private static void RandomShapes ()
    {
	//Random Dimensions
	int height = (int) (Math.random () * (500 + 1));
	int width = (int) (Math.random () * (700 + 1));
	//Output
	c.setColor (Color.blue);
	c.fillRect (0, 20, width, height);
    }


    //*****************************************Menu Program Here*******************************************
    public static void main (String[] args)
    {
	c = new Console ();
	int choice;

	do
	{
	    c.println ("Choose a program from the menu:\n");
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, or 13");
	    c.println ("1  - NameAge");
	    c.println ("2  - Chocs");
	    c.println ("3  - Supermarket");
	    c.println ("4  - RoundedMarks");
	    c.println ("5  - Playcosts");
	    c.println ("6  - Swimmers");
	    c.println ("7  - Rings");
	    c.println ("8  - MarkAverage");
	    c.println ("9  - FoodStall");
	    c.println ("10 - StarInBox");
	    c.println ("11 - ColdDrinks");
	    c.println ("12 - DiceThrow");
	    c.println ("13 - RandomShapes");
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
		NameAge ();
	    }
	    else if (choice == 2)
	    {
		Chocs ();
	    }
	    else if (choice == 3)
	    {
		Supermarket ();
	    }
	    else if (choice == 4)
	    {
		RoundedMarks ();
	    }
	    else if (choice == 5)
	    {
		Playcosts ();
	    }
	    else if (choice == 6)
	    {
		Swimmers ();
	    }
	    else if (choice == 7)
	    {
		Rings ();
	    }
	    else if (choice == 8)
	    {
		MarkAverage ();
	    }
	    else if (choice == 9)
	    {
		FoodStall ();
	    }
	    else if (choice == 10)
	    {
		StarInBox ();
	    }
	    else if (choice == 11)
	    {
		ColdDrinks ();
	    }
	    else if (choice == 12)
	    {
		DiceThrow ();
	    }
	    else if (choice == 13)
	    {
		RandomShapes ();
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
