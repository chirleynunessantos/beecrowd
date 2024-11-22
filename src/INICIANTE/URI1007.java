package INICIANTE;

import java.util.Scanner;

public class URI1007 {

	public static void main(String[] args) {
//DIFERENCA = (A * B - C * D).
	
		Scanner sc = new Scanner(System.in);
		int  a = sc.nextInt(),
				b = sc.nextInt(),
				c = sc.nextInt(),
				d = sc.nextInt();
		int DIFERENCA = (a * b - c * d);
		System.out.println("DIFERENCA = "+DIFERENCA);
		
		
	}

}
