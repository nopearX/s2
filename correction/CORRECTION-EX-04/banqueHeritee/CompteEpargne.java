package banqueHeritee;

/*
 * Un compte d’épargne est représenté par un numero, un solde, un taux
 * d’interet et une référence vers le client propriétaire de ce compte. 
 */
public class CompteEpargne extends Compte {
	
	// Nb d'instances de la classe CompteEpargne créées 
	// jusqu'à maintenant
	private static int nbComptes ; 

	// Attributs de chaque CompteEpargne
	private double tauxInteret ;

	//-------------------------------------------
	// CONSTRUCTEUR
	//-------------------------------------------
	public CompteEpargne() {
		// Incrémenter le nombre de comptes créés
		nbComptes ++ ; 
		
		// Fixer le numéro de CE compte
		numero = nbComptes ; 		
	}
	
	public CompteEpargne(double s, double taux) {
		this();
		// solde = s;
		solde = s + s * Banque.tauxRemuneration ;
		
		tauxInteret = taux ;
	}
	
	//------------------------------------------------
	// ACCESSEURS
	//------------------------------------------------
	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	} 
	
	//------------------------------------------------
	// AUTRES METHODES
	//------------------------------------------------
	// METHODE crediter spécifique aux comptes courants
	public void crediter(double montant) {
		solde = solde + montant * (1 + tauxInteret); 
	}

	public String toString() {
		return "CompteEpargne [numero=" + numero + ", solde=" + solde + ", tauxInteret=" + tauxInteret
				+ ", proprietaire=" + proprietaire + "]";
	}

	public static int getNbComptes() {
		return nbComptes;
	}

	public static void setNbComptes(int nbComptes) {
		CompteEpargne.nbComptes = nbComptes;
	}
}
