package inflearn_section07;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

// 1번 정점에서 각 정점으로 가는 최소 간선수를 2번 정점부터 차례대로 출력
public class Test14 {

	static ArrayList<ArrayList<Integer>> list;
	static int[] result, ch;
	static int v, num;
	public void BFS(int start) {
		ch[start] = 1;
		result[start] = 0;
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(start);
		while(!queue.isEmpty()) {
			int now = queue.poll();
			for(int nv : list.get(now)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					queue.offer(nv);
					result[nv] = result[now] + 1;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test14 t = new Test14();
		Scanner scan = new Scanner(System.in);
		
		v = scan.nextInt();
		num = scan.nextInt();
		
		ch = new int[v+1];
		result = new int[v+1];
		list = new ArrayList<ArrayList<Integer>>();
		for(int i = 0 ; i <= v ; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i = 0 ; i < num ; i++) {
			int ver = scan.nextInt();
			int edge = scan.nextInt();
			
			list.get(ver).add(edge);
		}
		
		t.BFS(1);
		
		for(int i = 2 ; i <= v ; i++) {
			System.out.println(i + " : " + result[i]);
		}
		// 입력값
		/*
		6 9
		1 3
		1 4
		2 1
		2 5
		3 4
		4 5
		4 6
		6 2
		6 5
		*/
		// 출력값
		/*
		2 : 3
		3 : 1
		4 : 1
		5 : 2
		6 : 2
		*/
	}
	
}
