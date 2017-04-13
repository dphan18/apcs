
public class Lunch {

	public static void main(String[] args) {
		
Drink d=new Drink ("Coke", 2);
Soup s=new Soup ("Tomato Soup", 4.5);
Sandwich sa=new Sandwich ("Hamburger", 6.5);

LunchSpecial l=new LunchSpecial (sa, s, d);
System.out.println(l.getName()+l.getPrice());
	}

}
