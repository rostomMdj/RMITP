package serveur;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

import service.ServeurCat;

public class ServeurRMI {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServeurCat od =new ServeurCat();
			LocateRegistry.createRegistry(1099);
			System.out.println(od.toString());
			Naming.rebind("rmi://localhost:1099/CATAL",od);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
