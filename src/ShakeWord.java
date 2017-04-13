//Author: Daniel Phan
//Description: This class is for ShakeWord objects which store the name
//of the word and what words follow it
//It can also choose a random word from that list

import java.util.ArrayList;
public class ShakeWord {
	private String word;
	
	//creates arraylist for all words that come right after it
	private ArrayList<String> wordList = new ArrayList<String>();
	
	//stores the name of the word itself
	public ShakeWord(String word){
		this.word=word;
	}
	
	//method to add words to the arraylist
	public void AddWord(String nextWord){
		wordList.add(nextWord);
	}
	
	//returns the name of the word
	public String getName(){
		return this.word;
	}
	
	//chooses a random word from the arraylist
	//if nothing follows it the word will be returned
	public String randomWord(){
		if (wordList.isEmpty()){
			return this.getName();
		}
		else{
			return wordList.get((int)(Math.random()*wordList.size()));
		}
	}

}
