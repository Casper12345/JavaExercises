package exercise7;

public class Employees {

    private String[] employeeName;
    private int[] employeeId;

    public Employees(){
        this.employeeName = new String[0];
        this.employeeId = new int[0];
    }

    public String[] getEmployeeName() {
        return employeeName;
    }

    public int[] getEmployeeId() {
        return employeeId;
    }

    public void addName(String name){
        String[] copyingArray = new String[employeeName.length +1];

        for(int i = 0; i < employeeName.length; i++){
            copyingArray[i] = employeeName[i];
        }
        copyingArray[copyingArray.length -1] = name;
        employeeName = copyingArray;
    }

    public void addId(int id){
        int[] copyingArray = new int[employeeId.length +1];

        for(int i = 0; i< employeeId.length; i++){
            copyingArray[i] =  employeeId[i];
        }
        copyingArray[copyingArray.length -1] = id;
        employeeId = copyingArray;
    }



}
