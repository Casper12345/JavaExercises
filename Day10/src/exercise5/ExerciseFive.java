package exercise5;

public class ExerciseFive {

    public static void main(String[] args) {

        ExerciseFive e = new ExerciseFive();
        System.out.println(e.powIterative(20,7));


    }

    private int powIterative(int base, int exponent){

        int result = 1;
        int i = 0;

        while(i<exponent){
            result *= base;
            i++;
        };

        return result;
    }

    private int powRecursive(int base, int exponent){

        return 1;
    }

    private int recursiveMultiplier(int multiplier){

        return 2;
    }

}
