package javacore.Npolimorfismo.servico;


import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Monitor;
import javacore.Npolimorfismo.dominio.Produto;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println("Relatorio de Imposto");
        double imposto = produto.calcularImposto();
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor do produto: " + produto.getValor());
        System.out.println("Imposto a pagar: " + imposto);
        if (produto instanceof Monitor) {
            Monitor monitor = (Monitor) produto;
            System.out.println(monitor.getDataValidade());
        } else {
            if (produto instanceof Computador) {
                Computador computador = (Computador) produto;
                System.out.println(computador.getDataValidade());
            }
        }
    }
}
