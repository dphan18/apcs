public class TwoDArrays {

	
	public static void main(String[] args) {
		
		int [][]test={{1,3,2},{4,5,6},{7,8,9}};
		System.out.println(isSequence(test));
		
int [][]num=new int [4][7];


for (int row=0; row<num.length;row++){
	for (int column=0; column<num [0].length;column++ ){
		num [row][column]=(int)(Math.random()*10);
}
		}
for (int row=0; row<num.length;row++){
	for (int column=0; column<num [0].length;column++ ){
		System.out.print(num [row][column]);
	}
	System.out.println();
	}
for(int i=0;i<num [0].length;i++){
	System.out.print(num[1][i]);
}
System.out.println();

	for(int i=0;i<num.length;i++){
		System.out.print(num[i][2]);
	}
	}
	
	public static boolean isSequence(int[][] a){
		boolean [] temp=new boolean [a.length*a.length];
		if (isSquare(a)==false){
			return false;
		}
		for (int row=0; row<a.length;row++){
			for (int column=0; column<a[0].length;column++ ){
				for (int count=1; count<temp.length+1;count++ ){
					if(a[row][column]==count){
						temp[a[row][column]-1]=true;
					}
				}
				
				}
			}
			for (int i=0;i<temp.length;i++){
				if (temp[i]==false){
					return false;
				}
			}
		return true;
	}
	public static boolean isLatin(int[][] a){
		if (isSquare(a)==false){
			return false;
		}
		boolean [][]rows=new boolean [a.length][a.length];
			boolean [][]cols=new boolean [a.length][a.length];
		
		for (int row=0;row<a.length;row++){
			for (int column=1;column<a.length+1;column++){
				for (int col2=0;col2<a.length;col2++){
				if (a[row][col2]==column){
					rows[row][column-1]=true;
				}
			}
			}
		}
		for (int row=0;row<a.length;row++){
			for (int column=1;column<a.length+1;column++){
				for (int col2=0;col2<a.length;col2++){
				if (a[col2][row]==column){
					cols[row][column-1]=true;
				}
				}
			}
		}
		
			for (int row=0;row<a.length;row++){
				for (int column=0;column<a.length;column++){
					
					if (rows[row][column]==false){
						return false;
					}
				
					if (cols[row][column]==false){
						return false;
				}
		}
			
			}
		return true;
		
	}
	public static boolean isMagic(int[][] a){
		if (isSquare(a)==false){
			return false;
		}
		if (isRowMagic(a)==false){
			return false;
		}
		if (isColumnMagic(a)==false){
			return false;
		}
		int sumDiag1=0;
		int sumDiag2=0;
		
		for (int row=0; row<a.length;row++){
			sumDiag1+=a[row][row];
		}
		for (int row=0; row<a.length;row++){
			sumDiag2+=a[row][a.length-1-row];
		}
		if(sumDiag1!=sumDiag2){
			return false;
		}
		return true;
	}
	public static boolean isColumnMagic(int[][] a){
		int prevSum=columnSum(a,0);
		for (int column=0; column<a[0].length;column++ ){
			if (prevSum!=columnSum(a,column)){
				return false;
			}
		}
		return true;
	}
	public static boolean isSquare(int[][] a){
		for (int row=1; row<a.length;row++){
			if (a.length!=a[row].length){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isRowMagic(int[][] a){
		int prevSum=rowSum(a,0);
		for (int row=1; row<a.length;row++){
			if (prevSum!=rowSum(a,row)){
				return false;
			}
		}
		return true;
	}
	
	public static int[] allRowSums(int[][] a){
		int [] sum=new int [a.length];
		for (int row=0; row<a.length;row++){
			sum[row]=rowSum(a,row);
		}
		return sum;
	}
	
	public static int columnSum(int[][] a, int x){
		int sum=0;
		for (int row=0; row<a.length;row++){
			sum+=a[row][x];
		}
		return sum;
	}
	public static int rowSum(int[][] a, int x){
		int sum=0;
		for (int column=0; column<a[0].length;column++ ){
			sum+=a[x][column];
		}
		return sum;
	}
	
public static int max(int[][] a) {
	int max=0;
	for (int row=0; row<a.length;row++){
		for (int column=0; column<a[0].length;column++ ){
			if (a [row][column]>max);
			max=a [row][column];
		}
	
}
	return max;
	
}
}