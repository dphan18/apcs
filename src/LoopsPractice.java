

public class LoopsPractice {

	
	public static void main(String[] args) {
		System.out.print(palindrome("levil"));
	}
public static boolean palindrome(String a){
	int count=0;
	while(a.charAt(count)==a.charAt(a.length()-count-1)){
			return true;
			

}
	count++;
	return false;
}
}

	