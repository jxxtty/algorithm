package inflearn_section08;

import java.util.ArrayList;
import java.util.Scanner;

public class Test15 {
	static int n, m, len;
	static int answer = Integer.MAX_VALUE;
	static ArrayList<Pointer> pizza, house;
	static int[] combi; // 조합(피자집 총 개수Cm)
	public void getDistance(int L, int s) {
		if(L == m) {
			int sum = 0;
			for(Pointer p : house) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis = Math.min(dis, Math.abs(p.pX - pizza.get(i).pX)+Math.abs(p.pY - pizza.get(i).pY));
				}
				sum += dis;
			}
			answer = Math.min(answer, sum);
			
		} else {
			for(int i = s ; i < len ; i++) {
				combi[L] = i;
				getDistance(L+1, i+1);
			}
		}
	}
	
	public static void main(String[] args) {
		Test15 t = new Test15();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		pizza = new ArrayList<>();
		house = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				int tmp = scan.nextInt();
				if(tmp == 1) house.add(new Pointer(i,j));
				else if(tmp == 2) pizza.add(new Pointer(i,j));
			}
		}
		combi = new int[m];
		len = pizza.size();
		
		t.getDistance(0,0);
		System.out.println(answer);
	}

}
