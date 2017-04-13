/*Author: Daniel Phan
 *This program will input a set of grades 
 *(Test grades, Quiz grades and Homework average) 
 * It will find the Test average, quiz average and weighted average
 */
import java.util.Scanner;

public class WeightedAverage {

	
	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		//test grade input
		System.out.println("Please enter your test grades.");
		System.out.println("Test 1 score:");
		int test1 = keys.nextInt();
		System.out.println("Test 2 score:");
		int test2 = keys.nextInt();
		//quiz grade input
		System.out.println("Please enter your quiz grades.");
		System.out.println("Quiz 1 score:");
		int quiz1 = keys.nextInt();
		System.out.println("Quiz 2 score:");
		int quiz2 = keys.nextInt();
		System.out.println("Quiz 3 score:");
		int quiz3 = keys.nextInt();
		//homework average input
		System.out.println("Please enter your homework average.");
		System.out.println("Homework:");
		double homeworkAverage = keys.nextDouble();
		//finds test and quiz averages
		double testAverage = (test1 + test2 ) / 2.00;
		double quizAverage = (quiz1 + quiz2 + quiz3)/3.00;
		//prints test and quiz averages
		System.out.println ("Test Average: " + testAverage);
		System.out.println ("Quiz Average: " + quizAverage);
		//finds weighted average
		double weightedAverage = (testAverage*.5)+ (quizAverage*.3) + (homeworkAverage*.2);
		//prints weighted average
		System.out.println("Final Grade: " + weightedAverage);
		
		
		
	}

}