public class Table {
	
	int nbPieds;
	String couleur;
	double prix;
	
	public Table() {
		nbPieds = 4;
		couleur = "marron";
		prix = 0.0;
	}
	
	public Table(int a) {
		nbPieds = a;
		couleur = "marron";
		prix = 0.0;
	}
	
	public Table(int a, String b) {
		nbPieds = a;
		couleur = b;
		prix = 0.0;
		}
	
	public static double augment(double a) {
		double b = a +((a*20)/100);
		return b;
	}
	
	public static double somme(double a)
	{
		return a/2;
	}
	public static void main(String[] args) {

	//EX A, B ---------------------------------------------------------------------------------
		Table t4;
		
		Table test = new Table();
		System.out.println(test.nbPieds);
		System.out.println(test.couleur);
		System.out.println(test.prix);
		
		Table t = new Table ();
		System.out.println ("\n" + t.nbPieds);
		System.out.println (t.couleur);
		System.out.println (t.prix);
		System.out.println ();
   	 
		Table t2 = new Table (3);
		System.out.println (t2.nbPieds);
		System.out.println (t2.couleur);
		System.out.println (t2.prix);
		System.out.println ();
   	 
		Table t3 = new Table (6, "NOIR");
    		System.out.println (t3.nbPieds);
    		System.out.println (t3.couleur);
    		System.out.println (t3.prix);
    		System.out.println ();

    		t4 = t3;
    		t3.prix = 1;
    		t3.prix = augment(t3.prix);
    		System.out.println(t4.prix + "\n");
    		
    		Table ta = t4;
    		Table ta1 = t;
    		Table ta2 = t2;
    		Table ta3 = t3;
    		
    		Table Tab[] = {ta, ta1, ta2, ta3};
    		
    		double somma = 0;
    		
    		for (int i = 0 ;  i < Tab.length ;  i++) 
    		{
    			somma = somma + Tab[i].prix;
    			System.out.println(Tab[i].prix);
    			
    		}
    		System.out.println("\n" + "La somme des prix est de : " + somma);
    		
	}
}
