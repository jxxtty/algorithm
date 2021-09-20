package inflearn_section03;

import java.util.Scanner;
// sliding window
public class Test03 {
	public int solution(int range, int[] sales) {
		int sum = 0;
		int max = 0;
		// ó�� range��ŭ�� ���� sum�� �־���´�.
		for(int i = 0 ; i < range ; i++) {
			sum += sales[i];
		}
		max = sum;

		for(int i = range ; i < sales.length ; i++) {
			sum = sum - sales[i-range] + sales[i];
			if(max < sum) max = sum;
		}
		
		
		return max;
	}
	

	public static void main(String[] args) {
		Test03 t = new Test03();
		Scanner scan = new Scanner(System.in);
		
		int day = scan.nextInt();
		int range = scan.nextInt();
		int[] sales = new int[day];
		for(int i = 0 ; i < day ; i++) {
			sales[i] = scan.nextInt();
		}
		
		int result = t.solution(range, sales);
		System.out.println(result);
	}

}
