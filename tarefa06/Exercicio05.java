package tarefa06java;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		/*
		 * 5. Efetuar a leitura de três valores (variáveis A, B e C) e efetuar o cálculo
		 * da equação completa de segundo grau, apresentando as duas raízes, se para os
		 * valores informados for possível efetuar o referido cálculo. Lembre-se de que
		 * a variável A deve ser diferente de zero.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores de A, B e C da equação de segundo grau:");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();

		if (a == 0) {
			System.out.println("O coeficiente 'a' deve ser diferente de zero para uma equação de segundo grau.");
		} else {
			double delta = b * b - 4 * a * c;
			if (delta < 0) {
				System.out.println("Não há raízes reais para os valores informados.");
			} else {
				double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
				double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);

				System.out.println("As raízes da equação são:");
				System.out.println("Raiz 1: " + raiz1);
				System.out.println("Raiz 2: " + raiz2);
			}
		}
		sc.close();
	}

}
