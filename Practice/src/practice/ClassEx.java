package practice;

public class ClassEx {
	public static void main(String[] args) {
		
		Book book = new Book("자바의정석", "김태훈");
		
		book.printInfo();
	}
}

class Book {
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	public void printInfo() {
		System.out.println("title : " + title + ", author : " + author);
	}
}

