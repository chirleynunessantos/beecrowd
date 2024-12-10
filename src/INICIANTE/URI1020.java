package INICIANTE;

import java.time.Duration;
import java.util.Scanner;

public class URI1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		Duration horas = Duration.ofSeconds(num);
		
		System.out.println(horas.toHours()+":"+horas.toMinutesPart()+":"+horas.toSecondsPart());

	}

}
