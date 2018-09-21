package EX3;

public abstract class Salarie {
	private double salaire ; 
	
	// pourrait aussi être défini seulement dans Employe
	private String nom ;

	public abstract void verserSalaire ();
	
	protected Salarie(double salaire, String nom) {
		this.salaire = salaire;
		this.nom = nom;
	}

	public double getSalaire() {
		return salaire;
	}

	public void setSalaire(double salaire) {
		this.salaire = salaire;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	} 
}
