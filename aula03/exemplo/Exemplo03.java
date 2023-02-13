package exemplo;

import java.util.Scanner;

public class Exemplo03 {
    
    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro: ");
        numero = console.nextInt();

        if (numero >=0) {

            System.out.println(numero + " é positivo.");
            
        } else {
            
            System.out.println(numero + " é negativo.");
            
        
        }


        console.close();
    }
}
