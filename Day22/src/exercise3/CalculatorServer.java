package exercise3;

/**
 * Created by Casper on 14/12/2016.
 */

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;


public class CalculatorServer extends UnicastRemoteObject implements CalculatorService {

    public CalculatorServer() throws RemoteException {
    // nothing to initialise for this server, but it is important
    // to declare that the constructor throws RemoteException

    }

    @Override
    public int add(int a, int b) {

        System.out.println("Client Requested add");

        return a + b;
    }

    @Override
    public int multiply(int a, int b){
        System.out.println("Client Requested multiply");

        return a * b;
    }

    @Override
    public int subtract(int a, int b){
        System.out.println("Client Requested subtract");

        return a - b;
    }

    @Override
    public int divide(int a, int b){
        System.out.println("Client Requested subtract");

        if(b == 0){
            return 0;
        }
        return a - b;
    }
}
