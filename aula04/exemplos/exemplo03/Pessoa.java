package exemplos.exemplo03;

public class Pessoa {

    // caracteristicas = ATRIBUTOS
    String nome;
    int idade;

    // ações = METODOS

    void apresentar() {
        System.out.println("Olá! Eu sou o(a) " + nome);
        System.out.println("Tenho " + idade + " anos.");
    }
    // construtor
    Pessoa(String nome, int idade) {
        // nome = "Sem nome";
        // idade = 18;
        this.nome = nome; // this se refere ao objeto (atributo)
        this.idade = idade;

    }


    

}
