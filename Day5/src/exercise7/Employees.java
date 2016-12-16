package exercise7;

public class Employees {

    private String[] employeeName;
    private int[] employeeId;

    public Employees(){
        this.employeeName = new String[0];
        this.employeeId = new int[0];
    }

    public void addName(String employeeName){
        String[] copyingArray = new String[employeeName.length() +1];

        for(int i = 0; i < copyingArray.length; i++){

            copyingArray[i] = employeeName[0];


        }



    }
}
