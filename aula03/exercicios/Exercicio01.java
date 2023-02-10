package exercicios;

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {

        //variaves
        
        Scanner console = new Scanner (System.in);
        int numero;
        double metade;

        // entrada
        
        System.out.println("Digite um número inteiro: ");
        numero = console.nextInt ();

        // processamento

        if (numero > 20) {



            metade = (double) numero / 2; // casting

        

            System.out.println(metade);
            
        }






        console.close();
    }
}