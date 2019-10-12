package RMI;

import java.rmi.*;

public interface information extends Remote {
	public String getInfo() throws RemoteException;
	

}
