package exemplo;

import java.util.Scanner;

public class Exemplo02 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        double nota;

        System.out.println("Digite a nota do aluno: ");
        nota = console.nextDouble();

        if (nota >=6) {

            System.out.println("Aprovado");
            
        } else {

            System.out.println("Reprovado");
        }


        console.close();

    }
    
}
