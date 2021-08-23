
class Book {
	String title;
	String author;
	int price;

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String author, int price) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + "]";
	}

}

public class Ex02 {

	public static void changeBook(Book book) {
		book.title = "Java8";
		book.price = 2000;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Book book = new Book("Java", "나유나", 1000);
		System.out.println("main 변경 전: " + book.toString());
		changeBook(book);
		System.out.println("main 변경 후: " + book.toString());
		
	}

}
