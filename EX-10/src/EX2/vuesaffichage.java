package EX2;


import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class vuesaffichage extends JPanel implements interfacesVue{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	ModeleFilm m;
	JLabel titre1 ;
	JLabel ans1;
	JLabel annee;
	JLabel nom;
	
	
	vuesaffichage(ModeleFilm m) {
		this.m = m;
		// TODO Auto-generated constructor stub
		titre1 = new JLabel("Titre : ");
		ans1 = new JLabel("Annee : ");
		this.annee = new JLabel("" + m.getAnnee());
		this.nom = new JLabel (m.getTitre());
		setLayout(new GridLayout (2, 2));
		add(titre1);
		add(nom);
		add(ans1);
		add(annee);
		
	}


	
	public static void main(String[] args) {
		
		JFrame fenetre = new JFrame("vueFilm");
		fenetre.setSize (300, 300);
		fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ModeleFilm modele = new ModeleFilm("Gravity", 2013);
		vuesaffichage vues2 = new vuesaffichage(modele);
		vues2.miseAJour();
		fenetre.add(vues2);
		fenetre.setVisible(true);
		
	}



	@Override
	public void miseAJour() {
		// TODO Auto-generated method stub
		
	}

}
