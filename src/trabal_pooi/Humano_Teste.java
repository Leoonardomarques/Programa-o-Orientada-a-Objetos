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
public class Humano_Teste {

    public static void main(String[] args) {
        Humano Humano1;
        Humano1 = new Humano();
        
        Humano1.Cor = "Negra";
        System.out.println("A cor da pessoa é :"+Humano1.Cor);
        
        Humano1.Ebipede = "Sim";
        System.out.println("A pessoa é Ebipede? :"+Humano1.Ebipede);
        
        Humano1.Nome = "Leticia";
        System.out.println("O nome da pessoa é :"+Humano1.Nome);
        
        ///////////////*Criar 1 Instancias*/////////////////////
        Humano Humano2;
        Humano2 = new Humano();
        
        Humano2.Idade = 22;
        Humano2.Nome = "Jose Francisco";
        System.out.println("O nome  da pessoa é "+Humano2.Nome+", e sua idade é "+Humano2.Idade+ " anos" );
        
         ///////////////*Criar 2 Instancias*/////////////////////
        Humano Humano3;
        Humano3 = new Humano();
        
        Humano3.Idade = 40;
        Humano3.Nome = " Francisco";
        System.out.println("O nome  da pessoa é "+Humano3.Nome+", e sua idade é "+Humano3.Idade+ " anos.");
        
        ///////////////*Criar 3 Instancias*/////////////////////
        Humano Humano4;
        Humano4 = new Humano();
        
        Humano4.Idade = 27;
        Humano4.Nome = " Geovanna";
        System.out.println("O nome  da pessoa é "+Humano4.Nome+", e sua idade é "+Humano4.Idade+ " anos.");
        
        ///////////////*Criar 4 Instancias*/////////////////////
        Humano Humano5;
        Humano5 = new Humano();
        
        Humano5.Idade = 77;
        Humano5.Nome = " Maria";
        System.out.println("O nome  da pessoa é "+Humano5.Nome+", e sua idade é "+Humano5.Idade+ " anos.");
        
        ///////////////*Criar 5 Instancias*/////////////////////
        Humano Humano6;
        Humano6 = new Humano();
        
        Humano6.Idade = 7;
        Humano6.Nome = " Gabriel";
        System.out.println("O nome  da pessoa é "+Humano6.Nome+", e sua idade é "+Humano6.Idade+ " anos.");
        
        ///////////////*Criar Instancias do mais velho e do mais novo */////////////////////
        
        Humano Humano7;
        Humano7 = new Humano();
        
        Humano7.Idade = 77;
        Humano7.Nome = " Maria";
        System.out.println("O nome  da pessoa mais velha é "+Humano7.Nome+", e sua idade é "+Humano7.Idade+ " anos.");
        
        /**********************************************/
        
        Humano Humano8;
        Humano8 = new Humano();
        
        Humano8.Idade = 7;
        Humano8.Nome = " Gabriel";
        System.out.println("O nome  da pessoa mais nova é "+Humano8.Nome+", e sua idade é "+Humano8.Idade+ " anos.");
        
        
    }
    
}
