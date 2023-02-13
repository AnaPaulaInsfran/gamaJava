package exercicio;

import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String[] args) {
        
        // vairáveis
        Scanner console = new Scanner(System.in);
        int limite, numero;

        // entradas
        System.out.println("Digite o valor limite: ");
        limite = console.nextInt();

        // solução 01
        System.out.println("\nSolução 1: ");
        numero = 1;
        while (numero <= limite) {

            if (numero * 2 <= limite) { // próximo = 2 * número
                System.out.print(numero + " , ");
            } else {
                System.out.print(numero);
            }
            numero = numero * 2;
            
        }

        // solução 2
        System.out.println("\nSolução 2: ");
        numero = 1;
        while (numero <= limite) {
            System.out.print(numero);
            numero *=2;
            if (numero <= limite) {
                System.out.print(" , ");
                
            }
            
        }
  


        console.close();
    }
}
