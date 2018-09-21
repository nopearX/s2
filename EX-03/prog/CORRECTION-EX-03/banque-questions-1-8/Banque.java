//-----------------------------
// EX 3 
//-----------------------------
package banque ;

public class Banque {
	private String nom ;
	private Client [] clients ; 
	private int nbClients ; 
	private final int nbMaxClients ;

	private CompteCourant [] compteCourants ; 
	private int nbcompteCourants ; 
	private final int nbMaxcompteCourants ;

	//-------------------------------------------------
	public static void main (String args []) {
		
		// Créer deux banques
		Banque bnp = new Banque (100, 100);
		bnp.setNom("BNP");
		Banque lcl = new Banque (200, 50);
		lcl.setNom("LCL");
		
		// Créer des clients et les ajouter aux banques
		Client clientDupont = new Client ("Dupont");
		Client clientDurand = new Client ("Durand");
		bnp.ajouterClient(clientDupont);
		lcl.ajouterClient(clientDurand);
		
		// Créer les comptes
		CompteCourant cDupont = new CompteCourant (1, 0, 0);
		CompteCourant cDurand = new CompteCourant (2, 1000, 2000);
		CompteCourant cDupont2 = new CompteCourant (3, 0, 0);
		CompteCourant cDurand2 = new CompteCourant (4, 100, 50);
		
		// Affecter le client à chaque compte
		cDupont.setProprietaire(clientDupont) ;		
		cDurand.setProprietaire(clientDurand) ;
		cDupont2.setProprietaire(clientDupont) ;
		cDurand2.setProprietaire(clientDurand) ;		

		// Ajouter les comptes aux clients
		clientDupont.ajouterCompteCourant(cDupont);
		clientDupont.ajouterCompteCourant(cDupont2);
		clientDurand.ajouterCompteCourant(cDurand);
		clientDurand.ajouterCompteCourant(cDurand2);		
		
		// Ajouter les comptes à la banque
		bnp.ajouterCompteCourant(cDupont);
		bnp.ajouterCompteCourant(cDupont2);
		lcl.ajouterCompteCourant(cDurand);
		lcl.ajouterCompteCourant(cDurand2);		
	}
	
	//-------------------------------------------------
	// Constructeur avec un paramètre indiquant le nb max de clients
	// et de comptes pour CETTE banque
	Banque (int nbMaxClients, int nbMaxcompteCourants) {
		clients = new Client [nbMaxClients];
		this.nbMaxClients = nbMaxClients ;
		
		compteCourants = new CompteCourant [nbMaxcompteCourants];
		this.nbMaxcompteCourants = nbMaxcompteCourants ;
	}

	//-------------------------------------------------
	public void ajouterClient(Client c) {
		clients [nbClients] = c ; 
		nbClients ++ ; 
	}

	//-------------------------------------------------
	public void ajouterCompteCourant(CompteCourant cc) {
		compteCourants [nbcompteCourants] = cc ; 
		nbcompteCourants ++ ; 
	}

	//-------------------------------------------------
	// ACCESSEURS
	//-------------------------------------------------
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Client[] getClients() {
		return clients;
	}

	public void setClients(Client[] clients) {
		this.clients = clients;
	}

	public int getNbClients() {
		return nbClients;
	}

	public void setNbClients(int nbClients) {
		this.nbClients = nbClients;
	}

	public int getNbMaxClients() {
		return nbMaxClients;
	}

	public CompteCourant[] getCompteCourants() {
		return compteCourants;
	}

	public void setCompteCourants(CompteCourant[] compteCourants) {
		this.compteCourants = compteCourants;
	}

	public int getNbcompteCourants() {
		return nbcompteCourants;
	}

	public void setNbcompteCourants(int nbcompteCourants) {
		this.nbcompteCourants = nbcompteCourants;
	}
}
