package inflearn_section07;

import java.util.Scanner;

public class Test02 {
	public void changePrime(int num) {
		if(num == 1) {
			System.out.print(num);
			return;
		}
		else {
			changePrime(num/2);
			System.out.print(num%2);
		}
		
	}
	public static void main(String[] args) {
		Test02 t = new Test02();
		Scanner scan = new Scanner(System.in); 
		
		int num = scan.nextInt();
		
		t.changePrime(num);
	}

}
