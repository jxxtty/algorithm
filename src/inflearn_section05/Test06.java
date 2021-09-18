package inflearn_section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test06 {
	
	public int solution(int prince, int num) {
		int answer = 0;
		Queue<Integer> table = new LinkedList<>();
		for(int i = 1 ; i <= prince ; i++) {
			table.add(i);
		}
		
		int count = 0;
		while(table.size() != 1) {
			count++;
			int buf = table.poll();
			if(count == num) {
				count = 0;
				continue;
			}
			table.add(buf);
		}
		answer = table.poll();
		return answer;
	}
	
	public static void main(String[] args) {
		Test06 t = new Test06();
		Scanner scan = new Scanner(System.in);
		
		int prince = scan.nextInt();
		int num = scan.nextInt();
		System.out.println(t.solution(prince, num));
	}
}
