/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabal_pooi;

import java.util.Scanner;


public class Funcionario {
String nome , profissao,dataNascimento;
int idade;
double salario,horas_trabalho; 


 void cadastraNome(){
   Scanner input = new Scanner (System.in);
    System.out.print("digite o nome do funcionario :   ");
    nome = input.nextLine(); 
}

void cadastraProf(){
    Scanner input = new Scanner (System.in);
    System.out.print("digite a profissao do funcionario :   ");
    profissao = input.nextLine();
    
}
void cadastraIdade(){
    Scanner input = new Scanner (System.in);
    System.out.print("digite a idade do funcionario :   ");
    idade = input.nextInt();   
}

void cadastraDataNas(){
    Scanner input = new Scanner (System.in);
    System.out.print("digite a data de nascimento do funcionario :   ");
    dataNascimento = input.nextLine();  
}

void cadastraSalario(){
    Scanner input = new Scanner (System.in);
    System.out.print("digite o salario do funcionario :   ");
    salario = input.nextDouble();  
}

void cadastraHoraTrabalhada(){
    Scanner input = new Scanner (System.in);
    System.out.print("digite as horas trabalhadas do funcionario :   ");
    horas_trabalho = input.nextDouble();  
}



}

