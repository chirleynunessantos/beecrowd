package INICIANTE;

import java.util.Scanner;

public class URI1011 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14159;
		double r = sc.nextDouble();
		double volume = (4.0/3) * pi * Math.pow(r, 3);
		System.out.printf("VOLUME = %.3f%n",volume);

	}

}
