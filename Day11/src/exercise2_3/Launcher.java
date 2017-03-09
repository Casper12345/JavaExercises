package exercise2_3;

/**
 * Created by Casper on 09/03/2017.
 */
public class Launcher {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        System.out.println(l.contains(2));
        System.out.println(l.containsVerbose(5));
        System.out.println(l.toString());
    }
}
