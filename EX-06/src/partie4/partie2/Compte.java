package partie4.partie2;   

public interface Compte {
	static final double SEUIL_SECURITE =1000;
	//--------------------------------
	// MÈthodes crÈditer et dÈbiter ABSTRAITES
	//--------------------------------s
	public abstract void crediter (double montant);
	
	public abstract void debiter (double montant) ;
	
	//--------------------------------
	// Accesseurs
	//--------------------------------
	public abstract int getNumero();
		
	public abstract void setNumero(int numero) ;
	public abstract double getSolde();
	

	public abstract Client getProprietaire();
	
	public abstract void setProprietaire(Client proprietaire); 
	
	
	/*
	 * Ajouter un test dans le setter de l'attribut solde : 
	 * si on essaye d'y mettre une nouvelle valeur qui est supÈrieure 
	 * ‡ une constante SEUIL_SECURITE (que vous fixerez ‡ 1000), 
	 * afficher un message ´ ATTENTION tentative d'affectation suspecte 
	 * d'un nouveau solde : compte no Ö ª 
	 * et ne modifiez alors pas cet attribut
	 */
	public abstract void setSolde(double solde); 
	
	
}
