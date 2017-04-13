/*Author: Daniel Phan
 * This program takes two sets of numbers and prints them out as arrays
 * They will be merged by increasing order as long as both arrays are in increasing order
 */
 

import java.util.Scanner;
public class MergeArrays {
//sets scanner and arrays
	public static void main(String[] args) {
		Scanner keys = new Scanner(System.in);
		int [] array1=new int [10001];
		for (int i=0;i<10001;i++){
			array1[i]=-1;
		}
		int [] array2=new int [10001];
		for (int i=0;i<10001;i++){
			array2[i]=-1;
		}
		int [] mergedArray=new int [20002];
		//takes in the first set of numbers
		System.out.println("Enter the values for the first array, up to 10000 values, enter a negative number to quit");
		int numberInput = keys.nextInt();
		int count=0;
		while(numberInput>=0&&count<10001){
		array1[count]= numberInput;
		 numberInput = keys.nextInt();
		 
		 count++;
		 
		}
		//takes in the second set of numbers
System.out.println("Enter the values for the second array, up to 10000 values, enter a negative number to quit");
numberInput = keys.nextInt();
int count2=0;
while(numberInput>=0&&count<10001){
	 array2[count2]=numberInput;
 numberInput = keys.nextInt();
 count2++;
 
}
keys.close();
//prints out the first array
int array1Length=0;
System.out.println("First Array:");
for (int i=0;i<10001;i++){
	
	if (array1[i]>=0){
		System.out.print(array1[i]+" ");
		array1Length++;
	}
	
	}
System.out.println("");
//prints out the second array
int array2Length=0;
System.out.println("Second Array:");
for (int i=0;i<10001;i++){
	
	if (array2[i]>=0){
		System.out.print(array2[i]+" ");
		array2Length++;
	}
	
	}
System.out.println("");
//determines if the array is in order
boolean inOrder=true;
int last1=0;
int last2=0;
for (int i=0;i<10001;i++){
	if (array1[i]>=0){
		if (array1[i]<last1){
			inOrder=false;
		}
	}
	last1=array1[i];
	 if(array2[i]>=0){
		if (array2[i]<last2){
			inOrder=false;
}
	}
	 last2=array2[i];
}
if(inOrder==false){
	System.out.println("ERROR: Array not in correct order");
}
//merges the arrays
int c1=0;
int c2=0;

if (inOrder==true){
for (int i=0; i<array1Length+array2Length;i++){
	if (c1<array1Length&&c2<array2Length){
	if(array1[c1]<=array2[c2]){
		mergedArray[i]=array1[c1];
		c1++;
		
	}
	else{
		mergedArray[i]=array2[c2];
		c2++;
	
	}
}
	else if (c1<array1Length){
		mergedArray[i]=array1[c1];
		c1++;
		
	}
	else if (c2<array2Length){
		mergedArray[i]=array2[c2];
		c2++;
		
	}
}

//prints the merged array
System.out.println("Merged Array:");
for (int i=0;i<array1Length+array2Length;i++){
	
	
		System.out.print(mergedArray[i]+" ");
		
	
	
	}
System.out.println("");
}
}
}
