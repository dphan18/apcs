
import java.util.Scanner;


public class PrimeOrNot {



	public static void main(String[] args) {
		System.out.println(isPrime(1));
		int counter=2;
		while (counter <1000000){
			if (isPrime(counter)==false){
				System.out.println(counter);
			}
			counter++;
		}
	}
		public static boolean isPrime(int n){
			int count=2;
			while (count<n){
				if (n%count==0){
					return true;
				}							
					
				count++;
			}
			return false;
		}
}