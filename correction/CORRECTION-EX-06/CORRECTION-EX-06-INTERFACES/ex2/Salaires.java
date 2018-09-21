package ex2;

/* **********************************************************************
 *  La classe Employe
 * **********************************************************************/
abstract class Employe {
	protected String nom;
	protected String prenom;
	protected int age;
	protected String date; // ou int annee ;
	
	public Employe(String prenom, String nom, int age, String date) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.date = date;
	}
	public abstract double calculerSalaire();
	public String getNom() {
		return getTitre() + prenom + " " + nom;
	}
	public String getTitre(){
		return "L'employe " ;
	}
}

/* **********************************************************************
 *  La classe Commercial (regroupe Vendeur et Representant)
 * **********************************************************************/
abstract class Commercial extends Employe {
	protected double chiffreAffaire;

	public Commercial(String prenom, String nom, int age, String date,
			   double chiffreAffaire) {
		super(prenom, nom, age, date);
		this.chiffreAffaire = chiffreAffaire;
	}

	public double getChiffreAffaire()		{
			return chiffreAffaire;
		}
}

/* **********************************************************************
 *  La classe Vendeur
 * **********************************************************************/
class Vendeur extends Commercial {
	protected final static double POURCENTAGE = 0.2;
	protected final static int BONUS = 200;
	
	public Vendeur(String prenom, String nom, int age, String date,
			double chiffreAffaire) {
		super(prenom, nom, age, date, chiffreAffaire);
	}

	public double calculerSalaire() {
		return (POURCENTAGE * getChiffreAffaire()) + BONUS;
	}

	public String getTitre() 		{
			return "Le vendeur ";
		}
}

/* **********************************************************************
 *  La classe Representant
 * **********************************************************************/
class Representant extends Commercial {
    private final static double POURCENTAGE = 0.3;
	private final static int BONUS = 500;
	
	public Representant(String prenom, String nom, int age, String date, double chiffreAffaire) {
		super(prenom, nom, age, date, chiffreAffaire);
	}

	public double calculerSalaire() {
		return (POURCENTAGE * getChiffreAffaire()) + BONUS;
	}

	public String getTitre()
		{
			return "Le representant ";
		}
}

/* **********************************************************************
 *  La classe Technicien (Production)
 * **********************************************************************/
class Technicien extends Employe {
	private final static double FACTEUR_UNITE = 10;
	private int unites;

	public Technicien(String prenom, String nom, int age, String date, int unites) {
		super(prenom, nom, age, date);
		this.unites = unites;
	}

	public double calculerSalaire() {
		return FACTEUR_UNITE * unites;
	}

	public String getTitre()
		{
			return "Le technicien ";
		}
}

/* **********************************************************************
 *  La classe Manutentionnaire
 * **********************************************************************/
class Manutentionnaire extends Employe {
	private final static double SALAIRE_HORAIRE = 15.0;
	private int heures;

	public Manutentionnaire(String prenom, String nom, int age, String date,
					 int heures) {
		super(prenom, nom, age, date);
		this.heures = heures;
	}

	public double calculerSalaire() {
		return SALAIRE_HORAIRE * heures;
	}

	public String getTitre()
		{
			return "Le manutentionnaire " ;
		}
}

/*
 * Autres possibilités pour gérer les salariés à risque : 
 * Définir un booléen prendDesRisques 
 * dans les classes Technicien et Manutentionnaire 
 * => Inconvénient : on mélange les implémentations des a risques et des pas à risque
 * 
 * Définir deux sous classes concrètes TechnicienARisque et ManuARisque. 
 * => inconvénients
 * 1) Dupliquer la définition de la constante PRIME_RISQUE
 * 2) On ne peut pas bénéficier du polymorphisme pour gérer de manière homogène 
 * des salariés à risque : 
 * 	paramètre d'une méthode : statistiquesSecurite (SalaireARisque s)
 *  ou tableau de salarie à risque 
 */





/* **********************************************************************
 *  L'interface d'employes manipulant des produits à  risque
 *  
 *  Une autre possibilité serait de définir une interface Salarié 
 *  avec une méthode calculerSalaire()
 *  et que Employé implémente Salarié
 *  et que SalarieARisque implémente Salarié
 *  ce qui permettrait d'avoir la spécification de la méthode calculerSalaire()
 *  à un seul endroit : l'interface Salarie
 *  
 * **********************************************************************/
interface SalarieARisque {
	int PRIME_RISQUE = 200;
	public double calculerSalaire(); 
}

/* **********************************************************************
 *  Une premiere sous-classe d'employe a  risque
 * **********************************************************************/
class TechnARisque extends Technicien implements SalarieARisque {

	public TechnARisque(String prenom, String nom, int age, String date, int unites) {
		super(prenom, nom, age, date, unites);
	}

	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME_RISQUE;
	}
}

/* **********************************************************************
 *  Une autre sous-classe d'employe a  risque
 * **********************************************************************/
class ManutARisque extends Manutentionnaire implements SalarieARisque {
	
	public ManutARisque(String prenom, String nom, int age, String date, int heures) {
		super(prenom, nom, age, date, heures);
	}

	public double calculerSalaire() {
		return super.calculerSalaire() + PRIME_RISQUE;
	}
}

/* **********************************************************************
 *  La classe Personnel
 * **********************************************************************/
class Personnel {
	private Employe[] staff;
	private int nbreEmploye;
	private final static int MAXEMPLOYE = 200;

	public Personnel() {
		staff = new Employe[MAXEMPLOYE];
		nbreEmploye = 0;
	}

	public void ajouterEmploye(Employe e) {
		if (nbreEmploye <= MAXEMPLOYE) {
			++nbreEmploye;
			staff[nbreEmploye - 1] = e;
		} else {
			System.out.println("Pas plus de " + MAXEMPLOYE + " employÃ©s");
		}
	}

	public double salaireMoyen() {
		double somme = 0.0;
		for (int i = 0; i < nbreEmploye; i++) {
			somme += staff[i].calculerSalaire();
		}
		return somme / nbreEmploye;
	}

	public void afficherSalaires() {
		for (int i = 0; i < nbreEmploye; i++) {
			System.out.println(staff[i].getNom() + " gagne "
					+ staff[i].calculerSalaire() + " francs.");
		}
	}
}

// ======================================================================
class Salaires {
	public static void main(String[] args) {
		Personnel p = new Personnel();
		p.ajouterEmploye(new Vendeur("Pierre", "Business", 45, "1995", 30000));
		p.ajouterEmploye(new Representant("Leon", "Vendtout", 25, "2001", 20000));
		p.ajouterEmploye(new Technicien("Yves", "Bosseur", 28, "1998", 1000));
		p.ajouterEmploye(new Manutentionnaire("Jeanne", "Stocketout", 32, "1998", 45));
		p.ajouterEmploye(new TechnARisque("Jean", "Flippe", 28, "2000", 1000));
		p.ajouterEmploye(new ManutARisque("Al", "Abordage", 30, "2001", 45));
		p.afficherSalaires();
		System.out.println("Le salaire moyen dans l'entreprise est de "
				+ p.salaireMoyen() + " francs.");

		System.out.println ();
		System.out.println ("Gestion du personnel à risque");
		System.out.println ();
		
		SalarieARisque ear [] = new SalarieARisque[2];
		ear [0] = new TechnARisque ("Paul", "Martin", 0, null, 10);
		ear [1] = new ManutARisque ("Pierre", "Avads", 0, null, 20);
		
		// L'interface permet d'exploiter le polymorphisme
		for (SalarieARisque e: ear) {
			System.out.println (e.calculerSalaire());
		}
	}
}






