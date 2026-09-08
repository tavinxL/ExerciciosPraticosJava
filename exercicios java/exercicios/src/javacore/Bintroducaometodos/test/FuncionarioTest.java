package javacore.Bintroducaometodos.test;

import javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest {
    static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.nome = "Otavio";
        funcionario.idade = 18;
        funcionario.salarios = new double[]{1500, 2000, 3000};

        funcionario.getInfo();

        System.out.println("-------------------------");

        funcionario.mediaSalario();
    }

}
