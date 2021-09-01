/*The VirusWarning Java Class
Ryan Chang
September 12, 2018
ICS203-03
VirusWarning
*/

// The "RC_VirusWarning" class.
import java.awt.*;
import hsa.Console;

public class RC_VirusWarning
{
    static Console c;           // The output console

    public static void main (String[] args)
    {
	c = new Console ();
	c.println("\t" + "WARNING" + "\n");
	c.println ("\tPossible virus detected \n\tReboot and run antivirus software");
    } // main method
} // RC_VirusWarning class
