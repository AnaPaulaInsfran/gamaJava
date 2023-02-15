package exercicios.exercicio04;

public class Funcionario {

    private String nome;
    private double valorPorHora; // horasTrabalhadas


    public Funcionario(String nome, double valorPorHora) {
        this.nome = nome;
        this.valorPorHora = valorPorHora;

    }

    // public void setHorasTrabalhadas(double numeroHoras) {
    //     this.horasTrabalhadas = numeroHoras;
    // }

    public void setValorPorHora(double novoValor) {
        valorPorHora = novoValor;
    }

    public String exibir() {
        return nome + " - R$ " + valorPorHora;
    }

    public double calcularSalario(double numeroHoras) {
        return valorPorHora * numeroHoras;

    }




    
}
