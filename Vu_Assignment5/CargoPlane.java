/**
 * Author:		Tuyen Vu
 * Date:		05/06/2022
 * Description: Create and implement interfaces
 */
package Vu_Assignment5;

public class CargoPlane implements AirVehicle {

	// Data field
	private int enginesNum;
	private int memberNum;
	private String planeName;
	private String manufacName;
	
	// Constructors
	CargoPlane(){};
	CargoPlane(int enginesNum, int memberNum, String planeName, String manufacName){
		this.enginesNum = enginesNum;
		this.memberNum = memberNum;
		this.planeName = planeName;
		this.manufacName = manufacName;
	}
	
	// Accessors
	int getEnginesNum() {return enginesNum;}
	int getMemberNum() {return memberNum;}
	String getPlaneName() {return planeName;}
	String getManufacName() {return manufacName;}
		
	// Mutators
	void setEnginesNum(int enginesNum) {this.enginesNum = enginesNum;}
	void setMemberNum(int memberNum) {this.memberNum = memberNum;}
	void setPlaneName(String planeName) {this.planeName = planeName;}
	void setManufacName(String manufacName) {this.manufacName = manufacName;}
	
	// Methods
	@Override
	public String toString() {
		String out;
		
		out = "CargoPlane [numEngines=" + enginesNum + ", numCrewMembers=" + memberNum + ", nameOfPlane=" + planeName +
				", manufacturer=" + manufacName + "]";
		return out;
	}
	
	public void avTakeoff() {
		System.out.println(planeName + " is starting to takeoff roll.");
	};
	public void avFly() {
		System.out.println(planeName + " has taken off and is now flying.");
	};
	public void avLand() {
		System.out.println(planeName + " has successfully landed.");
	};
	
}
