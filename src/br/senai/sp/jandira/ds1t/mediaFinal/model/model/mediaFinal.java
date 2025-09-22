package br.senai.sp.jandira.ds1t.mediaFinal.model.model;

import java.util.Scanner;

public class mediaFinal {

    String nomeAluno;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double pesoDaNota1;
    double pesoDaNota2;
    double pesoDaNota3;
    double pesoDaNota4;

    public void getData(){

        Scanner leitor = new Scanner(System.in);


        System.out.print("Digite o nome do aluno:");
        nomeAluno = leitor.findInLine();

        System.out.print("Agora digite a nota da atividade 1:");
        nota1 = leitor.nextDouble();


        System.out.print("Agora digite o peso da atividade 1:");
        pesoDaNota1 = leitor.nextDouble();

        System.out.print("Agora digite a nota da atividade 2:");
        nota2 = leitor.nextDouble();


        System.out.print("Agora digite o peso da atividade 2:");
        pesoDaNota2 = leitor.nextDouble();


        System.out.print("Agora digite a nota da atividade 3:");
        nota3 = leitor.nextDouble();


        System.out.print("Agora digite o peso da atividade 3:");
        nota3 = leitor.nextDouble();


        System.out.print("Agora digite o peso da atividade 3:");
        pesoDaNota3 = leitor.nextDouble();

        System.out.print("Agora digite a nota da atividade 4:");
        nota4 = leitor.nextDouble();


        System.out.print("Agora digite o peso da atividade 4:");
        pesoDaNota4 = leitor.nextDouble();

        calculandoNotas();

    }

    public void calculandoNotas(){




    }


}