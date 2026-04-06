package Aula6.src;
import java.util.Scanner;

public class Exercicio4OrdenacaoPilha {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Digite qual o tamanho da sua pilha: ");
        int tamanhoPilha = scn.nextInt();

        Exercicio4OrdenacaoPilha p = new Exercicio4OrdenacaoPilha(tamanhoPilha);
        
        int opcao;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Adicionar número à pilha");
            System.out.println("2 - Organizar números");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            
            opcao = scn.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite um número: ");
                    int numero = scn.nextInt();
                    p.empilhar(numero);
                    System.out.println("Número adicionado à pilha!");
                    break;

                case 2:
                    System.out.println("Organizando");
                    System.out.println(p.converterString());
        
                    Exercicio4OrdenacaoPilha pilhaAuxilar = new Exercicio4OrdenacaoPilha(tamanhoPilha);

                    while(!p.pilhaVazia()){
                        int valorAtual = p.topoPilha();//armazeno o topo da pilha principal em uma variavel
                        p.desempilhar();//descarto o valor da pilha principal

                        while(!pilhaAuxilar.pilhaVazia() && valorAtual < pilhaAuxilar.topoPilha()){
                        //Enquanto a pilha auxilar não estiver vazia e o valor atual for menor que o topo da pilha auxiliar,
                        p.empilhar(pilhaAuxilar.topoPilha());
                        //empilharemos o topo da pilha auxiliar na pilha principal
                        pilhaAuxilar.desempilhar();
                        //retiramos o topo da pilhaAuxiliar
                    }

                    pilhaAuxilar.empilhar(valorAtual);
                    //e por fim empilhamos o valor atual na pilhaAuxilar novamente
                    }

                    System.out.println(pilhaAuxilar.converterString()); 
                    break;
                    
                case 0:
                    System.out.println("Saindo!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);
    }

    public Integer[] pilha;//definie um array de inteiros
    int posicaoPilha;

    public Exercicio4OrdenacaoPilha(int tamanho){
        this.posicaoPilha = -1;//-1 == pilha vazia; a posicao zero de um array já armazena informação
        this.pilha = new Integer[tamanho];
    }

    public boolean pilhaVazia(){
        if(this.posicaoPilha == -1){
            //(posicaoPilha == -1) == pilha vazia, retorna true
            return true;
        }
        return false;
    }

    public int topoPilha(){
        if(this.pilhaVazia()){
            throw new RuntimeException("Pilha vazia");//esse return indica que não há informação na pilha
        }
        return pilha[this.posicaoPilha];
    }

    public int tamanho(){
        if(this.pilhaVazia()){
            return 0;//esse return indica que não há informação na pilha
        }
        return this.posicaoPilha + 1;
        //+1 necessário para exibir a qntd de itens corretamente, já que um array se inicia do zero
    }

    public void empilhar(Integer valor){
        if(this.posicaoPilha < this.pilha.length - 1){
            //verifica se a posicao atual da pilha é menor do que o tamanho total da pilha,
            //se for, então é inserido um valor na pilha e ao mesmo tempo é feito o incremento em posicaoPilha
            this.pilha[++posicaoPilha] = valor;
        }
    }

    public Integer desempilhar(){
        if(pilhaVazia()){
            return null;
            //se a pilha já estiver vazia o retorn é null e nada será realizado
        }
        return this.pilha[this.posicaoPilha --];
        //retornamos o que tem na ultima posição da pilha e decrementamos de posicaoPilha  
    }

    public String converterString() {
    if (pilhaVazia()) return "Pilha vazia";

    String resultado = "";
    for (int i = 0; i <= posicaoPilha; i++) {
        resultado += pilha[i] + " ";
    }
    return resultado;
    }
}