package Aula5.src;
import java.util.*;

public class PilhaArrayLivros {
	private String[] livros;
		
	private int topo;
	
	public PilhaArrayLivros(int capacidade) {
		livros = new String[capacidade];
		topo = -1;
		
	}
	
	//verifica se a pilha esta vazia
	public boolean EstaVazia() {
		return topo == -1;
	}
	
	//verifica se a pilha esta cheia
	public boolean EstaCheia() {
		return topo == livros.length - 1;
	}
	
	//retorna quantidade de livros que há na pilha
	public String QntdLivros(){
		return "Há " + (topo + 1) + " livros na pilha";
	}
	
	//adicionar um livro no topo da pilha
	public void EmpilharLivros(String tituloLivro) {
		if(EstaCheia()) {
			System.err.println("A pilha de livros está cheia, remova ou termine um livro para adicionar outro.");
			return;
		}
		
		livros[++ topo] = tituloLivro;
		System.out.println("Livro '" + tituloLivro + "' adicionado ao topo da pilha de estudos");
	}
	
	//excluir livro da pilha
	public String DesempilharLivros() {
		if(EstaVazia()) {
			System.err.println("A pilha de livros já está vazia.");
			return null;
		}
		
		String livroRemovido = livros[topo];//armazena o titulo do livro que esta sendo removido
		
		livros[topo--] = null;//remove a referência do 
		System.out.println("Livro '" + livroRemovido + "' removido da pilha de estudos");
		return livroRemovido;
	}
	
	//consulta o livro que está no topo da pilha
	public String ConsultarTopo(){
		if(EstaVazia()) {
			System.err.println("Não há livros na pilha para consultar.");
			return null;
		}
		
		return(livros[topo]);
	}
	
	//Exibe os livros do topo para base
	public void ExibirPilhaLivros() {
		if(EstaVazia()) {
			System.err.println("A pilha está vazia, nenhum livro para exibir!");
			return;
		}
		System.out.println("\nPilha de livros técnicos (topo -> base): ");
		for(int i = topo; i >= 0; i--) {
			System.out.println("| " + livros[i] + " |");
		}

		System.out.println("Capacidade total: " + livros.length + " | Livros na pilha: " + (topo + 1));
	}
	
	private static int lerCapacidadeValida(Scanner scanner) {
		
		while(true) {//loop infinito até o usúario inserir uma entrada válida
			System.out.println("Digite o número de livros técnicos você deseja organizar na pilha: ");
		
			if(scanner.hasNextInt()) {
				int capacidade = scanner.nextInt();
				scanner.nextLine();//limpa o buffer do scanner
				if(capacidade > 0) {
					return capacidade;
				}else {
					scanner.nextLine();
				}
				System.err.println("Entrada inválida. Digite um número inteiro maior que zero ");
			}
		}
	}

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== BEM-VINDO AO GERENCIADOR DE PILHA DE LIVROS ===");
        
        // 1. Testa a leitura da capacidade
        int capacidade = lerCapacidadeValida(scanner);
        PilhaArrayLivros pilha = new PilhaArrayLivros(capacidade);
        
        System.out.println("\n--- TESTANDO FUNCIONALIDADES ---");
        
        // 2. Testa pilha vazia
        System.out.println("A pilha está vazia? " + pilha.EstaVazia());
        pilha.ExibirPilhaLivros();
        
        // 3. Testa empilhar
        System.out.println("\n-> Empilhando livros...");
        pilha.EmpilharLivros("Clean Code");
        pilha.EmpilharLivros("Java: Como Programar");
        pilha.EmpilharLivros("Estruturas de Dados");
        
        // 4. Exibe a pilha e a quantidade
        pilha.ExibirPilhaLivros();
        System.out.println(pilha.QntdLivros());
        
        // 5. Testa consultar o topo
        System.out.println("\n-> Consultando o topo...");
        System.out.println("Livro no topo agora: " + pilha.ConsultarTopo());
        
        // 6. Testa desempilhar
        System.out.println("\n-> Desempilhando um livro...");
        pilha.DesempilharLivros();
        pilha.ExibirPilhaLivros();
        
        // 7. Testa estourar a pilha (tentar empilhar além da capacidade se testar com poucos livros)
        System.out.println("\n-> Testando limite da pilha...");
        for (int i = 0; i < capacidade + 1; i++) {
             pilha.EmpilharLivros("Livro Genérico " + i);
        }
        
        System.out.println("\nTeste finalizado com sucesso!");
        scanner.close();
    }
}
