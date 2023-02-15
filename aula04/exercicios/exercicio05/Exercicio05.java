package exercicios.exercicio05;

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {
        //variaveis
        Scanner entrada = new Scanner(System.in);
        String titulo, autor;
        int numeroPaginas, opcaoMenu = 0;
        Ebook livro; // se não criar a variável eu não consigo puxar as informações dele

        System.out.print("Qual o título do livro? ");
        titulo = entrada.nextLine();
        System.out.print("Qual o nome do autor? ");
        autor = entrada.nextLine();
        System.out.print("Qual o número de páginas? ");
        numeroPaginas = entrada.nextInt();

        livro = new Ebook(titulo, autor, numeroPaginas);

        System.out.println("Livro criado: ");
        livro.mostrarCapa();

        while (opcaoMenu != 4) {
            System.out.println("1 - mostrar a capa");
            System.out.println("2 - próxima página");
            System.out.println("3 -  página anterior");
            System.out.println("4 - sair");
            opcaoMenu = entrada.nextInt();

            switch (opcaoMenu) {
                case 1:
                    livro.mostrarCapa();
                    break;
                case 2:
                livro.avancarPagina();
                    System.out.println("Página atual" + livro.exibirPagina());
                    break;
                case 3:
                    System.out.println("Você escolehu 3.");
                    break;
                case 4:
                    System.out.println("Você escolehu 4.");
                    break;
            
                default:
                System.out.println("Opção inválida");
                    break;
            }

            
        }




        entrada.close();









        // Ebook livro1 = new Ebook("Um estranho no espelho", "Sidney Sheldon", 600);
        // livro1.mostrarCapa();

        // // teste para ver se está funcionando
        // for (int i = 0; i < 8; i++) {
        //     livro1.retrocederPagina();     // avancarPagina  
        // }

        // livro1.irParaPagina(10);
        // System.out.println("Pagina atual: " + livro1.exibirPagina());

        // while (livro1.exibirPagina() != 0) {
        //     livro1.retrocederPagina(); 
        // }
        // livro1.mostrarCapa();


   


    
       

    }

}

    



