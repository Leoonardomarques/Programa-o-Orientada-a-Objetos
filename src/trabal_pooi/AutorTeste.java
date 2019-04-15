/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabal_pooi;

import java.util.Scanner;

/**
 *
 * @author Leonardo Marques
 */
public class AutorTeste {

    
            
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
       Autor h1 = new Autor();
       h1.Nome = "  ";
       h1.nacionalidade = " ";
       h1.dataDoNascimento = "";
       h1.Cidadenatal = "  ";
       h1.Escolaridade ="";
       
        System.out.print("DIGITE O NOME DO AUTOR: ");
        h1.Nome = input.nextLine();
        
        System.out.print("DIGITE A SUA NACIONALIDADE: ");
        h1.nacionalidade = input.nextLine();
        
        System.out.print("DIGITE A DATA DE NASCIMENTO: ");
        h1.dataDoNascimento = input.nextLine();
        
        
        System.out.print("DIGITE A SUA CIDADE NATAL: ");
        h1.Cidadenatal = input.nextLine();
        
        System.out.print("DIGITE A ESCOLARIADADE: ");
        h1.Escolaridade = input.nextLine();
       
       h1.mostarNomeAutor();
      
       
       System.out.println("O nome do Autor é "+h1.Nome+ " sua nacionalidade é "+h1.nacionalidade+ 
              ",o autor nasceu na data "+h1.dataDoNascimento+ " em sua cidade natal de "+h1.Cidadenatal+ 
               ",e sua escolaridade é "+ h1.Escolaridade+"." );
       
        
        
    }
    
}
