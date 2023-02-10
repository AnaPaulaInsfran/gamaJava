package exercicios;
import java.util.Scanner;

public class Exercicio04 {


    public static void main(String[] args) {


        // Declaração variáveis

        Scanner console = new Scanner (System.in);
        double salarioMinimo, valorKw;
        double valorAPagar, valorComDesconto;
        int qtdeKw;

        // Entrada

        System.out.println("Informe o valor salario minimo: ");
        salarioMinimo = console.nextDouble();

        System.out.println("Digite a qtde de Kw consumido: ");
        qtdeKw = console.nextInt();

        // Processamento

        valorKw = salarioMinimo / 500;
        valorAPagar = qtdeKw * valorKw;
        valorComDesconto = valorAPagar * 0.85;

        // saida

        System.out.println("Um kw custa: " + valorKw);
        System.out.println("O valor a ser pago é: " + valorAPagar);
        System.out.println("Valor com desconto: " + valorComDesconto);

        console.close();


        
    }
}
