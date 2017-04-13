
public class StaffMember extends Person {
	int roomNumber;
	String title;
public StaffMember(String n, String g, int a, int r, String t) {
	super(n, g, a);
	roomNumber=r;
	title=t;
}
public String toString(){
	return super.toString()+" "+this.roomNumber+" "+this.title;
}

}
