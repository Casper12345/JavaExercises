package exercise4;

import java.util.*;

public class PatientList {
	
	private List<Object> hospital = new ArrayList<Object>();
	
	
	public static void main(String[] args){
		
		PatientList p = new PatientList();
		p.addPatient();
	
		
	}

	public void addPatient(){
		
		int age = 0;
		String name = null;
			
		while(age == 0){
				
			try{		
				System.out.print("Enter age: ");
				age = (Integer.parseInt(System.console().readLine()));
				
				if(age > 130 || age < 0){
					throw new IllegalArgumentException();
				}
			
			}catch(IllegalArgumentException ex){			
				System.out.println("Age has to be between 0 and 129");
			}
		}	
		
		System.out.print("Enter name: ");
		name = System.console().readLine();
	
		hospital.add(new Patient(age, name));
		
		
		
		
	}
	
	
}