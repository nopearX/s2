package banqueHeritee;
//-----------------------------
// EX 3 
//-----------------------------

import java.util.ArrayList;

public class Banque {
	// Taux de r�mun�ration national fix� pour toutes les banques
	static double tauxRemuneration = 0.01 ;
	
	ArrayList <Compte> comptes ; 
		
	//-------------------------------------------------	
	public static void main(String[] args) {

		//---------------------------------------
		// ATTRIBUTS ET CONSTRUCTEURS
		//---------------------------------------
		Client clientDupont = new Client ("Dupont");
		Client clientDurand = new Client ("Durand");
		
		CompteCourant cDupont = new CompteCourant ();
		cDupont.setProprietaire(clientDupont) ;
		
		CompteCourant cDurand = new CompteCourant (1000, 2000);
		cDurand.setProprietaire(clientDurand) ;

		CompteCourant cDupont2 = new CompteCourant ();
		cDupont2.setProprietaire(clientDupont) ;

		CompteCourant cDurand2 = new CompteCourant (1000, 2000);
		cDurand2.setProprietaire(clientDurand) ;

		// ERREUR : the field CompteCourant.solde is not visible
		// cDurand.solde = 10000 ; 
		cDurand.setSolde(10000);

		//---------------------------------------
		// TABLEAUX D'OBJETS
		//---------------------------------------
		Banque banqueOrsay = new Banque (10);
		banqueOrsay.ajouterCompte (cDupont);
		banqueOrsay.ajouterCompte (cDurand2);
		banqueOrsay.ajouterCompte (cDupont2);
		
		Banque banqueBures = new Banque (5);
		banqueBures.ajouterCompte (cDurand);
		
		// Afficher les comptes de chaque banque
		banqueOrsay.afficherComptes ();
		banqueBures.afficherComptes ();
		
		// Afficher les informations sur tous les comptes d'un client
		banqueOrsay.afficherComptesClient ("Dupont");
		banqueOrsay.deposerCompte (1, 100);

		System.out.println("Affichage des comptes de banqueOrsay apres r�mun�ration");
		banqueOrsay.afficherComptes ();
		
		System.out.println("Nb de comptes cr��s : " + CompteCourant.getNbComptes());
		
		// Essayer de modifier les soldes de comptes
		System.out.println("Demande de modification du solde de cDupont avec la valeur 100");
		System.out.println("Avant l'appel � setSolde : solde = " + cDurand.getSolde());
		cDupont.setSolde(100);
		System.out.println("Apr�s l'appel � setSolde : solde = " + cDupont.getSolde());

		System.out.println("Demande de modification du solde de cDurand avec la valeur 2000");
		System.out.println("Avant l'appel � setSolde : solde = " + cDurand.getSolde());
		cDurand.setSolde(2000);
		System.out.println("Apr�s l'appel � setSolde : solde = " + cDurand.getSolde());

		// Cr�er un compte d'�pargne
		CompteEpargne ce = new CompteEpargne ();
		ce.setProprietaire(clientDupont) ;
		banqueOrsay.ajouterCompte (ce);

		// Afficher la banque
		System.out.println(banqueOrsay);
	}
	
	//-------------------------------------------------
	// Ecrire les m�thodes qui permettent d�afficher les informations sur tous les comptes d�un client sp�cifi� par son nom (on supposera pour simplifier qu�il n�y a pas d�homonymes). 
	//-------------------------------------------------
	public void afficherComptesClient(String nomClient) {
		System.out.println ("Affichage des comptes de : " + nomClient);
		
		// Pour tous les comptes 
		for (Compte c : comptes) {
			if (c != null) {
				if (c.getProprietaire().getNom().equals(nomClient)) {
					System.out.println ("Numero du compte : " + c.getNumero ());
					System.out.println ("Solde du compte : " + c.getSolde ());				
				}
			}
		}
	}

	//-------------------------------------------------
	// Ecrire une m�thode qui, � partir d�un num�ro de compte, 
	// affiche toutes les informations sur le propri�taire de ce compte	
	//-------------------------------------------------
	public void afficherClientCompte (int numeroCompte) {
		System.out.println ("Affichage du proprietaire du compte no : " + numeroCompte);
		for (Compte c : comptes) {
			if (c != null) {
				if (c.getNumero() == numeroCompte) {
					Client client = c.getProprietaire();
					System.out.println ("Nom du client : " + client.getNom());
					System.out.println ("Annee de naissance du client : " + client.getAnneeNaissance());

					// Revenir au programme appelant car on a trouv� 
					// le compte
					return ; 
				}
			}
		}
	}

	//-------------------------------------------------
	// D�poser un montant sur ce compte * taux de r�mun�ration	
	//-------------------------------------------------
	public void deposerCompte (int numeroCompte, double montant) {
		for (Compte c : comptes) {
			if (c != null) {
				if (c.getNumero() == numeroCompte) {
					c.crediter (montant + montant * tauxRemuneration);
					// Revenir au programme appelant car on a trouv� 
					// le compte
					return ; 
				}
			}
		}
	}

	//-------------------------------------------------
	public void afficherComptes() {
		for (Compte c : comptes) {
			if (c != null) {
				System.out.println ("Numero du compte : " + c.getNumero ());
				System.out.println ("Solde du compte : " + c.getSolde ());
			}
		}
}

	//-------------------------------------------------
	Banque (int nbMaxComptes) {
		comptes = new ArrayList <Compte> ();
	}

	//-------------------------------------------------
	// On SURCHARGE (OVERLOAD) la m�thode ajouter compte
	// elle existe maintenant avec diff�rents param�tres
	//-------------------------------------------------	
	public void ajouterCompte(Compte c) {
		comptes.add(c) ; 
	}
	

	// M�thode toString() g�n�r�e par Eclipse
	public String toString() {
		return "Banque [comptes=" + comptes + "]";
	}
	
}







