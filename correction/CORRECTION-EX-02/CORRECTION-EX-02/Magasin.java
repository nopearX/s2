public class Magasin {
	private static final int NB_MAX = 10;
	Table tables [] ; 
	int nbTables ; 

	//------------------------------
	Magasin () {
		tables = new Table [NB_MAX];
	}

	//------------------------------
	void ajouterTable (Table t) {
		tables [nbTables] = t ; 
		nbTables ++ ; 
	}

	//------------------------------
	double getPrixTotal () {
        double total = 0 ;
        for (int i = 0 ; i < NB_MAX ; i++) {
        	if (tables[i] != null) {
        		double p = tables[i].prix ;
        		total += p ;
        	}
        }
        return total ;
	}

	//------------------------------
	public static void main(String[] args) {
		// Créer un magasin
		Magasin m = new Magasin ();

		// Créer quelques tables et les ajouter au magasin
		Table t = new Table ();
		t.prix = 50 ; 
		m.ajouterTable(t);
		
		Table t2 = new Table (3);
		m.ajouterTable(t2);
		
		Table t3 = new Table (6, Table.NOIR);
		t3.prix = 100 ; 
		m.ajouterTable(t3);
		
		// Afficher le prix de toutes les tables 
		System.out.println(m.getPrixTotal());
		
		// Créer un autre magasin
		Magasin ikeaCorbeil = new Magasin ();
		
		// Appeler des méthodes sur ce 2ème magasin ...
	}
}
