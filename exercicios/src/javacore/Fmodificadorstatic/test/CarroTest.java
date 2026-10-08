package javacore.Fmodificadorstatic.test;

import javacore.Fmodificadorstatic.domain.Carro;

public class CarroTest {
    static void main(String[] args) {
        Carro c1 = new Carro("BMW", 270);
        Carro c2 = new Carro("AUDI", 260);
        Carro c3 = new Carro("MERCEDES", 290);

        Carro.setVelocidadeLimite(180);

        c1.imprime();
        c2.imprime();
        c3.imprime();
    }
}
