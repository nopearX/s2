
import java.awt.FlowLayout;

import javax.swing.JFrame;


import modele.BandeDessinee;
import modele.Bibliotheque;
import modele.Livre;
import modele.Modele;
import modele.Roman;


public class ApplicationBibliotheque {

	public static void main(String[] args) {
		Modele<Livre> b = new Bibliotheque();
		b.ajouter(new Roman("Terry Pratchett", "L'Atalante", "La Huitieme Couleur", 5, Roman.FANTASY));
		b.ajouter(new Roman("Terry Pratchett", "L'Atalante", "Mortimer", 1, Roman.FANTASY));
		b.ajouter(new Roman("Terry Pratchett", "L'Atalante", "Au guet !", 8, Roman.FANTASY));
		b.ajouter(new Roman("Douglas Adams", "Folio SF", "Le Guide du voyageur galactique", 4, Roman.SF));
		b.ajouter(new Roman("Douglas Adams", "Folio SF", "Le Dernier Restaurant avant la fin du monde", 3, Roman.SF));
		b.ajouter(new BandeDessinee("Neil Gaiman", "Delcourt", "Sandman : Préludes et Nocturnes", 3, "Sam Kieth"));
		b.trier();
		
		JFrame fenetre = new JFrame("Bibliotheque");
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenetre.setResizable(false);
		fenetre.getContentPane().setLayout(new FlowLayout());
		

		//A COMPLETER
		BibliothequeGraphique bg = new BibliothequeGraphique(b);
		fenetre.getContentPane().add(bg);
		
		fenetre.setSize(800,400);
		fenetre.setVisible(true);
	}
}
