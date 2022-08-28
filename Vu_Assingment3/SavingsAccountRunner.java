package Vu_Assingment3;
/**
 * Author:		Tuyen Vu
 * Date:		04/15/2022
 * Description: Creating a small program used on an ATM for MidFirst Bank
 */

import java.util.Scanner;
import java.util.Date;

public class SavingsAccountRunner {
	public static void main(String args[]) 
    {
		// TEST PROGRAM
		Scanner input = new Scanner(System.in);
		int ID;
		double balance;
		double weeklyInt;
		double annualIntRate;
		int choice = 1;
		String str;
		
		// Get user information
		System.out.println("Welcome to your Savings Account!");
		System.out.print("Enter your account number: ");
		ID = input.nextInt();
		System.out.print("Enter your initial balance: $");
		balance = input.nextDouble();
		System.out.print("Enter annual interest rate (in percent): ");
		annualIntRate = input.nextDouble();
		
		// Create a test class
		SavingsAccount myBank = new SavingsAccount(ID, balance);
		myBank.setAnnualIntRate(annualIntRate);
		
		do {
			System.out.println("*************************************************");
			System.out.println("*                  OPTIONS BELOW                *");
			System.out.println("*************************************************");
			System.out.println("1. Deposit");
			System.out.println("2. View Weekly Interest Rate");
			System.out.println("3. View Account Details");
			System.out.println("4. Exit");
			System.out.println("************************************************");
			System.out.print("Enter your selection(1-4): ");
			choice = input.nextInt();
			
			// Validating user choice
			while (choice < 1 || choice > 4) {
				System.out.println("Invalid choice. Try again!");
				System.out.print("Enter your selection(1-4): ");
				choice = input.nextInt();
			}
			// Deposit
			if (choice == 1) {
				double deposit;
				System.out.print("Enter your deposit amount: $");
				deposit = input.nextDouble();
				while (deposit <= 0) {
					System.out.println("Invalid amount. Enter again: $");
					deposit = input.nextDouble();
				}
				myBank.deposit(deposit);
				balance = myBank.getBalance();
				str = String.format("%.02f", balance);
				System.out.println("New Balance: $" + str);
				System.out.print("\n\n\n");
			}
			// Weekly Interest
			else if (choice == 2) {
				weeklyInt = myBank.getWeeklyInt();
				str = String.format("%.02f", weeklyInt);
				System.out.println("Your weekly interest amount is: $" + str);
				System.out.print("\n\n\n");
			}
			// Account Details
			else if (choice == 3) {
				System.out.println("Account ID: " + myBank.getID());
				
				Date creation = myBank.getDate();
				System.out.println("Account Creation Date/Time: " + creation);
				
				balance = myBank.getBalance();
				str = String.format("%.02f", balance);
				System.out.println("Balance: $" + str);
				
				weeklyInt = myBank.getWeeklyInt();
				str = String.format("%.02f", weeklyInt);
				System.out.println("Weekly Interest Amount: $" + str);
				System.out.print("\n\n\n");
				
			}
			
		}while (choice != 4);
		System.out.print("\n\n\n");
		System.out.println("Thank you - Goodbye!");
		input.close();
		
    }
}
