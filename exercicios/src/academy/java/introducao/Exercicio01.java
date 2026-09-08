package academy.java.introducao;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio01 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> nomeDespesas = new ArrayList<>();
        List<Double> valoresDespesas = new ArrayList<>();

        System.out.print("Informe seu sálario: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        while (true) {
            System.out.print("Informe o nome da despesa(ou 'fim' para sair): ");
            String nome = scanner.nextLine();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.printf("Digite o valor da despesa %s: \n", nome);
            double valor = scanner.nextDouble();
            scanner.nextLine();

            nomeDespesas.add(nome);
            valoresDespesas.add(valor);


        }
        double totalDespesas = 0;
        for (int i = 0; i < valoresDespesas.size(); i++) {
            totalDespesas += valoresDespesas.get(i);

        }
        double saldoLivre = salario - totalDespesas;

        System.out.println("\n--- RESUMO FINANCEIRO ---");
        System.out.println("Total de despesas: R$ " + totalDespesas);
        System.out.println("Saldo restante: R$ " + saldoLivre);

        if (saldoLivre <= 0) {
            System.out.println("ALERTA: Você gastou mais do que ganha!");
        } else if (saldoLivre < (salario * 0.2)) {
            System.out.println("ATENÇÃO: Sobrou menos de 20% do salário.");
        } else {
            System.out.println("SITUAÇÃO SAUDÁVEL: Sobrou uma boa margem!");
        }

        scanner.close();
    }


}



