package exercise6;

/**
 * Created by Casper on 07/12/2016.
 */

public class Teacher {
    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void teach(String lessonName) {
        System.out.println("Teaching lesson: " + lessonName);
    }

}




