package Aula3.src.atividades;

public class Exercicio1 {
    /*
     * Método: inverterVetor
     * Recebe: vetor de inteiros com 8 posições
     * Retorna: novo vetor com os elementos invertidos
     * Lógica: percorre o vetor original do final para o início
     */

    public static int[] inverterVetor(int[] vetor){
        if(vetor == null || vetor.length != 8){
            System.out.println("Este vetor é inválido, precisa de 8 posições exatas");
            return null;
        }

        int[] invertido = new int[8];

        for(int i = 0; i < vetor.length; i++){
            invertido[i] = vetor[vetor.length - 1 - i];
        }

        return invertido;
    }
}