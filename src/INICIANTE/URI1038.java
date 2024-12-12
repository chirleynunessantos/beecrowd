package INICIANTE;

import java.util.Scanner;

public class URI1038 {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int cod = sc.nextInt(), quant = sc.nextInt();
		double total=0;
				
	
		switch(cod) {
		case 1:
			total = quant*4;
			break;
		case 2:
			total = quant*4.50;	
			break;
		case 3:
			total = quant*5.00;	
			break;
		
		case 4:
			total = quant*2.00;	
			break;
		case 5:
			total = quant*1.50;	
			break;
	}
		System.out.printf("Total: R$ %.2f%n",total);

}}
