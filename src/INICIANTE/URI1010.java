package INICIANTE;

import java.util.Scanner;

public class URI1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cod;
		double quant , valor ,total= 0;
		
		for (int i = 0; i < 2; i++) {
			cod = sc.nextInt();
			quant = sc.nextDouble();
			valor = sc.nextDouble();
			total+= quant*valor;
		}
		
	
		System.out.printf("VALOR A PAGAR: %.2f%n",total);
	}

}
