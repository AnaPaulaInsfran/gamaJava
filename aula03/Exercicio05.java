import java.util.Scanner;

public class Exercicio05 {
    
    public static void main(String[] args) {
        
        Scanner console = new Scanner (System.in);

        String nomeUsuario;
        String senha;
        boolean valida;

        System.out.println("Digite o nome do usuário: ");
        nomeUsuario = console.nextLine();
        

        System.out.println("Digite a senha: ");
        senha = console.nextLine();

        // valida = senha.equals("R10p5");

        valida = senha.equalsIgnoreCase("R10p5");

        if (valida) {

            System.out.println("Senha correta");
            
        } else {

            System.out.println("Senha incorreta");
        }





        console.close();
    }
}
