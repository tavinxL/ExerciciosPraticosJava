package javacore.Gassociacao.test;

import javacore.Gassociacao.dominio.Jogador;
import javacore.Gassociacao.dominio.Time;

public class Jogadortest02 {
    static void main(String[] args) {
        Jogador jogador1 = new Jogador("Pele");
        Time time = new Time("CBF");
        jogador1.setTime(time);
        jogador1.imprime();
    }
}
