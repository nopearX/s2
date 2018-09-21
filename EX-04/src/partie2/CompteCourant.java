package partie2;


public class CompteCourant extends Compte {
 
	private double seuilDecouvertAutorise ;
	private Client proprietaire; 
	

	public String toString() {
		return "CompteCourant [numero=" + numero + 
				", solde=" + solde + 
				", seuilDecouvertAutorise="
				+ seuilDecouvertAutorise + 
				", proprietaire=" + proprietaire + "]";	
	}

	public CompteCourant(double s, double seuil) {
		// Mémoriser que l'on crée une instance en plus de cette classe
		cpt++ ; 
		this.numero = cpt;
		// Appeler le setter qui effectuera un test sur le solde
		setSolde (s);
		seuilDecouvertAutorise = seuil ;
	}
	
	public void afficher() {
		System.out.print("Compte Courant no " + numero + " - solde = " 
			+ solde);
		if (proprietaire != null)
			System.out.println(" - propriétaire : " + 
					proprietaire.getNom());
	} 
	
	public void crediter (double montant) {
		if (montant > 0) {
			double nouveauSolde ; 
			nouveauSolde = solde+montant+
					montant*Banque.getTauxRemuneration();
			setSolde (nouveauSolde); 
		}
	}
	
	public void debiter (double montant) {
		if (montant > 0)
			setSolde (solde-montant); 
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
	
	public Client getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}	
}





