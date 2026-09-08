package academy.java.introducao;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


public class BancoJava {
    public void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File arquivo = new File("saldo.txt");
        double saldoConta = 0;

        if (arquivo.exists()) {
            try {
                Scanner leitorArquivo = new Scanner(arquivo);
                while (leitorArquivo.hasNextLine()) {
                    String linha = leitorArquivo.nextLine();

                    if (!linha.isEmpty()) {
                        //String[] partes = linha.split(";");

                        double saldoLido = Double.parseDouble(linha);
                        saldoConta = saldoLido;
                    }
                }
                leitorArquivo.close();
                System.out.println("Arquivo carregado com sucesso");
            } catch (IOException e) {
                System.out.println("Falha ao carregar o arquivo");
            }
        }

        boolean rodando = true;


        while (rodando) {
            System.out.println("[ 1 ] Depositar dinheiro");
            System.out.println("[ 2 ] Sacar dinheiro");
            System.out.println("[ 3 ] Ver extrato");
            System.out.println("[ 4 ] Sair");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.println("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    scanner.nextLine();

                    if (valorDeposito <= 0) {
                        System.out.println("Erro: o valor deve ser maior que zero!\n");
                    } else {
                        saldoConta += valorDeposito;
                        System.out.printf("R$ %.2f adicionado na sua conta\n\n", valorDeposito);
                    }
                    break;

                case 2:
                    System.out.println("Digite o valor que deseja sacar: ");
                    double valorSaque = scanner.nextDouble();
                    scanner.nextLine();

                    if (valorSaque <= 0) {
                        System.out.println("Erro: o valor deve ser maior que zero!\n");
                    } else if (valorSaque > saldoConta) {
                        System.out.println("Erro: saldo insuficiente!\n");
                    } else {
                        saldoConta -= valorSaque;
                        System.out.printf("R$ %.2f retirado da sua conta\n\n", valorSaque);
                    }
                    break;


                case 3:
                    System.out.println("---EXTRATO BANCÁRIO---");
                    System.out.printf("R$ %.2f\n\n", saldoConta);
                    break;

                case 4:
                    try {
                        PrintWriter gravador = new PrintWriter(new FileWriter(arquivo));
                        gravador.println(saldoConta);
                        gravador.close();
                        System.out.println("Arquivo gravado com sucesso");
                    } catch (IOException e) {
                        System.out.println("Erro ao gravar arquivo");
                    }
                    rodando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente");
            }

        }

    }
}
