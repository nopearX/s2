package partie3;
import java.io.File; 

public class Photo implements Comparable<Object>{
	
	
	String pays;
	int annee;
	String comment;
	String nomFichier;
	
	public Photo(String Pays, int ans, String Comment, String Fichier) {
	
		this.pays = Pays;
		this.annee = ans;
		this.comment = Comment;
		this.nomFichier = Fichier;
	}
	
	
public double taille() {
	   File file =new File("image.jpg");
       if(file.exists()){ 
         // Récupérer la taille du fichier 
       double bytes = file.length();
       return bytes;
       }
       return 0;
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


public String getComment() {
	return comment;
}


public void setComment(String comment) {
	this.comment = comment;
}


public String getNomFichier() {
	return nomFichier;
}


public void setNomFichier(String nomFichier) {
	this.nomFichier = nomFichier;
}


public static void main (String args []) {
	AlbumPhoto album = new AlbumPhoto();
	Photo photo1 = new Photo("Paris",2088,"tour eiffel", "vacance");
	Photo photo2 = new Photo("ABAST",2008,"montagne eiffel", "ski");
	Photo photo3 = new Photo("Londre",2218,"lac", "jura");
	Photo photo4 = new Photo("USA",2018,"Poils", "Portugal");
	Photo photo5 = new Photo("Venise",2019,"ordi tour","pigeon");
	
	
	album.ajoutPhoto(photo1);
	album.ajoutPhoto(photo2);
	album.ajoutPhoto(photo3);
	album.ajoutPhoto(photo4);
	album.ajoutPhoto(photo5);
}


public int compareTo(Object o) {
	// TODO Auto-generated method stub
	Photo photocompare = (Photo) o ;
	if (annee > photocompare.annee)
	{
		return 1;
	} else if (annee < photocompare.annee){
		return -1;
		
	}
	return 0;
}

//public ArrayList rechercheMot (String mot) {
//	ArrayList result = new ArrayList();
//	for 
	
//}




}