package partie4.partie2;

public class CompteCourant implements Compte {
	
	
	private int numero;
	private double solde;
	private Client proprietaire;
	// Nb d'instances de la classe CompteCourant crÈÈes 
	// jusqu'‡ maintenant
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
		// IncrÈmenter le nombre de comptes crÈÈs
		nbComptes ++ ; 
		
		// Fixer le numÈro de CE compte
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
		return "CompteCourant [numero=" + numero + ", solde=" + solde + ", seuilDecouvertAutorise=" + seuilDecouvertAutorise + ", proprietaire=" + proprietaire + "]";
	}
	
	// METHODE debiter spÈcifique aux comptes courants
	public void debiter (double montant) {
		if (solde - montant >= -seuilDecouvertAutorise) {
			solde -= montant ; 
		}
		else System.out.println("debit impossible");
	}
	
	public static void main(String args[]) {
		// CrÈer un compte courant
		CompteCourant c = new CompteCourant ();
		c.seuilDecouvertAutorise = 500 ; 
		
		// Appeler une mÈthode de la classe mËre
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

	@Override
	public int getNumero() {
		// TODO Auto-generated method stub
		return numero;
	}

	@Override
	public void setNumero(int numero) {
		// TODO Auto-generated method stub
		this.numero = numero;
	}

	@Override
	public double getSolde() {
		// TODO Auto-generated method stub
		return solde;
	}

	@Override
	public Client getProprietaire() {
		// TODO Auto-generated method stub
		return proprietaire;
	}

	@Override
	public void setProprietaire(Client proprietaire) {
		// TODO Auto-generated method stub
		this.proprietaire = proprietaire;
	}

	@Override
	public void setSolde(double solde) {
		// TODO Auto-generated method stub
		if (solde > SEUIL_SECURITE) {
			System.out.println("Attention tentative d'affectation suspecte d'un nouveau solde : compte no " + numero + " avec la valeur " + solde);
		}
		this.solde = solde;
	}
}






