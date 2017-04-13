
public class Square extends Rectangle{
	private double sideLength;
	public Square(double len) {
		super(len, len);
		this.sideLength=len;
		
	}
	public String toString(){
		return "side length: "+this.sideLength+" area: "+super.area()+ " perimeter: "+ super.perimeter();
	}

}
