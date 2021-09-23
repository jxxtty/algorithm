package inflearn_section02;

import java.util.Scanner;

// 소수(에라토스테네스 체)
public class Test05 {
	public int solution(int num) {
		int result = 0;
		int[] buf = new int[num+1]; // 20이 들어오면 길이20짜리 -> 전체가0으로 초기화되어있음
		// 소수면 0, 아니면 1로 짤꺼임!
		buf[0] = 1;
		buf[1] = 1;
		for(int i = 2; i < num+1 ; i++) {
			if(buf[i] == 0) {
				for(int j = 2; j*i < num+1 ; j++) {
					buf[i*j] = 1;
				}
			}
		}
		for(int i = 0 ; i < buf.length ; i++) {
			if(buf[i] == 0) {
				
				result++;
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
