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
public class ProfessorTeste {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        /******PROFESSOR 1 - CADASTRAR**********/
        Professor p1 = new Professor();
       
        
        System.out.print("DIGITE O NOME DO PROFESSOR: ");
        p1.nome = input.nextLine();
        
        System.out.print("DIGITE A SUA DISCIPLINA: ");
        p1.disciplina = input.nextLine();
        
        System.out.print("DIGITE O NOME DA TURMA QUE O  PROFESSOR LECIONA : ");
        p1.turma_leciona = input.nextLine();
        
        System.out.print("DIGITE A IDADE DO PROFESSOR: ");
        p1.idade = input.nextInt();
        
        System.out.print("DIGITE O TEMPO DE DOCENCIA DO PROFESSOR: ");
        p1.tempo_docencia = input.nextInt();
        
        System.out.println("O nome do Professor é "+p1.nome+ " sua idade é "+p1.idade+ 
              ",sua disciplina é "+p1.disciplina+ " o tempo de docencia é de "+p1.tempo_docencia+" anos,e sua turma que leciona é " 
               + p1.turma_leciona+"." );
                
        /******PROFESSOR 2**********/
        Professor b1 = new Professor();
        b1.disciplina = "ENGENHARIA DE SOFTWARE ";
        b1.idade = 40;
        b1.nome = "AMELIA";
        b1.tempo_docencia = 9;
        b1.turma_leciona = "SISTEMA DA INFORMAÇÃO";
        
        
        System.out.println("O nome do Professor é "+b1.nome+ " sua idade é "+b1.idade+ 
              ",sua disciplina é "+b1.disciplina+ " o tempo de docencia é de "+b1.tempo_docencia+" anos,e sua turma que leciona é " 
               + b1.turma_leciona+"." );
        
        /******PROFESSOR 3**********/
          
        Professor c1 = new Professor();
        c1.disciplina = "REDES DE COMPUTADORES  ";
        c1.idade = 45;
        c1.nome = "LUCIANO";
        c1.tempo_docencia = 12;
        c1.turma_leciona = "ENGENHARIA DE SOFTWARE";
        
        
        System.out.println("O nome do Professor é "+c1.nome+ " sua idade é "+c1.idade+ 
              ",sua disciplina é "+c1.disciplina+ " o tempo de docencia é de "+c1.tempo_docencia+" anos,e sua turma que leciona é " 
               + c1.turma_leciona+"." );
        
        /******PROFESSOR 4**********/
        Professor d1 = new Professor();
        d1.disciplina = "BANCO DE DADOS   ";
        d1.idade = 37;
        d1.nome = "FUTINO";
        d1.tempo_docencia = 10;
        d1.turma_leciona = "ANALISE E DESENVOLVIMENTO DE SISTEMAS ";
        
        
        System.out.println("O nome do Professor é "+d1.nome+ " sua idade é "+d1.idade+ 
              ",sua disciplina é "+d1.disciplina+ " o tempo de docencia é de "+d1.tempo_docencia+" anos,e sua turma que leciona é " 
               + d1.turma_leciona+"." );
        
        /******PROFESSOR 5**********/
        Professor e1 = new Professor();
        e1.disciplina = "PROGRAMAÇÃO ORIENTA A OBJETOS   ";
        e1.idade = 38;
        e1.nome = "RODRIGO";
        e1.tempo_docencia = 9;
        e1.turma_leciona = "CIENCIA DA COMPUTAÇÃO";
        
        
        System.out.println("O nome do Professor é "+e1.nome+ " sua idade é "+e1.idade+ 
              ",sua disciplina é "+e1.disciplina+ " o tempo de docencia é de "+e1.tempo_docencia+" anos,e sua turma que leciona é " 
               + e1.turma_leciona+"." );
        
        /******PROFESSOR 6**********/
        Professor f1 = new Professor();
        f1.disciplina = "SISTEMAS OPERACIONAIS   ";
        f1.idade = 39;
        f1.nome = "ANDREIA";
        f1.tempo_docencia = 9;
        f1.turma_leciona = "ENGENHARIA CIVIL ";
        
        
        System.out.println("O nome do Professor é "+f1.nome+ " sua idade é "+f1.idade+ 
              ",sua disciplina é "+f1.disciplina+ " o tempo de docencia é de "+f1.tempo_docencia+" anos,e sua turma que leciona é " 
               + f1.turma_leciona+"." );
        
        
        /******PROFESSOR 7**********/
        Professor h1 = new Professor();
        h1.disciplina = "LOGICA DE PROGRAMAÇÃO  ";
        h1.idade = 45;
        h1.nome = "AUCIONIO";
        h1.tempo_docencia = 14;
        h1.turma_leciona = "ANALISE E DESENVOLVIMENTO DE SISTEMAS  ";
        
        
        System.out.println("O nome do Professor é "+h1.nome+ " sua idade é "+h1.idade+ 
              ",sua disciplina é "+h1.disciplina+ " o tempo de docencia é de "+h1.tempo_docencia+" anos,e sua turma que leciona é " 
               + h1.turma_leciona+"." );
        
        
        
    }
    
}
