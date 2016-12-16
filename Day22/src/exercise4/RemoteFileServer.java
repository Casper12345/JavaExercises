package exercise4;

/**
 * Created by Casper on 14/12/2016.
 */

import java.io.*;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;


public class RemoteFileServer extends UnicastRemoteObject implements RemoteFileService {

    public RemoteFileServer() throws RemoteException {
    // nothing to initialise for this server, but it is important
    // to declare that the constructor throws RemoteException

    }

    @Override
    public String getRemoteFile(String filePath){

        File fileHandler = new File("./" + filePath);

        StringBuilder stringToReturn = new StringBuilder();

        if (fileHandler.exists()) {
            try {
                BufferedReader in = new BufferedReader(new FileReader("./" + filePath));

                String line;


                return "File not Found";

                while ((line = in.readLine()) != null) {
                    return stringToReturn.toString();
                }

            }

            } catch (FileNotFoundException ex) {
                 return "File not found";

            } catch (IOException ex) {
                return "IO exception caught.";
            }

        } else {

            return "This file does not exist";
        }



    }
}
