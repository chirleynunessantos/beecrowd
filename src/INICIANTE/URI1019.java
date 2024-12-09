package INICIANTE;

import java.util.Scanner;

public class URI1019 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int n100=0,n50=0,n20=0,n10=0,n5=0,n2=0,n1=0;
		System.out.println(num);
		do {
			if(num>=100) {
				n100 +=1;
				num -=100;
			}else
			if(num>=50 && num<100 ) {
				n50  +=1;
				num -=50;
			}else
			
			if(num>=20 && num<50  ) {
				n20  +=1;
				num -=20;
			}else
			if(num>=10 && num<20 ) {
				n10  +=1;
				num -=10;
			}else
			if(num>=5 && num<10 ) {
				n5  +=1;
				num -=5;
			}else
			if(num>=2 && num<5 ) {
				n2  +=1;
				num -=2;
			}else
			if(num>=1 && num<2 ) {
				n1  +=1;
				num -=1;
			}
		}while(num>0);
		
		
		System.out.println(n100 +" nota(s) de R$ 100,00");
		System.out.println(n50 +" nota(s) de R$ 50,00");
		System.out.println(n20 +" nota(s) de R$ 20,00");
		System.out.println(n10 + " nota(s) de R$ 10,00");
		System.out.println(n5 +" nota(s) de R$ 5,00");
		System.out.println(n2 +" nota(s) de R$ 2,00");
		System.out.println(n1 +" nota(s) de R$ 1,00");
	}

}
