package partie3;


	
class Elevage{
Volaille[] tab = new Volaille[100];
int nbBetes = 0;

void ajouter(Volaille v){
tab[nbBetes] = v;
nbBetes++;}

Volaille rechercher(int id){
for(int i=0; i<nbBetes; i++){
if (tab[i].getNumID() == id){
	return tab[i];}}
return null;
}

void changePoids(int id,double np){rechercher(id).changePoids(np);}

double evaluerBetesAAbattre(){
double res = 0;
for (int i=0; i<nbBetes; i++){
if (tab[i].assezGrosse()){
res = res+tab[i].prix();}}

return res;
}

Volaille[] envoyerALAbattoir(){
	
Volaille[] res = new Volaille[100];

int nb = 0;
int i = 0;

while (i < nbBetes){

		if (tab[i].assezGrosse()){
		res[nb] = tab[i];
		nb++;
		tab[i]=tab[nbBetes-1];
		nbBetes--;}
			else{
				i++;
				}}
	return res;}

String afficherBetesAAbattre() {
	String liste ="";
	for (int i =0;i<tab.length;i++) {
		if(tab[i].getPoids() >= tab[i].getPoids()) {
			liste = liste + String(tab[i].getNumID());
			liste = liste + "  ";
		}
	}
	return liste;
}
private String String(int numID) {
	// TODO Auto-generated method stub
	return null;
}

void ecrire(){
for (int i=0; i<nbBetes; i++){
System.out.println("" + tab[i].getNumID() + "" +	tab[i].getPoids() + "" +	tab[i].prix());}}}




