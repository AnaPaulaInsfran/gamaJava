package exercicio;

import java.util.Scanner;

public class Exercicio07 {
    
    public static void main(String[] args) {
        
        //variáveis
        Scanner console = new Scanner(System.in);
        double salario;

        // entrada

        System.out.println("Digite seu salário: ");
        salario = console.nextDouble();

        if (salario <= 600) {

            System.out.println("Desconto do INSS: isento");
            
        } else {

            if (salario <= 1200) {

                System.out.println("Desconto do INSS: 20%");
                
            } else {

                if (salario <= 2000) {

                    System.out.println("Desconto do INSS: 25%");
                    
                } else {

                    System.out.println("Desconto do INSS: 30%");
                }
            }
        }
      
        console.close();
    }
}
