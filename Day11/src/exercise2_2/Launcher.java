package exercise2_2;

/**
 * Created by Casper on 09/03/2017.
 */
public class Launcher {

    public static void main(String[] args) {
        Tree t = new Tree(2);
        t.add(1);
        t.add(2);
        t.add(4);
        t.add(5);
        t.add(6);
        t.add(7);

        System.out.println(t.contains(0));
        System.out.println(t.containsVerbose(9));
        System.out.println(t.toString());

    }
}
