import java.io.*;
import java.util.*;
public class Password {

	public static void main(String[] args) throws FileNotFoundException{
		File myFile= new File("password.txt");
		Scanner input= new Scanner(myFile);
		Scanner keys = new Scanner(System.in);
		System.out.println("Password: ");
		String attempt = keys.nextLine();
		String password=input.nextLine();
			while(!password.equals(attempt)){
				System.out.println("Wrong!");
				System.out.println("Password: ");	
				attempt = keys.nextLine();
	}
		System.out.println("You are awesome!");

}	
}
