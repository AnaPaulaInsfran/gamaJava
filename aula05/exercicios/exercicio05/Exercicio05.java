package exercicios.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int QTE_NOMES = 3;
        String nomes[] = new String[QTE_NOMES];



        for (int i = 0; i < nomes.length; i++) {
            System.out.printf("Digite o %d° nome: ", i + 1);
            nomes[i] = scanner.nextLine();
            
        }

        // nomes[0] = "Ana";
        // nomes[1] = "Paula";
        // nomes[2] = "Vanessa";
        // nomes[3] = "Graziela";
        // nomes[4] = "Carmen";
        // nomes[5] = "Clementino";
        // nomes[6] = "Leandro";


        System.out.println("Nomes lidos: ");
        for (int i = 2; i < nomes.length; i--) {

            System.out.println("Nomes: " + nomes[i]);
            
        }

        scanner.close();
    }
    
}
