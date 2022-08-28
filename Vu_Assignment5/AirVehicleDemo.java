/**
 * Author:		Tuyen Vu
 * Date:		05/06/2022
 * Description: Create and implement interfaces
 */
package Vu_Assignment5;


public class AirVehicleDemo {
	public static void main(String args[]) {
		FighterJet jet = new FighterJet(2, 1, "F-16", "General Dynamics");
		CargoPlane plane = new CargoPlane(4, 3, "C-17", "Boeing");
		
		// Fighter jet Information
		System.out.println("##########################");
		System.out.println("#     FighterJet Info    #");
		System.out.println(jet.toString());
		jet.avTakeoff();
		jet.avFly();
		jet.breakSoundBarrier();
		jet.avLand();
		
		// Cargo plane Information
		System.out.println("\n\n##########################");
		System.out.println("#     CargoPlane Info    #");
		System.out.println(plane.toString());
		plane.avTakeoff();
		plane.avFly();
		plane.avLand();
	}
}
