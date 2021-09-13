package inflearn_section10;

import java.util.Scanner;

public class Test02 {
	static int[] dy;
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i = 3 ; i <= n+1 ; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		return dy[n+1]; // 돌의개수 + 도착한지점(1)
	}
	public static void main(String[] args) {
		Test02 t = new Test02();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		dy = new int[n+2];
		System.out.println(t.solution(n));
	}

}
