/*En Java, le passage de param�tres se fait par 
=> VALEURS

Est-ce que dans un sous-programme, 
on peut modifier une variable de type de base (par exemple int) 
pass�e en param�tre ?
=> NON (les modifications r�alis�es dans le sous-programme seront
faites sur une copie et ne seront pas r�percut�es sur la variable 
pass�e en param�tre)


Dans un sous-programme auquel on passe une r�f�rence � un objet 
o en param�tre :
On peut modifier => SES ATTRIBUTS

On ne peut pas modifier 
=> L'ADRESSE QUI EST CONTENUE DANS LA REFERENCE o

Qu�affiche le programme suivant ?
=> 
*/
public class A {
    int na ;
    
    public static void main (String args []) {
        B b = new B();
        A a1 = new A();
        a1.na = 2 ;
        System.out.println ("Avant appel : " + a1.na);
        System.out.println ("Avant appel : " + a1);
        b.m(a1);
        System.out.println ("Apr�s appel : " + a1.na);
        System.out.println ("Apr�s appel : " + a1);
    }
}
class B {
    void m(A a2) {
        a2.na = 10 ;
        a2 = new A();
        System.out.println ("Durant appel : " + a2);
    }
}
