/*Author: Daniel Phan

 *This program will print an image of Seattle's Space Needle using keyboard characters
 *The size can be changed by changing the value of the constant "SIZE"
 */
 
public class SpaceNeedle {
public static void main(String[] args) {
//calls the methods for each part of the Space Needle respectively
	verticalRows();
	pyramidUp();
	horizontalRow();
	pyramidDown();
	verticalRows();
	verticalPercent();
	pyramidUp();
	horizontalRow();
	}

//sets the size of the Space Needle
public static final int SIZE=4;

//the method for the vertical rows "||" (nested loop)
public static void verticalRows(){
	for(int row=1;row<=SIZE;row++){
	for(int space=1;space<=SIZE*3;space++){
		System.out.print(" ");
}
		System.out.println("||");
}
}

//the method for the pyramid shape facing up "__/:||:\__
public static void pyramidUp(){
	for (int row=1;row<=SIZE;row++){
	for (int space=0; space<(SIZE*3)-(3*(row-1+1));space++){
		System.out.print(" ");
}
		System.out.print("__/");
	for (int leftSide=0;leftSide<(row-1)*3;leftSide++){
		System.out.print(":");
}
		System.out.print("||");
	for (int rightSide=0;rightSide<(row-1)*3;rightSide++){
		System.out.print(":");
}
		System.out.println("\\__");
}
	
}

//the method for the horizontal row "|""|"
public static void horizontalRow(){
		System.out.print("|");
	for(int quotes=0;quotes<SIZE*6;quotes++){
		System.out.print("\"");
}
		System.out.println("|");
}

//the method for the pyramid shape facing down "\_/\_/"
public static void pyramidDown(){
		System.out.print("\\_");
	for (int cones1=0;cones1<(SIZE*6-2)/2;cones1++){
		System.out.print("/\\");
}
		System.out.println("_/");
	for(int row=2;row<SIZE+1;row++){
	for (int space=2+(2*row-4);space>0;space--){
		System.out.print(" ");
}
		System.out.print("\\_");
	for (int cones=(row-1)*2;cones<(SIZE*6-2)/2;cones++){
		System.out.print("/\\");
}
		System.out.println("_/");
}
}

//sets the method for the vertical rows containing percents "|%|"
public static void verticalPercent(){
	for(int row=1; row<=Math.pow(SIZE,2);row++){
	for(int space=1; space<=SIZE*2+1;space++){
		System.out.print(" ");	
}
		System.out.print("|");
	for(int leftSide=1;leftSide<=SIZE-2;leftSide++){
		System.out.print("%");
}
		System.out.print("||");
	for(int rightSide=0;rightSide<SIZE-2;rightSide++){
		System.out.print("%");
}
		System.out.println("|");
}
}
}


