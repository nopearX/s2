package partie2;

public abstract class Compte {
	private static final double SEUIL_SECURITE = 1000;
	protected int numero ; 
	protected double solde ; 
	protected Client proprietaire ;
	
	//--------------------------------
	// MÈthodes crÈditer et dÈbiter ABSTRAITES
	//--------------------------------
	public abstract void crediter (double montant);
	
	public abstract void debiter (double montant) ;
	
	//--------------------------------
	// Accesseurs
	//--------------------------------
	public int getNumero() {
		debiter (100); // ON A LE DROIT D'APPELER UNE METHODE ABSTRAITE !
		return numero;
	}
	public void setNumero(int numero) { // le void ne retourne rien
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}

	public Client getProprietaire() {
		return proprietaire;
	}
	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	} 
	
	/*
	 * Ajouter un test dans le setter de l'attribut solde : 
	 * si on essaye d'y mettre une nouvelle valeur qui est supÈrieure 
	 * ‡ une constante SEUIL_SECURITE (que vous fixerez ‡ 1000), 
	 * afficher un message ´ ATTENTION tentative d'affectation suspecte 
	 * d'un nouveau solde : compte no Ö ª 
	 * et ne modifiez alors pas cet attribut
	 */
	public void setSolde(double solde) {
		if (solde > SEUIL_SECURITE) 
			System.out.println("ATTENTION tentative d'affectation suspecte d'un nouveau solde : compte no " + numero + " avec la valeur : " + solde);
		else
			this.solde = solde;
	}
	
}
