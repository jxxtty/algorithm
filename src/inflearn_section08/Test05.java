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
		if(answer <= count) return; // ������ ������ �� �� ����. -> Ž���ߴ�
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
		// ������ � ������ �������� �𸣴ϱ� ������������ �����Ѵ�
		Arrays.sort(coin, Collections.reverseOrder()); 
		total = scan.nextInt();
		
		t.getChange(0,0);
		System.out.println(answer);
	}

}
