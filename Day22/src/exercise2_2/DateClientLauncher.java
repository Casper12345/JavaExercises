package exercise2_2;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * Created by Casper on 14/12/2016.
 */

public class DateClientLauncher {

    public static void main(String[] args) {
        DateClientLauncher e = new DateClientLauncher();
        e.sendEchoToServer();
    }

    public void sendEchoToServer(){

        try {
            String registryAdress = "127.0.0.1";
            Remote service = Naming.lookup("//" + registryAdress + ":1099/echo");
            DateService dateService = (DateService) service;

            Calendar receivedDate = dateService.calendar();
            System.out.println(receivedDate.getTime());


        } catch(NotBoundException ex) {
            System.out.println("Not bound");

        } catch (RemoteException ex){
            System.out.println("Remote");


        } catch (MalformedURLException ex){
            System.out.println("Malformed Url");

        }
    }
}
