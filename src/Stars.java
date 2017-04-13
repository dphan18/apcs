
public class Stars {
	public static void star1 (){
		System.out.println ("*****");
		System.out.println ("*****");
	}
	public static void star2 (){
		System.out.println ("  *");
		System.out.println ("  *");
		System.out.println ("  *");
	}
	
	public static void star3 (){
		System.out.println (" * *");
		System.out.println ("  *");
		System.out.println (" * *");
		
	}
	public static void space (){
		System.out.println (" ");
	}
	
	public static void figure1 (){
		star1();
		star3();
		space();
		
	}
	
	public static void figure2 (){
		star1();
		star3();
		star1();
		space();
	}
	public static void figure3 (){
		star2();
		star1();
		star3();
	}
	public static void main(String[] args) {
		figure1();
		figure2();
		figure3();

	}

}
