package exercise3;


import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * An implementation of the echo service. */

public interface CalculatorService extends Remote {
    /**
    * Returns the same string passed as parameter * @param s a string
    * @return the same string passed as parameter */

    int add(int a, int b) throws RemoteException;

    int multiply(int a, int b) throws RemoteException;

    int subtract(int a, int b) throws RemoteException;

    int divide(int a, int b) throws RemoteException;

}