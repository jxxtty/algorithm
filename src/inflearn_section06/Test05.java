package inflearn_section06;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {
	public String solution(int num, int[] numbers) {
		String answer = "U";
		Arrays.sort(numbers);
		for(int i = 0 ; i < num-1 ; i++) {
			if(numbers[i] == numbers[i+1]) {
				answer = "D";
				break;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Test05 t = new Test05();
		Scanner scan = new Scanner(System.in); 
		
		int num = scan.nextInt();
		int[] numbers = new int[num];
		for(int i = 0 ; i < num ; i++) {
			numbers[i] = scan.nextInt();
		}
		System.out.println(t.solution(num, numbers));
	}

}
