package tarefa06java;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		/*
		 * 6. Efetuar a leitura de três valores (variáveis A, B e C) e apresentá-los
		 * dispostos em ordem crescente.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		
        System.out.println("Insira o valor de A:");
        int a = sc.nextInt();

        System.out.println("Insira o valor de B:");
        int b = sc.nextInt();

        System.out.println("Insira o valor de C:");
        int c = sc.nextInt();

        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Valores em ordem crescente: " + a + ", " + b + ", " + c);
	
		sc.close();
	}

}
