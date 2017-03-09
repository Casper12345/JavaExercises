package exercise3_3;

/**
 * Created by Casper on 09/03/2017.
 */
public class Launcher {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(10);
        l.add(1);
        l.add(4);
        l.add(2);
        l.add(0);
        l.add(1);
        l.add(4);
        l.add(2);
        l.add(0);
        System.out.println(l.contains(-1));
        System.out.println(l.toString());

    }

}

