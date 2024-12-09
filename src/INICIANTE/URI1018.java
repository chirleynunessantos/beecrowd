package INICIANTE;

import java.util.Scanner;

public class URI1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double tempoGasto = sc.nextDouble();
		double velocidadeMedia = sc.nextDouble();
		double litros = (velocidadeMedia/12) * tempoGasto;
		System.out.printf("%.3f%n",litros);

	}

}
