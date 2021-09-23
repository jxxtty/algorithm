package inflearn_section02;

import java.util.Scanner;
// 피보나치 수열 출력하기_배열이용
public class Test04_fibonacci {
	public void solution(int num) {
		int[] result = new int[num];
		result[0] = 1;
		result[1] = 1;
		for(int i = 2; i < num ; i++) {
			result[i] = result[i-2]+result[i-1];
		}
		
		for(int i = 0 ; i < num ; i++) {
			System.out.print(result[i] + " ");
		}
	}

	public static void main(String[] args) {
		Test04_fibonacci t = new Test04_fibonacci();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		 
		t.solution(num);
	}

}
