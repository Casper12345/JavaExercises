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
        Scanner integerScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = stringScanner.nextLine();

        while (true) {
            try {
                System.out.print("Enter age: ");
                age = integerScanner.nextInt();
                hospital.add(new Patient(age, name));
                break;

            } catch (IllegalArgumentException ex) {
                System.out.println("Age has to be between 0 and 129");


            }
        }
	}
	
	
}