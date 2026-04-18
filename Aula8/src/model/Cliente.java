package Aula8.src.model;
import java.util.*;

public class Cliente {
	private String nome;
	private String cpf;
	private int idade;
	private int qntdItens;

	
	public Cliente(String nome, String cpf, int qntdItens, int idade) {
		this.nome = nome;
		this.cpf = cpf;
		this.qntdItens = qntdItens;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public int getQntdItens() {
		return qntdItens;
	}
	
	public int getIdade() { return idade; }
    
    public boolean ehPrioritario() {
        return this.idade > 60;
	}

	@Override
    public String toString() {
        String status = ehPrioritario() ? "[PRIORIDADE]" : "[COMUM]";
        return String.format("%s | Nome: %-10s | Idade: %d | CPF: %s | Itens: %d", 
                status, nome, idade, cpf, qntdItens);
    }
}
