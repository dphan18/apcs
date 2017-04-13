//Author: Daniel Phan
//The class for a horse pet, contains methods for horses
public class Horse extends Animal implements Pet{

	
	public Horse(String n, double w) {//constructor
		super(n,w);		
	}

	public String move() {	//how the horse moves and speaks
		return "runs";
	}

		public String speak() {		
		return "neigh neigh neigh";
	}
	
	public String eat(String food) {//decreases hunger and raises weight if it is the correct food
		if(food.toLowerCase().contains("horse")){
			super.decreaseHungerLevel();
			super.changeWeight(1*super.getWeight()*0.01);
		}
		return "chomp";
	}
	
	public String showAffection() {//raises happiness
		super.increaseHappiness();
		return "neigh";
	}

	public int getAge() {//returns age and weight
		return super.getAge();
	}

	public double getWeight() {
		
		return super.getWeight();
	}

	
}
