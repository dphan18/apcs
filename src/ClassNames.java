import java.io.*;
import java.util.*;


public class ClassNames {

	public static void main(String[] args) throws FileNotFoundException{
		File myFile= new File("APCS.txt");
		Scanner input= new Scanner(myFile);
		double maximum=0;
		double total=0;
		while (input.hasNext()){
			if(input.hasNextLine()){
				String name=input.nextLine();
		
		System.out.println(name.charAt(0));
			}
		else{
			input.next();
		}
			
	}
		
}
}	