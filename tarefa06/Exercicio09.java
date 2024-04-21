package tarefa06java;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {
		/*
		 * 9. Elaborar um programa que efetue a leitura de um número inteiro e
		 * apresentar uma mensagem informando se o número é par ou ímpar.
		 * 
		 */
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um número para saber se ele é par ou ímpar: ");

		int num = sc.nextInt();

		if (num % 2 == 0) {

			System.out.println("O número digitado é par");

		} else {

			System.out.println("O número digitado é ímpar");
		}

		sc.close();
	}

}
