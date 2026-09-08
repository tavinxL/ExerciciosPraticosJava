package academy.java.introducao;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Exercicio02 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> tarefas = new ArrayList<>();
        List<String> prioridades = new ArrayList<>();

        boolean rodando = true;

        while (rodando) {
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Listar todas as tarefas");
            System.out.println("3 - Concluir/Remover tarefa");
            System.out.println("4 - Sair do Programa");

            System.out.print("Escolha um opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Descrição da tarefa: ");
                    String descricao = scanner.nextLine();

                    System.out.print("Prioridade (Alta / Média / Baixa): ");
                    String prioridade = scanner.nextLine();

                    tarefas.add(descricao);
                    prioridades.add(prioridade.toUpperCase());
                    System.out.println("-> Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("\n--- SUAS TAREFAS ---");
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada");
                    } else {
                        for (int i = 0; i < tarefas.size(); i++) {
                            System.out.println("[" + i + "] Prioridade: " + prioridades.get(i) + " | Tarefa: " + tarefas.get(i));
                        }

                    }
                    break;

                case 3:
                    if (tarefas.isEmpty()) {
                        System.out.println("Nenhuma tarefa encontrada");
                    } else {
                        System.out.print("Digite o indice da tarefa que deseja remover: ");
                        int indice = scanner.nextInt();

                        if (indice > 0 && indice < tarefas.size()) {
                            tarefas.remove(indice);
                            prioridades.remove(indice);
                            System.out.println("Tarefa removida com sucesso");
                        } else {
                            System.out.println("Indice incorreto");
                        }
                    }
                    break;
                case 4:
                    rodando = false;
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }
        scanner.close();
    }
}
