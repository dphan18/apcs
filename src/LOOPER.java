
public class LOOPER {
	public static void main(String args[]){
int number=0;
String alph="abcdefghij";
while (number<=1000){
	int Random= (int) (Math.random()*10);
	System.out.print(alph.substring(Random-1, Random));
	number++;
}
}
}
