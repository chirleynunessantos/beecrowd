package INICIANTE;

import java.util.Scanner;

public class URI1006 {

	public static void main(String[] args) {
//nota A tem peso 2, a nota B tem peso 3 e a nota C tem peso 5. 
		
		Scanner sc = new Scanner(System.in);
		double a = sc.nextDouble()*2;
		double b = sc.nextDouble()*3;
		double c = sc.nextDouble()*5;
		
		double media = (a+b+c)/10;
		System.out.printf("MEDIA = %.1f%n",media);
	}

}
