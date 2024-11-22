package INICIANTE;

import java.util.Scanner;

public class URI1009 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String nome = sc.next();
		double salario = sc.nextDouble();
		double quantVendas = sc.nextDouble();
		double recebe = (quantVendas*15/100)+salario;
		System.out.printf("TOTAL = %.2f%n",recebe);
	}

}
