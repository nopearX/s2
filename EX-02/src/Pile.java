import java.util.Scanner;

public class Pile {
	
	final int NB_MAX = 100;
	
	int TableauEntier[] = new int[100];
	int nbValeurs;
	
	public void empiler(int i){
		int cpt=0;
		TableauEntier[cpt]=i;
	}
	
	public void empiler(int i, int j){
		int cpt=0;
		TableauEntier[cpt] = i;
		TableauEntier[cpt+1] = j;	
	}
	
	public void afficherSommet(){
		System.out.println(TableauEntier[1]);
	}
	
	public void main(String[] args){
		
		System.out.println("Saisir un entier : ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		int j = sc.nextInt();
		
		empiler(i);
		empiler(i,j);
		
		System.out.println();
		System.out.println("Le sommet de la pile est : ");
		afficherSommet();
	}
}
