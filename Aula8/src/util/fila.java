package Aula8.src.util;

import java.util.ArrayList;

import Aula8.src.model.Cliente;

public class fila<T>{
	protected ArrayList<T> elementos;
	
	public fila() {
		elementos = new ArrayList<>();
	}
	
	public boolean estaVazia() {
		return elementos.isEmpty();
	}
	
	public void adiciona(T item) {
		elementos.add(item);
	}
	
	public T removePrimeiro() {
		if(estaVazia()) {
			return null;
		}
		return elementos.remove(0);
	}
	
	public T exibePrimeiro() {
		if(estaVazia()) {
			return null;
		}
		return elementos.get(0);
	}
	
	public int tamanhoFila() {
		return elementos.size();
	}
	
	public void exibirFila() {
		if(estaVazia()) {
			System.out.println("\nA fila está vazia!");
			return;
		}
		System.out.println("\nFila atual:");
		for(int i = 0; i < elementos.size(); i++) {
			System.out.println((i + 1) + "da fila ->" + elementos.get(i));
		}
	}
}