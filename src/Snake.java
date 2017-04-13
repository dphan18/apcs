//Daniel Phan
// The class for the Snake pet, contains methods for snakes

public class Snake extends Animal implements Pet{

	
	public Snake(String n, double w) {//constrcutor
		super(n,w);		
	}


	public String move() {//how the snake moves and talks
		return "slithers";
	}

	
	public String speak() {		
		return "ssss";
	}

	
	public String eat(String food) {//lowers hunger and raises weight if it is the right food
		if(food.toLowerCase().contains("snake")){
			super.decreaseHungerLevel();
			super.changeWeight(1*super.getWeight()*0.01);
		}
		return "ss";
	}

	
	public String showAffection() {//raises happiness		
		super.increaseHappiness();
		return "sss";
	}



	public int getAge() {//returns age and weight		
		return super.getAge();
	}



	public double getWeight() {
		
		return super.getWeight();
	}

	
	

}
