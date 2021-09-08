package inflearn_section09;

import java.util.Arrays;
import java.util.Scanner;

public class Test01 {
	
	public int findPlayer(int[] height, int[] weight) {
		int answer = 0;
		for(int i = 0 ; i < height.length ; i++) {
			int nowB = height[i];
			int nowW = weight[i];
			for(int j = 0 ; j < height.length ; j++) {
				if(height[j] != 0 && weight[j] != 0) {
					if(height[j] > nowB && weight[j] > nowW) {
						height[i] = 0;
						weight[i] = 0;
						break;
					}
				}
			}
		}
		
		answer = (int) Arrays.stream(height).filter(b -> b != 0).count();
		
		return answer;
	}
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] height = new int[n];
		int[] weight = new int[n];
		for(int i = 0 ; i < n ; i++) {
			height[i] = scan.nextInt();
			weight[i] = scan.nextInt();
		}
		System.out.println(t.findPlayer(height, weight));
	}

}
