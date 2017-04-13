public class BmiCalc {
public static void main (String args[]){
	double height=1.6;
	double weight = 60;
	double bmi = (weight/height/height);
if (bmi<18.5){
	System.out.println("Underweight");
	
}
else if (bmi >=25){
	System.out.println("Overweight");
	
}
else{
	System.out.println("NormalWeight");
}
			
}
}
