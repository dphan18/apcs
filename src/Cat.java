//Author: Daniel Phan
//This is the cat class that has the methods for the pet cat
public class Cat extends Animal implements Pet{
	
	public Cat(String n, double w) {//constructor
		super(n,w);		
	}

	public String move() {	
		return "walks";
	}
	
	public String speak() {		
		return "roar";
	}

		public String eat(String food) {//takes in food and decides if the cat will eat it
		if(food.toLowerCase().contains("cat")){
			super.decreaseHungerLevel();
			super.changeWeight(1*super.getWeight()*0.01);
		}
		return "meow";
	}

	public String showAffection() {//makes happiness go up		
		super.increaseHappiness();
		return "...";
	}

	public int getAge() {		
		return super.getAge();
	}

	public double getWeight() {		
		return super.getWeight();
	}

	

}
