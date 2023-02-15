package exercicios.exercicio02;

public class Animal {

    // atributos
    private String nomeAnimal, raca;
    private int anoNascimento;
    private Proprietario proprietario;

    public String nomeAnimal() {
        return "Nome do animal: " + nomeAnimal;
    }

    public String raca() {
        return "Raça: " + raca;
    }

    public void anoNascimento() {
        System.out.println("Ano do nascimento: " + anoNascimento);
    }

    public void dadosAnimal() {
        System.out.println(("Nome do animal: " + nomeAnimal));
        System.out.println("Raça: " + raca);
        System.out.println("Ano do nascimento: " + anoNascimento);
    }


    










    
}