package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.ImpressoraImprime;
import javacore.Aintroducaoclasses.dominio.Pessoa;

public class PessoaTest01 {
    static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa.nome = "Otavio";
        pessoa.idade = 18;
        pessoa.sexo = 'M';

        pessoa2.nome = "TUTU";
        pessoa2.idade = 20;
        pessoa2.sexo = 'F';

        pessoa.imprime();

        pessoa2.imprime();
    }
}
