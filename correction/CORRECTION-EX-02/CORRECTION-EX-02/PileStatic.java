// Une pile enti�rement static
// Ce n'est pas de la POO !
// Ce n'est pas bien ! 

// static devant un nom de m�thode : 
// cela signifie que ce n'est pas une m�thode d'objet
// => on n'a pas besoin de cr�er un objet pour l'appeler
// S'il n'y a pas static devant une m�thode : 
//      elle doit �tre appel�e sur un objet

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
	
	/* une m�thode static void empiler (int i, int j) qui permet d�empiler deux valeurs d�un seul coup
(on dit que la m�thode empiler est SURCHARGEE / OVERLOADED car elle existe en plusieurs versions avec diff�rents types ou nombres de param�tres) */
	static void empiler (int val, int val2) {
		empiler (val);
		empiler (val2);
	}
	
	//----------------------------------------------
	/* une m�thode void afficherSommet() 
	 * qui affiche la valeur actuellement sur le sommet de la pile */
	static void afficherSommet() {
		System.out.println("Valeur en haut de la pile : " + getSommet());
	}

	static int getSommet () {
		// Il faudrait tester qu'il y a une valeur
		return valeurs [nbValeurs-1];
	}
	
	public static void main(String[] args) {
		// Appeler des m�thodes 
		empiler (10);
		empiler (20, 30);
		afficherSommet();
	}
	
	// Est-ce que par exemple vous pouvez cr�er plusieurs piles 
	// (par exemple une pile de scores, une pile de nombre d�articles, � ) ? 
	// NON :-(
	
}





