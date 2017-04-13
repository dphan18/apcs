//The pet interface for the three animals in the program
public interface Pet {
	public String move();  //the pet walks or swims or ...
	public String speak(); //the pet makes an appropriate "sound"
	public String eat(String food); //the pet reacts to the food
	public String showAffection(); //the pet reacts to affection
	public String getName(); //returns the pet's name
	public int getAge(); //returns the pet's weight
	public double getWeight(); //returns the pet's age
}