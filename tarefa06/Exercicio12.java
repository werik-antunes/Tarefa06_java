package tarefa06java;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		/*
		 * 12. Elaborar um programa que efetue a leitura do nome e do sexo de uma
		 * pessoa, apresentando com saída uma das seguintes mensagens: "Ilmo Sr.", se o
		 * sexo informado como masculino, ou a mensagem "Ilma Sra.", para o sexo
		 * informado como feminino. Apresente também junto da mensagem de saudação o
		 * nome previamente informado.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite seu nome: ");
		String nome = sc.nextLine();
		
		System.out.println("Digite seu sexo M para masculino e F para feminino: ");
		char sexo = sc.next().charAt(0);
		
		if(sexo == 'M' || sexo == 'm' ) {
			System.out.println("Ilmo Sr. " + nome);
		}else if (sexo == 'F' || sexo == 'f'){
			 System.out.println("Ilma Sra. " + nome);
		}else {
			System.out.println("Sexo não reconhecido. Por favor, insira M para masculino ou F para feminino.");
		}
		sc.close();
	}

}
