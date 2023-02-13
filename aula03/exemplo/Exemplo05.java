package exemplo;

import java.util.Scanner;

public class Exemplo05 {
    public static void main(String[] args) {

        // variáveis
        Scanner console = new Scanner(System.in);
        int cont; // conta quantas notas serão digitadas
        double nota, soma, media;
        final int QTDE_NOTAS = 3;

        // entradas
        soma = 0; // acumulador das notas digitadas
        cont = 1;

        // processamento
        while (cont <= QTDE_NOTAS) {

            System.out.printf("Digite a nota (%d / %d): ", cont, QTDE_NOTAS);
            nota = console.nextDouble();
            soma = soma + nota;
            cont++; 
        }

        media = soma / QTDE_NOTAS;
        System.out.printf("A média das notas é: %.2f\n", media);


        console.close();
    }
}
