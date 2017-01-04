package exercise7;

/**
 * Created by Casper on 30/12/2016.
 */
public class A {

    public int throwAnException(Integer i) throws IllegalArgumentException{
        if(i > 8){
            throw new IllegalArgumentException();
        }
        return i + i;
    }

}
