package inflearn_section09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class Meeting implements Comparable<Meeting>{
	int start;
	int end;
	
	public Meeting(int s, int e) {
		start = s;
		end = e;
	}

	@Override
	public int compareTo(Meeting o) {
		// 끝나는 시간을 기준으로 오름차순 정렬 
		// 단, 끝나는 시간이 같다면 시작하는 시간을 기준으로 오름차순 정렬
		if(this.end == o.end) return this.start - o.start;
		else return this.end - o.end;
	}
	
	
}
public class Test02 {
	public int getMeetingNum(List<Meeting> list) {
		int answer = 0;
		Collections.sort(list);
		int buffer = 0;
		for(Meeting m : list) {
			if(m.start >= buffer) {
				answer++;
				buffer = m.end;
			}
		}
		
		return answer;
	}
	public static void main(String[] args) {
		Test02 t = new Test02();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		List<Meeting> list = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			int s = scan.nextInt();
			int e = scan.nextInt();
			list.add(new Meeting(s, e));
		}
		System.out.println(t.getMeetingNum(list));
	}

}
