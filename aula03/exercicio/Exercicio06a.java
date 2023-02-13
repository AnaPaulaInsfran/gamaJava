package exercicio;

import java.util.Scanner;

public class Exercicio06a {
    
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        double nota;

        System.out.println("Digite a nota do aluno: ");
        nota = console.nextDouble();

        if (nota < 7.0) {

            if (nota >= 5) {

                System.out.println("Exame.");
                
            } else {

                System.out.println("Reprovado.");
            }
            
        } else {

            System.out.println("Aprovado.");
        }



        console.close();



    }
}
