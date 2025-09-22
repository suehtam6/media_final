package br.senai.sp.jandira.ds1t.mediaFinal.model.model;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class MediaFinal {

    String nomeAluno;
    String situacao;
    double nota1;
    double nota2;
    double nota3;
    double nota4;
    double media;


    public void getData() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("**CÁLCULO DE MÉDIA ESCOLAS**");
        System.out.println("---------------------------------------");

        System.out.print("Digite o nome do aluno:");
        nomeAluno = leitor.nextLine();

        System.out.print("Digite a primeira nota:");
        nota1 = leitor.nextDouble();


        System.out.print("Digite a segunda nota:");
        nota2 = leitor.nextDouble();


        System.out.print("Digite a terceira nota:");
        nota3 = leitor.nextDouble();

        System.out.print("Digite a quarta nota:");
        nota4 = leitor.nextDouble();

        System.out.println("---------------------------------------");

        calcularMedia();

    }

    public void calcularMedia() {

        double somaDasNotas = nota1 + nota2 + nota3 + nota4;
        media = somaDasNotas /4;



       determinarSituacao();
    }


    public void determinarSituacao(){


        if (media >= 5.0) {
            situacao = "A P R O V A D O (A)";
        } else if (media < 3.0) {
            situacao = "R E P R O V A D O(A)";
        } else {
            situacao = "R E C U P E R A Ç Ã O";
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