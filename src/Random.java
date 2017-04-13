
public class Random {

	
	public static void main(String[] args) {
		System.out.println(makePass(8));
		}
		
	public static String makePass(int n){
		String alphabet="abcdefghijklmnopqrstuvwxyz";
		String passcode="";
		for(int count=0; count<n; count++){
			passcode=passcode+(alphabet.charAt((int)(Math.random()*26)));
		}
		return passcode;

	}
	}


