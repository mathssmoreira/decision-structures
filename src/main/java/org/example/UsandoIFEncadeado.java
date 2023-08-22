package org.example;

import java.util.Scanner;

public class UsandoIFEncadeado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe seu peso para identificarmos sua categoria: ");
        Double peso = scanner.nextDouble();
        
        Boolean pesoLeve = (peso > 50 && peso <= 80);
        Boolean pesoMedio = (peso >= 81 && peso <= 100);
        Boolean pesoPesado = (peso >= 101);
        
        if (pesoLeve) {
            System.out.print("Sua categoria é a LEVE");
        } else if (pesoMedio) {
            System.out.print("Sua categoria é a MÉDIO");

        } else if (pesoPesado) {
            System.out.print("Sua categoria é a PESADA");
        } else {
            System.out.print("Seu peso não se enquadra em nenhuma das categorias");
        }
    }
}
