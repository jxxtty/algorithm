package inflearn_section02;

import java.util.Scanner;

public class Test10 {
	public void solution(int[][] m) {
		int count = 0;
		// ╩С : [i-1][j] , го : [i+1][j]
		// аб : [i][j-1] , ©Л : [i][j+1]
		for(int i = 1 ; i <=m.length-2 ; i++) {
			for(int j = 1 ; j <= m.length-2 ; j++) {
				int max = (m[i-1][j] >= m[i][j-1])?m[i-1][j]:m[i][j-1];
				max = (max >= m[i+1][j])?max:m[i+1][j];
				max = (max >= m[i][j+1])?max:m[i][j+1];
				
				if(max < m[i][j]) count++;
			}
		}
		System.out.println(count);
	}

	public static void main(String[] args) {
		Test10 t = new Test10();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[][] mountain = new int[num+2][num+2];
		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1 ; j <= num ; j++) {
				mountain[i][j] = scan.nextInt();
			}
		}
		
		t.solution(mountain);
	}

}
