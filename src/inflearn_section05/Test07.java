package inflearn_section05;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test07 {
	public String solution(String order, String classes) {
		Queue<Character> classQ = new LinkedList<>();
		Queue<Character> orderQ = new LinkedList<>();
		for(char c : classes.toCharArray()) {
			classQ.add(c);
		}
		for(char c : order.toCharArray()) {
			orderQ.add(c);
		}
		
		while(!classQ.isEmpty()) {
			char buf = classQ.poll();
			if(orderQ.peek() == buf) {
				orderQ.poll();
				if(orderQ.size() == 0) break;
			}
		}
		
		return orderQ.isEmpty() ? "YES" : "NO";
	}
	public static void main(String[] args) {
		Test07 t = new Test07();
		Scanner scan = new Scanner(System.in);
		
		String order = scan.nextLine();
		String classes = scan.nextLine();
		System.out.println(t.solution(order, classes));
		
	}
}
