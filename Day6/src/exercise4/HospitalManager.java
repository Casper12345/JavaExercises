package exercise4;

public class HospitalManager{

	private Patient header;
	private Patient tail;

	public static void main (String[] args){
		
		HospitalManager myManager = new HospitalManager();
		Patient firstPatient = new Patient("joe", 23, "sick");

		myManager.addPatient(firstPatient);

		Patient secondPatient = new Patient("anker", 34, "fucked");
		myManager.addPatient(secondPatient);


		Patient thirdPatient = new Patient("Poul", 26, "more fucked");
		myManager.addPatient(thirdPatient);

        //myManager.printer();

        myManager.remove(secondPatient);

        myManager.printer();




	}

	private void addPatient(Patient newPatient){

	    Patient pointer = header;

	    if(header == null){
            header = newPatient;
            newPatient.setNextPatient(header);

	    }else{

	        while(!pointer.getNextPatient().equals(header)){
	            pointer = pointer.getNextPatient();
            }

            pointer.setNextPatient(newPatient);
            newPatient.setNextPatient(header);
            tail = newPatient;
        }



    }

    private void printer(){

	    Patient pointer = header;

	    if(header == null){
            System.out.println("list is empty");
        }

        if(pointer.getNextPatient().equals(header)){
            System.out.println("Name: " + pointer.getName());
            System.out.println("Age: " + pointer.getAge());
            System.out.println("Illness: " + pointer.getIllness());

        }else{

            System.out.println("Name: " + pointer.getName());
            System.out.println("Age: " + pointer.getAge());
            System.out.println("Illness: " + pointer.getIllness());

            while(!pointer.getNextPatient().equals(header)){

                pointer = pointer.getNextPatient();
                System.out.println("Name: " + pointer.getName());
                System.out.println("Age: " + pointer.getAge());
                System.out.println("Illness: " + pointer.getIllness());

            }

        }

    }

    private boolean remove(Patient toRemove){

        Patient pointer = header;

        if(header == null){
            System.out.println("List is empty");
            return false;
        }

        if(toRemove.equals(header)){
            header = pointer.getNextPatient();
            tail.setNextPatient(header);
            return true;
        }

        if(toRemove.equals(tail)){
            while (!pointer.getNextPatient().equals(tail)){
                pointer = pointer.getNextPatient();
            }
            pointer.setNextPatient(header);
            tail = pointer;
            return true;
        }

        while (!pointer.getNextPatient().equals(toRemove)){
            pointer = pointer.getNextPatient();

            if(pointer.getNextPatient().equals(header)){
                return false;
            }
        }

        pointer.setNextPatient(pointer.getNextPatient().getNextPatient());
        return true;

    }


}
	
