package Aula3.src;

public class Main {
    public static void main(String[] args) {

        //EXERCICIO 1
        System.out.println("EXERCICIO 1:");
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] vetorInvertido = Exercicio1.inverterVetor(vetor);

        if(vetorInvertido != null){
            System.out.print("Vetor Invertido: ");

            for(int i = 0; i < vetorInvertido.length; i++){
                System.out.print(vetorInvertido[i] + " ");
            }
        }

        //----------------------------------------------------------------------
        //EXERCICIO 2
        System.out.println("\n" + "\nEXERCICIO 2:");
        int[] v1 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] v2 = {9, 10, 11, 12, 13, 14, 15, 16};
        int[] v3 = {17, 18, 19, 20, 21, 22, 23, 24};

        int[][] matriz = Exercicio2.vetorParaMatriz(v1, v2, v3);

        if(matriz != null){
            System.out.println("Matriz gerada com os vetores fornecidos:");

            for(int i = 0; i < matriz.length; i++){

                for(int j = 0; j < matriz[i].length; j++){
                    System.out.print("["+ matriz[i][j] + "]"+ " ");
                }

                System.out.println();
            }
        }

        //----------------------------------------------------------------------
        //EXERCICIO 3
        System.out.println("\nEXERCICIO 3:");
        int[] binario = {1,0,1,0,1,0,1,1};

        int decimal = Exercicio3.binarioParaDecimal(binario);

        if(decimal != -1){
            System.out.println("10101011 em valor decimal: " + decimal);
        }

        //----------------------------------------------------------------------
        //EXERCICIO 4
        System.out.println("\nEXERCICIO 4:");
        int numero = 171;

        int[] bin = Exercicio4.decimalParaBinario(numero);

        System.out.print(numero + " em valor binário: ");
        for(int i = 0; i < bin.length; i++){
            System.out.print(bin[i] + " ");
        }

        //----------------------------------------------------------------------
        //EXERCICIO 5
        System.out.println("\n"+"\nEXERCICIO 5:");
        String[] vetor1 = {"A","B","C","D","E"};
        String[] vetor2 = {"1","2","3","4","5"};

        String[] resultado = Exercicio5.intercalaVetores(vetor1, vetor2);

        if(resultado != null){
            System.out.print("Vetores intercalados: ");

            for(int i = 0; i < resultado.length; i++){
                System.out.print(resultado[i] + " ");
            }
        }

        //----------------------------------------------------------------------
        //EXERCICIO 6
        System.out.println("\n"+"\nEXERCICIO 6:");
        String[][] matriz2 = {{"x","x"},{"y","y"},{"z","z"}};
        Exercicio6.imprimirMatriz(matriz2);

        //----------------------------------------------------------------------
        //EXERCICIO 7
        System.out.println("\n"+"\nEXERCICIO 7:");
        int[][] matriz3 = {{1,5},{7,3}, {8,2}};

        int[][] t = Exercicio7.transposta(matriz3);
        System.out.println("Matriz Original");

        for(int i = 0; i < matriz3.length; i++){
            for(int j = 0; j < matriz3[i].length; j++){
                System.out.print("["+ matriz3[i][j] + "]"+ " ");
            }

            System.out.println();
        }

        System.out.println("\nMatriz Transposta: ");
        for(int i = 0; i < t.length; i++){
            for(int j = 0; j < t[i].length; j++){
                System.out.print("["+ t[i][j] + "]"+ " ");
            }
        }
    };
}