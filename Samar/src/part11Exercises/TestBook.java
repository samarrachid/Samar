package part11Exercises;

public class TestBook {
	public static void main(String[] args) {
	Author author = new Author("dan", "daniams", 'f');

	Book book = new Book("50 shades ", author, 50.5);
	
	
	System.out.println(book.toString());
	
	}
	
	
	
	
}
