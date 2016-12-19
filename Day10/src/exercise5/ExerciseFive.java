package exercise5;

public class ExerciseFive {

    public static void main(String[] args) {

        ExerciseFive e = new ExerciseFive();
        System.out.println(e.powIterative(20,7));
        System.out.println(e.powRecursive(20,7));


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

    private int powRecursive(int base, int n){

        if (n < 0) {
            System.out.println("integer has to be positive");
        }
        if (n == 0) {
            return 1;
        } else {
            return base * powRecursive(base, n - 1);
        }
    }


}
