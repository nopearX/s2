
public class EXC {
	//------------------------------------------------------------------
	// Procedure tentant d'echanger 2 parametres char 
	// Resultat : les variables passées lors de l'appel ne sont pas modifiées
	//------------------------------------------------------------------
	static void echange (char a, char b) {
		char aux = b ; 
		b = a ; 
		a = aux ; 
		System.out.println ("durant l'appel apres echange : a = " + a + ", b = " + b);
	}
	
	public static void main(String[] args) {
		//------------------------------------------------------------------
		// Appel de la procedure tentant d'echanger 2 parametres entiers
		// (essayer d’échanger les valeurs de 2 variables de type char passées en paramètre (afficher leur valeur avant l’appel, pendant l’appel et après l’appel)
		//------------------------------------------------------------------
		char c1 = 'T';
		char c2 = 'U';
		System.out.println ("avant appel echange : c1 = " + c1 + ", c2 = " + c2);
		echange (c1, c2);
		System.out.println ("apres appel echange : c1 = " + c1 + ", c2 = " + c2);
		System.out.println ();
		
		//------------------------------------------------------------------
		// (essayer de mettre 150.7 dans la case de rang 1 d’un tableau 
		// de nombres réels passé en paramètre (idem afficher avant, pendant et après l’appel)
		//------------------------------------------------------------------
		float t[] = {2.5f, 11.7f, 13, 18};
		
		System.out.print ("avant modifierCaseTab : ");
		for (float valeur : t)
			System.out.print (valeur + "\t");
		System.out.println ();
		
		modifierCaseTab (t);
		
		System.out.print ("après modifierCaseTab : ");
		for (float valeur : t)
			System.out.print (valeur + "\t");
		System.out.println ();
		System.out.println ();
		
		//------------------------------------------------------------------
		// (essayer de modifier l’adresse d’un tableau de nombres réels 
		// passé en paramètres (idem affichage))
		//------------------------------------------------------------------
		System.out.print ("avant modifierAdresseTab : ");
		for (float valeur : t)
			System.out.print (valeur + "\t");
		System.out.println ();

		modifierAdresseTab (t);
		
		System.out.print ("après modifierAdresseTab : ");
		for (float valeur : t)
			System.out.print (valeur + "\t");
	}

	static void modifierAdresseTab(float[] t) {
		t = null ; 
	}

	static void modifierCaseTab(float[] t) {
		t[1] = 150.7f;
	}
}
