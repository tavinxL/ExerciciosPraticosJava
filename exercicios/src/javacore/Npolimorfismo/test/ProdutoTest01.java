package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Monitor;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest01 {
    static void main(String[] args) {
        Produto produto01 = new Computador("AtonI7", 7000);
        Monitor monitor = new Monitor("AOC27POL", 2000);
        produto01.setDataValidade("11/12/2027");
        CalculadoraImposto.calcularImposto(produto01);
        System.out.println("----------------------------");
        monitor.setDataValidade("11/12/2026");
        CalculadoraImposto.calcularImposto(monitor);
    }
}
