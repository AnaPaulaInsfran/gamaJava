package exercicio;

import java.util.Scanner;

public class Exercicio02 {
    
public static void main(String[] args) {

    // declaração das variáveis
    
    Scanner console = new Scanner(System.in);
    double nota1, nota2, media;

    // entradas

    System.out.println("Digite a nota P1: ");
    nota1 = console.nextDouble();

    System.out.println("Digite a nota P2: ");
    nota2 = console.nextDouble();

    // procesamento

    // media = ((nota1 * 40) + (nota2 * 60)) / 100
    // media - ((nota1 * 4) + (nota2 * 6)) / 10

    media = (nota1 * 0.4) + (nota2 * 0.6);

    // saídas

    if (media >= 6.0) {

        System.out.println("Aprovado");
        
    } else {

        System.out.println("Reprovado");
    }



    console.close();
}
}
