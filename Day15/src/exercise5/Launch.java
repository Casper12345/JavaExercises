package exercise5;

/**
 * Created by Casper on 30/12/2016.
 */
public class Launch {

    public static void main(String[] args) {
        PrimeDivisorList p = new PrimeDivisorList();
        p.add(223);
        p.add(11);
        p.add(2);
        //p.add(null);
        Integer gotten = p.get(0);
        System.out.println(gotten);
    }
}
