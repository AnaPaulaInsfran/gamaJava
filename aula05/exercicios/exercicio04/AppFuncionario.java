package exercicios.exercicio04;

import java.util.jar.Manifest;

/**
 * AppFuncionario
 */
public class AppFuncionario {

    public static void main(String[] args) {
        Funcionario func1 = new Funcionario("Ana", 40);

        System.out.println(func1.exibir());
        System.out.println("Salário: $ " + func1.calcularSalario(10));
    }
}