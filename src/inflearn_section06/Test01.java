package inflearn_section06;

import java.util.Scanner;
// ��������
public class Test01 {
	
	public void solution(int n, int[] num) {
		for(int i = 0 ; i < n ; i++) {
			int index = 0;
			int min = 101;
			for(int j = i ; j < n ; j++) {
				if(min > num[j]) {
					min = num[j];
					index = j;
				}
			}
			int tmp = num[i];
			num[i] = min;
			num[index] = tmp;
			System.out.print(num[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner scan = new Scanner(System.in); 
		int n = scan.nextInt();
		int[] num = new int[n];
		for(int i = 0 ; i < n ; i++) {
			num[i] = scan.nextInt();
		}
		t.solution(n, num);
	}

}
