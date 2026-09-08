package academy.java.introducao;

public class aula05EstruturasCondicionais {
    static void main(String[] args) {
        double salarioEuro = 25000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;

        if (salarioEuro <= 34712) {
            valorImposto = salarioEuro * primeiraFaixa;
            System.out.printf("O valor do imposto é de %.2f" , valorImposto);
        } else if (salarioEuro >= 34713 && salarioEuro <= 68507) {
            valorImposto = salarioEuro * segundaFaixa;
            System.out.printf("O valor do imposto é de %.2f", valorImposto);
        } else {
            valorImposto = salarioEuro * terceiraFaixa;
            System.out.printf("O valor do imposto é de %.2f", valorImposto);
        }




    }
}
