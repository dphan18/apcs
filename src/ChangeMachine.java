/*Author: Daniel Phan

 *This program will input a cost and amount paid (Dollars and Riel)
 *It will find the amount of change owed (Dollars and Riel)
 *It will give the number of each kind of bill to give 
 *(minimizing the number of bills given)
 */
import java.util.Scanner;
public class ChangeMachine {

	
	public static void main(String[] args) {
		
		Scanner keys = new Scanner(System.in);
		//Cost input (USD)
		System.out.println("Please enter the Cost of the Item in USD:");
		double costInUsd = keys.nextDouble();
		//Amount Paid (USD)
		System.out.println("Please enter the Amount Paid in USD:");
		double amountPaidUsd = keys.nextDouble();
		//Amount Paid (Riel)
		System.out.println("Please Enter the Amount Paid in Riel:");
		double amountPaidRiel = keys.nextDouble();
		//Finds total amount paid and change (Dollars and Riel)
		double amountPaidTotal = (amountPaidRiel/4000.00)+amountPaidUsd;
		double changeUsd = (double)(amountPaidTotal-costInUsd);
		int changeRiel = (int)Math.round(changeUsd*4000);
		//Prints the amount of change owed
		System.out.println("Change Owed:");
		System.out.println(Math.round(changeUsd*100.00)/100.00+ " = "+ (int)changeRiel);
		//Finds out and prints how many 2000r, 1000r, 500r, and 100r bills to give
		int riel2000 = (changeRiel/2000);
		System.out.println("2000 riel bills: "+riel2000);
		int riel1000 = (changeRiel-(2000*riel2000))/1000;
		System.out.println("1000 riel bills: "+riel1000);
		int riel500 = (changeRiel -(2000*riel2000)-(1000*riel1000))/500;
		System.out.println("500 riel bills: "+riel500);
		int riel100 = (int)Math.round((changeRiel -(2000*riel2000)-(1000*riel1000)-(500*riel500))/100.00);
		System.out.println("100 riel bills: "+riel100);
	
		
		
		
	
		
	}

}