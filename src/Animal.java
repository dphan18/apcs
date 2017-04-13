//Author: Daniel Phan
//This is the Animal class that is the parent class for the other animals. 
//It has general methods and stores information
public class Animal {//stores pet data
	private String name;
	private double happiness=100;
	private double hunger;
	private int age;
	private double weight;
	
	public Animal(String n, double w) {//constructor
		this.name=n;
		this.weight=w;
		
	}

	
	public String speak(){
		return null;
	}
	
	public String move(){
		return null;
	}
	public void increaseHungerLevel() {	//raises the hunger and happiness levels
		this.hunger+=100;
	}
	public void increaseHappiness() {		
		this.happiness+=100;
	}

	public void changeWeight(double change) {//changes the weight based on the change that is put in
		this.weight+=change;
	}

	public void decreaseHappiness() {//decreases happiness and hunger
		this.happiness-=10;
		
	}
	public void decreaseHungerLevel() {	
		this.hunger-=10;
		
	}
	public void setAge(int age) {//set the age of the pet according to the input
		this.age=age/100;
	}

	public double getHungerLevel() {//returns hunger, happiness, name, and age
	
		return this.hunger;
	}

	public double getHappiness() {
		
		return this.happiness;
	}

	public String getName() {
		
		return this.name;
	}

	public int getAge() {
		
		return this.age;
	}

	public double getWeight() {
		
		return this.weight;
	}
	public String toString(){//prints out all the data of the animal
		return this.name+" "+this.age+" "+this.weight+" "+this.hunger+" "+this.happiness;
		
	}

}
