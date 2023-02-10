package exercicios;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        
        Scanner console = new Scanner (System.in);
        float nota1, nota2;
        float media;

        // Entrada de Dados

        System.out.println("Digite a nota P1:");
        nota1 = console.nextFloat();

        System.out.println("Digite a nota P2:");
        nota2 = console.nextFloat();

        // Processamento

        media = (nota1 + nota2) / 2;

        // Saída de Dados

        System.out.println("Média do aluno: " + media);


        console.close();



    }
    
}
