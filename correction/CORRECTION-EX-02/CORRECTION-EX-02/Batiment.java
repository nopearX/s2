public class Batiment {
	static void initialiser () {
		System.out.println("init");
	}
	
	void afficher () {}; 
	
	public static void main(String[] args) {
		Batiment b = new Batiment ();

		// Erreur de compilation : 
		//  Cannot make a static reference to the non-static 
		// method afficher() from the type Batiment
		afficher ();

		
		// Warning : The static method initialiser() 
		// from the type Batiment should be accessed in a static way
		b.initialiser();
	}
}
