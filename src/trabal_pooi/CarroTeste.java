/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabal_pooi;

/**
 *
 * @author Leonardo Marques
 */
public class CarroTeste {

  
    public static void main(String[] args) {
        Carro carro1;
        carro1 = new Carro();
        carro1.Proprietario = "João";
        System.out.println("Nome do Proprietario é: "+carro1.Proprietario);
        carro1.Ano = 2002;
        System.out.println("O Ano do Veiculo é: "+carro1.Ano);
        carro1.Placa = "LVY-1234";
        System.out.println("A Placa do Veiculo é: "+carro1.Placa);
    }
    
}
