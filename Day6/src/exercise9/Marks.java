package exercise9;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by Casper on 19/12/2016.
 */
public class Marks {

    public static void main(String[] args) {

        Marks m = new Marks();
        m.takeUserInput();

    }

    private void takeUserInput(){

        int userInput = 0;
        int marksInTotal = 0;
        int passed = 0;
        int failed = 0;
        int distinct = 0;
        int notRecognised = 0;

        while (userInput != -1) {
            try {

                do {
                    System.out.print("Please enter mark: ");
                    Scanner input = new Scanner(System.in);
                    userInput = input.nextInt();
                    marksInTotal++;

                    if (userInput > 0 && userInput <= 49) {
                        failed++;
                    }

                    if (userInput >= 50 && userInput <= 69) {
                        passed++;
                    }

                    if (userInput >= 70 && userInput <= 100) {
                        distinct++;
                    }

                    if (userInput < 0 || userInput > 100) {
                        notRecognised++;
                    }


                } while (userInput != -1);

                System.out.println("Marks in total: " + marksInTotal);
                System.out.println("Passed: " + passed);
                System.out.println("Failed: " + failed);
                System.out.println("Distinction: " + distinct);
                System.out.println("Not recognised: " + notRecognised);

            } catch (InputMismatchException ex) {
                System.out.println("Try again");
            }
        }
    }

}
