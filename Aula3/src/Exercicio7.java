package Aula3.src;

public class Exercicio7 {
    /*
    * Método: transposta
    * Recebe: matriz 3x2
    * Retorna: matriz transposta 2x3
    * Lógica: troca linha por coluna conforme regra da transposição
    */

    public static int[][] transposta(int[][] original){

        int[][] transposta = new int[2][3];

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 2; j++){
                transposta[j][i] = original[i][j];
            }
        }
        
        return transposta;
    }
}