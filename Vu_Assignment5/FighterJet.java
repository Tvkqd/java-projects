/**
 * Author:		Tuyen Vu
 * Date:		05/06/2022
 * Description: Create and implement interfaces
 */
package Vu_Assignment5;

public class FighterJet implements AirVehicle, SoundBarrier {

	// Data field
	private int enginesNum;
	private int memberNum;
	private String jetName;
	private String manufacName;
	
	// Constructors
	FighterJet(){};
	FighterJet(int enginesNum, int memberNum, String jetName, String manufacName){
		this.enginesNum = enginesNum;
		this.memberNum = memberNum;
		this.jetName = jetName;
		this.manufacName = manufacName;
	}
	
	// Accessors
	int getEnginesNum() {return enginesNum;}
	int getMemberNum() {return memberNum;}
	String getJetName() {return jetName;}
	String getManufacName() {return manufacName;}
	
	// Mutators
	void setEnginesNum(int enginesNum) {this.enginesNum = enginesNum;}
	void setMemberNum(int memberNum) {this.memberNum = memberNum;}
	void setJetName(String jetName) {this.jetName = jetName;}
	void setManufacName(String manufacName) {this.manufacName = manufacName;}
	
	// Methods
	@Override
	public String toString() {
		String out;
		
		out = "FighterJet [numEngines=" + enginesNum + ", numCrewMembers=" + memberNum + ", nameOfJet=" + jetName +
				", manufacturer=" + manufacName + "]";
		return out;
	}
	
	public void avTakeoff() {
		System.out.println(jetName + " is starting to takeoff roll.");
	};
	public void avFly() {
		System.out.println(jetName + " has taken off and is now flying.");
	};
	public void avLand() {
		System.out.println(jetName + " has successfully landed.");
	};
	
	public void breakSoundBarrier() {
		System.out.println(jetName + " has broken the sound barrier!!!");
	};
}
