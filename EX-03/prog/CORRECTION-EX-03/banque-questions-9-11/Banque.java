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

		// Afficher les comptes des banques
		bnp.afficherComptes();
		lcl.afficherComptes();
		
		// Tester quelques méthodes
		System.out.println ("------------------------------");
		System.out.println ("Comptes du client Dupont :");
		bnp.afficherComptesClient ("Dupont");
		
		System.out.println ("------------------------------");
		System.out.println ("Proprietaire du compte no 2 dans la banque LCL : ");
		lcl.afficherProprietaireCompte (2);
	}
	//-------------------------------------------------
	// Ecrire une méthode qui, à partir d’un numéro de compte, 
	// affiche toutes les informations sur le propriétaire de ce compte
	//-------------------------------------------------
	public void afficherProprietaireCompte (int numeroCompte) {
		// Trouver le compte ayant ce numéro
		CompteCourant cc = getCompteCourantNumero (numeroCompte);

		// Afficher les infos sur le proprietaire de ce compte
		if (cc != null && cc.getProprietaire() != null)
			cc.getProprietaire().afficher();
	}

	//-------------------------------------------------
	// Trouver un compte à partir de son numéro
	//-------------------------------------------------
	public CompteCourant getCompteCourantNumero(int numeroCompte) {
		int i = 0 ; 
		while (i < nbcompteCourants) {
			if (compteCourants[i].getNumero() == numeroCompte) 
				return compteCourants[i];
			i++;
		}
		return null ;  // Il n'y a pas de compte ayant ce no	
	}

	//-------------------------------------------------
	// Trouver un client à partir de son nom
	//-------------------------------------------------
	public Client getClient (String nom) {
		int i = 0 ; 
		while (i < nbClients) {
			if (clients[i].getNom().equals(nom)) 
				return clients[i];
			i++;
		}
		return null ;  // Il n'y a pas de client à ce nom
	}
	//-------------------------------------------------
	// Ecrire les méthodes qui permettent d’afficher les informations sur tous les comptes d’un client spécifié par son nom (on supposera pour simplifier qu’il n’y a pas d’homonymes). 
	//-------------------------------------------------
	public void afficherComptesClient(String nomClient) {
		System.out.println ("Affichage des comptes de : " + 
				nomClient);

		// Trouver le client
		Client client = getClient (nomClient); 

		if (client != null)
			// Afficher tous les comptes de ce client 
			client.afficherComptes();
	}

	//-------------------------------------------------
	public void afficherComptes() {
		System.out.println("----------------------------");
		System.out.println("Banque " + nom);
		int i = 0 ; 
		while (i < nbcompteCourants) {
			compteCourants[i].afficher ();
			i++;
		}
		/* avec une boucle foreach 
		  for (CompteCourant c : compteCourants) {

			if (c != null) {
				c.afficher();
			}
		} */
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
