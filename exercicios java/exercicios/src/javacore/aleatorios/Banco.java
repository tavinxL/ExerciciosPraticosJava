package javacore.aleatorios;

import java.util.Scanner;

public class Banco {
    public String titularConta;
    public double saldo;

    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        banco.titularConta = "Otávio";
        banco.saldo = 0;

        System.out.println(banco.depositar(scanner));
        System.out.println(banco.depositar(scanner));
        System.out.println(banco.consultarSaldo());
        System.out.println(banco.sacar(scanner));
        System.out.println(banco.consultarSaldo());
        System.out.println(banco.sacar(scanner));
        System.out.println(banco.consultarSaldo());

        scanner.close();
    }

    public double depositar(Scanner scanner) {
        System.out.println("Nome do titular = " +titularConta);
        System.out.println("Valor que deseja depositar: ");
        double valorDeposito = scanner.nextDouble();
        scanner.nextLine();
        saldo += valorDeposito;
        System.out.print("Saldo atualizado = ");
        return saldo;
    }

    public double sacar(Scanner scanner) {
        System.out.println("Nome do titular = " +titularConta);
        System.out.println("Insira o valor de saque: ");
        double valorSaque = scanner.nextDouble();
        scanner.nextLine();
        if (valorSaque > saldo) {
            System.out.println("Saque indisponivel");
        } else {
            saldo -= valorSaque;
        }
        System.out.print("Saldo atualizado = ");
        return saldo;
    }

    public double consultarSaldo() {
        System.out.println("Seu saldo é de = ");
        return saldo;
    }




}
