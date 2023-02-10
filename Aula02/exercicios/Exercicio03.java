package exercicios;

import java.util.Scanner;

/**
 * Exercicio03
 */
public class Exercicio03 {

    public static void main(String[] args) {

        // variáveis

        Scanner console = new Scanner (System.in);
        double salario;
        double aumento;
        double novoSalario;

        // entradas

        System.out.print("Informe salário atual: \nR$ ");
        salario = console.nextDouble();

        // processamento

        aumento = salario * 0.25;
        novoSalario = salario + aumento;


        // saida

        System.out.println("Você terá um aumento de: \nR$ "+ aumento);

        System.out.println("Novo salário: \nR$ " + novoSalario);




        console.close();
    }
}