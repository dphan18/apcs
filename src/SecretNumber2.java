
import java.util.Scanner;


public class SecretNumber2 {


public static void main(String[] args) {
	int numberOfGuesses=1;
	Scanner keys = new Scanner(System.in);
	System.out.println("Guess a number from 1 to 10:");
	int numberInput = keys.nextInt();
	while (numberInput !=4&&numberOfGuesses<5){
		System.out.println("Guess again:");
		numberInput = keys.nextInt();
		numberOfGuesses++;
	}
	System.out.println("Correct!");
}
}
