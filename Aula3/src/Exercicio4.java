package Aula3.src;

public class Exercicio4 {
    /*
     * Método: decimalParaBinario
     * Recebe: número decimal
     * Retorna: vetor com representação binária
     * Lógica: divisões sucessivas por 2 armazenando os restos
     */

    public static int[] decimalParaBinario(int numero){

        int[] binario = new int[8];

        for(int i = 7; i >= 0; i--){
            binario[i] = numero % 2;
            numero = numero / 2;
        }

        return binario;
    }
}