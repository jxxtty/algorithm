package inflearn_section09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Wedding implements Comparable<Wedding>{
	int time;
	char state;
	
	public Wedding(int t, char c) {
		time = t;
		state = c;
	}

	@Override
	public int compareTo(Wedding w) {
		if(this.time == w.time) return this.state - w.state; // e -> s
		else return this.time - w.time;
	}
}
public class Test03 {
	public int getCapacity(List<Wedding> list) {
		int capacity = 0;
		Collections.sort(list);
		int cnt = 0;
		for(Wedding w : list) {
			if(w.state == 'e') {
				cnt--;
			} else {
				cnt++;
			}
			capacity = Math.max(capacity, cnt);
		}
		
		
		return capacity;
	}

	public static void main(String[] args) {
		Test03 t = new Test03();
		Scanner scan = new Scanner(System.in);
		List<Wedding> list = new ArrayList<>();
		int n = scan.nextInt();
		for(int i = 0 ; i < n ; i++) {
			int s = scan.nextInt();
			list.add(new Wedding(s,'s'));
			int e = scan.nextInt();
			list.add(new Wedding(e,'e'));
		}
		System.out.println(t.getCapacity(list));
		
	}

}
