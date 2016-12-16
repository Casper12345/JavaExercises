package exercise2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Arrays;


public class Main {


    public static void main(String[] args){
        Integer[] intArray = {1,7,3,4,8,2};
        String[] stringArray = {"hello", "yes", "ok"};
        System.out.println(Arrays.asList(intArray));
        System.out.println(Arrays.asList(stringArray));

        // without lambda
        Arrays.sort(stringArray, new ComparatorImp());
        System.out.println(Arrays.asList(stringArray));

        // with lambda
        Arrays.sort(stringArray, (String s1, String s2) -> s1.length() - s2.length());
        System.out.println(Arrays.asList(stringArray));

        // with type omitted
        Arrays.sort(stringArray, (s1, s2) -> s1.length() - s2.length());
        System.out.println(Arrays.asList(stringArray));

        // first character
        Arrays.sort(stringArray, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
        System.out.println(Arrays.asList(stringArray));

        Arrays.sort(stringArray, (s1, s2) -> s1.charAt(0) - s2.charAt(0));
        System.out.println(Arrays.asList(stringArray));




    }
}


class ComparatorImp implements Comparator<String>{

    @Override
    public int compare(String s1, String s2){

        return s2.length() - s1.length();

    }
}

