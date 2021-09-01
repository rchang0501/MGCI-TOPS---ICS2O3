/*The "CR_RocketLanding" class.
Ryan Chang
December 3, 2018
Rocket blasting off and then landing
*/
import java.awt.*;
import java.awt.image.BufferedImage;
import javax.swing.*;
import hsa.Console;
import sun.audio.*;
import javax.imageio.*;
import java.io.*;
import java.util.Random;

public class CR_RocketLanding
{
    static Console c;           // The output console
    static Graphics2D graphics;
    static Random rand = new Random ();

    //*******************************Image Loading Method****************************
    public static Image loadImage (String name) throws Exception
    {
	Image img = ImageIO.read (new File (name));
	return img;
    }


    //*******************************Audio Method****************************
    public static void playAudio (String file) throws Exception //for .wav only
    {
	InputStream in = new FileInputStream (file);
	AudioStream as = new AudioStream (in);
	AudioPlayer.player.start (as);
    }


    //*******************************Main Method****************************
    public static void main (String[] args) throws Exception
    {
	c = new Console ();
	BufferedImage image = new BufferedImage (640, 480, BufferedImage.TYPE_INT_ARGB); //BufferedImage
	graphics = image.createGraphics (); //Graphics2D

	//Intro Scene
	Image rocket = loadImage ("rocket.png"); //loading the rocket
	Image place = loadImage ("background.png"); //loading the background
	Image intro = loadImage ("4.png"); //loading the intro scence
	graphics.drawImage (intro, 0, 0, null);

	c.drawImage (image, 0, 0, null);

	//Countdown Scene
	c.getChar ();
	playAudio ("Megalovania.wav"); //play epic music
	String[] nums = {"3.png", "2.png", "1.png"};
	for (int i = 0 ; i < 3 ; i++)
	{
	    graphics.drawImage (place, 0, 0, null);
	    graphics.drawImage (rocket, 80, 100, null);
	    graphics.drawImage (loadImage (nums [i]), 50 + 200 * i, 0 + 100 * i, null);
	    c.drawImage (image, 0, 0, null);
	    Thread.sleep (1000);
	}

	//Blast Off! - Explosion
	Image explosion = loadImage ("boom.png"); //loading the explosion image
	rocket = loadImage ("rocket.png"); //change the rocket into the launch model
	playAudio ("explosion.wav"); //playing explosion audio
	graphics.drawImage (explosion, -20, 30, null);
	c.drawImage (image, 0, 0, null);
	Thread.sleep (1000);

	//Blast Off! - Moving the Rocket
	for (int i = 0 ; i < 20 ; i++)
	{
	    graphics.drawImage (place, 0, 0, null);
	    graphics.drawImage (rocket, 80, 100 - (i * i * i * i * i) / 3000, null); //rocket take off speed
	    c.drawImage (image, 0, 0, null);
	}

	//Mid Air FLight Upwards
	Image rocket2 = loadImage ("rocket2.png");
	Image place2 = loadImage ("space2.png"); //changing the background
	for (int i = 0 ; i < 30 ; i++)
	{
	    graphics.drawImage (place2, 0, 0, null);
	    graphics.drawImage (rocket2, -300 + (i * i * i * i * i) / 3000, 400 - (i * i * i * i * i) / 3000, null); //rocket take off speed
	    c.drawImage (image, 0, 0, null);
	}


	//Manuvering Through Space
	rocket = loadImage ("rocket2.png"); //Load the Rocket
	place = loadImage ("space4.png"); //Load the Background
	Image meteor = loadImage ("meteor2.png"); //Load the meteors
	int meteorX = 400;
	int meteorX2 = 300;
	int meteorX3 = 500;
	int meteorY1 = 50;
	int meteorY2 = 100;
	int meteorY3 = 150;
	for (int x = 0 ; x < 540 ; x += 2)
	{
	    int y = (int) (Math.cos (Math.toRadians (x * 2)) * 175 + 25);
	    graphics.drawImage (place, -20, 0, null);
	    graphics.drawImage (rocket, x / 3, y, null);

	    if (y < 200 && x > 200) //First Meteor
	    {
		graphics.drawImage (meteor, meteorX, meteorY1, null);
		meteorX -= 10;
		meteorY1 += 10;
	    }

	    if (y > 200 && x > 100) //Second Meteor
	    {
		graphics.drawImage (meteor, meteorX2, meteorY2, null);
		meteorX2 -= 30;
		meteorY2 += 30;
	    }
	    c.drawImage (image, 0, 0, null);
	}

	//Make a Choice Prompt
	place = loadImage ("choice.png"); //load ending scene
	graphics.drawImage (place, 0, 20, null);
	c.drawImage (image, 0, 0, null);

	//Choice Execution
	int num;
	c.println ("Land?");
	num = c.readInt ();
	Thread.sleep (350);
	if (num == 1) //Landing Sequence
	{
	    place = loadImage ("background.png"); //load ending scene
	    for (int i = 0 ; i < 50 ; i++)
	    {
		graphics.drawImage (place, 0, 0, null);
		graphics.drawImage (rocket, i, 5 * i, null); //rocket landing speed
		c.drawImage (image, 0, 0, null);
	    }
	    Thread.sleep (350);
	    c.drawImage (image, 0, 0, null);
	    place = loadImage ("end.png"); //load ending scene
	    graphics.drawImage (place, 0, 0, null);
	    c.drawImage (image, 0, 0, null);
	}
	else //Continue Flying Through Space
	{
	    Image place4 = loadImage ("space1.png");
	    for (int i = 0 ; i < 30 ; i++)
	    {
		graphics.drawImage (place4, 0, 0, null);
		graphics.drawImage (rocket2, -300 + (i * i * i * i * i) / 3000, 400 - (i * i * i * i * i) / 3000, null); //rocket take off speed
		c.drawImage (image, 0, 0, null);
	    }
	    Image place3 = loadImage ("end2.png");
	    graphics.drawImage (place3, 0, 0, null);
	    c.drawImage (image, 0, 0, null);
	}

    } // main method
} // CR_RocketLanding class


