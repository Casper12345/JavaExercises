package exercise1;

/**
 * Created by Casper on 14/12/2016.
 */

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;


public class ServerLauncher {
    public static void main(String[] args) {
        ServerLauncher l = new ServerLauncher();
        l.launch();

    }

    private void launch() {

        try {
        // 1. Create the registry if there is not one
            LocateRegistry.createRegistry(1099);
        // 2. Create the server object
            EchoServer server = new EchoServer();
        // 3. Register (bind) the server object on the registy.
            // The registry may be on a different machine
            String registryAddress = "localhost";
            String registryUrl = "//" + registryAddress + "/"; String serviceName = "echo";
            Naming.rebind(registryUrl + serviceName, server);
            System.out.println("running");
        } catch (MalformedURLException ex) {
            System.out.println("Malformed Url");

        } catch (RemoteException ex) {
            System.out.println("Remote Exception");
        }

    }
}