
package trabal_pooi;

/**
 *
 * @author Leonardo Marques
 */
public class Gato_Teste {

   
    public static void main(String[] args) {
        Gato Gato_1;
        Gato_1 = new Gato();
        
        Gato_1.Cor = "Laranja e Branco";
        System.out.println("A cor do Gato é: "+Gato_1.Cor);
        
        Gato_1.Équadrupede = "Sim";
        System.out.println("O Gato é Équadrupede? "+Gato_1.Équadrupede);
        
        Gato_1.Nome = "Tom";
        System.out.println("O nome do Gato é: "+Gato_1.Nome);
    }
    
}
