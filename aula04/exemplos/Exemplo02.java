package exemplos;

public class Exemplo02 {
    
    public static void main(String[] args) {
        int calculo;

       calculo = soma(5, 7);

        System.out.println(calculo);
        // System.out.println(soma(5, 7));
    }

    static int soma(int numero1, int numero2) {

        int resultado;

        resultado = numero1 + numero2;

        return resultado;

        // 10  % 2 = 0
        //11 % 2 = 1 //  calcula o resto da divisão de divisor 2
        // 13 % 2 = 1
    }
}
