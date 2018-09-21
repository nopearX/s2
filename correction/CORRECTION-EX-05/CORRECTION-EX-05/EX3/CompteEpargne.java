package EX3;

/*
 * Un compte d��pargne est repr�sent� par un numero, un solde, un taux
 * d�interet et une r�f�rence vers le client propri�taire de ce compte. 
 */
public class CompteEpargne extends Compte {
	
	// Nb d'instances de la classe CompteEpargne cr��es 
	// jusqu'� maintenant
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
		// Incr�menter le nombre de comptes cr��s
		nbComptes ++ ; 
		
		// Fixer le num�ro de CE compte
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
	// METHODE crediter sp�cifique aux comptes courants
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
