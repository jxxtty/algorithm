package inflearn_section06;

import java.util.Scanner;
// 버블정렬
public class Test02 {
	public void solution(int n, int[] num) {
		for(int i = 0 ; i < n-1 ; i++) {
			for(int j = 0 ; j < n-i-1 ; j++) {
				int tmp = num[j];
				if(num[j+1] < tmp) {
					num[j] = num[j+1];
					num[j+1] = tmp;
				}
			}
		}
		for(int i : num) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		Test02 t = new Test02();
		Scanner scan = new Scanner(System.in); 
		
		int n = scan.nextInt();
		int[] num = new int[n];
		for(int i = 0 ; i < n ; i++) {
			num[i] = scan.nextInt();
		}
		t.solution(n, num);
	}

}
