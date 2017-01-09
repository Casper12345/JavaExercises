package exercise6;

/**
 * Created by Casper on 16/12/2016.
 */
public class ExerciseSix {

    public static void main(String[] args) {

        ExerciseSix e = new ExerciseSix();
        System.out.println(e.greatestCommonDivisor(15,12));

    }

    private int greatestCommonDivisor(int p, int q){

        if(p == 0 || q == 0){
            return p+q;
        }
        return greatestCommonDivisor(q, p%q);

    }
}
