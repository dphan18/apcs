
public class Rectangle {
private double length;
private double width;

	public Rectangle(double l, double w){
		this.length=l;
		this.width=w;
	}
	
	public double area(){
		return this.length*this.width;
	}
	
	public double perimeter(){
		return this.length*2+this.width*2;
		
	}
	public String toString(){
		return "length: "+this.length+" width: "+this.width+" area: "+this.area()+" perimter: "+this.perimeter();
	}
}
