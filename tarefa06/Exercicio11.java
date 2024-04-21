package tarefa06java;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		/*
		 * 11. Elaborar um programa que efetue a leitura de um determinado valor
		 * inteiro, e efetue a sua apresentação, caso o valor não seja maior que três.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor inteiro: ");
		int num = sc.nextInt();
		if(num <= 3) {
			System.out.println("o número digitado foi: " + num);
		}
		sc.close();
	}

}
