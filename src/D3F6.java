
public class D3F6 extends Droid {

	   private int x,y,z;
	void move() {
		x+=12;
		y+=43;
		z+=6;
	}

	
	void speak() {
		System.out.println("Hello");
	}


	
	void fight() {
		x+=4;
		y+=3;
		z+=2;
		
		System.out.println("Boom");
		
	}

}
