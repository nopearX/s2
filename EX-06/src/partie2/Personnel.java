package partie2;

class Personnel {
private employe[] staff;
private int nbreEmploye;
private final static int MAXEMPLOYE = 200;
public Personnel() {
staff = new employe[MAXEMPLOYE];
nbreEmploye = 0;    
}
public void ajouterEmploye(employe e) {
if (nbreEmploye <= MAXEMPLOYE) {
++nbreEmploye;
staff[nbreEmploye - 1] = e;
} else {
System.out.println("Pas plus de " + MAXEMPLOYE + " employés");
}
}

public double salaireMoyen() {
double somme = 0.0;
for (int i = 0; i < nbreEmploye; i++) {
somme += staff[i].calculSalaire();
}
return somme / nbreEmploye;
}
public void afficherSalaires() {
for (int i = 0; i < nbreEmploye; i++) {
System.out.println(staff[i].getNom() + " gagne "+ staff[i].calculSalaire() + " francs.");
}
}
}
