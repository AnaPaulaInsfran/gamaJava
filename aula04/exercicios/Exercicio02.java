package exercicios;

import java.util.Scanner;

public class Exercicio02 {
    
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.println("Digite três valores inteiros: ");
        numero1 = console.nextInt();
        numero2 = console.nextInt();
        numero3 = console.nextInt();

        System.out.println("Menor = " + menor(numero1, numero2, numero3));

        console.close();
       
    }

    static int menor(int n1, int n2, int n3) {

        // if (n1 <= n2 && n1 <= n3) {

        //     return n1;
            
        // } else {
        //     if (n2 <= n1 && n2 <= n3) {
        //         return n2;
                
        //     } else {
        //         return n3;
        //     }

        // }

        // if (n1 <= n2) {
        //     if (n1 <= n3) {
        //         return n1;
                
        //     } else {
        //         if(n2 <= n3) {
        //             return n2;
        //         } else {
        //             return n3;
        //         }
        //     }
            
        // } else {
        //     if(n2 <= n3) {
        //         return n2;
        //     } else {
        //         return n3;
        //     }
        // }

        int numeroMenor = n1;
    

        if (n2 < numeroMenor) {
            numeroMenor = n2;
        } 
        if (n3 < numeroMenor) {
            numeroMenor = n3;
        }
        return numeroMenor;
            
        


    }
}
