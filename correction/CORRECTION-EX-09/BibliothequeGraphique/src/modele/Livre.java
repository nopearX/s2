package modele;

public abstract class Livre implements Comparable<Livre>{

	protected String auteur;
	protected String maisonImprimerie;
	protected String titre;
	protected int nbExemplaires;
	protected int nbExemplairesPretes;
	
	public Livre(String auteur, String maisonImprimerie, String titre, int exemplaire){
		this.auteur=auteur;
		this.maisonImprimerie=maisonImprimerie;
		this.titre=titre;
		this.nbExemplaires=exemplaire;
		nbExemplairesPretes = 0;
	}

	public String getTitre() {
		
		return titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public String getMaisonImprimerie() {
		return maisonImprimerie;
	}

	public int getNbExemplaires() {
		return nbExemplaires;
	}

	public int getNbExemplairesPretes() {
		return nbExemplairesPretes;
	}

	public void emprunter() {
		nbExemplairesPretes++;
		
	}

	public void retourner() {
		nbExemplairesPretes--;
		
	}
	
	public String getInfosHTML() {
		String s = new String();
		s+= "Auteur : " + auteur + "<br/>";
		s+= "Titre : " + titre + "<br/>";
		s+= "Editeur : " + maisonImprimerie + "<br/>";
		s+= "Nombre exemplaires : " + nbExemplaires + "<br/>";
		s+= "Nombre exemplaires sortis : " + nbExemplairesPretes + "<br/>";
		
		return s;
	}
	
	@Override
	public int compareTo(Livre arg0) {
		return titre.compareTo(arg0.titre);
	}
}
