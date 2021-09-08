package inflearn_section09;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Greedy Algorithm(���������ǹ̷� -> �����س��� �����س�����.)
class Player implements Comparable<Player> {
	int height;
	int weight;
	
	public Player(int h, int w) {
		height = h;
		weight = w;
	}

	@Override
	public int compareTo(Player o) { // Ű�� �������� �������� ����
		return o.height - this.height;
	}
	
	
	
}
public class Test01_2 {
	public int findPlayer(ArrayList<Player> list) {
		int answer = 0;
		Collections.sort(list);
		int max = Integer.MIN_VALUE;
		for(Player p : list) {
			if(p.weight > max) {
				max = p.weight;
				answer++;
			}
		}
		
		return answer;
	}

	public static void main(String[] args) {
		Test01_2 t = new Test01_2();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		ArrayList<Player> list = new ArrayList<>();
		for(int i = 0 ; i < n ; i++) {
			int h = scan.nextInt();
			int w = scan.nextInt();
			list.add(new Player(h, w));
		}
		System.out.println(t.findPlayer(list));
	}

}
