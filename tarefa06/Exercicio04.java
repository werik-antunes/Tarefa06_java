package tarefa06java;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		/*
		 * 4. Ler quatro valores referentes a quatro notas escolares de um aluno e
		 * imprimir uma mensagem dizendo que o aluno foi aprovado, se o valor da média
		 * escolar for maior ou igual a 7. Se o valor da média for menor que 7,
		 * solicitar a nota de exame, somar com o valor da média e obter nova média. Se
		 * a nova média for maior ou igual a 5, apresentar uma mensagem dizendo que o
		 * aluno foi aprovado em exame. Se o aluno não foi aprovado, indicar uma
		 * mensagem informando esta condição. Apresentar com as mensagens o valor da
		 * média do aluno, para qualquer condição.
		 * 
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a primeira nota do aluno: ");
		float nota1 = sc.nextFloat();
		
		System.out.println("Digite a segunda nota do aluno: ");
		float nota2 = sc.nextFloat();
		
		System.out.println("Digite a terceira nota do aluno: ");
		float nota3 = sc.nextFloat();
		
		System.out.println("Digite a quarta nota do aluno: ");
		float nota4 = sc.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4) / 4.0f;
		
		if(media >= 7.0) {
			System.out.println("O aluno foi aprovado com a media  " + media);
		}else {
			System.out.println("O aluno foi reprovado com a media " + media);
			System.out.println("Digite a nota da prova de recuperação: ");
			float notaPro = sc.nextFloat();
			float novaMedia = (media + notaPro) / 2.0f;
			if(novaMedia >= 5.0) {
				System.out.println("O aluno foi aprovado com a media " + novaMedia);
			}else {
				System.out.println("O aluno foi reprovado com media " + novaMedia);
			}
		}
		sc.close();
	}

}
