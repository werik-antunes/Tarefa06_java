package tarefa06java;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		/*
		 * 2. Efetuar a leitura de um valor inteiro positivo ou negativo e apresentar o
		 * número lido como sendo um valor positivo, ou seja, o programa deverá
		 * apresentar o módulo de um número fornecido. Lembre-se de verificar se o
		 * número fornecido é menor que zero; sendo, multiplique-o por -1.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um numero inteiro: ");
		int num = sc.nextInt();
		
		int mod = Math.abs(num);
		
		System.out.println("O módulo é: "+ mod);
		sc.close();
	}

}
