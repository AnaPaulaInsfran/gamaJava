package exemplos;

import java.util.Scanner;

public class Exemplo03 {


    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        double nota;
        final int QTDE_ALUNOS = 5;
        int cont;


        cont = 1;

        while (cont <= qtdeAlunos) {
            System.out.println("Digite a próxima nota: ");
            nota = teclado.nextDouble();
            cont++;


            
        }





        teclado.close();

        
    }
}
