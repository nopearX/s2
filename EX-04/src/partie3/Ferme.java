package partie3;

public class Ferme {
    
    //----------------------------------------------------
    public static void main(String[] args){
        // Creer et ajouter quelques animaux
        Elevage laFerme = new Elevage();
        for    (int i=0; i<15; i++){
            laFerme.ajouter(new Poulet(0.250,150+i));
        }
        
        for(int i=0; i<15; i++){
            laFerme.ajouter(new Canard(0.250,380+i));
        }
        
        for (int i=0; i<10; i++){
            laFerme.ajouter(new Poulet(0.250,700+i));
        }        
        laFerme.ajouter(new Canard(0.750,825));

        // Changer le poids de quelques animaux
        for (int i=0; i<8; i++){
            laFerme.changePoids(155+i,1.3);
            laFerme.changePoids(382+i,1.55);
        }
        
        // Afficher l'�tat du volailler
        laFerme.ecrire();
        System.out.println("liste des animaux a abattre: ");
        System.out.println(laFerme.afficherBetesAAbattre());
        laFerme.envoyerALAbattoir(); // Retourne aussi un tableau avec les betes abattues
        laFerme.ecrire();
        
        System.out.println("Valeur des animaux a abattre: ");
        System.out.println(laFerme.evaluerBetesAAbattre());
    }
}
