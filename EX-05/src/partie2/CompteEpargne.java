package partie2;

/*
 * Un compte díÈpargne est reprÈsentÈ par un numero, un solde, un taux
 * díinteret et une rÈfÈrence vers le client propriÈtaire de ce compte. 
 */
public class CompteEpargne extends Compte {
	
	// Nb d'instances de la classe CompteEpargne crÈÈes 
	// jusqu'‡ maintenant
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
		// IncrÈmenter le nombre de comptes crÈÈs
		nbComptes ++ ; 
		
		// Fixer le numÈro de CE compte
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
	// METHODE crediter spÈcifique aux comptes courants
	public void crediter(double montant) {
		solde = solde + montant * (1 + tauxInteret); 
	}

	public String toString() {
		return "CompteEpargne [numero=" + numero + ", solde=" + solde + ", tauxInteret=" + tauxInteret + ", proprietaire=" + proprietaire + "]";
	}

	// IMPLEMENTATION DES METHODES ABSTRAITES
	public void debiter(double montant) {
		solde -= montant ;
	}
}
