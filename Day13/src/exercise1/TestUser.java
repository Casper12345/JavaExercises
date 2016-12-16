package exercise1;

import org.junit.*;
import static org.junit.Assert.*;

public class TestUser {

	private User myUser;
	
    @Before public void initialize() {
	
		myUser = new UserImpl("Casper");

    }
	
	
	@Test 
	public void testUserName() {		
		assertEquals("Casper" , myUser.getName());
	}
	
	
	@Test
	public void testRegiserLibrary(){
		
		Library myLibrary = new MockLibrary();
		
		assertEquals(21, myUser.register(myLibrary));

		
	}
	
	@Test
	public void testTwoUsersGetDifferentIDs(){
		User myUser = new UserImpl("Casper");

		User anotherUser = new UserImpl("Enrics");

		Library myLibrary = new MockLibrary();

		assertTrue(myUser.register(myLibrary) != anotherUser.register(myLibrary));
	}
	
	
}
















