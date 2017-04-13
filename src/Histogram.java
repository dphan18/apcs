/*Author: Daniel Phan
 * This program makes a chart of the times each number occurs in a file
 * It also finds the Mean, Median, and Mode of the numbers 
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Histogram {
	
 public static void main(String[] args) throws FileNotFoundException {
	 
		//sets scanner and initializes variables and arrays
	 final String TEXTFILE = "tallyingInput";
		File myFile= new File(TEXTFILE);
		Scanner input= new Scanner(myFile);
		double mode=0;
		int counter=0;
		double total=0;
		double median=0;
		int max=0;
		double [] score=new double [101];	
		
		 while(input.hasNext()){
			 double number=input.nextDouble();			 
			 //counts total and sets numbers to the correct array
			 for (int i=0;i<101;i++){
					if (number==i){
					score[i]=score[i]+1;
					}					
				}			
			 counter++;
			 total+=number;
		 }
		input.close();

		//prints the histogram
	for(int o=0;o<101;o++){		
		if (score[o]>0){
		System.out.print(o+ ": ");
		for (int u=0;u<score[o];u++){
			System.out.print("*");
		}
		System.out.println("");
	}
		//finds the mode
		if(score[o]>score[(int)mode]){
			mode =o;
		}
	}
	
	//finds the median
	int count=0;	
	if(counter%2!=0){
		 max=(counter+1)/2;
		 }
	else{
		max=counter/2;	
	}
	double prev = 0;
	for(int i=0;i<101;i++){
		for (int b=0; b<score[i];b++){
		count++;
		
		if(count==max){
			if(counter%2!=0){
		median=i;
			}
			else{
				median=(i+prev)/2;
				
			}
		}
			
		
			
	}		
		prev=i;	
	}
	
	//prints and calculates the mean
	System.out.println("Mean: "+(total/counter));
	System.out.println("Median: "+median);
	System.out.println("Mode: "+mode);	
 }
}