package EX3;
//-----------------------------
// EX 3 
//-----------------------------

import java.util.ArrayList;
import java.util.Arrays;

public class Banque {
	// Taux de r�mun�ration national fix� pour toutes les banques
	static double tauxRemuneration = 0.01 ;
	
	// private CompteCourant [] comptesCourants ; 
	// private int nbComptesCourants ; 
	ArrayList <CompteCourant> comptesCourants ; 
	
	// private CompteEpargne [] comptesEpargnes ; 
	// private int nbComptesEpargne ; 
	ArrayList <CompteEpargne> comptesEpargnes ; 
	
	//-------------------------------------------------	
	public static void main(String[] args) {

		//---------------------------------------
		// ATTRIBUTS ET CONSTRUCTEURS
		//---------------------------------------
		
		// Cr�er un salari� client interne 
		// et verser son salaire
		CompteCourant cDupont = new CompteCourant ();
		Salarie clientDupont = new ClientInterne (2000.0, "Dupont", cDupont);
		System.out.println(cDupont);
		clientDupont.verserSalaire();
		System.out.println(cDupont);		

	}
	
	//-------------------------------------------------
	// Ecrire les m�thodes qui permettent d�afficher les informations sur tous les comptes d�un client sp�cifi� par son nom (on supposera pour simplifier qu�il n�y a pas d�homonymes). 
	//-------------------------------------------------
	public void afficherComptesClient(String nomClient) {
		System.out.println ("Affichage des comptes de : " + nomClient);
		
		// Pour tous les comptes courants
		for (CompteCourant c : comptesCourants) {
			if (c != null) {
				if (c.getProprietaire().getNom().equals(nomClient)) {
					System.out.println ("Numero du compte : " + c.getNumero ());
					System.out.println ("Solde du compte : " + c.getSolde ());				
				}
			}
		}
		
		// Pour tous les comptes �pargne
		for (CompteEpargne c : comptesEpargnes) {
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
		for (CompteCourant c : comptesCourants) {
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
		// Idem pour les comptes d'�pargne
		for (CompteEpargne c : comptesEpargnes) {
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
	public void deposerCompteCourant (int numeroCompte, double montant) {
		for (CompteCourant c : comptesCourants) {
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

	public void deposerCompteEpargne (int numeroCompte, double montant) {
		// Idem pour les comptes �pargne
		for (CompteEpargne c : comptesEpargnes) {
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
	
	// Pour les tableaux Arrays.toString affiche des crochets
	// Banque [comptesCourants=[CompteCourant [numero=1, solde=100.0, seuilDecouvertAutorise=0.0, proprietaire=Client [numero=1, nom=Dupont, anneeNaissance=0]], CompteCourant [numero=4, solde=1010.0, seuilDecouvertAutorise=2000.0, proprietaire=Client [numero=2, nom=Durand, anneeNaissance=0]], CompteCourant [numero=3, solde=0.0, seuilDecouvertAutorise=0.0, proprietaire=Client [numero=1, nom=Dupont, anneeNaissance=0]], CompteCourant [numero=3, solde=0.0, seuilDecouvertAutorise=0.0, proprietaire=Client [numero=1, nom=Dupont, anneeNaissance=0]], null, null, null, null, null, null], nbComptesCourants=4, comptesEpargnes=[null, null, null, null, null, null, null, null, null, null], nbComptesEpargne=0]
	// 


	//-------------------------------------------------
	public void afficherComptes() {
		for (CompteCourant c : comptesCourants) {
			if (c != null) {
				System.out.println ("Numero du compte : " + c.getNumero ());
				System.out.println ("Solde du compte : " + c.getSolde ());
			}
		}

		for (CompteEpargne c : comptesEpargnes) {
			if (c != null) {
				System.out.println ("Numero du compte : " + c.getNumero ());
				System.out.println ("Solde du compte : " + c.getSolde ());
			}
		}
}

	//-------------------------------------------------
	Banque (int nbMaxComptes) {
		comptesCourants = new ArrayList <CompteCourant> ();
		comptesEpargnes = new ArrayList <CompteEpargne> ();
	}

	//-------------------------------------------------
	// On SURCHARGE (OVERLOAD) la m�thode ajouter compte
	// elle existe maintenant avec diff�rents param�tres
	//-------------------------------------------------	
	public void ajouterCompte(CompteCourant c) {
		comptesCourants.add(c) ; 
	}
	
	public void ajouterCompte(CompteEpargne c) {
		comptesEpargnes.add(c) ; 
	}

	// M�thode toString() g�n�r�e par Eclipse
	public String toString() {
		return "Banque [comptesCourants=" + comptesCourants + 
				", comptesEpargnes=" + comptesEpargnes + "]";
	}
	
}







