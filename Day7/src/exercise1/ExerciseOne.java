package exercise1;

public class ExerciseOne{

	public static void main(String[] args){
		Supermarked s = new Supermarked();
		s.servePerson();	
		s.addPerson(new Person("peterson", "Oscar", "Male", 23));
		s.addPerson(new Person("Geller", "Uri", "Male", 69));
		s.addPerson(new Person("Tyler", "Steven", "Male", 55));
		Person firstServing = s.servePerson();
		System.out.println(firstServing.getFirstName());
		Person secondServing = s.servePerson();
		System.out.println(secondServing.getFirstName());
	}
}