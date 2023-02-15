package exercicios.exercicio03;

public class Exercicio03 {

    public static void main(String[] args) {
        
        Carro meuCarro = new Carro("X1", "BMW", -0.5);

        meuCarro.apresentar();

        meuCarro.setConsumo(5);

        // meuCarro.consumo = -7; não é permitido pois o atributo é privDO

        System.out.println("Consumo: " + meuCarro.getConsumo());
    }
    
}
