package exercise1;

public class Supermarked{

	PersonQueueLinkedList header ;
	
	public void addPerson(Person addPerson){
		if(header == null){
			header = new PersonQueueLinkedList();
		}
		    header.insert(addPerson);
	}
	
	public Person servePerson(){
		if(header == null){
			return null;
		}else{
			return header.retrieve();
		}
	}
}