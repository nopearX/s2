package BibliothequeGraphique.modele;



import java.util.ArrayList;
import java.util.Collections;

public class Bibliotheque implements Modele<Livre> {

    private ArrayList<Livre> livres;
    private ArrayList<Class<?>> types;

    public Bibliotheque() {
        livres = new ArrayList<Livre>();
        types = new ArrayList<Class<?>>();
    }

    public void ajouter (Livre l) {
        livres.add(l);
        if(!types.contains(l.getClass())){
            types.add(l.getClass());
        }
    }

    public ArrayList<String> getTypes() {
        ArrayList<String> res = new ArrayList<String>();
        for(Class<?> c : types)
            res.add(c.getSimpleName());
        return res;
    }

    public ArrayList<String> getListe() {
        ArrayList<String> res = new ArrayList<String>();
        for(Livre l : livres)
            res.add(l.getTitre());
        return res;
    }

    public void trier() {
        Collections.sort(livres);
    }

    public String getInfosHTML(int index) {
        return livres.get(index).getInfosHTML();

    }

    public boolean pretPossible(int index){
        return livres.get(index).getNbExemplaires()>livres.get(index).getNbExemplairesPretes();
    }
    public boolean retourPossible(int index){
        return livres.get(index).getNbExemplairesPretes()>0;
    }

    @Override
    public void emprunter(int index) {
        livres.get(index).emprunter();
    }

    @Override
    public void retourner(int index) {
        livres.get(index).retourner();
    }

}

