import java.util.Scanner;

/**
 * Author:		Tuyen Vu
 * Date:		04/01/2022
 * Description: 
 * 		Writing a program that does book inventory each day
 *  	Fist, ask for ISBN and validating it
 *  	Then, ask for returning or checking book
 * 		Calculate books returned or checked out
 * 		Display the calculation
 */

public class Vu_Assignment2 {
	public static void main(String args[]) 
    {
		Scanner input = new Scanner(System.in);
		String ISBN;
		char returnOrcheckout;
		char exit = 'y';
		int checkSum;
		int returned = 0;
		int checkout = 0;
		int processed = 0;
		
		System.out.println("************************************************");
		System.out.println("* Welcome to the Daily Book Inventory Program! *");
		System.out.println("************************************************");
		
		do {
			// Get ISBN
			System.out.print("Enter the first 12 digits of an ISBN-13 as a String: ");
			ISBN = input.next();
		
			// Validating ISBN
			int ISBN_length = ISBN.length();
		
			if (ISBN_length != 12) {
				System.out.println("Invalid ISBN-13 number! Try again.");
				continue;
			}
			else {
				// Calculate checksum number
				int temp = 0;
				for (int i = 0; i < ISBN_length; i++) {
					char a = ISBN.charAt(i);
					String s = String.valueOf(a);
					int charValue = Integer.parseInt(s);
					if (i%2 == 0)
						temp += charValue;
					else
						temp += 3 * charValue;
				}
				checkSum = 10 - temp % 10;
				if (checkSum == 10 )
					checkSum = 0;
				System.out.println("The ISBN-13 number is " + ISBN + checkSum);
				System.out.println("\n\n");
				
				// Returned or Checkout?
				System.out.print("Enter 'R' for return or 'C' for check out: ");
				returnOrcheckout = input.next().charAt(0);
				String s = String.valueOf(returnOrcheckout).toLowerCase();
				while (!s.equals("r") && !s.equals("c")) {
					System.out.println(s);
					System.out.println("Invalid choice! Try again.");
					System.out.print("Enter 'R' for return or 'C' for check out: ");
					returnOrcheckout = input.next().charAt(0);
					s = String.valueOf(returnOrcheckout).toLowerCase();
				}
				// Update number of returned/checkout books
				if (returnOrcheckout == 'R' || returnOrcheckout == 'r')
					returned++;
				else
					checkout++;
				processed++;
		
				//Output result
				System.out.println("************************************************");
				System.out.println("*             Daily Book Inventory             *");
				System.out.println("************************************************");
				System.out.println("Number of books returned:      " + returned);
				System.out.println("Number of books checked out:   " + checkout);
				System.out.println("The total of books processed:  " + processed);
				System.out.println("************************************************");
				System.out.print("Enter 'Y' to continue, 'N' to quit: ");
				exit = input.next().charAt(0);
			}
		} while (exit != 'N' && exit != 'n');
		
		System.out.println("************************************************");
		System.out.println("*             Daily Book Inventory             *");
		System.out.println("************************************************");
		System.out.println("Number of books returned:      " + returned);
		System.out.println("Number of books checked out:   " + checkout);
		System.out.println("The total of books processed:  " + processed);
		System.out.println("************************************************");
		
		input.close();
    }
}
