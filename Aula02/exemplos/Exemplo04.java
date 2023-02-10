package exemplos;
import java.util.Scanner;

public class Exemplo04 {

    public static void main(String[] args) {
        
        Scanner console = new Scanner(System.in);
        String nome;

        System.out.println("Digite o seu nome:");

        nome = console.nextLine();

        System.out.println("Olá, " + nome+"!");


        console.close();

    }
    
}
