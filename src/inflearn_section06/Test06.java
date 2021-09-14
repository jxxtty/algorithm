package inflearn_section06;

import java.util.Arrays;
import java.util.Scanner;

public class Test06 {
	public void solution(int num, int[] numbers) {
		int[] height = numbers.clone();
		Arrays.sort(height);
		for(int i = 0 ; i < num ; i++) {
			if(height[i] != numbers[i]) System.out.print((i+1) + " ");
		}
	}
	public static void main(String[] args) {
		Test06 t = new Test06();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int[] numbers = new int[num];
		for(int i = 0 ; i < num ; i++) {
			numbers[i] = scan.nextInt();
		}
		t.solution(num, numbers);
	}

}
