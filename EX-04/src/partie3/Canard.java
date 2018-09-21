package partie3;



class Canard extends Volaille{
static double prixAuKilo = 1.2;
static double poidsAbattage = 1.5;

Canard(double p,int i){
super(p,i);}

static void changePrix( double x){
prixAuKilo = x;}

static void changePoidsAbattage(double x){
poidsAbattage = x;}

public double prix(){
	return getPoids() *prixAuKilo;
}

boolean assezGrosse(){
return getPoids() >= poidsAbattage;}}