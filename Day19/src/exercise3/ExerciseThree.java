package exercise3;

@FunctionalInterface
interface TwoStringPredicate {

    boolean isBetter(String s1, String s2);

}


public class ExerciseThree {

    public static void main(String[] args){
        String test1 = "Hello";
        String test2 = "Goodbye";


    }

    private static String betterString(String s1, String s2, TwoStringPredicate tsp){
        // less verbose that the underneath code
        return (tsp.isBetter(s1, s2)) ? s1 : s2;

        //if (tsp.isBetter(s1, s2)) {
        //    return s1;
        //}else{
        //    return s2;
        //}
    }
}