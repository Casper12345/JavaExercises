package exercise6;


public class Main {

    public static void main(String[] args){

        Teacher t = new Teacher("John");
        Lecturer l = new Lecturer("Paul");

        System.out.println(t.getName());
        System.out.println(l.getName());
        l.doResearch("chemistry");

        t.teach("math");


    }
}
