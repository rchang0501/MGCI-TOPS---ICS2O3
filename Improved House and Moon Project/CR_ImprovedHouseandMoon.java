/*Ryan Chang
Started: September 26, 2018
Completed: October 10, 2018
ICS203-03
Making an improved house and moon using c.fill operations, polygons, and animation*/

// The "CR_ImprovedHouseandMoon" class.
import java.awt.*;
import hsa.Console;

public class CR_ImprovedHouseandMoon
{
    static Console c;           // The output console
    public static void main (String[] args)
    {
	c = new Console ();

	//Colors
	Color marroon = new Color (155, 13, 13);
	Color darkmarroon = new Color (108, 0, 0);
	Color navy = new Color (45, 56, 100);
	Color dirtywhite = new Color (244, 247, 252);
	Color glass = new Color (180, 190, 215);
	Color darkgreen = new Color (20, 150, 50);
	Color hazel = new Color (128, 64, 0);
	Color darkhazel = new Color (84, 38, 5);
	Color middlehazel = new Color (99, 50, 4);
	Color darkwhite = new Color (203, 209, 216);
	Color moon = new Color (219, 227, 226);
	Color crater = new Color (173, 187, 189);
	Color grass = new Color (80, 150, 63);
	Color darkgrass = new Color (56, 109, 42);
	Color dirtgrass = new Color (91, 117, 41);
	Color special = new Color (2, 0, 25);
	Color darkgray = new Color (73, 77, 84);
	Color middlegray = new Color (130, 134, 140);
	Color starblue = new Color (77, 183, 226);
	Color starred = new Color (155, 45, 111);
	Color moonglow1 = new Color (43, 43, 76);
	Color moonglow2 = new Color (81, 81, 119);
	Color moonglow3 = new Color (124, 124, 165);

	//Night Sky
	c.setColor (new Color (35, 19, 113));
	c.fillRect (0, 0, 640, 480);
	for (int i = 0 ; i < 113 ; i++)
	{
	    if (i <= 10)
		c.setColor (new Color (35 - i, 19 - i, 113 - i));
	    if (i > 25 && i <= 19)
		c.setColor (new Color (0, 19 - i, 113 - i));
	    if (i > 0)
		c.setColor (new Color (0, 0, 113 - i));

	    c.fillRect (0, 0, c.getWidth (), c.getHeight () - i * 5);
	}

	//Moon Glows
	c.setColor (moonglow1);
	c.fillOval (-55, -35, 250, 250);
	c.setColor (moonglow2);
	c.fillOval (-45, -25, 230, 230);
	c.setColor (moonglow3);
	c.fillOval (-37, -17, 215, 215);


	//Static Stars
	c.setColor (Color.white);
	//Loop Method
	c.setColor (Color.white);

	for (int i = 0 ; i < 125 ; i++)
	{
	    c.fillStar ((int) (Math.random () * 640), (int) (Math.random () * 640), 8, 8);
	}

	c.setColor (starblue);
	for (int i = 0 ; i < 125 ; i++)
	{
	    c.fillStar ((int) (Math.random () * 640), (int) (Math.random () * 400), 6, 6);
	}

	c.setColor (starred);
	for (int i = 0 ; i < 125 ; i++)
	{
	    c.fillStar ((int) (Math.random () * 640), (int) (Math.random () * 500), 5, 5);
	}
	//Brute Force Method
	c.fillStar (200, 20, 5, 5);
	c.fillStar (210, 100, 5, 5);
	c.fillStar (215, 25, 5, 5);
	c.fillStar (265, 23, 5, 5);
	c.fillStar (280, 80, 5, 5);
	c.fillStar (300, 50, 8, 8);
	c.fillStar (320, 100, 5, 5);
	c.fillStar (340, 45, 5, 5);
	c.fillStar (370, 80, 5, 5);
	c.fillStar (400, 50, 5, 5);
	c.fillStar (420, 60, 5, 5);
	c.fillStar (440, 15, 5, 5);
	c.fillStar (470, 80, 5, 5);
	c.fillStar (500, 40, 5, 5);
	c.fillStar (550, 60, 8, 8);
	c.fillStar (580, 75, 5, 5);
	c.fillStar (600, 10, 5, 5);
	c.fillStar (620, 95, 5, 5);

	//Sky Gradient (ALT);
	/*c.setColor (new Color (68, 168, 225));
	c.fillRect (0, 0, 640, 480);
	for (int i = 0 ; i < 225 ; i++)
	{
	    if (i <= 68)
		c.setColor (new Color (68 - i, 168 - i, 225 - i));
	    if (i > 68 && i <= 168)
		c.setColor (new Color (30, 168 - i, 225 - i));
	    if (i > 168)
		c.setColor (new Color (0, 0, 225 - i));

	    c.fillRect (0, 0, c.getWidth (), c.getHeight () - i * 5);
	}*/

	//Big Moon (ALT);
	/*c.setColor (moon);
	c.fillOval (-100, 290, 900, 300);
	c.setColor (crater);
	c.fillOval (50, 400, 100, 75);*/

	//Moon
	c.setColor (moon);
	c.fillOval (-30, -10, 200, 200);
	c.setColor (crater);
	c.fillOval (100, 100, 20, 20);
	c.fillOval (100, 40, 40, 40);
	c.fillOval (-10, 20, 60, 60);
	c.fillOval (30, 135, 35, 35);
	c.fillOval (125, 120, 30, 30);
	c.fillOval (75, 15, 20, 20);
	c.fillOval (7, 95, 20, 20);
	//c.fillOval (90, 150, 20, 20);

	//Island
	c.setColor (hazel);
	int[] side1 = {150, 200, 100, 50};
	int[] island1 = {370, 420, 490, 390};
	c.fillPolygon (side1, island1, 4);

	c.setColor (hazel);
	int[] side2 = {550, 625, 575, 545};
	int[] island2 = {370, 390, 490, 470};
	c.fillPolygon (side2, island2, 4);

	c.setColor (middlehazel);
	int[] middle1 = {100, 210, 155};
	int[] middleisland1 = {420, 450, 500};
	c.fillPolygon (middle1, middleisland1, 3);

	c.setColor (middlehazel);
	int[] middle2 = {400, 575, 530};
	int[] middleisland2 = {420, 420, 500};
	c.fillPolygon (middle2, middleisland2, 3);

	c.setColor (darkhazel);
	int[] center = {80, 600, 580, 300, 90};
	int[] bigisland = {400, 400, 430, 600, 420};
	c.fillPolygon (center, bigisland, 5);

	c.setColor (dirtgrass);
	int[] dirt1 = {110, 225, 155, 130};
	int[] grass1 = {400, 430, 465, 440};
	c.fillPolygon (dirt1, grass1, 4);

	int[] dirt2 = {200, 325, 255, 200};
	int[] grass2 = {430, 430, 465, 440};
	c.fillPolygon (dirt2, grass2, 4);

	int[] dirt3 = {330, 455, 385, 330};
	int[] grass3 = {430, 430, 470, 440};
	c.fillPolygon (dirt3, grass3, 4);

	int[] dirt4 = {450, 565, 505, 450};
	int[] grass4 = {430, 410, 460, 440};
	c.fillPolygon (dirt4, grass4, 4);

	c.setColor (grass);
	int[] green1 = {80, 280, 260, 180, 95};
	int[] greens1 = {400, 400, 430, 450, 415};
	c.fillPolygon (green1, greens1, 5);

	int[] green2 = {380, 480, 450, 378, 360};
	int[] greens2 = {400, 400, 455, 440, 430};
	c.fillPolygon (green2, greens2, 5);

	c.setColor (darkgrass);
	int[] dark1 = {240, 380, 360, 310, 262};
	int[] greens3 = {400, 400, 430, 450, 430};
	c.fillPolygon (dark1, greens3, 5);

	int[] dark2 = {480, 590, 560, 458};
	int[] greens4 = {400, 400, 420, 440};
	c.fillPolygon (dark2, greens4, 4);

	//White Body
	c.setColor (dirtywhite);
	c.fillRect (275, 135, 225, 265);
	c.setColor (darkwhite);
	int[] d1 = {500, 500, 515, 515};
	int[] white1 = {260, 135, 155, 270};
	c.fillPolygon (d1, white1, 4);

	//Red Building Parts
	c.setColor (marroon);
	c.fillRect (125, 260, 235, 140);
	c.setColor (darkmarroon);
	int[] d2 = {360, 370, 370, 360};
	int[] marroon1 = {258, 265, 400, 400};
	c.fillPolygon (d2, marroon1, 4);

	c.setColor (marroon);
	c.fillRect (500, 260, 50, 140);
	c.setColor (darkmarroon);
	int[] d3 = {550, 550, 560, 560};
	int[] marroon2 = {400, 260, 265, 400};
	c.fillPolygon (d3, marroon2, 4);
	//int[] cc = {500, 510, 560, 560};
	//int[] dd = {260, 250, 250, 260};
	//c.fillPolygon (cc, dd, 4);

	//Side Window
	c.setColor (Color.white);
	c.fillRect (135, 295, 210, 100);

	c.setColor (new Color (200, 210, 235));
	c.fillRect (140, 300, 200, 90);
	for (int i = 0 ; i < 200 ; i++)
	{

	    int j = i / 2;
	    c.setColor (new Color (200 - j < 0 ? 0:
	    200 - j, 210 - j, 235 - j));

	    c.fillRect (140 + i, 300, 1, 90);
	}


	c.setColor (Color.white);
	c.fillRect (240, 295, 5, 100);
	c.fillRect (190, 295, 5, 100);
	c.fillRect (290, 295, 5, 100);
	c.fillRect (140, 340, 50, 4);
	c.fillRect (290, 340, 50, 4);

	//Other Side Window
	c.fillRect (508, 278, 34, 114);
	c.setColor (glass);
	c.fillRect (513, 283, 24, 104);
	c.setColor (Color.white);
	c.fillRect (508, 330, 34, 4);

	//Door
	c.setColor (navy);
	c.fillRect (380, 295, 100, 100);
	c.setColor (glass);
	c.fillRect (385, 300, 90, 95);
	c.setColor (new Color (200, 210, 235));
	c.fillRect (385, 300, 90, 95);
	for (int i = 0 ; i < 90 ; i++)
	{

	    int j = i / 2;
	    c.setColor (new Color (200 - j < 0 ? 0:
	    200 - j, 210 - j, 235 - j));

	    c.fillRect (385 + i, 300, 1, 95);
	}


	c.setColor (navy);
	c.fillRect (415, 295, 5, 100);
	c.fillRect (380, 343, 35, 4);
	c.setColor (darkgray);
	c.fillRect (375, 395, 110, 5);

	//Bezels
	c.setColor (Color.gray);
	c.fillRect (90, 400, 500, 7);

	c.fillRect (267, 130, 241, 8);
	int[] bez1 = {508, 508, 523, 523};
	int[] ang1 = {130, 138, 158, 148};
	c.fillPolygon (bez1, ang1, 4);
	c.setColor (darkgray);
	c.fillRect (267, 138, 241, 3);
	int[] bez2 = {508, 523, 515, 500};
	int[] ang2 = {138, 158, 158, 138};
	c.fillPolygon (bez2, ang2, 4);

	c.setColor (Color.gray);
	c.fillRect (110, 252, 258, 8);
	int[] bez3 = {368, 376, 376, 368};
	int[] ang3 = {252, 259, 267, 260};
	c.fillPolygon (bez3, ang3, 4);
	c.setColor (darkgray);
	c.fillRect (110, 260, 258, 3);
	int[] bez4 = {368, 376, 370, 362};
	int[] ang4 = {260, 267, 267, 260};
	c.fillPolygon (bez4, ang4, 4);

	c.setColor (Color.gray);
	c.fillRect (500, 252, 55, 8);
	int[] bez5 = {555, 555, 568, 568};
	int[] ang5 = {252, 263, 270, 262};
	c.fillPolygon (bez5, ang5, 4);
	c.setColor (darkgray);
	c.fillRect (500, 260, 55, 3);
	int[] bez6 = {555, 568, 560, 550};
	int[] ang6 = {260, 270, 270, 260};
	c.fillPolygon (bez6, ang6, 4);


	//Fence
	c.setColor (Color.gray);
	for (int x = 115 ; x <= 265 ; x += 15)
	{
	    c.fillRect (x, 200, 5, 60);
	}

	/*The Brute Force Method
	c.fillRect (130, 200, 5, 60);
	c.fillRect (145, 200, 5, 60);
	c.fillRect (160, 200, 5, 60);
	c.fillRect (175, 200, 5, 60);
	c.fillRect (190, 200, 5, 60);
	c.fillRect (205, 200, 5, 60);
	c.fillRect (220, 200, 5, 60);
	c.fillRect (235, 200, 5, 60);
	c.fillRect (250, 200, 5, 60);
	c.fillRect (265, 200, 5, 60);
	*/
	c.fillRect (110, 200, 165, 5);
	//The Other Side
	for (int x = 505 ; x <= 550 ; x += 15)
	{
	    c.fillRect (x, 200, 5, 60);
	}
	c.fillRect (500, 200, 60, 5);
	//3D Fence
	c.setColor (middlegray);
	int[] fence = {561, 565, 565, 561};
	int[] side = {203, 205, 261, 258};
	c.fillPolygon (fence, side, 4);

	c.setColor (Color.gray);
	int[] Top = {560, 570, 570, 560};
	int[] fenceside = {200, 209, 216, 205};
	c.fillPolygon (Top, fenceside, 4);

	//Window Frames
	c.setColor (navy);
	c.fillRect (300, 175, 75, 60);
	c.fillRect (400, 175, 75, 60);
	//Left Window
	c.setColor (new Color (200, 210, 235));
	c.fillRect (305, 180, 65, 50);
	for (int i = 0 ; i < 65 ; i++)
	{
	    int j = i / 2;
	    c.setColor (new Color (200 - j < 0 ? 0:
	    200 - j, 210 - j, 235 - j));

	    c.fillRect (305 + i, 180, 1, 50);
	}
	c.setColor (navy);
	//c.fillRect (321, 175, 5, 60);
	c.fillRect (321, 175, 4, 60);
	c.fillRect (351, 175, 4, 60);
	c.fillRect (300, 203, 23, 3);
	c.fillRect (352, 203, 23, 3);

	//Right Window
	c.setColor (glass);
	c.fillRect (405, 180, 65, 50);
	c.setColor (new Color (200, 210, 235));
	c.fillRect (405, 180, 65, 50);
	for (int i = 0 ; i < 65 ; i++)
	{
	    int j = i / 2;
	    c.setColor (new Color (200 - j < 0 ? 0:
	    200 - j, 210 - j, 235 - j));

	    c.fillRect (405 + i, 180, 1, 50);
	}


	c.setColor (navy);
	c.fillRect (421, 175, 4, 60);
	c.fillRect (451, 175, 4, 60);
	c.fillRect (400, 203, 23, 3);
	c.fillRect (452, 203, 23, 3);

	//Shooting Stars
	int x1 = 200;
	int y1 = -10;
	while (true)
	{
	    for (x1 = 200, y1 = -10 ; x1 < 640 ; x1 += 3, y1++)
	    {
		c.setColor (Color.white);
		c.fillStar (x1 + 7, y1 + 30, 10, 10);
		c.setColor (special);
		c.fillStar (x1 - 6, y1 + 24, 14, 14);
		try
		{
		    Thread.sleep (6);
		}
		catch (InterruptedException ie)
		{
		    ie.printStackTrace ();
		}
	    }
	    for (x1 = 275, y1 = -10 ; x1 < 640 ; x1 += 3, y1++)
	    {
		c.setColor (Color.white);
		c.fillStar (x1 + 49, y1 + 30, 10, 10);
		c.setColor (special);
		c.fillStar (x1 + 36, y1 + 24, 14, 14);
		try
		{
		    Thread.sleep (7);
		}
		catch (InterruptedException ie)
		{
		    ie.printStackTrace ();
		}
	    }
	    for (x1 = 400, y1 = -10 ; x1 < 640 ; x1 += 3, y1++)
	    {
		c.setColor (Color.white);
		c.fillStar (x1 + 49, y1 + 30, 10, 10);
		c.setColor (special);
		c.fillStar (x1 + 36, y1 + 24, 14, 14);
		try
		{
		    Thread.sleep (8);
		}
		catch (InterruptedException ie)
		{
		    ie.printStackTrace ();
		}
	    }


	}

	//Sky and Sun (ALT)
	//c.setColor (Color.yellow);
	//c.fillOval (5, 5, 100, 100);
	//c.fillStar (150, 20, 20, 20);
	//c.setColor (Color.black);
	//c.fillOval (50, 20, 60, 60);

	//Ground (ALT);
	/*c.setColor (new Color (20, 150, 50));
	c.fillRect (0, 408, 1000, 1000);
	for (int i = 0 ; i < 50 ; i++)
	{
	    if (i <= 20)
		c.setColor (new Color (20 - i, 150 - i, 50 - i));
	    if (i > 95 && i <= 150)
		c.setColor (new Color (0, 150 - i, 50 - i));
	    if (i > 150)
		c.setColor (new Color (0, 0, 150 - i));

	    c.fillRect (0, 408, c.getWidth (), c.getHeight () - i * 5);
	}*/

	//Tree (ALT)
	/*c.setColor (hazel);
	c.fillRect (40, 258, 25, 150);
	c.setColor (darkgreen);
	int[] a = {5, 50, 100};
	int[] b = {288, 218, 288};
	c.fillPolygon (a, b, 3);
	int[] A = {10, 50, 95};
	int[] B = {248, 178, 248};
	c.fillPolygon (A, B, 3);
	int[] x = {15, 50, 90};
	int[] y = {208, 138, 208};
	c.fillPolygon (x, y, 3);
	*/

    } // main method
} // CR_ImprovedHouse class


