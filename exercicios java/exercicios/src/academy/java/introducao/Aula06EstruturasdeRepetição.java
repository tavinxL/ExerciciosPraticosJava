package academy.java.introducao;

public class Aula06EstruturasdeRepetição {
    static void main(String [] args) {

        double valorCarro = 30000;
        double valorParcela = 0;

        for (int parcela = 1; parcela <= valorCarro; parcela++) {
            valorParcela = valorCarro / parcela;
            if (valorParcela < 1000) {
                break;
            }
                System.out.printf("Parcela %d : R$ %.2f\n", parcela, valorParcela);
        }
    }
}
