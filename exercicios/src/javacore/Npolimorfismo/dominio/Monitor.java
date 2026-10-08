package javacore.Npolimorfismo.dominio;

public class Monitor extends Produto {
    public static final double IMPOSTO_POR_CENTO = 0.11;
    public Monitor(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImposto() {
        System.out.println("Calculando imposto do monitor");
        return this.valor * IMPOSTO_POR_CENTO;
    }
}
