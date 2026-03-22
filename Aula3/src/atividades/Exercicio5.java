package Aula3.src.atividades;


public class Exercicio5 {
    /*
     * Método: intercalarVetores
     * Recebe: dois vetores de 5 posições
     * Retorna: vetor com elementos intercalados
     * Lógica: adiciona alternadamente elementos dos dois vetores
     */

    public static String[] intercalaVetores(String[] v1, String[] v2){

        if(v1.length != 5 || v2.length != 5){
            System.out.println("Vetores inválidos, cada vetor deve possuir 5 valores");
        }

        String[] v3 = new String[10];
        int j = 0;

        for(int i = 0; i < 5; i++){
            v3[j] = v1[i];
            j++;

            v3[j] = v2[i];
            j++;
        }

        return v3;
    }
}