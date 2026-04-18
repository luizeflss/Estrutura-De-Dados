package Aula8.src.util;
import Aula8.src.model.Cliente;

public class FilaPrioridade extends fila<Cliente> {
    /**
     * Sobrescreve o método de enfileirar para aplicar a regra:
     * - Se for idoso (>60), entra atrás dos outros idosos, mas à frente dos comuns.
     * - Se for comum, entra no final da fila.
     */
    @Override
    public void adiciona(Cliente novoCliente) {
        if (novoCliente.ehPrioritario()) {
            int posicaoParaInserir = 0;

            // Percorre a fila para achar o fim do bloco de prioridade
            // Enquanto o cliente da posição 'posicaoParaInserir' for prioritário, pula ele
            while (posicaoParaInserir < elementos.size() && elementos.get(posicaoParaInserir).ehPrioritario()) {
                posicaoParaInserir++;
            }

            // O ArrayList.add(index, element) "empurra" o restante para trás
            elementos.add(posicaoParaInserir, novoCliente);
            System.out.println(">> Cliente prioritário inserido na posição: " + (posicaoParaInserir + 1));
        } else {
            // Se não é prioritário, usa o comportamento padrão da classe pai (final da fila)
            super.adiciona(novoCliente);
            System.out.println(">> Cliente comum inserido no final da fila.");
        }
    }
}
