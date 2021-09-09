package inflearn_section09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
class Lecture implements Comparable<Lecture>{
	int pay;
	int time;
	
	public Lecture(int pay, int time) {
		this.pay = pay;
		this.time = time;
	}

	@Override
	public int compareTo(Lecture o) {
		return o.time - this.time;
	}
	
}
public class Test04 {
	public int getMaxMoney(List<Lecture> list, int max) {
		int answer = 0;
		Collections.sort(list);
		PriorityQueue<Integer> pQueue = new PriorityQueue<>(Collections.reverseOrder());
		for(int i = max ; i >= 1 ; i--) {
			for(int j = 0 ; j < list.size() ; j++) {
				if(list.get(j).time < i) break;
				if(list.get(j).time == i) pQueue.offer(list.get(j).pay);
			}
			if(!pQueue.isEmpty()) answer += pQueue.poll();
		}
		
		
		return answer;
	}

	public static void main(String[] args) {
		Test04 t = new Test04();
		Scanner scan = new Scanner(System.in);
		List<Lecture> list = new ArrayList<>();
		int max = Integer.MIN_VALUE;
		int n = scan.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int pay = scan.nextInt();
			int time = scan.nextInt();
			list.add(new Lecture(pay, time));
			if(max < time) max = time;
		}
		System.out.println(t.getMaxMoney(list, max));
	}

}
