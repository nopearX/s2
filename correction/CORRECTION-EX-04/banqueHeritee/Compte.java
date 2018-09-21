package banqueHeritee;

public class Compte {
	private static final double SEUIL_SECURITE = 1000;

	protected int numero ; 
	protected double solde ; 
	protected Client proprietaire ;
	protected Banque banque ; 
	
	//--------------------------------
	// Méthodes créditer et débiter par défaut
	//--------------------------------
	public void crediter (double montant) {
		if (montant > 0)
			solde += montant ; 
	}
	
	public void debiter (double montant) {
		if (montant > 0 && solde >= montant)
			solde -= montant ; 
	}
	
	//--------------------------------
	// Accesseurs
	//--------------------------------
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
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
	 * Ajouter un test dans le setter de l’attribut solde : 
	 * si on essaye d’y mettre une nouvelle valeur qui est supérieure 
	 * à une constante SEUIL_SECURITE (que vous fixerez à 1000), 
	 * afficher un message « ATTENTION tentative d’affectation suspecte 
	 * d’un nouveau solde : compte no … » 
	 * et ne modifiez alors pas cet attribut
	 */
	public void setSolde(double solde) {
		if (solde > SEUIL_SECURITE) 
			System.out.println("ATTENTION tentative d’affectation suspecte d’un nouveau solde : compte no " + numero + " avec la valeur : " + solde);
		else
			this.solde = solde;
	}
}
