package EX2;

public class ModeleFilm implements interfacemodele{

	String titre;
	int annee;
	String nomFichier;
	
	
	public ModeleFilm(String title, int ans) {
		// TODO Auto-generated constructor stub
		this.titre = title;
		this.annee = ans;
		
	}


	public String getTitre() {
		return titre;
	}


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public int getAnnee() {
		return annee;
	}


	public void setAnnee(int annee) {
		this.annee = annee;
	}


	public String getNomFichier() {
		return nomFichier;
	}


	public void setNomFichier(String nomFichier) {
		this.nomFichier = nomFichier;
	}





	

}
