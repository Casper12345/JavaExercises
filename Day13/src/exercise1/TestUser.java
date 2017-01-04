package exercise1;

import org.junit.*;
import static org.junit.Assert.*;

public class TestUser {

	private User myUser;
	private User mySecondUser;
	
    @Before public void initialize() {
	
		myUser = new UserImpl("Casper");
		mySecondUser = new UserImpl("Enric");

    }
	
	
	@Test 
	public void testUserName() {		
		assertEquals("Casper" , myUser.getName());
		assertEquals("Enric", mySecondUser.getName());
	}

	
	
	@Test
	//@Ignore
	public void testRegiserLibrary(){
		
		Library myLibrary = new MockLibrary();
		
		assertEquals(1, myUser.register(myLibrary));
		assertEquals(2, myUser.register(myLibrary));

		
	}
	
	@Test
	public void testTwoUsersGetDifferentIDs(){
		User myUser = new UserImpl("Casper");

		User anotherUser = new UserImpl("Enrics");

		Library myLibrary = new MockLibrary();

		assertTrue(myUser.register(myLibrary) != anotherUser.register(myLibrary));
	}
	
	
}
















