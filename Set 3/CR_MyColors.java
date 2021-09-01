/*The MyColors Java Class
Ryan Chang
September 20
ICS203-03
Making differnt colours with rectangles 
*/

// The "CR_MyColors" class.
import java.awt.*;
import hsa.Console;

public class CR_MyColors
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

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

    } // main method
} // CR_MyColors class
