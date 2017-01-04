package exercise1;

import org.junit.*;
import static org.junit.Assert.*;

public class TestBook {

	Book myBook;
	
    @Before public void initialize() {
		myBook = new BookImpl("Dickens", "Tale of two cities");
	
    }
	
	@Test 
	public void testBookAuthor() {		
		assertEquals("Dickens" , myBook.getAuthor());
	}
	@Test 
	public void testBookTitle() {		
		assertEquals("Tale of two cities" , myBook.getTitle());
	}

	
	
}