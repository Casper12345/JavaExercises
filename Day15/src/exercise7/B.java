package exercise7;

/**
 * Created by Casper on 30/12/2016.
 */
public class B extends A{


    public int throwAnException(Integer i) throws NullPointerException{
        if(i == null){
            throw new NullPointerException();

        }
        return i + i;
    }

}
