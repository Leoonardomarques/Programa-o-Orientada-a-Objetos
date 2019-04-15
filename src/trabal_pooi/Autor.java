
package trabal_pooi;

import java.util.Scanner;

/**
 *
 * @author Leonardo Marques
 */
public class Autor {
    String Nome;
    String Escolaridade;
    String nacionalidade;
    String Sexo;
    String dataDoNascimento;
    String Cidadenatal;
    
      void mostarNomeAutor(){
          
        System.out.println("O Nome do Autor é DEITEL, H.M"+this.Nome);       
        
    }
    
    void cadastarNomeAutor(String Nome){
        Scanner input = new Scanner (System.in);
        
        System.out.print("Digite o nome do autor : ");
        Nome = input.nextLine();
        
    }


    
}
