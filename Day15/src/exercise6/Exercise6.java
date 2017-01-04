package exercise6;

/**
 * Created by Casper on 30/12/2016.
 */
public class Exercise6 {

    public int checkedException(int i) throws IllegalArgumentException{

        if(i == 2){
            throw new IllegalArgumentException();
        }
        return i + i;

    }

    public int uncheckedException(int base , int divisor){
        return base/divisor;
    }

}
