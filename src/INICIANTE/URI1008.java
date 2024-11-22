package INICIANTE;

import java.util.Scanner;

public class URI1008 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		double quantHoras = sc.nextDouble();
		double valor = sc.nextDouble();
		double salario = valor*quantHoras;
		System.out.println("NUMBER = "+numero);
		System.out.printf("SALARY = U$ %.2f%n",salario);
	}

}
