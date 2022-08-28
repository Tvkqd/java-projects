/**
 * Author:		Tuyen Vu
 * Date:		04/29/2022
 * Description: Creating superclass and subclass, objects for subclass - demonstrating knowledge of inheritance 
 */
package Vu_Assignment4;

public class MonsterTruck extends Vehicle {
	// Data field
	private int wins;
	private int losses;
	private String trick;
	
	// Constructors
	MonsterTruck(){};
	MonsterTruck(int year, String name, String color, String power, int wins, int losses, String trick){
		super(year, name, color, power);
		this.wins = wins;
		this.losses = losses;
		this.trick = trick;
	};
	
	// Accessors
	int getWins() {return wins;}
	int getLosses() {return losses;}
	String getTrick() {return trick;}
	
	// Mutators
	void setWins(int wins) {this.wins = wins;}
	void setLosses(int losses) { this.losses = losses;}
	void setTrick(String trick) {this.trick = trick;}
	
	//Method
	@Override
	public String toString() {
		String out;
		String str;
		double percent = wins * 1.0 / (losses + wins) * 100;
		str = String.format("%.02f", percent);
		
		out = super.toString();
		out += "# Wins: " + wins + "\n# Losses: " + losses + "\nSpecial Trick: " + trick + "\nWin Percentage: " + str + "%\n";
		
		return out;
	}

}
