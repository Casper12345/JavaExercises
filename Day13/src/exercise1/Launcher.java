package exercise1;

/**
 * Created by Casper on 20/12/2016.
 */
public class Launcher {

    public static void main(String[] args) {
        Book b = new BookImpl("DadelMann", "1009");
        System.out.println(b.getAuthor()+"  "+b.getTitle());

    }
}
