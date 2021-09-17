package inflearn_section05;

import java.util.Scanner;
import java.util.Stack;

// 카카오 인형뽑기
public class Test03 {
	public int solution(int num, int[][] dolls, int count, int[] moves) {
		int answer = 0;
		Stack<Integer> bucket = new Stack<>();
		for(int i = 0 ; i < count ; i++) {
			int loc = moves[i];
			for(int j = 0 ; j < num ; j++) {
				if(dolls[j][loc-1] != 0) {
					bucket.push(dolls[j][loc-1]);
					dolls[j][loc-1] = 0;
					break;
				}
			}
			if(i != 0) {
				int first = bucket.pop();
				int second = bucket.peek();
				if(first == second) {
					bucket.pop();
					answer += 2;
				} else {
					bucket.push(first);
				}
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Test03 t = new Test03();
		Scanner scan = new Scanner(System.in); 
		int num = scan.nextInt();
		int[][] dolls = new int[num][num];
		for(int i = 0 ; i < num ; i++) {
			for(int j = 0 ; j < num ; j++) {
				dolls[i][j] = scan.nextInt();
			}
		}
		int count = scan.nextInt();
		int[] moves = new int[count];
		for(int i = 0 ; i < count ; i++) {
			moves[i] = scan.nextInt();
		}
		
		System.out.println(t.solution(num, dolls, count, moves));
	}

}
