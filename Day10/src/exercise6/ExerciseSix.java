package exercise6;

/**
 * Created by Casper on 16/12/2016.
 */
public class ExerciseSix {

    public static void main(String[] args) {

        ExerciseSix e = new ExerciseSix();
        System.out.println(e.greatestCommonDivisor(30,6));

    }

    private int greatestCommonDivisor(int p, int q){

        if (p>q){
            return greatestCommonDivisor(q, p%q);
        } else{
            return p/q;
        }


        //if p > q, then gcd(p,q) = gcd(q,p mod q)
    }
}
