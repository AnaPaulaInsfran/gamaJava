import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {
        //vaiáveis
       Scanner teclado = new Scanner (System.in);
       double nota1;
       double nota2;
       double media;

       // entradas
    
       System.out.println("Informe a nota da prova 1: ");
       nota1 = teclado.nextDouble();

       System.out.println("Informe a nota da prova 2: ");
       nota2 = teclado.nextDouble();

       // processamento

       // media = (nota1 * 40) + (nota2 * 60) / 100;
       // media = (nota1 * 4) + (nota2 * 6) / 10;


       media = (nota1 * 0.4) + (nota2 * 0.6);

       // saídas

       if (media >= 6.0) {

        System.out.println("\nAluno Aprovado");
        
       } else {

        System.out.println("\nAluno Reprovado");
       }

       

       teclado.close();


    }
}
