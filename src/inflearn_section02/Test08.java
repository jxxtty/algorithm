package inflearn_section02;

import java.util.Scanner;

public class Test08 {
	public void solution(int[] score) {
		int[] grade = new int[score.length];
		for(int i = 0 ; i < score.length ; i++) {
			int stamp = score[i];
			int count = 1;
			for(int j = 0 ; j < score.length ; j++) {
				if(i != j) {
					if(stamp < score[j]) count++;
				}
			}
			grade[i] = count;
		}

		for(int i = 0 ; i < score.length ; i++) {
			System.out.print(grade[i]+" ");
		}
		
	}

	public static void main(String[] args) {
		Test08 t = new Test08();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] score = new int[num];
		for(int i = 0 ; i < num ; i++) {
			score[i] = scan.nextInt();
		}
		
		t.solution(score);
	}

}
