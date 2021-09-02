package inflearn_section08;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Test05 {
	static int num, total;
	static Integer[] coin;
	static int answer = Integer.MAX_VALUE;
	public void getChange(int count, int sum) {
		if(sum > total) return;
		if(answer <= count) return; // 어차피 정답이 될 수 없다. -> 탐색중단
		if(sum == total) {
			answer = Math.min(answer, count);
			return;
		} else {
			for(int i = 0 ; i < num ; i++) {
				getChange(count+1, sum+coin[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Test05 t = new Test05();
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		coin = new Integer[num];
		for(int i = 0 ; i < num ; i++) {
			coin[i] = scan.nextInt();
		}
		// 동전이 어떤 순서로 들어오는지 모르니까 내림차순으로 정렬한다
		Arrays.sort(coin, Collections.reverseOrder()); 
		total = scan.nextInt();
		
		t.getChange(0,0);
		System.out.println(answer);
	}

}
