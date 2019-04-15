
package trabal_pooi;

/**
 *
 * @author Leonardo Marques
 */
public class Cachorro_Teste {

   
    public static void main(String[] args) {
        Cachorro Cachorro_1;
        Cachorro_1 = new Cachorro();
        Cachorro_1.Cor = "Branca";
        System.out.println("A cor do cachorro é: "+Cachorro_1.Cor);
        
        
        Cachorro_1.Équadrupede = "Sim";
        System.out.println("O cachorro é Quadrupede?  "+Cachorro_1.Équadrupede);
        
         Cachorro_1.Nome = "Shark";
        System.out.println("O nome do cachorro é: "+Cachorro_1.Nome);
               
    }
    
}
