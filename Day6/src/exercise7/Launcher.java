package exercise7;

import java.util.List;

/**
 * Created by Casper on 19/12/2016.
 */
public class Launcher {

    public static void main(String[] args) {
        String[] arrayToConvert = {"a","b","c", "d"};

        List l = ArrayUtilities.listReturner(arrayToConvert);

        System.out.println(l);

    }
}
