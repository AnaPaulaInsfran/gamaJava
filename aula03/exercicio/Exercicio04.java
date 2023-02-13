package exercicio;

import java.util.Scanner;

public class Exercicio04 {
    
    public static void main(String[] args) {


        // Variáveis
        Scanner console = new Scanner(System.in);
        double prestacao, salarioBruto, valorParcela;
       

        // entradas
    

        System.out.print("Digite o valor da prestação desejada: \nR$ ");
        prestacao = console.nextDouble();

        System.out.print("Digite o valor do salário bruto: \nR$ ");
        salarioBruto = console.nextDouble();



        valorParcela = salarioBruto * 0.3;



        if (prestacao <= valorParcela) {

            System.out.println("Empréstimo concedido.");
            
        } else {

            System.out.println("Empréstimo reprovado.");


        }




        console.close();
        

    }
}
