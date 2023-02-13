package exercicio;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {

        // variáveis
        Scanner console = new Scanner(System.in);
        int tabuada, cont;

        // entradas
        System.out.println("Digite a tabuada desejada: ");
        tabuada = console.nextInt();

        // processamento

        cont = 0;

        while (cont <=10) {

            // System.out.println(tabuada + " x " + cont + " = " + (tabuada * cont));
            // print formatado (mais limpo)
            // %d = múmero, 2 é o número de casas numéricas
            System.out.printf("%d x %2d = %2d\n", tabuada, cont, (tabuada * cont));
            cont++;

            
        }

        console.close();

    }
}
