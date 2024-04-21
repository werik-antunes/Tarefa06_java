package tarefa06java;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		/*
		 * 7. Efetuar a leitura de quatro números inteiros e apresentar os números que
		 * são divisíveis por 2 e 3.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		 System.out.println("Digite quartro numeros inteiros: ");
		 int []num = new int[4];
		 
		 for(int i = 0; i < 4; i++ ) {
			 num[i] = sc.nextInt();			 
		 }
		 
		 System.out.println("Números divisíveis por 2 e 3:");
	        
	       
	        for (int numero : num) {
	            if (numero % 2 == 0 && numero % 3 == 0) {
	                System.out.println(numero);
	            }
	        }
		 
		sc.close();
	}

}
