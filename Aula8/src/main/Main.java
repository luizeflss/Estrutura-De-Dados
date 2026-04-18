package Aula8.src.main;
import Aula8.src.model.Cliente;
import Aula8.src.util.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        FilaPrioridade filaSupermercado = new FilaPrioridade();
        Scanner leitor = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            System.out.println("\n--- SISTEMA DE FILA COM PRIORIDADE ---");
            System.out.println("1. Adicionar Cliente");
            System.out.println("2. Atender (Remover) Cliente");
            System.out.println("3. Ver Primeiro da Fila");
            System.out.println("4. Ver Tamanho da Fila");
            System.out.println("5. Exibir Fila Completa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = leitor.nextInt();
            leitor.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = leitor.nextLine();
                    System.out.print("CPF: ");
                    String cpf = leitor.nextLine();
                    System.out.print("Itens: ");
                    int itens = leitor.nextInt();
                    System.out.print("Idade: ");
                    int idade = leitor.nextInt();
                    
                    filaSupermercado.adiciona(new Cliente(nome, cpf, itens, idade));
                    break;
                case 2:
                    Cliente atendido = filaSupermercado.removePrimeiro();
                    if (atendido != null) {
                        System.out.println("Atendendo agora: " + atendido.getNome());
                    } else {
                        System.out.println("Ninguém para atender.");
                    }
                    break;
                case 3:
                    System.out.println("Próximo da fila: " + filaSupermercado.exibePrimeiro());
                    break;
                case 4:
                    System.out.println("Tamanho total: " + filaSupermercado.tamanhoFila());
                    break;
                case 5:
                    filaSupermercado.exibirFila();
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        leitor.close();
    }
}
