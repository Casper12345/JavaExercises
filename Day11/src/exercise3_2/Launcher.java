package exercise3_2;

/**
 * Created by Casper on 09/03/2017.
 */
public class Launcher {

    public static void main(String[] args) {
        Tree t = new Tree(4);
        t.add(2);
        t.add(8);
        t.add(1);
        t.add(2);
        System.out.println(t.contains(0));
        System.out.println(t.toString());
    }
}
