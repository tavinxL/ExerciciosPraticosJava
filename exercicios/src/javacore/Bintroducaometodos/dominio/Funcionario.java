package javacore.Bintroducaometodos.dominio;

import java.util.Arrays;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void getInfo() {
        if (salarios == null) {
            System.out.println("ALERTA, ARRAY SALARIOS ESTA VAZIA");
            return;
        }
        System.out.println("Nome: " + nome + " / Idade: " + idade + " / Salários: " + Arrays.toString(salarios));
    }

    public void mediaSalario() {
        if (salarios == null) {
            System.out.println("ALERTA, ARRAY SALARIOS ESTA VAZIA");
            return;
        }
        double media = 0;
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.printf("A média dos 3 salários é de: %.2f", media);

    }

}
