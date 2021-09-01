/*Ryan Chang
September 20, 2018
ICS203-03
RC_Set3_Menu
Putting the Set 3 programs into a menu.
*/

import java.awt.*;
import hsa.Console;

public class CR_Set3_Menu
{
    static Console c;

    //*******************************Intro*********************************


    public static void Intro ()
    {
	c.clear (); // clear the screen
	// Display message
	c.println ("Hi!");
	c.println ("This is where you can find all my programs from Set 3.");
	c.println ("Have fun browsing!");
    }


    //*******************************BlueRect*********************************


    public static void BlueRect ()
    {
	c.clear (); // clear the screen
	// Display message
	
	//3.1.1 and 3.1.2 and 3.1.3
	c.setColor (Color.blue);
	c.fillRect (635, 0, 5, 5);
	//(x,y,l,h)
	c.setColor (Color.red);
	c.fillRect (0, 495, 5, 5);
	c.setColor (Color.green);
	c.fillRect (0, 0, 5, 5);
	c.setColor (Color.yellow);
	c.fillRect (635, 495, 5, 5);
	c.setColor (Color.pink);
	c.fillRect (312, 215, 5, 5);

    }


    //*******************************Rectangles*********************************


    public static void Rectangles ()
    {
	c.clear (); // clear the screen
	// Display message

	//3.1.1 and 3.1.2 and 3.1.3
	c.setColor (Color.blue);
	c.fillRect (635, 0, 5, 5);
	//(x,y,l,h)
	c.setColor (Color.red);
	c.fillRect (0, 495, 5, 5);
	c.setColor (Color.green);
	c.fillRect (0, 0, 5, 5);
	c.setColor (Color.yellow);
	c.fillRect (635, 495, 5, 5);
	c.setColor (Color.pink);
	c.fillRect (312, 215, 5, 5);

    }


    //*******************************MyColors*********************************


    public static void MyColors ()
    {
	c.clear (); // clear the screen
	// Display message

	//3A
	Color pink = new Color (255, 0, 255);
	c.setColor (pink);
	c.fillRect (140, 200, 70, 70);

	Color black = new Color (0, 0, 0);
	c.setColor (black);
	c.fillRect (210, 200, 70, 70);

	Color grey = new Color (200, 200, 200);
	c.setColor (grey);
	c.fillRect (0, 200, 70, 70);

	Color white = new Color (255, 255, 255);
	c.setColor (white);
	c.fillRect (70, 200, 70, 70);

	Color red = new Color (255, 0, 0);
	c.setColor (red);
	c.fillRect (280, 200, 70, 70);

	Color green = new Color (0, 255, 0);
	c.setColor (green);
	c.fillRect (350, 200, 70, 70);

	Color blue = new Color (0, 0, 255);
	c.setColor (blue);
	c.fillRect (420, 200, 70, 70);

	Color brown = new Color (160, 100, 0);
	c.setColor (brown);
	c.fillRect (490, 200, 70, 70);
	
	Color turqoise = new Color (0, 200, 200);
	c.setColor (turqoise);
	c.fillRect (560, 200, 70, 70);

	Color navy = new Color (45, 56, 100);
	c.setColor (navy);
	c.fillRect (0, 270, 70, 70);
	
	Color DECAblue = new Color (10, 30, 100);
	c.setColor (DECAblue);
	c.fillRect (70, 270, 70, 70);

    }


    //*******************************Circles*********************************


    public static void Circles ()
    {
	c.clear (); // clear the screen
	// Display message

	c.setColor (Color.magenta);
	c.fillOval (225,150,250,250);
	//c.drawOval is just the outline of the circle 

    }


    //*******************************House*********************************


    public static void House ()
    {
	c.clear (); // clear the screen
	// Display message
	//3B
	c.setColor (Color.blue);
	c.fillRect (200, 200, 200, 200);
	c.setColor (Color.green);
	c.fillRect (275, 325, 50, 75);
	c.setColor (Color.yellow);
	c.fillRect (235, 250, 40, 40);
	c.fillRect (325, 250, 40, 40);
	c.setColor (Color.red);
	c.fillRect (175, 160, 250, 40);
	c.setColor (Color.black);
	c.fillRect (235, 120, 30, 40);
	c.setColor (Color.cyan);
	c.fillOval (160, 60, 50, 50);
	c.fillOval (100, 50, 40, 40);
	c.fillOval (40, 40, 30, 30);
    }


    //*******************************Moon*********************************


    public static void Moon ()
    {
	c.clear (); // clear the screen
	// Display message
	c.setColor (Color.black); 
	c.fillRect (0,0, 10000000, 100000);
	c.setColor (Color.yellow);
	c.fillOval (135, 150, 200, 200);
	c.fillStar (50, 50, 50, 50);
	c.fillStar (260, 30, 50, 50);
	c.fillStar (550, 350, 50, 50);
	c.fillStar (500, 150, 50, 50);
	c.fillStar (400, 400, 50, 50);
	c.fillStar (70, 370, 50, 50);
	c.setColor (Color.black);
	c.fillOval (195, 175, 150, 150);
    }


    //*******************************ColSquares*********************************


    public static void ColSquares ()
    {
	c.clear (); // clear the screen
	// Display message
	c.setColor (Color.blue);
	c.fillRect (100,50, 400, 400);
	c.setColor (Color.yellow);
	c.fillRect (150,100, 300, 300);
	c.setColor (Color.green);
	c.fillRect (200, 150, 200, 200);
	c.setColor (Color.red);
	c.fillRect (250, 200, 100, 100);
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
	    c.println ("Enter 1, 2, 3, 4, 5, 6, 7, 8");
	    c.println ("1 - About the contents in this menu");
	    c.println ("2 - The BlueRect Porgram");
	    c.println ("3 - The Rectangles Program");
	    c.println ("4 - The MyColors Program");
	    c.println ("5 - The Circles Program");
	    c.println ("6 - The House Program");
	    c.println ("7 - The Moon Program");
	    c.println ("8 - The ColSquares Program");

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

		    BlueRect ();
		}
		else
		    if (choice == 3)
		    {
			c.clear ();
			Rectangles ();
		    }
		    else
			if (choice == 4)
			{
			    MyColors ();
			}
			else
			    if (choice == 5)
			    {
				c.clear ();
				Circles ();
			    }
			    else
				if (choice == 6)
				{
				    c.clear ();
				    House ();
				}
				else
				    if (choice == 7)
				    {
					c.clear ();
					Moon ();
				    }
				    else
					if (choice == 8)
					{
					    c.clear ();
					    ColSquares ();
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


