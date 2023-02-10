import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {
        

        Scanner console = new Scanner (System.in);
        double salarioBruto, emprestimo, prestacao;
        int parcelas;

        System.out.print("Digite o valor do salário bruto: \nR$ ");
        salarioBruto = console.nextDouble();

        System.out.print("Digite o valor do empréstimo: \nR$ ");
        emprestimo = console.nextDouble();

        System.out.print("Informe a quantidade de parcelas desejada: \n");
        parcelas = console.nextInt();

        prestacao = emprestimo / parcelas;

        if (prestacao <= salarioBruto * 0.3) {

            System.out.println("Aprovado");
            
        } else {

            System.out.println("Reprovado");



        }

        System.out.println("Fim da simulação");


        console.close();
    }
    
}
