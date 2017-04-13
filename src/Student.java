
public class Student extends Person {
	int studentID;
	int grade;

	public Student(String n, String g, int a, int s, int d) {
		super(n, g, a);
		this.studentID=s;
		this.grade=d;
		
	}
	public String toString(){
		return super.toString()+" "+this.studentID+" "+this.grade;
	}

}
