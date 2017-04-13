import java.io.*;
import java.util.*;

public class Document {
	public static void main(String[] args) throws FileNotFoundException{
		final String TEXTFILE = "Flesch.txt";
		File myFile= new File(TEXTFILE);
		Scanner input= new Scanner(myFile);
		Scanner input2= new Scanner(myFile);
		Scanner input3= new Scanner(myFile);
		Word syllables = new Word();
		int totalSyll = syllables.getSyllables(input3);
		int totalSentences=sentences(input);
		int totalWords = words(input2);
		double readability=(206.835-(1.015*(totalWords/totalSentences))-(84.6*(totalSyll/totalWords)));
		String level = "";
		if (readability<0){
			level= "Law school graduate";
		}
		else if (readability<30){
			level= "College graduate";
		}
		else if (readability<50){
			level= "College student";
		}
		else if (readability<60){
			level= "High school student";
		}
		else if (readability<65){
			level= "9th grader";
		}
		else if (readability<70){
			level= "8th grader";
		}
		else if (readability<80){
			level= "7th grader";
		}
		else if (readability<90){
			level= "6th grader";
		}
		else {
			level= "5th grader";
		}
	
		System.out.println("Read in file: "+TEXTFILE);
		System.out.println("Flesch Readability Index: "+readability);
		System.out.println("Educational Level: "+level);
		
		}

	public static int sentences(Scanner input) {
		int totalSentences=0;
		while(input.hasNext()){
		String text=input.next();
			for(int i=0; i<text.length(); i++){
        		if(text.substring(i,i+1).equals(":")){
         		totalSentences++;
         		 
        		}
        		else if(text.substring(i,i+1).equals(".")){
         		totalSentences++;;
        		}
        		else if(text.substring(i,i+1).equals("?")){
         		totalSentences++;
        		}
        		else if(text.substring(i,i+1).equals(";")){
         		totalSentences++;
        		}
        		else if(text.substring(i,i+1).equals("!")){
         		 totalSentences++;
        		}
        		else{
        			
        		}
        	}
       
        
		}
	return totalSentences;
   
	 
	}
	public static int words(Scanner input) {
		int words=0;
		 while(input.hasNext()){
			 words++;
			 input.next();
		 }
			 return words;
			 
		 }
	
}

