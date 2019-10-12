package RMI;

import java.net.InetAddress;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;
import java.rmi.UnknownHostException;
import java.rmi.server.UnicastRemoteObject;

public class informationIMPL extends UnicastRemoteObject implements information {

private static final long serialVersionUID = 2674880711467464646L;

protected informationIMPL() throws RemoteException {

super();
}


public String getInformation() throws RemoteException {

System.out.println("Invocation de la méthode getInformation()");

return "bonjour";
}

 
	public static void main(String[] args) throws java.net.UnknownHostException {
		// TODO Auto-generated method stub
		try {
			
			if (System.getSecurityManager() == null) {
	
			System.setSecurityManager(new RMISecurityManager());
			
			}
			

			informationIMPL informationImpl = new informationIMPL();
			
			String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/TestRMI";
			
			System.out.println("Enregistrement de l'objet avec l'url : " + url);
			
			Naming.rebind(url, informationImpl);
			
			 
			
			System.out.println("Serveur lancé");
			
			} catch (RemoteException e) {
			
			e.printStackTrace();
			
			} catch (MalformedURLException e) {
			
			e.printStackTrace();
			
			}
			
			}
	


	@Override
	public String getInfo() throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

}
