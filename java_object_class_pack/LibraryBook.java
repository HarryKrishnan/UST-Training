package java_object_class_pack;

class LibraryBook {

	int bookId;
	String title;
	String author;
	boolean available;

	LibraryBook(int bookId, String title, String author, boolean available) {
		
		this.bookId = bookId;
		this.title = title;
		this.author = author;
		this.available = available;
	}

	boolean isAvailable() {
		return available;
	}

	void display() {
		
		System.out.println("Book ID: " + bookId);
		System.out.println("Title: " + title);
		System.out.println("Author: " + author);
		System.out.println("Available: " + isAvailable());
	}

	public static void main(String[] args) {

		LibraryBook book = new LibraryBook(101, "Java Basics", "James", true);
		book.display();
	}
}
