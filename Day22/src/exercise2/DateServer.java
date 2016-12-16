package exercise2;

/**
 * Created by Casper on 14/12/2016.
 */
import org.intellij.lang.annotations.MagicConstant;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Calendar;
import java.util.Date;


public class DateServer extends UnicastRemoteObject implements DateService {

    public DateServer() throws RemoteException {
    // nothing to initialise for this server, but it is important
    // to declare that the constructor throws RemoteException

    }

    @Override
    public Calendar calendar() {
        // This println() is not necessary, but helps verifying whether
        // the server has received the call or not on the remote machine
        System.out.println("Client Requested Calendar");

        Calendar calendar = Calendar.getInstance();

        calendar.set(2016,Calendar.DECEMBER,14);

        return calendar;
    }
}
