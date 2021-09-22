package inflearn_section03;

import java.util.Scanner;
// 연속된 자연수의 합
public class Test05 {
	public int solution(int num) {
		int result = 0; 
		
		for(int i = 1 ; i < num ; i++) {
			int sum = 0;
			for(int j = i ; j < num ; j++) {
				sum+= j;
				if(sum == num) {
					result++;
					break;
				} else if(sum > num) {
					break;
				}
			}
		}
		
		return result;
	}

	public static void main(String[] args) {
		Test05 t = new Test05();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		System.out.println(t.solution(num));
	}

}
