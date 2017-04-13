/*Author: Daniel Phan

 *This program will input a text
 *It will convert SMS/internet slang into English words
 *The program will stop when quit is entered
 *Words not in this dictionary will just be printed without being changed
 */
import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		String text="";
		
		//This sets the loop to run until quit is entered
		while (!text.equals("quit")){
		//This takes in the text
		System.out.println("What message would you like to convert?");
		text=keys.nextLine();		
		//These are all the texts that can be converted
		if(madeLowerCase(text).equals("lol")){
		System.out.println("Laugh out loud");
		}
		else if(madeLowerCase(text).equals("l8r")){
		System.out.println("Later");
		}
		else if(madeLowerCase(text).equals("m8")){
		System.out.println("Mate");
		}
		else if(madeLowerCase(text).equals("ttyl")){
		System.out.println("Talk to you later");
		}
		else if(text.equals(":-)")||text.equals(":)")){
		System.out.println("Smiling");
		}
		else if(text.equals(":-(")||text.equals(":(")){
		System.out.println("Frowning");
		}
		else if(madeLowerCase(text).equals("brb")){
		System.out.println("Be right back");
		}
		else if(madeLowerCase(text).equals("Tomorrow")){
		System.out.println("Be right back");
		}
		else if(madeLowerCase(text).equals("j/k")){
		System.out.println("Just kidding");
		}
		else if(madeLowerCase(text).equals("imho")){
		System.out.println("In my humble opinion");
		}
		else if(madeLowerCase(text).equals("btw")){
		System.out.println("By the way");
		}
		else if(madeLowerCase(text).equals("ikr")){
		System.out.println("I know right");
		}
		else if(madeLowerCase(text).equals("k")||text.equals("kk")){
			System.out.println("Ok");
			}
		//Prints out the same text if it is not one of the texts listed
		else{
			System.out.println(text);
		}
		}
		//Prints out "Good bye!" once "quit" is entered
		System.out.println("Good bye!");
	}
	//When called on it makes the text all lowercase
public static String madeLowerCase(String textOriginal){
	return textOriginal.toLowerCase();
}

}
