package exercise6;

/**
 * Created by Casper on 30/12/2016.
 */
public class Launch {

    public static void main(String[] args) {

        Exercise6 e = new Exercise6();

        //e.checkedException(2);

        try{
            e.checkedException(2);
        }catch (IllegalArgumentException ex){
            System.out.println("don't enter two");
        }


        //e.uncheckedException(2,0);

        try {
            e.uncheckedException(2,0);
        }catch (ArithmeticException ex){
            System.out.println("cannot devide by zero");
        }

    }
}
