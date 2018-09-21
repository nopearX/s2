package partie2;

//Un compte d��pargne est repr�sent� par un numero, un solde, un taux d�interet (qui varie selon chaque compte) et une r�f�rence vers le client propri�taire de ce compte. Cr�ez la classe CompteEpargne. Ajoutez la gestion d�un tableau de comptes d��pargne dans la banque. 
public class CompteEpargne extends Compte {
	 
	private Client proprietaire ; 
	private double tauxInteret ; 
	
	public CompteEpargne (double s, double tauxInteret) {
		// M�moriser que l'on cr�e une instance en plus de cette classe
		cpt++ ; 
		this.numero = cpt;
		// Appeler le setter qui effectuera un test sur le solde
		setSolde (s);
		
		this.tauxInteret = tauxInteret ; 
	}	
	
	public void afficher() {
		System.out.print("Compte Epargne no " + numero + " - solde = " 
			+ solde);
		if (proprietaire != null)
			System.out.println(" - propri�taire : " + 
					proprietaire.getNom());
	} 

	public void crediter (double montant) {
		if (montant > 0) {
			double nouveauSolde ; 
			nouveauSolde = solde+montant+
					montant*Banque.getTauxRemuneration() +
					montant*tauxInteret;
			setSolde (nouveauSolde); 
		}
	}
	
	public void debiter (double montant) {
		if (montant > 0 && solde-montant > 0)
			setSolde (solde-montant); 
	}
	
	//------------------------------------------------
	// ACCESSEURS
	//------------------------------------------------
	public static int getCpt() {
		return cpt;
	}

	public static void setCpt(int cpt) {
		CompteEpargne.cpt = cpt;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	private void setSolde(double solde) {
		this.solde = solde;
	}

	public Client getProprietaire() {
		return proprietaire;
	}

	public void setProprietaire(Client proprietaire) {
		this.proprietaire = proprietaire;
	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}	
}








