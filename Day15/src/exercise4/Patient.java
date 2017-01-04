package exercise4;

public class Patient {

	private int age;
	private String name;
	
	public Patient(int age, String name) throws IllegalArgumentException{
        if(age > 130 || age < 0){
            throw new IllegalArgumentException();
        }
		this.age = age;
		this.name = name;
		
	}
	
	public int getAge(){
		return age;
	}
	
	public String getName(){
		return name;
	}

}