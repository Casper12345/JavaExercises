package exercise4;


import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * An implementation of the echo service. */

public interface RemoteFileService extends Remote {

    String getRemoteFile(String filePath);

}