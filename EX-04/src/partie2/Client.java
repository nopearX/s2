package partie2;

//Cette classe permet de représenter les clients d'une banque.
//------------------------------------------------------------


public class Client {
	final static int NB_COMPTES_MAX_PAR_CLIENT = 15 ;

	//---------------------------
	// ATTRIBUTS
	//---------------------------
	private String nom ; 
	private CompteCourant compteCourants [] ; 
	private int nbcompteCourants ; 
	
	//---------------------------
	public Client(String nom) {
		this.nom = nom;
		// Allouer le tableau de comptes pour ce client
		compteCourants = new CompteCourant [NB_COMPTES_MAX_PAR_CLIENT];
	}
	
	//---------------------------
	public void ajouterCompteCourant(CompteCourant cc) {
		compteCourants [nbcompteCourants] = cc ; 
		nbcompteCourants ++ ; 
	}
	
	//---------------------------
	public void afficherComptes() {
		System.out.println("----------------------------");
		System.out.println("Client " + nom);
		int i = 0 ; 
		while (i < nbcompteCourants) {
			compteCourants[i].afficher ();
			i++;
		}
	}
	
	//---------------------------
	// ACCESSEURS
	//---------------------------
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public CompteCourant[] getComptes() {
		return compteCourants;
	}

	public void setComptes(CompteCourant[] comptes) {
		this.compteCourants = compteCourants;
	}

	public int getNbComptes() {
		return nbcompteCourants;
	}

	public void setNbComptes(int nbComptes) {
		this.nbcompteCourants = nbComptes;
	}

	public void afficher() {
		System.out.println("Client : " + nom + 
				" Nb de comptes : " + nbcompteCourants);	
	}	
}







