package INICIANTE;

import java.util.Scanner;


public class URI1048 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sal =  sc.nextDouble();
		double novoSal ,reajuste;
		String per;
		if(sal >= 0 && sal<= 400.00) {
			
			novoSal = (sal *15/100)+sal;
			per = "15 %";
			reajuste =novoSal -sal;
		}else if(sal >400.00 && sal<= 800.00) {
			novoSal = (sal *12/100)+sal;
			per ="12 %";
			reajuste =novoSal -sal;
		}else if(sal > 800.00 && sal<=  1200.00) {
			novoSal = (sal *10/100)+sal;
			per = "10 %";
			reajuste =novoSal -sal;
		}else if(sal >1200.01 && sal<= 2000.00) {
			novoSal = (sal *7/100)+sal;
			per = "7 %";
			reajuste =novoSal -sal;
		}else {
			novoSal = (sal *4/100)+sal;
			per = "4 %";
			reajuste =novoSal -sal;
		}
		System.out.printf("Novo salario: %.2f%n",novoSal);
		System.out.printf("Reajuste ganho: %.2f%n",reajuste);
		System.out.println("Em percentual: "+per);
	
	}
	

}


