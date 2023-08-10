package br.senai.sp.escola;

import java.util.Scanner;

public class Escola {
    public static void main(String[] args) {
        /**Declara variaveis*/

        String nomeAluno;
        String disciplina;
        String professor;
        int frequencia;
        int nota1;
        int nota2;
        float mediaAluno;
        String situacao;
        boolean continuar = true;



        /** Instanciar o teclado*/

        Scanner teclado = new Scanner(System.in);

        while(continuar) {


            /**Coleta dados*/
            System.out.println("-----------------------------");
            System.out.println("Olá profº, qual seu nome?");
            professor = teclado.nextLine();
            System.out.println("Informe o nome do seu aluno:");
            nomeAluno = teclado.nextLine();
            System.out.println("Informe sua disciplina: ");
            disciplina = teclado.nextLine();
            System.out.println("Informe a frequência do aluno: ");
            frequencia = teclado.nextInt();
            System.out.println("Informe a nota 1: ");
            nota1 = teclado.nextInt();
            System.out.println("Informe a nota 2: ");
            nota2 = teclado.nextInt();
            System.out.println("-----------------------------");

            /** Avaliação do aluno*/
            boolean validacao = (professor.equalsIgnoreCase("vitor"));

            mediaAluno = (nota1 + nota2) / 2;
            System.out.println(mediaAluno);

            if ((mediaAluno >= 6 && frequencia >= 90) && !validacao || (mediaAluno >= 7 && frequencia >= 75 && !validacao)) {
                situacao = "Aluno aprovado!";
            } else {
                situacao = "Aluno reprovado!";
            }

            System.out.println("Olá profº " + professor + ". Seja bem vindo, é um prazer tê-lo aqui. Sua disciplina é " + disciplina);
            System.out.println(" O nome do seu aluno é " + nomeAluno);
            System.out.println("Suas notas são " + nota1 + " e " + nota2 + ". Logo, a média dele é " + mediaAluno);
            System.out.println(situacao);

            System.out.println("Deseja cadastrar mais alunos? ");
            String respPROF = teclado.next();

            if (respPROF.equalsIgnoreCase("nao")) {
                continuar = false;
            }

        }

        System.out.println("Cadastros finalizados com sucesso");
    }


}
