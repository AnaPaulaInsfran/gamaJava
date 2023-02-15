package exercicios;

import java.util.Scanner;

/**
 * Exercicio01
 */
public class Exercicio01 {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = console.nextInt();

        par (numero);

        if (ehPar(numero)) {

            System.out.println(numero + " é par.");
            
        } else {
            System.out.println(numero + " é impar.");
        }




        console.close();
        
    }


    static void par(int valor) {
        int sobra;

        sobra = valor % 2;

        if (sobra == 0) {

            System.out.println(valor + " é par.");
            
        } else {

            System.out.println(valor + " é ímpar.");
        }

    }

    
    static boolean ehPar(int valor) {
       // int sobra;

        // sobra = valor % 2;

       // if (sobra == 0) {

        //    return true;
            
       // } else {
       //     return false;

      
      
      // if ((valor % 2) ==0) {

        // return true;

      // } else{
      //  return false;

      return (valor % 2) == 0;

       }


        

        

    }









