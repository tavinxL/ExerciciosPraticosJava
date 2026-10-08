package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Escola;
import javacore.Gassociacao.dominio.Professor;

public class Escolatest01 {
    static void main(String[] args) {
        Professor professor1 = new Professor("Jiraya");
        Professor professor2 = new Professor("JJJ");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola(professores, "Jva");

        escola.imprime();
    }
}
