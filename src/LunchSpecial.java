


	public class LunchSpecial implements MenuItem{
private String name;
private double price;

LunchSpecial(Sandwich sa, Soup s, Drink d){
	this.name=(sa.getName()+"/"+s.getName()+"/"+d.getName());
	
	if (d.getPrice()<=s.getPrice()&&d.getPrice()<=sa.getPrice()){
		this.price=s.getPrice()+sa.getPrice();
	}
	else if (s.getPrice()<=d.getPrice()&&s.getPrice()<=sa.getPrice()){
		this.price=sa.getPrice()+d.getPrice();
	}
	else {
		this.price=d.getPrice()+s.getPrice();
	}
}
		
		public String getName() {
			return name;
			
		}

		
		public double getPrice() {
			
			return price;
		}
			
	}
	