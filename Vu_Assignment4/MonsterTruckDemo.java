/**
 * Author:		Tuyen Vu
 * Date:		04/29/2022
 * Description: Creating superclass and subclass, objects for subclass - demonstrating knowledge of inheritance 
 */
package Vu_Assignment4;

public class MonsterTruckDemo {
	public static void main(String args[]) {
		// Create objects
		MonsterTruck truck1 = new MonsterTruck();
		MonsterTruck truck2 = new MonsterTruck(2011, "Grave Digger", "black", "gasoline", 20, 10, "Big Air");
		
		// Set values for the first truck
		truck1.setName("Max D");
		truck1.setColor("silver");
		truck1.setPower("gasoline");
		truck1.setYear(2022);
		truck1.setWins(10);
		truck1.setLosses(2);
		truck1.setTrick("backflip");
		// Calculate the percentage
		double percent = truck1.getWins()  * 1.0 / (truck1.getLosses() + truck1.getWins()) * 100;
		String str = String.format("%.02f", percent);
		
		// Display information
		System.out.println("####################################");
		System.out.println("#      MONSTER TRUCK ONE INFO      #");
		System.out.println("####################################\n");
		System.out.println("Name: " + truck1.getName());
		System.out.println("Color: " + truck1.getColor());
		System.out.println("Power: " + truck1.getPower());
		System.out.println("Year: " + truck1.getYear());
		System.out.println("# Wins: " + truck1.getWins());
		System.out.println("# Losses: " + truck1.getLosses());
		System.out.println("Special Trick: " + truck1.getTrick());
		System.out.println("Win Percentage: " + str + "%");
		
		System.out.println("\n\n####################################");
		System.out.println("#      MONSTER TRUCK TWO INFO      #");
		System.out.println("####################################\n");
		System.out.println(truck2.toString());
	
	}

}
