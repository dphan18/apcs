
public class ChildrensBook extends Book{
private String illustrator;
public ChildrensBook(){
	this("none", "unknown", "unknown", 1900);
}
public ChildrensBook(String t, String a, String i, int y){
	super(t,a,y);
	illustrator=i;
}
public String toString(){
return super.toString()+"\n\t"+illustrator;
}
}
