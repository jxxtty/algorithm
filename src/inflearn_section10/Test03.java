package inflearn_section10;

import java.util.Arrays;
import java.util.Scanner;

public class Test03 {
	static int[] dy;
	public int solution(int[] nums, int n) {
		dy[0] = 1;
		for(int i = 1 ; i < n ; i++) {
			int max = 0;
			for(int j = i-1 ; j >= 0 ; j--) {
				if(nums[i] > nums[j] && dy[j] > max) max = dy[j];
			}
			dy[i] = max+1;
		}
		
		return Arrays.stream(dy).max().getAsInt();
	}

	public static void main(String[] args) {
		Test03 t = new Test03();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n];
		dy = new int[n];
		for(int i = 0 ; i < n ; i++) {
			nums[i] = scan.nextInt();
		}
		System.out.println(t.solution(nums, n));
	}

}
