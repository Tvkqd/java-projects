package Vu_Assingment3;
/**
 * Author:		Tuyen Vu
 * Date:		04/15/2022
 * Description: Creating a small program used on an ATM for MidFirst Bank
 */

import java.util.Date;


public class SavingsAccount {
	// Data field
	int ID;
	double balance;
	double annualIntRate;
	Date dateEstablished = new Date();
					
	// Constructor
	SavingsAccount(){}
	SavingsAccount(int newID, double initBalance){
	ID = newID;
	balance = initBalance;}
	
	// Accessors
	int getID() {return ID;}
	double getBalance() {return balance;}
	double getAnnualIntRate() {return annualIntRate;}
	Date getDate() {return dateEstablished;}
			
	// Mutators
	void setID(int newID){ID = newID;}
	void setBalance(double newBalance) {balance = newBalance;}
	void setAnnualIntRate(double newAnnualIntRate) {annualIntRate = newAnnualIntRate;}
			
	// Methods
	double getWeeklyInt() {return balance * annualIntRate / (100 * 52);}
	void deposit(double newBalance) {balance += newBalance;}
		
}

