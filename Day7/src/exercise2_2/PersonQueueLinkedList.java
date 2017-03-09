package exercise2_2;

public class PersonQueueLinkedList implements PersonQueue{
	
	private Person header = null;
	
	
	public void insert(Person insert){
			
			Person pointer = header;
			
			if (header == null){
				
				header = insert;
				
			}else{
				
				while(pointer.getNextPerson() != null){
					
					pointer = pointer.getNextPerson();
					
				}
				
				 pointer.setNextPerson(insert); 
				
			}
		
		
	}
	
	public Person retrieve(){
		
		Person pointer = header;
		
		if(header == null){
			
			System.out.println("List is empty");
			return null;
			
		}else{
			
			header = pointer.getNextPerson();
			pointer.setNextPerson(null);
			return pointer;
		}	
		
		
	}

	
	
	
	
	
	
	
}