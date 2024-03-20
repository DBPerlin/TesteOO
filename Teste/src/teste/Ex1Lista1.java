package teste;

import java.util.Scanner;

public class Ex1Lista1 {

	public static void main(String[] args) {
		double a1, a2;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite a velocidade maxima permitida na via.");
		a1 = entrada.nextDouble();
		System.out.println("Agora, digite a velocidade do motorista.");
		a2 = entrada.nextDouble();
		if (a2 <= a1) {
			System.out.println("Sem multa!!");
		} else {
			if (a2 > a1 && a2 < a1 + 11) {
				System.out.println("Multa de 50 reais.");
			} else {
				if (a2 > a1 && a2 < a1 + 31) {
					System.out.println("Multa de 100 reais.");
			}
				else
				{
					System.out.println("Multa de 200 reais.");
				}
		}
		
	}

}
}
