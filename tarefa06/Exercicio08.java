package tarefa06java;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
		/*
		 * 8. Efetuar a leitura de cinco números inteiros e identificar o maior e o
		 * menor valores.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite cinco numeros inteiros: ");
		int[]num = new int[5];
		
		for(int i = 0; i < 5; i++) {
			num[i] = sc.nextInt();
		}
		int maior = num[0];
		int menor = num[0];
		
		for(int i = 0; i < 5; i++) {
			if(num[i] > maior) {
				maior = num[i];
			}
			if(num[i] < menor) {
				menor = num[i];
			}
		}
		System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
		sc.close();
	}

}
