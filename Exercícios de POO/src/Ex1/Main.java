package Ex1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Pessoa pessoa = new Pessoa();
		Scanner input = new Scanner(System.in);

		System.out.print("Insira o nome: ");
		pessoa.setNome(input.nextLine());
		
		System.out.print("Insira o ano de nascimento: ");
		pessoa.setAnoNasc(input.nextInt());

		System.out.print("Insira a altura (em centímetros): ");
		pessoa.setAltura(input.nextDouble());

		pessoa.imprimirDadosPessoa();

	}

}
