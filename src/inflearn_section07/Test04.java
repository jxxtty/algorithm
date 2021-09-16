package inflearn_section07;

import java.util.Scanner;
// 피보나치_메모이제이션
public class Test04 {
	static int[] fibonacci;
	public int fibo(int num) {
		if(fibonacci[num] > 0 ) return fibonacci[num];
		if(num == 1) return fibonacci[num] = 1;
		else if(num == 2) return fibonacci[num] = 1;
		else return fibonacci[num] = fibo(num-2) + fibo(num-1);
		
	}
	
	public static void main(String[] args) {
		Test04 t = new Test04();
		Scanner scan = new Scanner(System.in); 
		
		int num = scan.nextInt();
		fibonacci = new int[num+1];
		t.fibo(num);
		for(int i = 1; i <= num ; i++) System.out.print(fibonacci[i] + " ");
		
	}

}
