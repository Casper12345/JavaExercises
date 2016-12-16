package exercise3;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.Calendar;

/**
 * Created by Casper on 14/12/2016.
 */

public class CalculatorClientLauncher {

    public static void main(String[] args) {
        CalculatorClientLauncher e = new CalculatorClientLauncher();
        e.sendRequestToServer();
    }

    public void sendRequestToServer(){

        try {
            String registryAdress = "127.0.0.1";
            Remote service = Naming.lookup("//" + registryAdress + ":1099/echo");
            CalculatorService calculatorService = (CalculatorService) service;

            // recives request

            int receivedAdd = calculatorService.add(1,2);
            System.out.println(receivedAdd);

            int receivedSubtract = calculatorService.subtract(10,2);
            System.out.println(receivedSubtract);

            int receivedMultiply = calculatorService.multiply(12,2);
            System.out.println(receivedMultiply);

            int receivedDivide = calculatorService.divide(10,2);
            System.out.println(receivedDivide);


        } catch(NotBoundException ex) {
            System.out.println("Not bound");

        } catch (RemoteException ex){
            System.out.println("Remote");


        } catch (MalformedURLException ex){
            System.out.println("Malformed Url");

        }
    }
}
