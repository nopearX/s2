package partie4.partie2;
public class ClientInterne extends salarie {
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

