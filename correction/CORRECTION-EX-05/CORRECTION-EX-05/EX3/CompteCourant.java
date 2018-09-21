package EX3;

public class CompteCourant extends Compte {
	
	// Nb d'instances de la classe CompteCourant créées 
	// jusqu'à maintenant
	static int nbComptes ; 

	// Attributs de chaque CompteCourant
	private double seuilDecouvertAutorise ;

	//-------------------------------------------
	// CONSTRUCTEUR
	//-------------------------------------------
	public CompteCourant(double s, double seuil) {
		this();
		// solde = s;
		solde = s + s * Banque.tauxRemuneration ;
		
		seuilDecouvertAutorise = seuil ;
	}

	public CompteCourant() {
		// Incrémenter le nombre de comptes créés
		nbComptes ++ ; 
		
		// Fixer le numéro de CE compte
		numero = nbComptes ; 		
	}
	
	//------------------------------------------------
	// ACCESSEURS
	//------------------------------------------------
	public double getSeuilDecouvertAutorise() {
		return seuilDecouvertAutorise;
	}
	public void setSeuilDecouvertAutorise(double seuilDecouvertAutorise) {
		this.seuilDecouvertAutorise = seuilDecouvertAutorise;
	}

	//------------------------------------------------
	// AUTRES METHODES
	//------------------------------------------------
	public String toString() {
		return "CompteCourant [numero=" + numero + ", solde=" + solde + ", seuilDecouvertAutorise="
				+ seuilDecouvertAutorise + ", proprietaire=" + proprietaire + "]";
	}
	
	// METHODE debiter spécifique aux comptes courants
	public void debiter (double montant) {
		if (solde - montant >= -seuilDecouvertAutorise) {
			solde -= montant ; 
		}
		else System.out.println("debit impossible");
	}
	
	public static void main(String args[]) {
		// Créer un compte courant
		CompteCourant c = new CompteCourant ();
		c.seuilDecouvertAutorise = 500 ; 
		
		// Appeler une méthode de la classe mère
		System.out.println(c);
		c.crediter(200);
		System.out.println(c);
		c.debiter(1000);
		System.out.println(c);
	}

	// IMPLEMENTATION DES METHODES ABSTRAITES
	public void crediter(double montant) {
		solde += montant ; 
	}
}






