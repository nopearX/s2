package EX3;

/*
 * Un compte d’épargne est représenté par un numero, un solde, un taux
 * d’interet et une référence vers le client propriétaire de ce compte. 
 */
public class CompteEpargne extends Compte {
	
	// Nb d'instances de la classe CompteEpargne créées 
	// jusqu'à maintenant
	static int nbComptes ; 

	// Attributs de chaque CompteEpargne
	private double tauxInteret ;

	//-------------------------------------------
	// CONSTRUCTEUR
	//-------------------------------------------
	public CompteEpargne(double s, double taux) {
		this();
		// solde = s;
		solde = s + s * Banque.tauxRemuneration ;
		
		tauxInteret = taux ;
	}

	public CompteEpargne() {
		// Incrémenter le nombre de comptes créés
		nbComptes ++ ; 
		
		// Fixer le numéro de CE compte
		numero = nbComptes ; 		
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

	// IMPLEMENTATION DES METHODES ABSTRAITES
	public void debiter(double montant) {
		solde -= montant ;
	}
}
