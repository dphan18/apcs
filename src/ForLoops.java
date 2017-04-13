public class ForLoops {

	
	public static void main(String[] args) {
		System.out.print(palindrome("levil"));
	}
public static boolean palindrome(String a){
	int count=0;
	while(count<=(a.length()/2)){
			if(a.charAt(count)!=a.charAt(a.length()-count-1)){
				return false;
				
			}
			count++;

}
	
	return true;
	
}
}