package inflearn_section02;

import java.util.Scanner;

public class Test12 {
	public int solution(int people, int recordNum, int[][] record) {
		int answer = 0;
		for(int i = 1 ; i < people+1 ; i++) {
			for(int j = 1 ; j < people+1 ; j++) {
				int count = 0;
				int positionI = 0;
				int positionJ = 0;
				for(int k = 0 ; k < recordNum ; k++) {
					for(int s = 0 ; s < people ; s++) {
						if(record[k][s] == i) {
							positionI = s;
						}
						if(record[k][s] == j) {
							positionJ = s;
						}
					}
					if(positionI < positionJ) count++;
				}
				if(count == recordNum) answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Test12 t = new Test12();
		Scanner scan = new Scanner(System.in);
		
		int people = scan.nextInt();
		int recordNum = scan.nextInt();
		int[][] record = new int[recordNum][people];
		for(int i = 0 ; i < recordNum ; i++) {
			for(int j = 0 ; j < people ; j++) {
				record[i][j] = scan.nextInt();
			}
		}
		System.out.println(t.solution(people, recordNum, record));
	}

}
