public class Stock {
// EX B -----------------------------------------------------    

    public static void main(String[] args) {    
        //---------------------------------------
    // Déclarer les constantes
        //---------------------------------------
        final int NB_Articles = 3;

        //---------------------------------------
        // Déclarer les tableaux
        //---------------------------------------
        char CodeArticle[];
        double PrixArticle[];
        
        //---------------------------------------
        // Allouer les tableaux
        //---------------------------------------
        CodeArticle = new char[3];
        PrixArticle = new double[3];
            
        //---------------------------------------
        // Mettre des valeurs dans les cases
        //---------------------------------------
        CodeArticle[0] = 'A';
        CodeArticle[1] = 'B';
        CodeArticle[2] = 'C';
        PrixArticle[0] = 10.5;
        PrixArticle[1] = 2.5;
        PrixArticle[2] = 21.5;
        
        //---------------------------------------
        // Parcours des deux tableaux avec deux boucles foreach
        //---------------------------------------
        for(int i=0; i<NB_Articles; i++){
        	System.out.print(CodeArticle[i] + "	");
        }
        System.out.println();
        for(int j=0; j<NB_Articles; j++){
        	System.out.print(PrixArticle[j] + "	");
        }
        System.out.println();
        System.out.println();
        
        //---------------------------------------
        // Parcours des deux tableaux en parallèle avec une boucle while et un booleen
        //---------------------------------------
        boolean fini = false;
        int i=0;
        while(!fini){
        	System.out.print(CodeArticle[i] + " - " + PrixArticle[i]);
        	i++;
        	System.out.println();
        	fini = i == NB_Articles;
        }
        
        // EX C --------------------------------------
        System.out.println();
        System.out.println();
        
        
        for(int k=0; k<NB_Articles; k++){
        	System.out.print(CodeArticle[k]+"	");
        }
        
        char temp=CodeArticle[0];
        CodeArticle[0]=CodeArticle[1];
        CodeArticle[1]=temp;
        
        System.out.println();
        
        for(int k=0; k<NB_Articles; k++){
        	System.out.print(CodeArticle[k]+"	");
        }
        
        System.out.println();
        System.out.println();
        
        for(int n=0; n<NB_Articles; n++){
        	System.out.print(PrixArticle[n]+"	");
        }
        
        System.out.println();
        
        PrixArticle[1]=150.7;
        for(int n=0; n<NB_Articles; n++){
        	System.out.print(PrixArticle[n]+"	");
        }
        
        System.out.println();
        System.out.println();
        
        System.out.println("L'adresse du tableau de nombres réels PrixArticle est: "+ PrixArticle);
        double[] Tableau = new double[3];
        PrixArticle = Tableau;
        System.out.printf("L'adresse du tableau de nombres réels PrixArticle est: "+ PrixArticle);
    }
}


