package exercise6;

/**
 * Created by Casper on 07/12/2016.
 */

public class Lecturer extends Teacher {

    public Lecturer(String name){

        super(name);
    }

    public void doResearch(String topic) {
        System.out.println("Doing research on: " + topic);
    }
}
