
public class Book {
	private String title;
	private String author;
	
	private int yearPublished;
	
	private int bookID;
	private static int num=1;
		
	public Book() {
		this("none", "unknown", 1900);
	}
	
	public Book(String t, String a, int y) {
		this.title = t;
		this.author = a;
		this.yearPublished = y;
		this.bookID = num;
		num++; //will increase for each book because it is static
	}
	
	//accessor methods
	public String getTitle() {
		return this.title;
	}
	
	public String getAuthor() {
		return this.author;
	}
	
	public int getYear() {
		return this.yearPublished;
	}
	
	public int getIDNum() {
		return this.bookID;
	}
	
	public String toString() {
		return title + "\n\t" + author + "\n\t" + yearPublished + "\tID:" + bookID;
	}
	
	//mutator methods
	public void setTitle(String t) {
		this.title = t;
	}
	
	public void setAuthor(String a) {
		this.author = a;
		
	}
	
	public void setYearPublished(int y) {
		this.yearPublished = y;
	}

}