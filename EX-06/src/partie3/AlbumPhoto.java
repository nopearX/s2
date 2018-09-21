package partie3;
import java.util.ArrayList;
import java.util.Collections;

public class AlbumPhoto implements Spec{
	
ArrayList <Photo> album = new ArrayList<Photo>();
ArrayList <Photo> recherche = new ArrayList<Photo>();
private String p2;
 public void ajoutPhoto(Photo p) {
		 album.add(p);
	 }



	@Override
	public void triPhoto() {
		// TODO Auto-generated method stub
		Collections.sort(album);
	
	}



	@Override
	public void rechercheComment(String P) {
		p2 = P;
		for (int i =0; i < album.size(); i++) {
			if (album.get(i).getComment().contains(p2))
				{
					recherche.add(album.get(i));
				}
		}
	}

	

	
	 
	}
