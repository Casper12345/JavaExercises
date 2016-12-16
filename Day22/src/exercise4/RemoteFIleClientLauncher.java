package exercise4;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * Created by Casper on 14/12/2016.
 */

public class RemoteFIleClientLauncher {

    public static void main(String[] args) {
        RemoteFIleClientLauncher e = new RemoteFIleClientLauncher();
        e.sendRequestToServer();
    }

    public void sendRequestToServer(){

        try {
            String registryAdress = "127.0.0.1";
            Remote service = Naming.lookup("//" + registryAdress + ":1099/echo");
            RemoteFileService remoteFileService = (RemoteFileService) service;

            // recives request

            String receivedRemoteFile = remoteFileService.getRemoteFile("");
            System.out.println(receivedRemoteFile);




        } catch(NotBoundException ex) {
            System.out.println("Not bound");

        } catch (RemoteException ex){
            System.out.println("Remote");


        } catch (MalformedURLException ex){
            System.out.println("Malformed Url");

        }
    }
}
