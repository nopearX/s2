package EX3;

public class Client {

	public String toString() {
		return "Client [numero=" + numero + ", nom=" + nom + ", anneeNaissance=" + anneeNaissance + "]";
	}
	private static int nbClients ; 
	private int numero ; 
	
	private String nom ; 
	private int anneeNaissance ;
	
	public static void main (String args []) {
		Client c1 = new Client ("Petri");
		Client c2 = new Client ("Oups");
		
		System.out.println ("Client " + c1);

		System.out.println ("Client " + c1.getNom() + " : no = " + c1.numero);
		System.out.println ("Client " + c2.getNom() + " : no = " + c2.numero);
		System.out.println ("Nb de clients cr��s : " + nbClients);
	}
	
	public Client(String nom) {
		// Incr�menter le nombre de clients cr��s
		nbClients ++ ; 
		
		// Fixer le num�ro de CE client
		numero = nbClients ; 
		
		this.nom = nom ;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getAnneeNaissance() {
		return anneeNaissance;
	}
	public void setAnneeNaissance(int anneeNaissance) {
		this.anneeNaissance = anneeNaissance;
	}
	
}
