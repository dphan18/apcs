public class NestedLoops {

public static void main(String[] args) {
	christmasTree(4);
}
public static void printTriangle(int numROws) {
	int row=0;
	while(row<numROws) {
	for(int count=0;count<=row;count++) {
		System.out.print("[]");
}
		System.out.println();
		row++;
}
}
public static void timesTable(){
	for(int a=1;a<=12;a++){
	for (int b=a;b<=a*12;b=b+a){ 
		System.out.print(b+" ");
}
		System.out.println();
}
}
public static void christmasTree(int n){
	for (int a=1;a<=n;a++) {
	for (int b=1;b<=n-a;b++) {
		System.out.print(" ");
}
	for (int c=0;c<(2*a-1);c++) {
		System.out.print("*");
}
		System.out.println();
}
	for(int d=1;d<=n/2;d++){
	for(int e=1;e<(n-1);e++){
		System.out.print(" ");
}

	for (int f=0;f<3;f++){
		System.out.print("-");
	
}
		System.out.println();
		  
}
}
}



		    
		    
		

	


