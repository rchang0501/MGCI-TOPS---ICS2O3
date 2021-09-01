// The "Trythis" class.
import java.awt.*;
import hsa.Console;

public class Trythis
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();

	c.setColor (Color.red);
	c.fillRect (0, 0, 100, 100);
	c.setColor (Color.blue);
	c.fillRect (100, 0, 100, 100);
	c.setColor (Color.yellow);
	c.fillRect (0, 100, 100, 100);
	c.setColor (Color.green);
	c.fillRect (100, 100, 100, 100);
    } // main method
} // Trythis class
