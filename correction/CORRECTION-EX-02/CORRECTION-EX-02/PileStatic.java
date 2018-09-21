// Une pile entièrement static
// Ce n'est pas de la POO !
// Ce n'est pas bien ! 

// static devant un nom de méthode : 
// cela signifie que ce n'est pas une méthode d'objet
// => on n'a pas besoin de créer un objet pour l'appeler
// S'il n'y a pas static devant une méthode : 
//      elle doit être appelée sur un objet

// static devant un nom de variable 
// cela signifie que ce n'est pas une variable d'objet
// => il n'y en a qu'une pour toute la classe

public class PileStatic {
	private static final int NB_MAX = 100;
	static int [] valeurs = new int [NB_MAX] ; 
	static int nbValeurs ; 
	
	//----------------------------------------------
	static void empiler (int val) {
		// Il faudrait tester qu'il reste de la place
		valeurs[nbValeurs] = val ; 
		nbValeurs ++ ;
	}
	
	/* une méthode static void empiler (int i, int j) qui permet d’empiler deux valeurs d’un seul coup
(on dit que la méthode empiler est SURCHARGEE / OVERLOADED car elle existe en plusieurs versions avec différents types ou nombres de paramètres) */
	static void empiler (int val, int val2) {
		empiler (val);
		empiler (val2);
	}
	
	//----------------------------------------------
	/* une méthode void afficherSommet() 
	 * qui affiche la valeur actuellement sur le sommet de la pile */
	static void afficherSommet() {
		System.out.println("Valeur en haut de la pile : " + getSommet());
	}

	static int getSommet () {
		// Il faudrait tester qu'il y a une valeur
		return valeurs [nbValeurs-1];
	}
	
	public static void main(String[] args) {
		// Appeler des méthodes 
		empiler (10);
		empiler (20, 30);
		afficherSommet();
	}
	
	// Est-ce que par exemple vous pouvez créer plusieurs piles 
	// (par exemple une pile de scores, une pile de nombre d’articles, … ) ? 
	// NON :-(
	
}





