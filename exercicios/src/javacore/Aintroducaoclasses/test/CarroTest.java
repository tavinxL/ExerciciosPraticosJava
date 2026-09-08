package javacore.Aintroducaoclasses.test;

import javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest {
    static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();

        carro.nome = "Chevrolet";
        carro.modelo = "Tracker";
        carro.ano = 2020;
        System.out.println("Nome: "+carro.nome+ "\n" + "Modelo: "+carro.modelo+ "\n" + "Ano: "+ carro.ano);

        System.out.println("-------------");

        carro2.nome = "Wolkswagen";
        carro2.modelo = "Jetta GLI";
        carro2.ano = 2025;
        System.out.println("Nome: "+carro2.nome+ "\n" + "Modelo: "+carro2.modelo+ "\n" + "Ano: "+ carro2.ano);


    }
}
