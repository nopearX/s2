package ex1_perimetre.ecouteurAnonyme;



import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PerimetreObjetEcouteurAnonyme extends JPanel {
    // D�finir des actions pour chaque bouton
    protected String CALCULER_ACTION = "CALCULER";
    protected String NETTOYER_ACTION = "NETTOYER";

    // D�clarer les composants en tant qu'attribut
    protected JLabel lLongeur ;
    protected JLabel lLargeur ;
    protected JTextField txtLongeur ;
    protected JTextField txtLargeur ;
    protected JLabel lblResultat ;
    protected JLabel lblValResultat ;
    protected JButton bCalculer ;
    protected JButton bNettoyer ;

    // Constructeur
    PerimetreObjetEcouteurAnonyme () {
        // Cr�er les composants
        lLongeur = new JLabel ("Longueur:");
        lLargeur = new JLabel ("Largeur:");
        txtLongeur = new JTextField (20);
        txtLargeur = new JTextField (20);
        lblResultat = new JLabel ("Resultat:");
        lblValResultat = new JLabel ("0");

        // Pour les boutons, on choisit de leur affecter une action
        /// on pourrait aussi simplement tester le texte qui est affich� sur les boutons
        bCalculer = new JButton ("Calculer");
        bCalculer.setActionCommand(CALCULER_ACTION);
        bNettoyer = new JButton ("Nettoyer");
        bNettoyer.setActionCommand(NETTOYER_ACTION);

        // Fixer la mise en page
        setLayout(new GridLayout (4, 2));

        // Centrer les labels
        lLongeur.setHorizontalAlignment(JLabel.CENTER);
        lLargeur.setHorizontalAlignment(JLabel.CENTER);
        lblResultat.setHorizontalAlignment(JLabel.CENTER);

        // Ajouter les composants
        add(lLongeur);
        add(txtLongeur);
        add(lLargeur);
        add(txtLargeur);
        add(lblResultat);
        add(lblValResultat);
        add(bCalculer);
        add(bNettoyer);

        // Ajouter cet objet comme �couteur aux boutons
        ActionListener e = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("on a cliqu�");
                JButton bouton = (JButton) e.getSource ();
                if (e.getActionCommand().equals(getCALCULER_ACTION())) {
                    // R�cup�rer les valeurs de la longueur et de la largeur
                    double largeur = Double.parseDouble(getTxtLargeur().getText());
                    double longueur = Double.parseDouble(getTxtLongeur().getText());
                    double resultat = 2 * (largeur + longueur);
                    getLblValResultat().setText(""+resultat);

                } else if (e.getActionCommand().equals(getNETTOYER_ACTION())) {
                    // Vider les champs de texte
                    getTxtLargeur().setText("");
                    getTxtLongeur().setText("");
                }
            }
        };

        bCalculer.addActionListener(e);
        bNettoyer.addActionListener(e);
    }

    public static void main(String[] args) {
        // Creer une fenetre
        JFrame fenetre = new JFrame ("Perimetre");
        fenetre.setSize (300, 300);
        fenetre.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Cr�er un panneau global
        PerimetreObjetEcouteurAnonyme perimetre = new PerimetreObjetEcouteurAnonyme();

        // Ajouter le bouton dans un des conteneurs de la fenetre
        fenetre.add(perimetre);

        // Afficher la fenetre
        fenetre.setVisible(true);
    }

    public String getCALCULER_ACTION() {
        return CALCULER_ACTION;
    }

    public void setCALCULER_ACTION(String cALCULER_ACTION) {
        CALCULER_ACTION = cALCULER_ACTION;
    }

    public String getNETTOYER_ACTION() {
        return NETTOYER_ACTION;
    }

    public void setNETTOYER_ACTION(String nETTOYER_ACTION) {
        NETTOYER_ACTION = nETTOYER_ACTION;
    }

    public JLabel getlLongeur() {
        return lLongeur;
    }

    public void setlLongeur(JLabel lLongeur) {
        this.lLongeur = lLongeur;
    }

    public JLabel getlLargeur() {
        return lLargeur;
    }

    public void setlLargeur(JLabel lLargeur) {
        this.lLargeur = lLargeur;
    }

    public JTextField getTxtLongeur() {
        return txtLongeur;
    }

    public void setTxtLongeur(JTextField txtLongeur) {
        this.txtLongeur = txtLongeur;
    }

    public JTextField getTxtLargeur() {
        return txtLargeur;
    }

    public void setTxtLargeur(JTextField txtLargeur) {
        this.txtLargeur = txtLargeur;
    }

    public JLabel getLblResultat() {
        return lblResultat;
    }

    public void setLblResultat(JLabel lblResultat) {
        this.lblResultat = lblResultat;
    }

    public JLabel getLblValResultat() {
        return lblValResultat;
    }

    public void setLblValResultat(JLabel lblValResultat) {
        this.lblValResultat = lblValResultat;
    }

    public JButton getbCalculer() {
        return bCalculer;
    }

    public void setbCalculer(JButton bCalculer) {
        this.bCalculer = bCalculer;
    }

    public JButton getbNettoyer() {
        return bNettoyer;
    }

    public void setbNettoyer(JButton bNettoyer) {
        this.bNettoyer = bNettoyer;
    }
}
