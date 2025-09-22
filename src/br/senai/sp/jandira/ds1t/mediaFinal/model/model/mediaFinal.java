package br.senai.sp.jandira.ds1t.mediaFinal.model.model;

import java.util.Scanner;

public class mediaFinal {

    String nomeAluno;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;
    String situacao;

    public void getData() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("---------------------------------------");
        System.out.print("Digite o nome do aluno:");
        nomeAluno = leitor.nextLine();

        System.out.print("Agora digite a nota da atividade 1:");
        nota1 = leitor.nextDouble();


        System.out.print("Agora digite a nota da atividade 2:");
        nota2 = leitor.nextDouble();


        System.out.print("Agora digite a nota da atividade 3:");
        nota3 = leitor.nextDouble();

        System.out.print("Agora digite a nota da atividade 4:");
        nota4 = leitor.nextDouble();
        System.out.println("---------------------------------------");

        calculandoNotas();

    }

    public void calculandoNotas() {

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        if (media >= 5) {
            situacao = "Aprovado(a)";
        } else {
            situacao = "Reprovado(a)";
        }

        exibirResultados();
    }


    public void exibirResultados() {

        System.out.println("************************************************");
        System.out.println("Média do aluno: " + media);
        System.out.println("Resultado: O(a) " + nomeAluno + " está " + situacao);
        System.out.println("************************************************");

    }

}