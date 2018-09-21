package EX3;
public class ClientInterne extends Salarie {
	private Compte compte ; 
	
	public ClientInterne(double salaire, String nom, Compte compte) {
		super(salaire, nom);
		this.compte = compte ;
	}
	
	public void verserSalaire() {
		compte.crediter(getSalaire());
	}
	
	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}
}
