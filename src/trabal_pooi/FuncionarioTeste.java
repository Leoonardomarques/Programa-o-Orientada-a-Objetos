
package trabal_pooi;

/**
 *
 * @author Leonardo Marques
 */
public class FuncionarioTeste {

  
    public static void main(String[] args) {
       
        
        Funcionario a1 = new Funcionario();
        a1.cadastraNome();
        a1.cadastraProf();
        a1.cadastraIdade();
        a1.cadastraSalario();
        a1.cadastraDataNas();
        a1.cadastraHoraTrabalhada();
        
        
        System.out.println("O nome do funcionario é "+a1.nome+",sua profissão é "+a1.profissao+",sua idade é "+a1.idade
                + " anos,nasceu na data "+a1.dataNascimento+", seu salario é de R$ "+a1.salario+",e sua horas trabalhas são "
                +a1.horas_trabalho+"Hrs/dia.");
        
                }
    
    
}
