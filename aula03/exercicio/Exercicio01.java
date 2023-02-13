package exercicio;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {


        Scanner console = new Scanner(System.in);
        int numero;
        double resultado;

        System.out.println("Digite um número inteiro: ");
        numero = console.nextInt();

        if (numero >20) {

            resultado = numero / 2.0;

            System.out.println(resultado);


            
        }






        console.close();

    }
    
}
