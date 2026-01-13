package java_object_class_pack;

public class Book {

	String bookName;
	int bookId;
	double bookPrice;

	Book(String bookName, int bookId, double bookPrice) {

		this.bookName = bookName;
		this.bookId = bookId;
		this.bookPrice = bookPrice;
	}

	Book() {

		bookName = "Tempest";
		bookId = 101;
		bookPrice = 1500;
	}

	void details() {

		System.out.println("Book name : " + bookName);
		System.out.println("Book Id : " + bookId);
		System.out.println("Book Prize : " + bookPrice);
	}

	public static void main(String[] args) {

		Book book = new Book("Tempest", 101, 1200);
		book.details();
		
		System.out.println("------------------");
		
		Book boo = new Book();
		boo.details();

	}

}
