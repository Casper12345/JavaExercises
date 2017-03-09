package exercise2_2;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * An implementation of the echo service. */

public interface DateService extends Remote {
    /**
    * Returns the same string passed as parameter * @param s a string
    * @return the same string passed as parameter */

    Calendar calendar() throws RemoteException;
}