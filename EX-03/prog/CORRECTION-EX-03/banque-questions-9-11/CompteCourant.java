package banque ;
public class CompteCourant {
	private static final double SEUIL_SECURITE = 1000;
	private int numero ; 
	private double solde ; 
	private double seuilDecouvertAutorise ;
	private Client proprietaire ; 
	
	public Client getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	public CompteCourant(int numero, double s, double seuil) {
		this.numero = numero;
		// Appeler le setter qui effectuera un test sur le solde
		setSolde (s);
		seuilDecouvertAutorise = seuil ;
	}
	
	//------------------------------------------------
	// ACCESSEURS
	//------------------------------------------------
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public double getSolde() {
		return solde;
	}
	
	// Setter pour le solde avec un test de sécurité
	public void setSolde(double solde) {
		if (solde > SEUIL_SECURITE)
			System.out.println ("ATTENTION tentative d'affectation suspecte d'un nouveau solde : compte no "+ 
					numero + " nouvelle valeur essayee " + solde);
		else
			this.solde = solde;
	}
	
	public double getSeuilDecouvertAutorise() {
		return seuilDecouvertAutorise;
	}
	public void setSeuilDecouvertAutorise(double seuilDecouvertAutorise) {
		this.seuilDecouvertAutorise = seuilDecouvertAutorise;
	} 
	
	public void afficher() {
		System.out.print("Compte no " + numero + " - solde = " 
			+ solde);
		if (proprietaire != null)
			System.out.println(" - propriétaire : " + 
					proprietaire.getNom());
	} 	
}





