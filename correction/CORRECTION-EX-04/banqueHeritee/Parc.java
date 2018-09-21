package banqueHeritee;

public class Parc {
	int nbArbres ; 
	String nom ; 
	boolean ouvert ; 
	int nbBancs ; 
	
	public String toString () {
		String s ; 
		s = "Nom : " + nom + "\n"; 
		s += "Nb Arbres : " + nbArbres + "\n";
		s += "Ouvert : " + ouvert + "\n"; 
		return s ;
	}
	public static void main(String[] args) {
		Parc p = new Parc ();
		p.nbArbres = 10 ; 
		p.nom = "East Cambridge";
		p.nbBancs = 30 ; 	
		System.out.println (p);
	}
}
