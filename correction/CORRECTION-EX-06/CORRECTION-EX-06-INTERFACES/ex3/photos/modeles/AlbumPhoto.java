package ex3.photos.modeles;
import java.util.*;
import java.util.Arrays;
import java.util.Collections;

public class AlbumPhoto implements EnsemblePhotos {
	ArrayList album ; 
	
	public AlbumPhoto () {
		album = new ArrayList ();
	}
	public void ajouterPhoto(Photo p) {
		album.add(p);
	}
	public void trierSelonAnnee() {
		Collections.sort (album);		
	}
	public ArrayList rechercherMotCle(String motCle) {
		ArrayList result = new ArrayList ();
		Iterator it = album.iterator();
		while (it.hasNext()) {
		       Photo p = (Photo) (it.next());
		       if (p.getCommentaire().contains(motCle))
		    	   result.add (p);
		}
		return result;
	}

	public static void main(String[] args) {
		AlbumPhoto souvenirs = new AlbumPhoto();
		Photo p1 = new Photo (null, "USA", 2014, "Vacances en famille");		
		Photo p2 = new Photo (null, "Asie", 2016, "Randonnées");		
		Photo p3 = new Photo (null, "Allemagne", 2009, "Vélo");		
		souvenirs.ajouterPhoto(p1);
		souvenirs.ajouterPhoto(p2);
		souvenirs.ajouterPhoto(p3);
	}
}
