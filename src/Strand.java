//Author: Amplify APCS MOOC and Daniel Phan
//The Strand class
//This class represents a strand of lights
//It allows you to set light colors and turn lights on/off
//It also allows you to set a burnOut variable to true

import java.util.ArrayList;

public class Strand {
	
	private ArrayList<Light> strand;
	//default constructor
	//Pre-condition: None
	//Post-condition: ArrayList holding one Light: turned on, white bulb, not burnt out
	public Strand() {
		this.strand=new ArrayList<Light>();
		this.strand.add(new Light());
	}
	
	//creates n number of lights
	//Pre-condition: n is an int
	//Post-condition: ArrayList holding n Light: turned on, white bulb, not burnt out
	public Strand(int n) {
		this.strand=new ArrayList<Light>();
		if (n<1){
			this.strand.add(new Light());
		}
		for(int i=0;i<n;i++){
		this.strand.add(new Light());
		}
	}
	
	//returns a string of all the Light data
	//Pre-condition: None
	//Post-condition: Strings of Light data each on a different line
	public String toString() {
		String text=null;
		for (Light light:this.strand){
			text=text+"\n"+ light.toString();
		}
		return text;
	}
	
	//sets Lights to color c if c is red, green, or blue
	//Pre-condition: c is a string, c is red, green or blue
	//Post-condition: Lights are all set to color c 
	public void setColor(String c) {
		for (Light light:this.strand){
			light.setColor(c);
		}
	}
	
	//sets Lights to the pattern red, green, blue
	//Pre-condition: None
	//Post-condition: Lights are set to the pattern red, green, blue,red...
	public void setMulti() {
		//0=r,1=g,2=,3=,4=g,5=b
		for(int i=0;i<this.strand.size();i++){
			if (i%3==2){
				this.strand.get(i).setColor("blue");
			}
			else if(i%3==1){
				this.strand.get(i).setColor("green");
			}
			else{
				this.strand.get(i).setColor("red");	
			}
		}
	}
	
	//turns all lights on
	//Pre-condition: BurntOut is false
	//Post-condition: Lights are all turned on
	public void turnOn() {
		for (Light light:this.strand){
			if (light.isOn()==false){
				light.flip();
			}
		}
	}
	
	//turns all lights off
	//Pre-condition: BurntOut is false
	//Post-condition: Lights are all turned off
	public void turnOff(){
		for (Light light:this.strand){
			if (light.isOn()==true){
				light.flip();
			}
		}
	
	}
	
	//sets a light to burntOut
	//Pre-condition: i is an int less than the ArrayList size
	//Post-condition: The light a i to burntOut=true
	public void burnOut(int i) {
		this.strand.get(i).burnOut();
		
	}

	public static void main(String[] args) {
		
		Strand strand1 = new Strand();
		System.out.println("1. Test the default constructor Strand()");
		test(strand1.strand.size() == 1, "*** PASS: Strand() creates a list of size 1", "*** FAIL: Strand() did not create a list of size 1");


		System.out.println("2. Test the constructor Strand(n)");
		Strand strand2 = new Strand(0);
		test(strand2.strand.size() == 1, "*** PASS: Strand(0) creates a list of size 1", "*** FAIL: Strand(0) did not create a list of size 1");
		Strand strand3 = new Strand(-7);
		test(strand3.strand.size() == 1, "*** PASS: Strand(-7) creates a list of size 1", "*** FAIL: Strand(-7) did not create a list of size 1");
		Strand strand4 = new Strand(5);
		test(strand4.strand.size() == 5, "*** PASS: Strand(5) creates a list of size 5", "*** FAIL: Strand(5) did not create a list of size 5");
		boolean flag = true;
		for(int i=0; i<strand4.strand.size(); i++) {
			if(strand4.strand.get(i) == null) {
				System.out.println("*** FAIL: Strand(5) did not initialize bulbs correctly");
				flag = false;
			}
		}
		if(flag)
		{
			System.out.println("*** PASS: Strand(5) initialized bulbs correctly");
		}
		
		System.out.println("3. Test setColor(String)");
		flag = true;
		strand4.setColor("green");
		for(Light test:strand4.strand) {
			if(!test.getColor().equals("green")) {
				flag = false;
			}
		}
		test(flag, "*** PASS: setColor worked as expected (green test)", "*** FAIL: setColor did not work as expected (green test)");
		flag = true;
		strand4.setColor("pink");
		for(Light test:strand4.strand) {
			if(!test.getColor().equals("white")) {
				flag = false;
			}
		}
		
		
		test(flag, "*** PASS: setColor worked as expected (pink test)", "*** FAIL: setColor did not work as expected (pink test)");

		System.out.println("4. Test turnOff()");
		flag = true;
		strand4.turnOff();
		for(Light light:strand4.strand) {
			if(light.isOn()) {
				flag = false;
			}
		}
		test(flag, "*** PASS: turnOff() worked as expected", "*** FAIL: turnOff() did not work as expected");

		System.out.println("5. Test turnOff()");
		flag = true;
		strand4.turnOn();
		
		for(Light light:strand4.strand) {
			if(!light.isOn()) {
				flag = false;
			}
		}
		test(flag, "*** PASS: turnOn() worked as expected", "*** FAIL: turnOn() did not work as expected");


		System.out.println("6. Test burnOut(n)");
		strand4.burnOut(1);
		flag = true;
		if(strand4.strand.get(0).isBurntOut()) {
			flag = false;
		}
		if(!strand4.strand.get(1).isBurntOut()) {
			flag = false;
		}
		for(int i=2; i<strand4.strand.size(); i++)
		{
			if(strand4.strand.get(i).isBurntOut()) {
				flag = false;
			}
		}
		test(flag, "*** PASS: burnOut(1) works as expected.", "*** FAIL: burnOut(1) did not work as expected.");

	}
	
	private static void test(boolean result, String t, String f) {
		if(result) {
			System.out.println(t);
		}
		else {
			System.out.println(f);
		}
	}

}
