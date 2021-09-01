/*
Ryan Chang 
November 19, 2018
ICS2O3-03
Set 8
Modern ASCII art drawn with loops, and more
*/
import java.awt.*;
import hsa.Console;

public class CR_Set8 {
    private static Console c;

    /* ***************************PrintCharsA********************************* */
    private static void PrintCharsA() {
	for (char ch = 1 ; ch <= 6 ; ch++)   //1
	{
	c.print (ch + "ch ");  //2
	}
    }


    /* ***************************PrintCharsB*************************** */
    private static void PrintCharsB() {
	for (char ch = 32; ch <= 126; ch++) {
	    c.print(ch, 4);
	}
	
	c.println();
    }
    
    /* ***************************PrintCharsC*************************** */
    private static void PrintCharsC()
    {
	for (char ch = 32; ch <= 126; ch++) {
	    int ascii = ch;
	    c.print("" + ascii, 4);
	    c.print(ch, 4);
	}
	
	c.println();
    }
    
    /* ****************************PrintLbl******************************* */
    private static void PrintLbl() {
	c.print("", 25);
	
	for (int i = 0; i < 30; i++) {
	    c.print('=');
	}
	
	c.println();
	c.print("", 32);
	c.println("realcoolclothing");
	c.print("", 44);
	c.println("from");
	c.print("", 35);
	c.println("ETHNIK AFRICA");
	c.print("", 25);
	
	for (int i = 0; i < 30; i++) {
	    c.print('=');
	}
	
	c.println();
    }
    
    /* ****************************PrintDiag***************************** */
    private static void PrintDiag() {
	char sel = 0;
	
	while (true) {
	    c.clear();
	    
	    switch (sel) {
		case 'q':
		    return;
		case '1':
		case 'a':
		    for (int i = 6; i >= 1; i--) {
			c.println(i, i);
		    }
		    break;
		case '2':
		case 'b':
		    for (int i = 1; i <= 6; i++) {
			c.println(i, 7 - i);
		    }
		    break;
		case '3':
		case 'c':
		    for (int i = 6; i >= 1; i--) {
			c.println(i, 13 - 2 * i);
		    }
		    break;
		case '4':
		case 'd':
		    for (int i = 0; i < 6; i++) {
			char ch = (char) (i + 65);
			
			if (ch == 'E') {
			    c.println("E E E E E E");
			} else {
			    c.print("", i * 2);
			    c.println(ch);
			}
		    }
		    break;
		default:
		    c.println("\n\n\n\n\n");
	    }
	    
	    c.println("Select a pattern from 1-4 (a-d).");
	    c.println("Press <q> to quit.");
	    sel = c.getChar();
	}
    }
    
    /* ********************************ConvertTemp***************************** */
    private static void ConvertTemp() {
	char rangeSel;
	int rangeMin = 100;
	
	while (true) {
	    c.print("°C", 8);
	    c.println("°F");
	    
	    for (int degC = rangeMin; degC <= rangeMin + 15; degC++) {
		long degF = Math.round(degC * 9.0 / 5 + 32);
		c.print(degC + "°", 8);
		c.println(degF + "°");
	    }
	    
	    c.println();
	    
	    c.println("Use <,> and <.> to cycle through the table.");
	    c.println("Press <q> to quit.");
	    rangeSel = c.getChar();
	    
	    if (rangeSel == 'q') {
		return;
	    } else if (rangeSel == ',') {
		rangeMin = rangeMin > 100 ? rangeMin - 15 : rangeMin;
	    } else if (rangeSel == '.') {
		rangeMin = rangeMin < 265 ? rangeMin + 15 : rangeMin;
	    }
	    
	    c.clear();
	}
    }
    
    /* ******************************MaxNumsA******************************** */
    private static void MaxNumsA() {
	int num;
	int max;
	
	c.print("Enter a number. " );
	num = c.readInt();
	max = num;
	
	for (int i = 1; i < 10; i++) {
	    c.print("Enter another number. ");
	    num = c.readInt();
	    
	    if (num > max) {
		max = num;
	    }
	}
	
	c.println("The largest number is " + max + ".");
    }


    /* *****************************MaxNumsB***************************** */
    private static void MaxNumsB() {
	int num;
	int listSize;
	int max;
	
	c.print("How many numbers are in the list? ");
	listSize = c.readInt();
	
	if (listSize < 1) {
	    c.println("Surely there's at least one number?");
	    return;
	} else { 
	    c.print("Enter a number. " );
	    num = c.readInt();
	    max = num;
	    
	    for (int i = 1; i < listSize; i++) {
		c.print("Enter another number. ");
		num = c.readInt();
		
		if (num > max) {
		    max = num;
		}
	    }
	    
	    c.println("The largest number is " + max + ".");
	}
    }
    
    /* ********************************MinNum**********************************/
    private static void MinNum() {
	int num;
	int listSize;
	int min;
	
	c.print("How many numbers are in the list? ");
	listSize = c.readInt();
	
	if (listSize < 1) {
	    c.println("Surely there's at least one number?");
	    return;
	} else { 
	    c.print("Enter a number. " );
	    num = c.readInt();
	    min = num;
	    
	    for (int i = 1; i < listSize; i++) {    
		c.print("Enter another number. ");
		num = c.readInt();
		
		if (num < min) {
		    min = num;
		}
	    }
	    
	    c.println("The smallest number is " + min + ".");
	}
    }
    
    /* *****************************BakedBeans*************************** */
    private static void BakedBeans() {
	String item;
	double price;
	int numItems;
	String cheapest;
	double bestPrice;
	
	c.print("How many items are you comparing? ");
	numItems = c.readInt();
	
	if (numItems < 1) {
	    c.println("Surely there's at least one item?");
	    return;
	} else {
	    c.print("Enter the name of the first item. " );
	    cheapest = c.readLine();
	    c.print("Enter its price. ");
	    bestPrice = c.readDouble();
	    
	    for (int i = 1; i < numItems; i++) {
		c.print("Enter the name of another item. ");
		item = c.readLine();
		c.print("Enter its price. ");
		price = c.readDouble();
		
		if (price < bestPrice) {
		    bestPrice = price;
		    cheapest = item;
		}
	    }
	    
	    c.println(cheapest + " is the best buy.");
	}
    }
    
    /* *****************************FivePatterns****************************** */
    private static void FivePatterns() {
	char sel = 0;
	
	while (true) {
	    c.clear();
	    
	    switch (sel) {
		case 'q':
		    return;
		case '1':
		case 'a':
		    for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
			    c.print(j);
			}
			c.println();
		    }
		    
		    c.println();
		    break;
		case '2':
		case 'b':
		    for (int i = 1; i <= 4; i++) {
			for (int j = 1; j <= i; j++) {
			    c.print(i);
			}
			c.println();
		    }
		    
		    c.println();
		    break;
		case '3':
		case 'c':
		    for (int i = 1; i <= 4; i++) {
			for (int j = i; j >= 1; j--) {
			    c.print(j);
			}
			c.println();
		    }
		    
		    c.println();
		    break;
		case '4':
		case 'd':
		    for (int i = 1; i <= 4; i++) {
			for (int j = 0; j < i; j++) {
			    c.print((int) (Math.pow(i, 2) / 2 - i / 2.0 + 1 + j));
			}
			c.println();
		    }
		    
		    c.println();
		    break;
		case '5':
		case 'e':
		    for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < 5; j++) {
			    c.print(i + j);
			}
			c.println();
		    }
		    break;
		default:
		    c.println("\n\n\n\n");
		    break;
	    }
	    
	    c.println("Select a pattern from 1-5 (a-e).");
	    c.println("Press <q> to quit.");
	    sel = c.getChar();
	}
    }
    
    /* *****************************AdjacentT****************************** */
    private static void AdjacentT() {
	for (int i = 0; i < 5; i++) {
	    for (int j = 0; j < 2 * i + 1; j++) {
		c.print("%");
	    }
	    
	    c.println();
	}
    }
    
    /* ***************************TriangleShape***************************** */
    private static void TriangleShape() {
	for (int i = 0; i < 5; i++) {
	    c.print("", 4 - i);
	    
	    for (int j = 0; j < 2 * i + 1; j++) {
		c.print("%");
	    }
	    
	    c.println();
	}
    }
    
    /* ********************************MENU******************************** */
    public static void main (String[] args) {
	c = new Console();
	int choice;
	
	do {
	    c.println("Choose a program from the menu by entering the corresponding integer");
	    c.println("To exit a graphical program, press any character key.");
	    c.println("1  - PrintCharsA");
	    c.println("2  - PrintCharsB");
	    c.println("3  - PrintCharsC");
	    c.println("4  - PrintLbl");
	    c.println("5  - PrintDiag");
	    c.println("6  - ConvertTemp");
	    c.println("7  - MaxNumsA");
	    c.println("8  - MaxNumsB");
	    c.println("9  - MinNum");
	    c.println("10 - BakedBeans");
	    c.println("11 - FivePatterns");
	    c.println("12 - AdjacentT");
	    c.println("13 - TriangleShape");
	    c.println();
	    c.println("0 - [quit]");
	    c.print("Run: ");
	    
	    choice = c.readInt();
	    
	    c.clear();
	    if (choice == 0) {
		continue;
	    } else if (choice == 1) {
		PrintCharsA();
	    } else if (choice == 2) {
		PrintCharsB();
	    } else if (choice == 3) {
		PrintCharsC();
	    } else if (choice == 4) {
		PrintLbl();
	    } else if (choice == 5) {
		PrintDiag();
	    } else if (choice == 6) {
		ConvertTemp();
	    } else if (choice == 7) {
		MaxNumsA();
	    } else if (choice == 8) {
		MaxNumsB();
	    } else if (choice == 9) {
		MinNum();
	    } else if (choice == 10) {
		BakedBeans();
	    } else if (choice == 11) {
		FivePatterns();
	    } else if (choice == 12) {
		AdjacentT();
	    } else if (choice == 13) {
		TriangleShape();
	    } else {
		c.println("Select a program from 0-11.");
	    }
	    
	    c.print(choice == 5 || choice == 11 ? "" : "\n");
	    c.print(choice >= 1 && choice <= 13 ? "Method returned.\n" : "");
	    c.println("Press any character key to continue.\n");
	    c.getChar();
	    c.clear();
	} while (choice != 0);
	
	c.println("The program has terminated.");
    }
}
