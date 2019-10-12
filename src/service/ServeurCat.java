package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;

import RMI.catalogue;
import RMI.compteB;

public class ServeurCat extends UnicastRemoteObject implements  CatalogueRemote{
public catalogue metier;
	public ServeurCat() throws RemoteException {
		metier =new catalogue();
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<compteB> consulterCompteParKey(String key)
			throws RemoteException {
		// TODO Auto-generated method stub
		return metier.getListeParKey(key);
	}

	
	

	

	@Override
	public List<compteB> consulter() throws RemoteException {
		// TODO Auto-generated method stub
		return metier.listeComptes();
	}

	@Override
	public compteB ajout(int x, int y) throws RemoteException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int convert(int x) throws RemoteException {
		// TODO Auto-generated method stub
		return x/134;
	}

	@Override
	public compteB consulterC(int id) throws RemoteException {
		// TODO Auto-generated method stub
		return  metier.getCompte(id);
	}
	

}
