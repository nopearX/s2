import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.SwingConstants;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import modele.Modele;


public class BibliothequeGraphique extends JPanel  implements ActionListener, ListSelectionListener{

	private JLabel infos;
	private DefaultListModel<String> listesModel;
	private JList<String> listes;
	private JButton preter, rendre;

	private Modele<?> modele;

	public BibliothequeGraphique(Modele<?> modele) {
		this.modele = modele;
		JPanel panelgauche = new JPanel();
		panelgauche.setLayout(new BorderLayout());
		initListes();
		JLabel labelListes  = new JLabel("Liste ouvrages :");
		JScrollPane scrollListes = new JScrollPane(listes);

		JPanel boutons = new JPanel();
		initBoutons();
		boutons.add(preter);
		boutons.add(rendre);	

		panelgauche.add(labelListes, BorderLayout.NORTH);
		panelgauche.add(scrollListes, BorderLayout.CENTER);
		panelgauche.add(boutons,BorderLayout.SOUTH);
		
		JPanel paneldroite = new JPanel();
		paneldroite.setLayout(new BorderLayout());
		infos = new JLabel();
		infos.setVerticalAlignment(SwingConstants.TOP);
		infos.setOpaque(true);
		infos.setBackground(Color.WHITE);
		JScrollPane scrollInfoLivre = new JScrollPane(infos);

		JLabel labelInfos = new JLabel("Infos :");
		paneldroite.add(labelInfos, BorderLayout.NORTH);
		paneldroite.add(scrollInfoLivre, BorderLayout.CENTER);
		
		setPreferredSize(new Dimension(750,370));
		setLayout(new GridLayout(1,2,20,0));
		add(panelgauche);
		add(paneldroite);
	}
	
	private void initBoutons() {
		preter = new JButton("Emprunt");
		preter.setEnabled(false);
		preter.addActionListener(this);
		rendre = new JButton("Retour");
		rendre.setEnabled(false);
		rendre.addActionListener(this);
	}


	private void initListes() {
		listesModel = new DefaultListModel<String>();

		majListe(modele.getListe());

		listes = new JList<String>(listesModel);
		listes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listes.setLayoutOrientation(JList.VERTICAL);
		listes.setVisibleRowCount(-1);
		listes.setBackground(Color.WHITE);
		listes.addListSelectionListener(this);
	}

	public void majListe(ArrayList<String> l){
		listesModel.clear();
		for(String s : l)
			listesModel.addElement(s);
	}

	
	public void majInfos(String s){
		infos.setText(s);
	}

	private void majBoutons(int index) {
		preter.setEnabled(modele.pretPossible(index));
		rendre.setEnabled(modele.retourPossible(index));
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		int index = listes.getSelectedIndex();
		majInfos(modele.getInfosHTML(index));
		majBoutons(index);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		int index = listes.getSelectedIndex();
		if(e.getSource()==preter){
			modele.emprunter(index);
		}
		else if (e.getSource()==rendre){
			modele.retourner(index);
		}

		majInfos(modele.getInfosHTML(index));
		majBoutons(index);
	}
}
