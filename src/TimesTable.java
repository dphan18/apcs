/*Author: Daniel Phan
 * 
 * This program is a times table game
 * You input the answer until you make a mistake
 * The highscore and who it is set by is recorded
 */
 
import java.io.*;
import java.util.*;

public class TimesTable {

	public static void main(String[] args) throws FileNotFoundException {
		//uses a file to record a number and name
		File myFile= new File("TimesTableHighScore.txt");
		//sets scanners
		Scanner input= new Scanner(myFile);
		Scanner keys = new Scanner(System.in);
		Scanner keys2 = new Scanner(System.in);
		//finds highscore
		int highScore=input.nextInt();
		//prints out greeting message and highscore info
		System.out.println("Welcome to the Ultimate Times Practice!");
		System.out.println("The high score is: "+highScore+ " set by: "+input.nextLine());
		System.out.println("Can you beat it?");
		//sets up multiplication section (0-12) keeps track of number of correct answers
		int randomNumber1=(int)(Math.random()*13);
		int randomNumber2=(int)(Math.random()*13);
		int answer=randomNumber1*randomNumber2;
		int attempt=answer;
		int counter=-1;
		while (answer==attempt){
			randomNumber1=(int)(Math.random()*13);
			randomNumber2=(int)(Math.random()*13);
			answer=randomNumber2*randomNumber1;
			System.out.println(randomNumber1+" x "+randomNumber2);
			attempt=keys.nextInt();
			counter++;			
		}
		
		
		//prints out ending message
		System.out.println("You got "+counter+" correct!");
		if(counter>highScore){
			input.close();
		//tells you when you beat the highscore and asks for your name
			System.out.println("You've made a new high score of "+counter+"!");
		System.out.println("Print your name: ");
		String name=keys2.nextLine();
		keys.close();
		keys2.close();
		PrintWriter output = new PrintWriter(new File("TimesTableHighScore.txt"));
					output.println(counter +" "+name);
						output.close();
						
						
						
		}

	}
}
