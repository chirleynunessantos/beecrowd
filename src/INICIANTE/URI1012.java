package INICIANTE;

import java.util.Scanner;

public class URI1012 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double  A =  sc.nextDouble(),
				B =  sc.nextDouble(),
				C=  sc.nextDouble();

		double TRIANGULO = 0,CIRCULO = 0,TRAPEZIO = 0,QUADRADO = 0,RETANGULO = 0;
		TRIANGULO =  (A*C)/2;
		CIRCULO =  Math.pow(C,2) * 3.14159;
		TRAPEZIO = ((A+B)/2)*C; 
		QUADRADO = B*B; 
		RETANGULO = A*B; 
		
		System.out.printf("TRIANGULO: %.3f%n",TRIANGULO);
		System.out.printf("CIRCULO: %.3f%n",CIRCULO);
		
		System.out.printf("TRAPEZIO: %.3f%n",TRAPEZIO);
		System.out.printf("QUADRADO: %.3f%n",QUADRADO);		
		System.out.printf("RETANGULO: %.3f%n",RETANGULO);
	}

}
