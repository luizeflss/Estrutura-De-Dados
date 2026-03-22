package Aula3.src;

public class Exercicio6 {
    /*
     * Método: imprimirMatriz
     * Recebe: matriz bidimensional
     * Retorna: nada (apenas imprime)
     * Lógica: percorre linhas e colunas exibindo o formato solicitado
     */

    public static void imprimirMatriz(String[][] matrizz){
        for(int i = 0; i < matrizz.length; i++){
            for(int j = 0; j < matrizz[i].length; j++){
                System.out.print("|" + "\t" + matrizz[i][j] + "\t");
            }
            System.out.println("|");
        }
    }
}