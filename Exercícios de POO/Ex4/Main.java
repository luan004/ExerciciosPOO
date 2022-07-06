package Ex4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		ControleRemoto cr = new ControleRemoto();
		
		boolean t = true;
		
		while (t = true) {
			System.out.print("\n\nO que você deseja fazer?\n\n1 - Aumentar o volume\n2 - Diminuir o volume\n3 - Avançar de canal\n4 - Retroceder de canal\n5 - Imprimir o valor do volume e do canal\n\nDigite: ");
			int i = input.nextInt();
			
			if (i == 1) {
				cr.maisVolume();
				System.out.println(cr.imprimir());
			}
			else if (i == 2) {
				cr.menosVolume();
				System.out.println(cr.imprimir());
			}
			else if (i == 3) {
				cr.avancarCanal();
				System.out.println(cr.imprimir());
			}
			else if (i == 4) {
				cr.retrocederCanal();
				System.out.println(cr.imprimir());
			}
			else {
				System.out.println(cr.imprimir());
			}
		}
		


	}

}
