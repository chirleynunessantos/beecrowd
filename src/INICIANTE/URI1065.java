package INICIANTE;

import java.util.Scanner;

public class URI1065 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cont=0;
		for (int i = 0; i < 5; i++) {
			int valor= sc.nextInt();
			if(valor%2==0) {
				cont +=1;
			}
		}
		System.out.println(cont+" valores pares");
		
		
		
	}

}
