package modele;

import java.util.ArrayList;

public interface Modele<E> {
	public void ajouter (E l);
	public ArrayList<String> getListe();
	public String getInfosHTML(int index);
	public void trier();
	
	public boolean pretPossible(int index);
	public boolean retourPossible(int index);
	public void emprunter(int index);
	public void retourner(int index);

}
