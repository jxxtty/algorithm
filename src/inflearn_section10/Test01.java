package inflearn_section10;

import java.util.Scanner;

// 계단오르기(한번에 한계단 또는 두계단)
public class Test01 {
	static int[] dy;
	public int solution(int n) {
		dy[1] = 1;
		dy[2] = 2;
		for(int i = 3 ; i <= n ; i++) {
			dy[i] = dy[i-2] + dy[i-1];
		}
		return dy[n];
	}
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		dy = new int[n+1];
		System.out.println(t.solution(n));
	}
}
