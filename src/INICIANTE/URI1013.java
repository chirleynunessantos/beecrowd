package INICIANTE;

import java.util.Scanner;

public class URI1013 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int  	A =  sc.nextInt(),
				B =  sc.nextInt(),
				C=  sc.nextInt();
		
		int maior = Math.max(Math.max(A, B), C) ;
					
		System.out.println(maior+" eh o maior");
	}

}
