 /* Une table est caractérisée par un nombre de pieds, 
 * une couleur (de type String) et un prix.
*/
public class Table {
	// cf aussi classe Color
	final static String ROUGE = "Rouge";
	final static String VERT = "Vert";
	final static String MARRON = "Marron";
	final static String NOIR = "Noir";
	
	// Attributs
	int nbPieds ; 
	String couleur ; 
	double prix ; 
	
	//--------------------------------------------
	// Constructeurs
	//--------------------------------------------
	/* Supprimez l’ancien constructeur qui n’avait pas de paramètres.  
	 * Essayez de créer un objet avec l’expression new Table().  Que remarquez-vous ?
	 * => Erreur de compilation :  The constructor Table() is undefined
	 */

	Table () {	
		nbPieds = 4 ;
	}
	
	Table (int nbPieds) {
		this.nbPieds = nbPieds ;
	}

	Table (int nbPieds, String couleur) {
		this(nbPieds);
		this.couleur = couleur ;
	}
	
	//--------------------------------------------
    public static void main (String args []) {
        // Erreur de compilation "The constructor Table() is undefined" 
        // si on a supprimé la version du constructeur sans paramètres
        Table t = new Table (); 
        
        System.out.println (t.nbPieds);
        System.out.println (t.couleur);
        System.out.println (t.prix);
        System.out.println ();
        
        Table t2 = new Table (3);
        System.out.println (t2.nbPieds);
        System.out.println (t2.couleur);
        System.out.println (t2.prix);
        System.out.println ();
        
        Table t3 = new Table (6, Table.NOIR);
        t3.prix = 100 ; 
        System.out.println (t3.nbPieds);
        System.out.println (t3.couleur);
        System.out.println (t3.prix);
        System.out.println ();
        
        Table t4 ; // ne pas faire = new Table(); 
        t4 = t3 ; 
        
        System.out.println("Prix de la table pointée par t4 : " 
        		+ t4.prix);
        System.out.println("Augmentation de 20%");
        t3.prix *= 1.2 ;
        System.out.println("Prix de la table pointée par t4 : " + 
        		t4.prix);   
        
        // Tableau d'objet (correspond à la version 1 du poly)
        int nbTables = 4;
    	Table tables [] = new Table [nbTables];
        tables [0] = t ; 
        tables [1] = t2 ; 
        tables [2] = t3 ; 
        
        // Parcourez les *4* cases du tableau, affichez le prix 
        // de chaque table pointée par la case du tableau 
        // et calculez le total des prix.
        double total = 0 ;
        for (int i = 0 ; i < nbTables ; i++) {
        	double p = tables[i].prix ;
        	System.out.println("Prix de la table d'indice " + i + " : " + p);
        	total += p ;
        }
        
        // ERREUR D'EXECUTION : Table [3] contient NULL : 
        // Exception in thread "main" java.lang.NullPointerException
    	// at Table.main(Table.java:78)

        // VERSION AVEC TEST
       double total2 = 0 ;
        for (int i = 0 ; i < nbTables ; i++) {
        	if (tables[i] != null) {
        		double p = tables[i].prix ;
        		System.out.println("Prix de la table d'indice " + i + " : " + p);
        		total2 += p ;
        	}
        }
     }   
}















