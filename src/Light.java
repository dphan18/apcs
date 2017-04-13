//Author:  From Amplify APCS MOOC and Daniel Phan
//The Light class
//Allows you to create a light
//Allows you to set color, if it is on, and if it is burntout

public class Light {
	private boolean on;
	private boolean burntOut;
	private String color;

	public Light() {
	
	this.on=true;
	this.burntOut=false;
	this.color="white";
	}
	
	//sets a light
	//Pre-condition: boolean, boolean, String of color red, green, or blue
	//Post-condition: sets the light to on/off, burntOut/not, and color
	public Light(boolean o, boolean b, String c) {
		if (o==true){
			this.on=true;
		}
		if(o==false){
			this.on=false;
		}
		if (b==false){
			this.burntOut=false;
		}
		if(b==true){
			this.on=false;
			this.burntOut=true;
		}
		if (c.toLowerCase().equals("red")){
			this.color="red";
		}
		else if (c.toLowerCase().equals("green")){
			this.color="green";
		}
		else if (c.toLowerCase().equals("blue")){
			this.color="blue";
		}
		else{
			this.color="white";
		}

		
	}
	
	//returns string data
	//Pre-condition: None
	//Post-condidion: returns if the string is on, burntout, and the color on the same line
	public String toString() {
	String onOrOff;
	String burn;
	if(this.on==true){
		onOrOff="on";
	}
	else{
		onOrOff="off";
	}
	if(this.burntOut==true){
		burn="Burnt Out";
	}
	else{
		burn="not Burnt Out";
	}
	
	return(onOrOff+" "+this.color+"\t"+burn);
	
	}
	

	//flips the light on/off
	//Pre-condition: light must not be burntout
	//Post-condition: on is changed from true to false, false to true 
	public void flip() {
		if (this.on==false){
			this.on=true;
		}
		else{
			this.on=false;
		}
		if(this.burntOut==true){
			this.on=false;
		}
	}
	//tells color
	//Pre-Condition: None
	//Post-Condition: returns color
	public String getColor() {
		return this.color;
	}

	//sets the color
	//Pre-condidion: c must be red, green or blue
	//Post-condition: light is set to color c
	public void setColor(String c) {
		if (c.toLowerCase().equals("red")){
			this.color="red";
		}
		else if (c.toLowerCase().equals("green")){
			this.color="green";
		}
		else if (c.toLowerCase().equals("blue")){
			this.color="blue";
		}
		else{
			this.color="white";
		}
	}
	
	//returns if it is on
	//Pre-condition: None
	//Post-condidion: returns true if on, false if not
	public boolean isOn() {
		return this.on;
	}
	
	//returns if it is burntout
	//Pre-condition: None
	//Post-condidion: returns true if on, false if not
	public boolean isBurntOut() {
		return this.burntOut;
	}
	
	//sets the light to burntout
	//Pre=condition: None
	//Post-condition: burntout is set to true, on is set to false
	public void burnOut() {
		if (this.on==true){
			this.on=false;
		}
		if (this.burntOut==false){
			this.burntOut=true;
		}
	}
	
	public static void main(String [] args) {
		System.out.println("1. Test Light()");
		Light light1 = new Light();
		test(light1.on == true, "*** PASS: on is set correctly(true)", "*** FAIL: on is not correct(false)");
		test(light1.burntOut == false, "*** PASS: burntOut is set correctly (false)", "*** FAIL: burntOut is not correct(true)");
		test(light1.color.equals("white"), "*** PASS: color is set correctly (" + light1.color + ")", "*** FAIL: color is not correct(" + light1.color + ")");
		test(light1.toString().equals("on white\tnot Burnt Out"), "*** PASS: toString produced the correct output (" + light1.toString()+ ")", "*** FAIL: toString is not correct (" + light1.toString() + ")");
		
		System.out.println("2. Test Light(boolean b, boolean o, String c)");
	
		Light light2 = new Light(false, true, "green");
		test(light2.on == false, "*** PASS: on is set correctly ("+ light2.on + ")", "*** FAIL: on is not correct("+light2.on + ")");
		test(light2.burntOut == true, "*** PASS: burntOut is set correctly ("+light2.burntOut+")", "*** FAIL: burntOut is not correct("+light2.burntOut+")");
		test(light2.color.equals("green"), "*** PASS: color is set correctly (" + light2.color + ")", "*** FAIL: color is not correct(" + light2.color + ")");
		test(light2.toString().equals("off green\tBurnt Out"), "*** PASS: toString produced the correct output (" + light1.toString()+ ")", "*** FAIL: toString is not correct (" + light1.toString() + ")");
	
		
		System.out.println("3. Test isBurntOut()");
		test(light1.isBurntOut() == false, "*** PASS: isBurntOut() returns false for light1 (which is not burnt out)", "*** FAIL: isBurntOut() returns true for light1 (which is not burnt out)");
		test(light2.isBurntOut() == true, "*** PASS: isBurntOut() returns true for light2 (which is burnt out)", "*** FAIL: isBurntOut() returns false for light1 (which is burnt out)");
		
		System.out.println("4. Test burnOut()");
		light1.burnOut();
		test(light1.on == false,"*** PASS: on is set correctly (false)", "*** FAIL: on is not set correctly (true)");
		test(light1.burntOut == true,"*** PASS: burntOut is set correctly (true)", "*** FAIL: burntOut is not set correctly (false)");
		test(light1.color.equals("white"),"*** PASS: color is set correctly (white)", "FAIL: color is not set correctly ("+light1.color+")");
		test(light1.toString().equals("off white\tBurnt Out"), "*** PASS: toString produced the correct output (off white	Burnt Out)", "*** FAIL: toString produced the wrong output ("+light1.toString()+")");
		
		
		System.out.println("5. Test flip()");
		Light light3 = new Light();
		
		System.out.println("light3 is on");
		test(light3.on == true, "*** PASS: on is set correctly (true)", "*** FAIL: on is not set correctly (false)");
		test(light3.burntOut == false, "*** PASS: burntOut is set correctly (false)", "*** FAIL: burntOut is not set correctly (true)");
		test(light3.color.equals("white"), "*** PASS: color is set correctly (white)", "*** FAIL: color is not set correctly ("+light3.color+")");
		test(light3.toString().equals("on white\tnot Burnt Out"), "*** PASS: toString produced the correct output (on white	not Burnt Out)", "*** FAIL: toString produced the wrong output (" + light3.toString() + ")");
		
		light3.flip();
		System.out.println("now light3 should be off");
		test(light3.on==false, "*** PASS: on is set correctly (false)", "*** FAIL: on is set wrong (true)");
		test(light3.burntOut==false, "*** PASS: burntOut is set correctly (false)", "*** FAIL: burntOut is set wrong (true)");
		test(light3.color.equals("white"), "*** PASS: color is set correctly (white)", "*** FAIL: color is not set correctly ("+light3.color+")");
		test(light3.toString().equals("off white	not Burnt Out"), "*** PASS: toString produced the correct output (off white	not Burnt Out)", "*** FAIL: toString produced the wrong output (" + light3.toString() + ")");
		
		light3.flip();
		System.out.println("now light3 should be back on");
		test(light3.on==true, "*** PASS: on is set correctly (true)", "*** FAIL: on is set wrong (false)");
		test(light3.burntOut == false, "*** PASS: burntOut is set correctly (false)", "*** FAIL: burntOut is set wrong (true)");
		test(light3.color.equals("white"), "*** PASS: color is set correctly (white)",  "*** FAIL: color is not set correctly ("+light3.color+")"); 
		test(light3.toString().equals("on white\tnot Burnt Out"),"*** PASS: toString produced the correct output (on white	not Burnt Out)", "*** FAIL: toString produced the wrong output (" + light3.toString() + ")");
		
		System.out.println("light1 is burned out and off, we can't flip it on");
		light1.flip();
		test(light1.on == false, "*** PASS: on is set correctly (false)", "*** FAIL: on is set wrong (true)");
		test(light1.burntOut, "*** PASS: burntOut is set correctly (true)", "*** FAIL: burntOut is set wrong(false)");
		test(light1.color.equals("white"), "*** PASS: color is set correctly (white)", "*** FAIL: color is not set correctly (" + light1.color + ")");
		test(light1.toString().equals("off white\tBurnt Out"), "*** PASS: toString produced the correct output (off white	Burnt Out)", "*** FAIL: toString produced the wrong output (" + light3.toString() + ")");

		System.out.println("6. Test isOn()");
		test(light1.isOn()== light1.on, "*** PASS: isOn() working properly", "*** FAIL: isOn() is not working properly");
		test(light2.isOn() == light2.on, "*** PASS: isOn() working properly", "*** FAIL: isOn() is not working properly");

		System.out.println("7. Test getColor()");
		test(light2.getColor().equals(light2.color), "*** PASS: getColor() working properly", "*** FAIL: getColor() is not working properly");

		System.out.println("8. Test setColor(String)");
		light3.setColor("red");
		test(light3.color.equals("red"), "*** PASS: color is set correctly (red)", "*** FAIL: color is not set correctly (" + light3.color + ")"); 
		light3.setColor("blue");
		test(light3.color.equals("blue"), "*** PASS: color is set correctly (blue)", "*** FAIL: color is not set correctly (" + light3.color + ")"); 
		light3.setColor("purple");
		test(light3.color.equals("white"), "*** PASS: color is set correctly (white)", "*** FAIL: color is not set correctly, should be white (" + light3.color + ")"); 

		
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