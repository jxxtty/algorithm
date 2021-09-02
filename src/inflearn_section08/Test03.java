package inflearn_section08;

import java.util.Scanner;

public class Test03 {
	static int q, minute;
	static int[][] timeScore;
	static int result = 0;
	public void findMaxScore(int index, int scoreSum, int timeSum) {
		if(timeSum > minute) return;
		if(index == q) {
			result = Math.max(result, scoreSum);
		} else {
			findMaxScore(index+1, scoreSum+timeScore[index][0], timeSum+timeScore[index][1]);
			findMaxScore(index+1, scoreSum, timeSum);
		}
	}
	
	public static void main(String[] args) {
		Test03 t = new Test03();
		Scanner scan = new Scanner(System.in);
		q = scan.nextInt();
		minute = scan.nextInt();
		timeScore = new int[q][2];
		for(int i = 0 ; i < q ; i++) {
			timeScore[i][0] = scan.nextInt();
			timeScore[i][1] = scan.nextInt();
		}
		t.findMaxScore(0, 0, 0);
		System.out.println(result);
	}

}
