package inflearn_section06;

import java.util.Arrays;
import java.util.Scanner;

// 이분검색
public class Test08 {
	public int solution(int num, int point, int[] numbers) {
		int answer = 0;
		
		Arrays.sort(numbers);
		int low = 0;
		int high = (num-1);
		while(low <= high) {
			int mid = (low + high)/2;

			if(numbers[mid] > point) high = mid-1;
			else if(numbers[mid] < point) low = mid+1;
			else {
				answer = mid;
				break;
			}
		}
		
		return answer+1;
	}
	public static void main(String[] args) {
		Test08 t = new Test08();
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		int point = scan.nextInt();
		int[] numbers = new int[num];
		for(int i = 0 ; i < num ; i++) {
			numbers[i] = scan.nextInt();
		}
		System.out.println(t.solution(num, point, numbers));
	}

}
