//Author: Daniel Phan
//Description: This program takes in a text file and prints a new one
//based on the occurrence of what words directly follow other words

import java.io.*;
import java.util.*;
public class FakeShake {

	public static void main(String[] args) throws FileNotFoundException {
		//Sets up Scanners and files
		Scanner keys = new Scanner(System.in);
		final String TEXTFILE = "MidSummer.txt";
		File myFile= new File(TEXTFILE);
		Scanner input= new Scanner(myFile);
		
		//creates an arraylist of all words
		ArrayList<ShakeWord> wordsList = new ArrayList<ShakeWord>();
		
		//input of length of text
		System.out.println("How long would you like the play to be?");
		Double number = keys.nextDouble();
		keys.close();
		
	
		addWords(input, wordsList);
		input.close();
		
		printPlay(wordsList, number);	
	
	}
	
	//Loops through the file and stores data as Word objects
	public static void addWords(Scanner input, ArrayList<ShakeWord> wordsList) {
		String word=input.next();
		while (input.hasNext()){
			
			boolean added=true;
			for (int i=0;i<wordsList.size();i++){
				if(( wordsList.get(i)).getName().equals(word)){
					String newWord=input.next();
					( wordsList.get(i)).AddWord(newWord);
					word=newWord;
					i+=wordsList.size();
					added=false;
				}
			}
			
			if (added){
				wordsList.add(new ShakeWord (word));
				String newWord=input.next();
				(wordsList.get(wordsList.size()-1)).AddWord(newWord);
				word=newWord;
			}
			
			
	}
		}
	//starts text with a random word adds words until it reaches the limit
		public static void printPlay(ArrayList<ShakeWord> wordsList, double number){
			String start=(wordsList.get((int)(Math.random()*wordsList.size()))).getName();
			for (int i=0;i<=number;i++){
				for (int j=0;j<=wordsList.size();j++){
					if(( wordsList.get(j)).getName().equals(start)){
						String newStart=( wordsList.get(j)).randomWord();
						System.out.print(newStart+ " ");
						start=newStart;
						j+=wordsList.size();
					}
				
				}
			
			}
		}
	}

