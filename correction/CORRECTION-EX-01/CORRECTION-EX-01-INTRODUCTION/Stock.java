public class Stock {	
	public static void main(String[] args) {	
		//---------------------------------------
		// D�clarer les constantes
		//---------------------------------------
		final int NB_ARTICLES = 3 ; 

		//---------------------------------------
		// D�clarer les tableaux
		//---------------------------------------
		char [] codesArticles ; 
		double [] prix ; 
		
		//---------------------------------------
		// Allouer les tableaux
		//---------------------------------------
		codesArticles = new char [NB_ARTICLES]; 
		prix = new double [NB_ARTICLES]; 
			
		//---------------------------------------
		// Mettre des valeurs dans les cases
		//---------------------------------------
		codesArticles [0] = 'A'; prix [0] = 10.5;
		codesArticles [1] = 'B'; prix [1] = 2.5;
		codesArticles [2] = 'C'; prix [2] = 21.5;	
		
		//---------------------------------------
		// Parcours des deux tableaux avec deux boucles foreach
		//---------------------------------------
		System.out.println ("Parcours successif des tableaux avec deux boucle foreach : ");
		
		// Port�e de la variable code : l'instruction for dans lequel elle est d�clar�e
		// (apr�s le for elle n'est plus connue)
		for (char code : codesArticles)
			System.out.print (code + "\t");
		
		System.out.println();
		
		for (double p : prix)
			System.out.print (p + "\t");
		System.out.println();
		System.out.println();
		
		//---------------------------------------
		// Parcours des deux tableaux en parall�le avec une boucle while et un booleen
		//---------------------------------------
		boolean fini = false ; 
		int i = 0 ; 
		System.out.println ("Parcours des deux tableaux en parall�le avec une boucle while et un booleen : ");
		while (! fini) {
			System.out.println (codesArticles[i] + " - " + prix [i] + " Euros");
			i++ ; 
			fini = i == codesArticles.length ;
		}
		

		
	}
}
