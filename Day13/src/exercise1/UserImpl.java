package exercise1;

public class UserImpl implements User{
	private String name;
	
	
	public UserImpl(String name){

		this.name = name;
	}
	
	public String getName() {
	    return name;
	}
	
	public int register(Library library){
	    return (library.registerUser(this));
	}
	
	
}