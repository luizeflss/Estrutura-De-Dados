package Aula4.src.atividades;
import java.util.Scanner;

public class TorreDeHanoi {

    //variavel estática global para contagem de movimentos
    static int totalMovimentos = 0;
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int qntdDisco = 0;

        //o programa só continua se o número de discos for válido
        do{
            System.out.println("Digite o número de discos: ");
            qntdDisco = scn.nextInt();
            if(qntdDisco <= 0){
                System.out.println("A quantidade de discos deve ser maior que zero!");
            }
        }while(qntdDisco <= 0);
        
        //Criação da matriz de 3 torres
        int[][] torres = new int[qntdDisco][3];

        // Inicializando a matriz com todos os discos na Torre A (coluna 0)
        // O disco menor (1) fica no topo (linha 0), o maior fica na base.
        for(int i = 0; i < qntdDisco; i++){
            torres[i][0] = i + 1;
        }

        System.out.println("TORRES:");
        exibirTorres(torres);

        //Chama metódo recursivo principal 
        hanoi(qntdDisco, 'A', 'B', 'C',torres);

        //Finalização e contagem de cada movimento nas torres
        System.out.println("===================================");
        System.out.println("DESAFIO CONCLUÍDO");
        System.out.println("Total de movimentos realizados: " + totalMovimentos);
        System.out.println("===================================");

        scn.close();
    }

    public static void hanoi(int n, char origem, char destino, char auxiliar, int torres[][]){

        //condição de parada, caso só tenha 1 disco basta move-lo direto para o destino
        if(n ==  1){
            totalMovimentos++;
            System.out.println("Movimentos: " + totalMovimentos);
            System.out.println("Mover disco "+ n + " de " +origem+" para "+destino+".");
            moverDiscoNaMatriz(torres, origem, destino);
            exibirTorres(torres);
            return;
        }

        //move n - 1 discos para a torre auxiliar
        hanoi(n - 1, origem, auxiliar, destino, torres);

        //adiciona 1 a totalMovimentos e move o disco maior de Origem para Destiono
        totalMovimentos++;
        System.out.println("Movimento " + totalMovimentos);
        System.out.println("Mover disco "+n+" de "+origem+" para "+destino+".");
        moverDiscoNaMatriz(torres, origem, destino);
        exibirTorres(torres);

        //mover o disco de Auxiliar para Destino
        hanoi(n - 1, auxiliar, destino, origem, torres);
    }

    public static void exibirTorres(int [][] torres){

        //Método para exibir o estado atual das torres de forma alinhada e organizada
        System.out.println("Estado atual das torres:");
        System.out.println(" A  B  C");
        System.out.println("--------");
        
        for(int i = 0; i < torres.length; i++){
            for(int j = 0; j < 3; j++){
                System.out.print(" " + torres[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int getIndiceTorre(char torre){

        //Converte char da torre em indice para a matriz
        if(torre == 'A'){
            return 0;
        }else if(torre == 'B'){
            return 1;
        }else{
            return 2;//Resta apenas a torre C
        }
    }

    public static void moverDiscoNaMatriz(int[][] torres, char origem, char destino) {
        int colOrigem = getIndiceTorre(origem);
        int colDestino = getIndiceTorre(destino);
        int linhas = torres.length;
        int discoMovido = 0;

        // Remover o disco do topo da torre de origem
        // Procura de cima para baixo pelo primeiro valor diferente de zero
        for (int i = 0; i < linhas; i++) {
            if (torres[i][colOrigem] != 0) {
                discoMovido = torres[i][colOrigem];
                torres[i][colOrigem] = 0; // Remove o disco (substitui por 0)
                break;
            }
        }

        // Colocar o disco na torre de destino
        // Procura de baixo para cima pela primeira posição vazia (zero)
        for (int i = linhas - 1; i >= 0; i--) {
            if (torres[i][colDestino] == 0) {
                torres[i][colDestino] = discoMovido; // Insere o disco
                break;
            }
        }
    }
}