package foo;

import java.util.Arrays;
import java.util.List;

public class FooOne {

    public static void main(String[] args){

        List<Integer> mylist = Arrays.asList(1,2,4,5);

        long  m = mylist.stream().map(i -> i).count();

        System.out.println(m);


    }


}
