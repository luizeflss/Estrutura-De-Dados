package Aula3.src.atividades;

public class Exercicio2 {
    /*
     * Método: vetorParaMatriz
     * Recebe: três vetores de 8 posições
     * Retorna: matriz 8x3 contendo os valores dos vetores
     * Lógica: cada linha da matriz usa o mesmo índice dos três vetores
     */

    public static int[][] vetorParaMatriz(int[] v1, int[] v2, int[] v3){

        if(v1.length != 8 || v2.length != 8 || v3.length != 8){
        System.out.println("Vetores inválidos, todos devem possuir 8 posições");
        return null;
        }

        int[][] matriz = new int[8][3];

        for(int i = 0; i < 8; i++){
        matriz[i][0] = v1[i];
        matriz[i][1] = v2[i];
        matriz[i][2] = v3[i];
        }

        return matriz;
    }
}