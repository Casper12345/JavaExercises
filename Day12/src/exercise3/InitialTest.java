package exercise3;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Casper on 10/03/2017.
 */
public class InitialTest {
    @Test
    public void getInitialsFails() throws Exception {
        boolean thrown = false;

        Initial i = new Initial();

            i.getInitials("hello  world");

    }


    @Ignore
    public void getInitialsPass() throws Exception {
        boolean thrown = false;

        Initial i = new Initial();

        try {
            i.getInitials("hello  world");
        }catch (StringIndexOutOfBoundsException ex){
            thrown = true;
        }

        assertFalse(thrown);
    }

}