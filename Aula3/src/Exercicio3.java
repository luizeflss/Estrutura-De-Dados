package Aula3.src;

public class Exercicio3 {
    /*
     * Método: binarioParaDecimal
     * Recebe: vetor com número binário
     * Retorna: valor decimal equivalente
     * Lógica: percorre o vetor acumulando o valor decimal
     */

    public static int binarioParaDecimal(int[] bin){
        int decimal = 0;
        for(int i = 0; i < bin.length; i++){
            if(bin[i] != 0 && bin[i] != 1){
                System.out.println("Valores inválido, o vetor deve conter apenas 0 e 1.");          
                return -1;
            }
            decimal = decimal * 2 + bin[i];
        }
        return decimal;
    }
}