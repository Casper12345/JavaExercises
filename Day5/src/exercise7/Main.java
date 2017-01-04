package exercise7;

import java.util.Scanner;

/**
 * Created by Casper on 04/01/2017.
 */
public class Main {

    public static void main(String[] args) {
        int intEntered = 1;
        String stringEntered = "";
        Employees employees = new Employees();

        while(intEntered != 0) {
            Scanner input1 = new Scanner(System.in);
            Scanner input2 = new Scanner(System.in);
            System.out.print("Enter name: ");
            stringEntered = input2.nextLine();
            System.out.print("Enter id(finish process with 0): ");
            intEntered = input1.nextInt();


            employees.addId(intEntered);
            employees.addName(stringEntered);

        }

        int[] ids = employees.getEmployeeId();
        String[] names = employees.getEmployeeName();
        for(int i = 0; i < ids.length; i++){

            if(ids[i]%2 == 0 || names[i].startsWith("S")){
                System.out.println("Name: " + names[i]);
                System.out.println("Id: " + ids[i]);
            }

        }



    }




}
