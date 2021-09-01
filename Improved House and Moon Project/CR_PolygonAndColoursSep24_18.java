/* Ryan Chang
ICS2O3-03
Sep 24 18
Polygon and Colours Program
Using colours and working with Horizontal and vertical*/

import java.awt.*;
import hsa.Console;

public class CR_PolygonAndColoursSep24_18
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	//c.setColor (Color.red);
	//Pick your colour with paint.
	Color col = new Color (100, 100, 100);
	c.setColor (col);

	Color col2 = (Color.cyan); //This makes it yellow if you uncomment this line
	//  //Color col2 = new Color (100, 110, 100);//remember to turn this off is you are using yellow
	//c.setColor (col2);
	//int Horizontal2[] = {3, 5, 42};
	//int Vertical2[] = {1, 400, 400};
	//c.fillPolygon (Horizontal2, Vertical2, 3);

	//c.setColor (Color.red);//This way you can pick a preprogrammed red
	//Creating the polygon shape.
	//    int Horizontal1[] = {0, 0, 640,640};//controls from left to right
	//    int Vertical1[] = {240, 480, 480,0};//controls from top to bottom
	//  c.fillPolygon (Horizontal1, Vertical1, 4);
	//
	//  c.getChar();
	//  c.clear();
	// Color col2 = (Color.yellow);//This makes it yellow if you uncomment this line
	//  //Color col2 = new Color (100, 110, 100);//remember to turn this off is you are using yellow
	//  c.setColor (col2);
	//  int Horizontal2[] = {260, 180, 350};
	//  int Vertical2[] = {1, 400, 400};
	//  c.fillPolygon (Horizontal2, Vertical2, 3);
	//
	c.setColor (col2);
	int Horizontal3[] = {300, 500, 400, 200, 100};
	int Vertical3[] = {0, 175, 375, 375, 175};
	c.fillPolygon (Horizontal3, Vertical3, 5);

    }
}
