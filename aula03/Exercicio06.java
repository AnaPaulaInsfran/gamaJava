import java.util.Scanner;



public class Exercicio06 {

    public static void main(String[] args) {
        
        Scanner console = new Scanner (System.in);

        double salario;
        

        System.out.println("Informe seu salário: \nR$ ");
        salario = console.nextDouble();

    if (salario <= 600.00) {

        System.out.println("Desconto INSS: isento");

    } else {

            if (salario <= 1200.00) {

                System.out.println("Desconto INSS: 20%"); 
            } else 
                if (salario <= 2000.00) {

                    System.out.println("Desconto INSS: 25%");
                    
                } else 

                System.out.println("Desconto INSS: 30%");
                    
                }

    console.close();
    
            }
            

                


                
            


        
    





    }
    

