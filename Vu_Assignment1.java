/**
 * Author:		Tuyen Vu
 * Date:		03/25/2022
 * Description: 
 * 		Building a program to help new investors select a stock based on certain criteria
 * 		To begin, ask for money available to invest
 * 		Then, ask for stock ticker, stock price, and the price-to-earnings (P/E) ratio
 * 		Finally, output the ticker, stock price, P/E ratio, and # of shares able to purchase 
 * 			based on available funds
 */

import java.util.Scanner;

public class Vu_Assignment1 {
	public static void main(String args[]) 
    {
		Scanner input = new Scanner(System.in);
		double invest;
		String ticker;
		double price;
		double ratio;
		
		// Get data
		System.out.println("Welcome to the Stock Picker App!");
		System.out.println();
		System.out.print("Enter the total amount of money you are willing to invest: $");
		invest = input.nextDouble();
		
		input.nextLine();
		System.out.print("Enter the stock ticker: ");
		ticker = input.nextLine();
		// Validating the stock ticker length
		while (ticker.length() > 5) {
			System.out.print("Invalid Input! Enter the stock ticker again: ");
			ticker = input.nextLine();
		}
	
		System.out.print("Enter the price: $");
		price = input.nextDouble();
		// Validating price
		while (price < 0.01) {
			System.out.print("Invalid Input! Enter the price again: $");
			price = input.nextDouble();
		}
		
		System.out.print("Enter the P/E Ratio: ");
		ratio = input.nextDouble();
		
		// Output result
		System.out.println();
		System.out.println("Below are your results: ");
		System.out.println();
		System.out.println("Stock: " + ticker);
		System.out.println("Price: $" +  price);
		System.out.println("P/E Ratio: " + ratio);
		// Display warning
		if (ratio > 60)
			System.out.println("WARNING: This company may be overvalued!");
		System.out.println("# of shares able to purchase: " + (int)(invest / price));	
		
		input.close();
		
    }

}
