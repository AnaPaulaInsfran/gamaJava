package exemplo;

public class Exemplo04 {

    public static void main(String[] args) {
        
        int cont, soma;

        soma = 0;
        cont = 0;

        while (cont <5) {

            System.out.println(cont + "+");
            soma = soma + cont;
            cont++;
            
        }

        System.out.println("= " + soma);
    }
    
}
