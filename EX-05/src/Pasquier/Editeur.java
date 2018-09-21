package Pasquier;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.* ; 
public class Editeur {

public void afficherStats (FormeGeometrique f) {                
    JButton bouton = new JButton("fermer");
    // Declarer une reference vers une fenetre independante
 // Creer un objet de type fenetre independante
	Frame frame= new Frame ("Statistiques sur une forme graphique");
                // Declarer une reference vers une etiquette
                Label labelNom ;
        
                // Creer une etiquette avec toutes les informations sur la forme
                String classe = f.getClass().getName();
                
                labelNom = new Label (classe + ", x = " + f.getX() + ", y = " + f.getY() + ", Surface = " + f.Surface () + ", Perimetre = " + f.Perimetre ());

                // Ajouter l'etiquette dans la frame
                frame.add(labelNom);

                // Fixer la taille de la fenetre
                frame.setSize (400, 300);

                // Afficher la fenetre
                frame.setVisible (true);
                
        
                frame.add(bouton, BorderLayout.SOUTH);

             //  bouton.setContentPane(frame);

               frame.setVisible(true);
        	  
		bouton.addActionListener (new ActionListener(){public void actionPerformed (ActionEvent e) {
				frame.setVisible (false);
				frame.dispose();

		}
	
});
}

}
