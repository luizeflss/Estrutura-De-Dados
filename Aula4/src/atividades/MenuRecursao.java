package Aula4.src.atividades;
import java.util.Scanner;

public class MenuRecursao {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            exibirMenu();
            System.out.println("Escolha uma opção: ");
            opc = sc.nextInt();

            switch (opc){
                case 1:
                    System.out.println("Digite um número inteiro não negativo para calcular o fatorial: ");
                    int nFatorial = sc.nextInt();

                    if(nFatorial < 0){
                        System.err.println("Numero negativo não permitido aceito para calcular fatorial");
                    }else{
                        long resultadoFatorial = fatorial(nFatorial);
                        System.out.println("Fatorial de " + nFatorial + " = " + resultadoFatorial);
                        break;
                    }
                    
                case 2:
                	System.out.println("Digite a base: ");
                	int base = sc.nextInt();
                	System.out.println("Digite o expoente(Inteiro não negativo): ");
                	int expoente = sc.nextInt();
                	sc.nextLine();
                	
                	if(expoente < 0) {
                		System.out.println("Erro, neste exercício o expoente devera ser não negativo!");
                	}else {
                		long resultadoPotencia = potencia(base, expoente);
                		System.out.println(base + "^" + expoente + " = " + resultadoPotencia);
                	}
                	break;
                
                case 3:
                	System.out.println("Digite um número inteiro não negativo para converter em binário: ");
                	int numero = sc.nextInt();
                	
                	if (numero < 0 ) {
                		System.out.println("Numeros negativos não permitidos.");
                	}else {
                		String binario = decimalParaBinario(numero);
                		System.out.println("Binário de " + numero + " = " + binario);
                	}
                	break;
                	
                case 4:
                	System.out.println("Encerrando Programa...");
                	break;
                	
                	default:
                	System.out.println("Opção inválida. Tente novamente!");
                	
            	}
        }while(opc != 4);
        
        sc.close();
    }
        
        public static void exibirMenu() {
        	System.out.println("== Menu Recursão ==");
        	System.out.println("== *** ==");
        	System.out.println("1) Calcular Fatorial");
        	System.out.println("2) Calcular Potencia");
        	System.out.println("3) Calcular Decimal para Binário");
        	System.out.println("4) Sair");
        }
        
        public static long fatorial(int n){
        	if(n == 0) {
        		return 1;
        	}
        	return  n * fatorial(n - 1);
        }
        
        public static long potencia(int base, int expoente) {
        	if(expoente == 0) {
        		return 1;
        	}
        	return base * potencia(base, expoente -1);
        }
        
        public static String decimalParaBinario(int n){
        	if(n < 2) {
        		return String.valueOf(n);
        	}
        	
        	return decimalParaBinario(n / 2) + (n % 2);
        }
}