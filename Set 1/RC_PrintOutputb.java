/*The PrintOutputb Java Class
Ryan Chang 
September 12, 2018
ICS203-03
PrintOutputb
*/

// The "RC_PrintOutputb" class.
import java.awt.*;
import hsa.Console;

public class RC_PrintOutputb
{
    static Console c;           // The output console
    
    public static void main (String[] args)
    {
	c = new Console ();
	c.print("Hello. " + "How are you today?");        
    } // main method
} // RC_PrintOutputb class
