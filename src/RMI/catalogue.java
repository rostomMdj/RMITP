package RMI;

import java.util.ArrayList;
import java.util.List;

public class catalogue {
	List <compteB> comptes=new ArrayList<>();
	public catalogue (){
		comptes.add(new compteB(1,"martin","matin",5000));
		comptes.add(new compteB(2,"harry","potter",20000));
		comptes.add(new compteB(3,"michael ","scoffield",457100));
	}
	
public List<compteB> listeComptes(){
	return comptes;
}
public List<compteB> getListeParKey(String key ){
	List <compteB> cmpt =new ArrayList<compteB>();
	for(compteB c:comptes){
		if (c.getNom().indexOf(key)>0)
			cmpt.add(c);
		
	}
	return cmpt;
	
}

public compteB getCompte(int idc){
	for(compteB cpt:comptes){
		if(cpt.getID()==idc)
			return cpt;
	}
	return null;
}
}
