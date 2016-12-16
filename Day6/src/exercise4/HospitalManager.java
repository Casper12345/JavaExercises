package exercise4;

public class HospitalManager{

	private Patient header;

	public static void main (String[] args){
		
		HospitalManager myManager = new HospitalManager();

		Patient firstPatient = new Patient("Per",12,"TB");
		myManager.addPatient(firstPatient);
        Patient secondPatient = new Patient("Dadel",13,"OK");
        myManager.addPatient(secondPatient);

		//myManager.printPatients();



	}

	private void addPatient(Patient newPatient){
		
		Patient pointer = header;

		if(header == null){

		    header = newPatient;

		} else {

            while (!pointer.equals(header)) {
                pointer = pointer.getNextPatient();
            }

            pointer.setNextPatient(newPatient);
            pointer.getNextPatient().setNextPatient(header);
        }

	}

    private boolean deletePatient(Patient delete){

        Patient pointer = header;

        if(pointer == null) {

            System.out.println("List is empty");
            return false;
        }

        if (delete.equals(pointer) && pointer.getNextPatient() == header){
            header.setNextPatient(null);
            return true;
        }

        if(delete.equals(pointer) && pointer.getNextPatient() != header) {
            while(!pointer.getNextPatient().equals(delete)){
                pointer = pointer.getNextPatient();
            }

            pointer.setNextPatient(pointer.getNextPatient().getNextPatient());
            return true;
        }else{
            return false;
        }
    }

	private void printPatients(){

        Patient pointer = header;

        if(pointer == null){

            System.out.println("List is empty");
            return;

        }

        if(pointer.getNextPatient().equals(header)){

            System.out.println("Name: " + pointer.getName());
            System.out.println("Age: " + pointer.getAge());
            System.out.println("Illness: " + pointer.getIllness());

        } else {

            while(!pointer.getNextPatient().equals(header)){

                pointer = pointer.getNextPatient();

                System.out.println("Name: " + pointer.getName());
                System.out.println("Age: " + pointer.getAge());
                System.out.println("Illness: " + pointer.getIllness());
            }


        }
    }
}
	
