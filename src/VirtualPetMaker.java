/* VirtualPetMaker provides the menu system and interface for interacting with the 
 * virtual pets that have been created.
 * Author: Miss Hines and Daniel Phan
 */
import java.util.Scanner;


public class VirtualPetMaker {

	
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		Pet myPet = new Cat("a", 0.01);
		long startTime = System.nanoTime();
		long endTime = System.nanoTime();
		long lastFed = 0;
		long lastPlayed = 0;
		//welcome screen
		System.out.println("Welcome to Virtual Pet Maker");
		System.out.println("What kind of pet would you like to have?");
		System.out.println("A: Cat"); 
		System.out.println("B: Snake"); 
		System.out.println("C: Horse");
		String animal = keys.nextLine();
		String name;
		boolean done = false;
		while(!done) {
			//check for the first letter in case they typed additional letters
			if(animal.toUpperCase().charAt(0) == 'A') {
				System.out.println("What would you like to name your cat?"); 
					name = keys.nextLine();
					
					myPet = new Cat(name, 7);//creates a new cat
					done = true;
			}
			if(animal.toUpperCase().charAt(0) == 'B') {
				System.out.println("What would you like to name your Snake?"); 
					name = keys.nextLine();
					
					myPet = new Snake(name, 3);
					done = true;
			}
			if(animal.toUpperCase().charAt(0) == 'C') {
				System.out.println("What would you like to name your Horse?"); 
					name = keys.nextLine();
					
					myPet = new Horse(name, 500);
					done = true;
			}
			//add in other options here!
			else {
				System.out.println("that is not an option. Try again.");
				done=true;
			}
		}
		System.out.println("\t\t\t\t\t\t Congratulations!  You are the proud owner of " + myPet.getName());
		String currInput = "";
		//main program loop!
		while(!currInput.equals("Q")) {
			endTime = System.nanoTime();
			long time = calculateTime(startTime, endTime);
			System.out.println("Time:" + time);
			System.out.println("Name: " + myPet.getName() + " Age: " + 
							myPet.getAge() + " Weight: " + myPet.getWeight() + " kg");
			System.out.println("Hunger level:" + ((Animal)myPet).getHungerLevel());
			System.out.println("Happiness level:" + ((Animal)myPet).getHappiness());
			System.out.println("What would you like to do with your pet?");
			System.out.println("A: Feed it");
			System.out.println("B: Show it affection.");
			System.out.println("(Q: Quit!)");
			currInput = keys.nextLine().toUpperCase().substring(0,1);
			if(currInput.equals("A")) {
				System.out.println("What do you want to feed your pet?");
				System.out.println("\t\t\t\t\t\t" + myPet.eat(keys.nextLine()));
				
				lastFed = time;
			}
			else if(currInput.equals("B")) {
				System.out.println("\t\t\t\t\t" + myPet.showAffection());
				lastPlayed = time;
			}
			//set age
			((Animal)myPet).setAge((int)time);
			
			//if the pet is neglected, it gets hungry and grumpy
			if(time - lastFed > 50) {
				System.out.println("\t\t\t\t\t I'm hungry!");
				((Animal)myPet).increaseHungerLevel();
				((Animal)myPet).changeWeight(-1*myPet.getWeight()*0.01); //1% weight loss!
			}
			if(time - lastPlayed > 50) {
				System.out.println("\t\t\t\t\t I'm bored...");
				((Animal)myPet).decreaseHappiness();
			}
			//if it is severly neglected, it dies :(
			if(((Animal)myPet).getHungerLevel() > 200) {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("\t\t\t\t\t" + myPet.getName() + " has starved to death.");
				currInput = "Q";
			}
			if(((Animal)myPet).getHappiness() < 0) {
				System.out.println();
				System.out.println();
				System.out.println();
				System.out.println("\t\t\t\t\t" + myPet.getName() + " has died of boredom.");
				currInput = "Q";	
			}
		}
		System.out.println("\t\t\t\tGoodbye!");
	}

	//calculates the time that has passed since the program starts and returns the
	//illusive "time"
	private static long calculateTime(long start, long finish) {
		long div = 100000000;
		return (finish - start) / div ;
	}
}
