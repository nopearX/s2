package bonuscalc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class EcouteurCalculatrice implements ActionListener {
	vuesaffichage panel ;

	public EcouteurCalculatrice(vuesaffichage vuesaffichage) {
		super();
		this.panel = vuesaffichage;
	}

	public void actionPerformed(ActionEvent e) {
		// On se contente de concat�ner dans le r�sultat les touches tap�es
		
		// R�cup�rer la commande du bouton
		JButton b = (JButton) (e.getSource());
		String s = b.getActionCommand();
		
		// L'ajouter au label r�sultat
		JLabel res = panel.getResultat();
		res.setText(res.getText()+s);
	} 
}
