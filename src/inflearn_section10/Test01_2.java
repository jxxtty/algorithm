package inflearn_section10;

import java.util.Scanner;

public class Test01_2 {
	static int answer = 0;
	public int solution(int n) {
		if(n == 1) return 1;
		if(n == 2) return 2;
		for(int i = 3 ; i <= n ; i++) {
			answer = solution(n-2) + solution(n-1);
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Test01_2 t = new Test01_2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(t.solution(n));
	}

}
