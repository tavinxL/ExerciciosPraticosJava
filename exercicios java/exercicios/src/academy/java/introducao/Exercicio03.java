package academy.java.introducao;

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Exercicio03 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        File arquivo = new File("alunosnota.txt");
        List<String> nomeAluno = new ArrayList<>();
        List<Double> notaAluno = new ArrayList<>();
        if (arquivo.exists()) {
            try {
                Scanner leitorArquivo = new Scanner(arquivo);

                while (leitorArquivo.hasNextLine()) {
                    String linha = leitorArquivo.nextLine();

                    if (!linha.isEmpty()) {
                        String[] partes = linha.split(";");

                        String nomeLido = partes[0];
                        double notaLida = Double.parseDouble(partes[1]);

                        nomeAluno.add(nomeLido);
                        notaAluno.add(notaLida);
                    }
                }
                leitorArquivo.close();
                System.out.println("-> Dados anteriores carregados com sucesso!");
            } catch (IOException e) {
                System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            }
        }

        boolean rodando = true;
        double media = 0;

        while (rodando) {
            System.out.println("[ 1 ]  Adicionar aluno");
            System.out.println("[ 2 ]  Mostrar alunos Aprovados/Reprovados");
            System.out.println("[ 3 ]  Remover aluno");
            System.out.println("[ 4 ]  Sair");
            System.out.print("Digite uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {

                case 1:
                    System.out.print("Digite o nome do aluno: ");
                    String nome = scanner.nextLine();

                    System.out.printf("Digite a nota 1 do aluno %s: ", nome);
                    double nota1 = scanner.nextDouble();
                    System.out.printf("Digite a nota 2 do aluno %s: ", nome);
                    double nota2 = scanner.nextDouble();
                    media = (nota1 + nota2) / 2;


                    nomeAluno.add(nome);
                    notaAluno.add(media);
                    System.out.println("Aluno adicionado com sucesso");
                    break;

                case 2:
                    if (nomeAluno.isEmpty()) {
                        System.out.println("Nenhum aluno encontrado");
                    } else {
                        for (int i = 0; i < notaAluno.size(); i++) {
                            if (notaAluno.get(i) >= 7) {
                                System.out.println("[" + i + "] Aluno: " + nomeAluno.get(i) + " | Média: " + notaAluno.get(i) + " | Aprovado");
                            } else {
                                System.out.println("[" + i + "] Aluno: " + nomeAluno.get(i) + " | Média: " + notaAluno.get(i) + " | Reprovado");
                            }

                        }
                    }
                    break;

                case 3:
                    if (nomeAluno.isEmpty()) {
                        System.out.println("Nenhum aluno encontrado");
                    } else {
                        System.out.print("Digite o indice do aluno: ");
                        int indice = scanner.nextInt();
                        scanner.nextLine();

                        if (indice > 0 && indice < nomeAluno.size()) {
                            nomeAluno.remove(indice);
                            notaAluno.remove(indice);
                            System.out.println("Aluno removido");
                        } else {
                            System.out.println("Indice incorreto");
                        }
                    }
                    break;

                case 4:
                    try {
                        PrintWriter gravador = new PrintWriter(new FileWriter(arquivo));

                        for (int i = 0; i < nomeAluno.size() ; i++) {
                            gravador.println(nomeAluno.get(i) + ";" + notaAluno.get(i));
                        }
                        gravador.close();
                        System.out.println("-> Arquivo 'alunos.txt' atualizado e salvo no disco!");

                    } catch (IOException e) {
                        System.out.println("Erro ao salvar no arquivo: " + e.getMessage());
                    }
                    rodando = false;
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção incorreta...");
            }


        }
    }
}
