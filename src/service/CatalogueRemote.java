package service;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

import RMI.compteB;

public interface CatalogueRemote extends Remote {
	
	public List <compteB> consulterCompteParKey(String key ) throws RemoteException;
	public List <compteB> consulter( ) throws RemoteException;
	public compteB consulterC(int id) throws RemoteException;
	public compteB ajout (int x,int y) throws RemoteException;
	public int convert (int x) throws RemoteException;

	

}
