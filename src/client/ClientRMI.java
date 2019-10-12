package client;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.List;
import java.util.Scanner;

import RMI.compteB;

import service.CatalogueRemote;

public class ClientRMI {

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			CatalogueRemote stub=(CatalogueRemote)Naming.lookup("rmi://localhost:1099/CATAL");
			
			System.out.println("จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ WELCOME จจจจจจจจจจจจจจจจจจจจจจจจจจจจจจ ");
System.out.println("pour consulter tous les comptes tappez 1 "+"\n");	
System.out.println("pour consulter un compte tappez 2 "+"\n");			
System.out.println("pour consulter un compte a partir d'un mot cl้ tappez 3"+"\n");			
System.out.println("pour modifier un menton tappez  4 "+"\n");
System.out.println("pour convertir un menton dans  un compte  tappez 5 "+"\n");			
			
			Scanner sc=new Scanner (System.in);
			
			int choix=sc.nextInt();
			switch(choix){
			case 1 :
				List <compteB> bnp=stub.consulter();
				for(compteB c:bnp){
					System.out.println(c.getNom()+"---"+c.getPrenom()+"---"+c.getMenton()+"DA");
				}
				break;
			case 2:
				System.out.println("Donnez l'ID de votre Compte ");
				Scanner sc1 =new Scanner(System.in);
				int x=sc1.nextInt();
				compteB cnep=stub.consulterC(x);
					System.out.println(cnep.getNom()+"---"+cnep.getPrenom());
				
				break;
			case 3:
				System.out.println("Donnez un mot cl้");
				Scanner sc2 =new Scanner(System.in);
				String s2=sc2.nextLine();
				List <compteB> AGB=stub.consulterCompteParKey(s2);
				for(compteB c:AGB){
					System.out.println(c.getNom()+"---"+c.getPrenom());
				}
				break;
				
			case 4:
				List <compteB> societeGenerale=stub.consulter();
				for(compteB c:societeGenerale){
					if(c.getNom().equals("martin")){
						c.setMenton(-200);
						System.out.println(c.getNom()+"--"+"menton avant"+(c.getMenton()+200)+"menton apres "+c.getMenton());

					}
				}
				break;
				
			case 5:
				
				List <compteB> BNA=stub.consulter();

				for(compteB c:BNA){
					if(c.getNom().equals("martin")){
						
						int z=stub.convert(c.getMenton());
					System.out.println("menton en Euro " +c.getMenton()+ "€" + "--" +"menton en DZ"+"\n"+ z + "DA");

					}
				}
				
			}
			
			
			
			

		} catch (MalformedURLException | RemoteException | NotBoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
