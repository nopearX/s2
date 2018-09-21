package ex3.photos.modeles;

import java.io.File;

public class Photo implements Comparable {
	private String fichier ; 
	private String pays ; 
	private int annee ; 
	private String commentaire ; 
	private long tailleFichier ; 
	
	public Photo(String fichier, String pays, int annee, String commentaire) {
		super();
		this.fichier = fichier;
		this.pays = pays;
		this.annee = annee;
		this.commentaire = commentaire;
		this.tailleFichier = 0;
		File f = new File (fichier);
		this.tailleFichier = f.length();
		}

	public static void main(String[] args) {
		Photo p  = new Photo ("suisse.jpg", "Suisse", 2006, "Très bons chocolats"); 
		Photo p2  = new Photo ("maldives.jpg", "Maldives", 2008, "Très jolis poissons"); 
	}

	public int compareTo(Object arg) {
		Photo autrePhoto = (Photo) arg ;
		if (annee > autrePhoto.annee) {
			return -1;
		}
		else if (annee < autrePhoto.annee) {
			return 1;
		}
		return 0 ;
	}

	public String getFichier() {
		return fichier;
	}

	public void setFichier(String fichier) {
		this.fichier = fichier;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}

	public String getCommentaire() {
		return commentaire;
	}

	public void setCommentaire(String commentaire) {
		this.commentaire = commentaire;
	}

	public long getTailleFichier() {
		return tailleFichier;
	}

	public void setTailleFichier() {
		File f = new File (fichier);
		this.tailleFichier = f.length();
	}
}
