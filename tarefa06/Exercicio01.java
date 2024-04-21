package tarefa06java;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		/*
		 * 1) Ler dois valores numéricos inteiros e apresentar o resultado da diferença
		 * do maior pelo menor valor.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o primeiro valor: ");
		int valor1 = sc.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		int valor2 = sc.nextInt();
		
		int maior = Math.max(valor1, valor2);
		int menor = Math.min(valor1, valor2);
		
		int diferenca = maior - menor;
		
		System.out.println("A diferenca do maior pelo menor é: "+ diferenca);
		sc.close();
	}

}
