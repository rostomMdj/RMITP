package RMI;

import java.io.Serializable;

public class compteB implements Serializable{
	int ID;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	String nom;
	String prenom;
	int menton ;
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getMenton() {
		return menton;
	}
	public void setMenton(int menton) {
		this.menton += menton;
	}
	public compteB(int iD, String nom, String prenom, int menton) {
		super();
		ID = iD;
		this.nom = nom;
		this.prenom = prenom;
		this.menton = menton;
	}
	public compteB() {
		super();
	}
	

}
