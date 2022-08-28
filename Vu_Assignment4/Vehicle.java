/**
 * Author:		Tuyen Vu
 * Date:		04/29/2022
 * Description: Creating superclass and subclass, objects for subclass - demonstrating knowledge of inheritance 
 */
package Vu_Assignment4;

public class Vehicle {
	// Data field
	private int year;
	private String name;
	private String color;
	private String power;

	// Constructors
	Vehicle(){}
	Vehicle(int year, String name, String color, String power){
		this.year = year;
		this.name = name;
		this.color = color;
		this.power = power;
	}
	
	// Accessors
	int getYear() {return year;}
	String getName() {return name;}
	String getColor() {return color;}
	String getPower() {return power;}

	// Mutators
	void setYear(int year) {this.year = year;}
	void setName(String name) {this.name = name;}
	void setColor(String color) {this.color = color;}
	void setPower(String power) {this.power = power;}

	// Method
	@Override
	public String toString() {
		String out;
		out = "Name: " + name + "\nColor:" + color + "\nPower: " + power + "\nYear: " + year + "\n";
		return out;
	}
}
