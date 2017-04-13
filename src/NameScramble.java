
public class NameScramble {

	public static void main(String[] args) {
		System.out.println(scrambleName("Joesph" , "Smith"));
	}
		public static String scrambleName(String fName, String lName) {
			return "aaa"+lName.substring(lName.length()-3)+fName.substring(3, fName.length())+" "+lName.substring(0, lName.length()-3)+fName.substring(0, 3)+"ooo";
		}

	}


