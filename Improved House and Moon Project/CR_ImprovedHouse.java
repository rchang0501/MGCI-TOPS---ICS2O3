/*Ryan Chang
September 26, 2018
ICS203-03
Making an improved house*/

// The "CR_ImprovedHouse" class.
import java.awt.*;
import hsa.Console;

public class CR_ImprovedHouse
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	//Colors
	Color marroon = new Color (155, 13, 13);
	Color darkmarroon = new Color (109, 3, 3);
	Color navy = new Color (45, 56, 100);
	Color glass = new Color (180, 190, 215);
	Color darkgreen = new Color (20, 150, 50);
	Color hazel = new Color (128, 64, 0);
	Color darkhazel = new Color (84, 38, 5);
	Color middlehazel = new Color (99, 50, 4);
	Color darkwhite = new Color (223, 222, 229);
	Color moon = new Color (219, 227, 226);
	Color crater = new Color (173, 187, 189);
	Color grass = new Color (80, 150, 63);
	Color darkgrass = new Color (56, 109, 42);
	Color dirtgrass = new Color (91, 117, 41);
	Color special = new Color (2, 0, 25);
	Color darkgray = new Color (73, 77, 84);
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

	//Sky Gradient
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
	int[] xxx = {150, 200, 100, 50};
	int[] yyy = {370, 420, 490, 390};
	c.fillPolygon (xxx, yyy, 4);

	c.setColor (hazel);
	int[] xxxxx = {550, 625, 575, 545};
	int[] yyyyy = {370, 390, 490, 470};
	c.fillPolygon (xxxxx, yyyyy, 4);

	c.setColor (middlehazel);
	int[] xxxx = {100, 210, 155};
	int[] yyyy = {420, 450, 500};
	c.fillPolygon (xxxx, yyyy, 3);

	c.setColor (middlehazel);
	int[] xxxxxx = {400, 575, 530};
	int[] yyyyyy = {420, 420, 500};
	c.fillPolygon (xxxxxx, yyyyyy, 3);

	c.setColor (darkhazel);
	int[] xx = {80, 600, 580, 300, 90};
	int[] yy = {400, 400, 430, 600, 420};
	c.fillPolygon (xx, yy, 5);

	c.setColor (dirtgrass);
	int[] david = {110, 225, 155, 130};
	int[] walji = {400, 430, 465, 440};
	c.fillPolygon (david, walji, 4);

	int[] bye = {200, 325, 255, 200};
	int[] hi = {430, 430, 465, 440};
	c.fillPolygon (bye, hi, 4);

	int[] ello = {330, 455, 385, 330};
	int[] oodbye = {430, 430, 470, 440};
	c.fillPolygon (ello, oodbye, 4);

	int[] conner = {450, 565, 505, 450};
	int[] lee = {430, 410, 460, 440};
	c.fillPolygon (conner, lee, 4);

	c.setColor (grass);
	int[] ryan = {80, 280, 260, 180, 95};
	int[] chang = {400, 400, 430, 450, 415};
	c.fillPolygon (ryan, chang, 5);

	int[] bob = {380, 480, 450, 378, 360};
	int[] sponge = {400, 400, 455, 440, 430};
	c.fillPolygon (bob, sponge, 5);

	c.setColor (darkgrass);
	int[] toast = {240, 380, 360, 310, 262};
	int[] cute = {400, 400, 430, 450, 430};
	c.fillPolygon (toast, cute, 5);

	int[] jdub = {480, 590, 560, 458};
	int[] potato = {400, 400, 420, 440};
	c.fillPolygon (jdub, potato, 4);

	//White Body
	c.setColor (Color.white);
	c.fillRect (275, 135, 225, 265);
	c.setColor (darkwhite);
	int[] ee = {500, 500, 515, 515};
	int[] ff = {260, 135, 155, 270};
	c.fillPolygon (ee, ff, 4);

	//Red Building Parts
	c.setColor (marroon);
	c.fillRect (125, 260, 235, 140);
	c.setColor (darkmarroon);
	int[] jeffrey = {360, 370, 370, 360};
	int[] changgg = {258, 265, 400, 400};
	c.fillPolygon (jeffrey, changgg, 4);

	c.setColor (marroon);
	c.fillRect (500, 260, 50, 140);
	c.setColor (darkmarroon);
	int[] aa = {550, 550, 560, 560};
	int[] bb = {400, 260, 265, 400};
	c.fillPolygon (aa, bb, 4);
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

	//Other Side Window
	c.fillRect (508, 278, 34, 114);
	c.setColor (glass);
	c.fillRect (513, 283, 24, 104);

	/*c.setColor (new Color (200, 210, 235));
	c.fillRect (513, 283, 24, 104);
	for (int i = 0 ; i < 24 ; i++)
	{

	    int j = i / 2;
	    c.setColor (new Color (200 - j < 0 ? 0:
	    200 - j, 210 - j, 235 - j));

	    c.fillRect (150 + i, 300, 1, 90);
	}
	*/

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
	c.setColor (darkgray);
	c.fillRect (375, 395, 110, 5);

	//Bezels
	c.setColor (Color.gray);
	c.fillRect (90, 400, 500, 7);

	c.fillRect (267, 130, 241, 8);
	int[] ii = {508, 508, 523, 523};
	int[] jj = {130, 138, 158, 148};
	c.fillPolygon (ii, jj, 4);
	c.setColor (darkgray);
	c.fillRect (267, 138, 241, 3);
	int[] vicky = {508, 523, 515, 500};
	int[] changg = {138, 158, 158, 138};
	c.fillPolygon (vicky, changg, 4);

	c.setColor (Color.gray);
	c.fillRect (110, 252, 258, 8);
	int[] marg = {368, 376, 376, 368};
	int[] chen = {252, 259, 267, 260};
	c.fillPolygon (marg, chen, 4);
	c.setColor (darkgray);
	c.fillRect (110, 260, 258, 3);
	int[] lynn = {368, 376, 370, 362};
	int[] toxic = {260, 267, 267, 260};
	c.fillPolygon (lynn, toxic, 4);

	c.setColor (Color.gray);
	c.fillRect (500, 252, 55, 8);
	int[] gg = {555, 555, 568, 568};
	int[] hh = {252, 263, 270, 262};
	c.fillPolygon (gg, hh, 4);
	c.setColor (darkgray);
	c.fillRect (500, 260, 55, 3);
	int[] tina = {555, 568, 560, 550};
	int[] deca = {260, 270, 270, 260};
	c.fillPolygon (tina, deca, 4);


	//Fence
	c.setColor (Color.gray);
	for (int x = 115 ; x <= 265 ; x += 15)
	{
	    c.fillRect (x, 200, 5, 60);
	}


	/*The Brute Force Version
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
	c.fillRect (336, 175, 5, 60);

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
	c.fillRect (436, 175, 5, 60);

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

	/*c.setColor (new Color (35, 19, 113));
	int e = 0;
	if (e <= 10)
	    c.setColor (new Color (35 - e, 19 - e, 113 - e));
	if (e > 25 && e <= 19)
	    c.setColor (new Color (0, 19 - e, 113 - e));
	if (e > 0)
	    c.setColor (new Color (0, 0, 113 - e));
	c.fillStar (x1 + 4, y1 + 30, 10, e);*/



	//Sky and Sun
	//c.setColor (Color.yellow);
	//c.fillOval (5, 5, 100, 100);
	//c.fillStar (150, 20, 20, 20);
	//c.setColor (Color.black);
	//c.fillOval (50, 20, 60, 60);

	//Ground
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

	//Tree
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

	//Color lightblue = new Color (68, 168, 227);
	//c.setColor (lightblue);
	//c.fillRect (30, 30, 100, 100);
    } // main method
} // CR_ImprovedHouse class


