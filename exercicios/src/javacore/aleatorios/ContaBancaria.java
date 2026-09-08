package javacore.aleatorios;

import java.util.Scanner;

public class ContaBancaria {
    private String titular;
    private double saldo;
    private String senha;

    public ContaBancaria(String titular, double saldoInicial, String senha) {
        this.titular = titular;
        this.saldo = saldoInicial;
        this.senha = senha;
    }

    public boolean depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
            return true;
        }
        return false;
    }

    public boolean sacar(double valor, String senhaDigitada) {
        if (!senhaDigitada.equals(senha)) {
            System.out.println("Senha incorreta!");
            return false;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente!");
            return false;
        }

        if (valor <= 0) {
            System.out.println("Valor deve ser positivo!");
            return false;
        }

        saldo = saldo - valor;  // BUG: aqui tem problema
        return true;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    // BUG: esse método deveria retornar boolean mas tem lógica errada (check)
    public boolean transferir(ContaBancaria destino, double valor, String senhaDigitada) {
        if (sacar(valor, senhaDigitada)) {
            destino.depositar(valor);
            System.out.println("Transferência realizada!");
            return true;

        }
        System.out.println("Transferência falhou!");
        return false;
    }

    public void exibir() {
        System.out.println("=== CONTA ===");
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }

    static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Otavio", 10000, "6769");
        ContaBancaria conta2 = new ContaBancaria("Maria", 2000, "9999");

        System.out.println(conta.depositar(5000));
        System.out.println(conta.sacar(2000, "6769"));
        System.out.println(conta.getSaldo());
        System.out.println(conta.getTitular());
        System.out.println(conta.transferir(conta2, 1000, "6769"));
        conta.exibir();

    }
}
