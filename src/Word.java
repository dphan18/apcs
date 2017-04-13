import java.io.*;
import java.util.*;

public class Word {
private int syllables;
private Scanner input;
public int getSyllables(Scanner recievedInput){
	input=recievedInput;
	int syllables=0;
	boolean preVowel=false;
	while(input.hasNext()){
		String text=input.next();
		text=text.toLowerCase();
		if(text.equals("e")){
			syllables++;
		}
		if(text.charAt(text.length()-1)=='e'){
			text=text.substring(0, text.length()-1);
		}
			int count=0;
			for(int i=0; i<text.length(); i++) {
				if (vowel(text.charAt(i)) && (preVowel==false)) {
				syllables++;
				preVowel = true;
				
				}
					else if (vowel(text.charAt(i)) && (preVowel==true)){
					preVowel = true;
					}
						else {
							preVowel = false;
						count++;
						if (count==text.length()){
						syllables++;
						}
							else{
							
							}
						
						
						
						}
			 }
	}
	return syllables;
	
}




	

	public static boolean vowel(char t) {
	    if (t == 'a') {
	    	return true;  
			}
	   
		 else if (t == 'e') 
		 	{ return true;  
			}
		 
	    else if (t == 'i') 
		 	{ return true;  
			}
			
	    else if (t == 'o')
		 	{ return true;  
			}
	  
	    else if (t == 'u') 
		 	{ return true;  
			}
			
	    else if (t == 'y') 
	 	 	{ return true;  
	 		}
		 	
			
	    else 
		 	{ return false; 
			}
	  



	}

}

