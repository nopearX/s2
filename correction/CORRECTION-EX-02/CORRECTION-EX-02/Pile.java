
public class Pile {
	private static final int NB_MAX = 100;
	int [] valeurs ; 
	int nbValeurs ; 
	
	Pile () {
		valeurs = new int [NB_MAX] ; 
	}
	
	//----------------------------------------------
	void empiler (int val) {
		// Il faudrait tester qu'il reste de la place
		valeurs[nbValeurs] = val ; 
		nbValeurs ++ ;
	}
	
	/* une méthode static void empiler (int i, int j) qui permet d’empiler deux valeurs d’un seul coup
(on dit que la méthode empiler est SURCHARGEE / OVERLOADED car elle existe en plusieurs versions avec différents types ou nombres de paramètres) */
	void empiler (int val, int val2) {
		empiler (val);
		empiler (val2);
	}
	
	//----------------------------------------------
	/* une méthode void afficherSommet() qui affiche la valeur actuellement sur le sommet de la pile */
	void afficherSommet() {
		System.out.println("Valeur en haut de la pile : " + getSommet());
	}

	int getSommet () {
		// Il faudrait tester qu'il y a une valeur
		return valeurs [nbValeurs-1];
	}
	
	public static void main(String[] args) {
		// Créer plusieurs piles et empiler des valeurs
		Pile scores = new Pile(); 
		scores.empiler (100);
		scores.empiler (25);
		
		Pile articles = new Pile(); 
		articles.empiler (1000);
		articles.empiler (4500);
		articles.empiler (22000);

		// Afficher le sommet des piles
		System.out.println(scores.getSommet());
		System.out.println(articles.getSommet());
	}
}




