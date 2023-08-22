package org.example;

import java.util.Scanner;

/*
 *       Crie um programa que vai receber as notas que uma pessoa tirou nas duas materias de sua prova.
 *       Serão dois parâmetros para receber um para receber a nota de português e outro para receber as de matemática.
 *       A prova, no total, vale 200 pontos - 100 para cada matéria. A nota mínima total para passar é igual ou maior que 150.
 *       Entretanto, o candidato não pode tirar menos do que 60 pontos em qualquer uma das duas matérias, ou seja, se tirar
 *       59 em português e 100 em matemática (totalizando uma nota maior do que o total necessário que é 150) ele não conseguirá a vaga.
 *       No final mostre para o candidato se ele conseguiu ou não.
 */
public class ExercDeDecisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Double notaCandidato;

        System.out.print("\n");
        System.out.println("******* NOTAS DE CORTE *******");
        System.out.println( "     PORTUGUÊS = 60 PONTOS ");
        System.out.println("    MATEMÁTICA = 60 PONTOS ");
        System.out.println("   TOTAL GERAL = 150 PONTOS" );
        System.out.println("******************************");
        System.out.print("\n");

        System.out.print("Informe sua nota na prova de PORTUGÊS: ");
        Double provaPortugues = scanner.nextDouble();

        System.out.print("Informe sua nota na prova de MATEMÁTICA: ");
        Double provaMatematica = scanner.nextDouble();

        notaCandidato = provaPortugues + provaMatematica;

        if (provaPortugues < 60) {
            System.out.println("Você não atingiu a nota mínima na prova de PORTIUGUÊS (60 pontos) ");

        } else if (provaMatematica < 60) {
            System.out.println("Você não atingiu a nota mínima na prova de MATEMÁTICA (60 pontos) ");

        } else if (notaCandidato < 150){
            System.out.println("Você não atingiu a nota de corte (150 pontos) ");

        } else {
            System.out.println("Sua nota foi "+ notaCandidato + " pontos" + " Parabéns você atingiu a nota de corte ");

        }


    }
}