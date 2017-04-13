import java.io.*;
import java.util.Scanner;

public class StringSearch{
private static String [] words;
public static void main(String[] args) throws FileNotFoundException
{
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(new File("names.txt"));
		//Note that the file must be the first argument!
		int size = input.nextInt();
		words = new String[size];
		int counter = 0;
		while(input.hasNext()) {
			words[counter] = input.next();
			counter++;
			
		}
		
		System.out.println(linearSearch("DANIEL"));
		System.out.println(binarySearch("DANIEL", 0, words.length)); 
	}
public static int linearSearch(String a) {
	
	
	for (int i=0;i<words.length;i++){
		if (words[i].equals(a)){
			return i;
		}
		
	}
	return -1;
}
public static int binarySearch(String a, int b, int c) {
	int min=b;
	int max=c;
	if (min > max) {
        return -1;
    }
    
    int mid = (max + min) / 2;
    
    if (words[mid].equals(a)) {
        return mid;
    } else if(words[mid].compareTo(a) > 0) {
        return binarySearch(a, min, mid - 1);
    } else {
        return binarySearch(a, mid + 1, max);
    }
}
}