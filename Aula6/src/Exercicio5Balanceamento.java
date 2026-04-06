package Aula6.src;

import java.util.Scanner;

public class Exercicio5Balanceamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a expressão: ");
        String expressao = scanner.nextLine();

        if (validaBalanceamento(expressao)) {
            System.out.println("Resultado: Expressão balanceada.");
        } else {
            System.out.println("Resultado: Expressão desbalanceada.");
        }

        scanner.close();
    }

    public static boolean validaBalanceamento(String sequencia) {
        int n = sequencia.length();
        
        // Criamos um array para servir de pilha. 
        // O tamanho máximo necessário é o comprimento da própria string.
        char[] pilha = new char[n];
        int topo = -1; // Indica que a pilha está vazia

        for (int i = 0; i < n; i++) {
            char atual = sequencia.charAt(i);

            // --- LÓGICA DE EMPILHAR (PUSH) ---
            if (atual == '{') {
                pilha[++topo] = '}'; // Incrementa topo e insere
            } else if (atual == '[') {
                pilha[++topo] = ']';
            } else if (atual == '(') {
                pilha[++topo] = ')';
            } 
            
            // --- LÓGICA DE DESEMPILHAR (POP) ---
            else if (atual == '}' || atual == ']' || atual == ')') {
                
                // Se topo for -1, a pilha está vazia (ERRO: fechamento sem abertura)
                if (topo == -1) {
                    return false;
                }

                // Obtém o valor do topo e decrementa o índice
                char esperado = pilha[topo--];
                
                if (atual != esperado) {
                    return false; // Símbolo de fechamento incorreto
                }
            }
        }

        // Se o topo voltou a ser -1, todos os pares foram fechados corretamente
        return (topo == -1);
    }
}