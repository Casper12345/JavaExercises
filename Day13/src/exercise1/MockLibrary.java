package exercise1;

public class MockLibrary implements Library{
	private int userCount;
	
	public int registerUser(User user){
		userCount++;
		return userCount;
	}


}