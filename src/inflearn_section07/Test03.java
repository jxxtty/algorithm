package inflearn_section07;

import java.util.Scanner;

public class Test03 {
public static int result = 1;
	
	public void factorial(int num) {
		if(num == 1) return;
		else {
			factorial(num-1);
			result = result * num;
		}
		
	}
	public static void main(String[] args) {
		Test03 t = new Test03();
		Scanner scan = new Scanner(System.in); 
		
		int num = scan.nextInt();
		
		t.factorial(num);
		System.out.println(result);
	}

}
