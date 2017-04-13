
public class Person {
	String name;
	String gender;
	int age;
public Person(String n, String g, int a){
	this.name=n;
	this.gender=g;
	this.age=a;
}
public String toString(){
	return this.name +" "+this.gender+" "+this.age;
}
}
