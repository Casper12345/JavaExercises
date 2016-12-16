package exercise1;

public class Person{
	
	private String familyName;
	private String firstName;
	private String gender;
	private int age;
	private Person nextPerson; 	
	

	Person(String familyName, String firstName, String gender, int age){
		this.familyName = familyName;
		this.firstName = firstName;
		this.gender =gender;
		this.age = age;
		this.nextPerson = null;
	}
	
	public String getFamilyName(){
		return familyName;
	}

	public String getFirstName(){
		return firstName;
	}
	public String getGender(){
		return gender;
	}
	public int getAge(){
		return age; 
	}
	public void setNextPerson(Person nextPerson){
		
		this.nextPerson = nextPerson;
		
	}
	
	public Person getNextPerson(){
		
		return nextPerson; 
		
	}
}