package javacore.Lclassesabstratas.test;

import javacore.Lclassesabstratas.dominio.Desenvolvedor;
import javacore.Lclassesabstratas.dominio.Funcionario;
import javacore.Lclassesabstratas.dominio.Gerente;

public class FuncionarioTest01 {
    static void main(String[] args) {
        Desenvolvedor desenvolvedor = new Desenvolvedor("Otavio", 10000);
        Gerente gerente = new Gerente("Pedro", 15000);

        System.out.println(desenvolvedor);
        System.out.println(gerente);
    }
}
