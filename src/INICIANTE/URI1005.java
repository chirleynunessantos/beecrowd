package INICIANTE;

import java.util.Scanner;

public class URI1005 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble(), b = sc.nextDouble();
		double media = ((a * 3.5) +  (b * 7.5)) / 11;
		System.out.printf("MEDIA = %.5f%n",media);
	}

}
