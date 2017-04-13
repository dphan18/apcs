
public class Drink implements MenuItem {
private String name;
private double price;

public Drink (String n, double p){
	this.name=n;
	this.price=p;
}
	
	public String getName() {
	
		return this.name;
	}

	@Override
	public double getPrice() {
		
		return this.price;
	}

}
