package inflearn_section07;

import java.util.ArrayList;
import java.util.Scanner;

public class Test13 {
	static ArrayList<ArrayList<Integer>> list;
	static int[] ch;
	static int v, num;
	static int answer = 0;
	
	public void DFS(int start) {
		if(start == v) answer++;
		else {
			for(int nv : list.get(start)) {
				if(ch[nv] == 0) {
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test13 t = new Test13();
		Scanner scan = new Scanner(System.in);
		
		v = scan.nextInt();
		num = scan.nextInt();
		
		ch = new int[v+1];
		list = new ArrayList<ArrayList<Integer>>();
		for(int i = 0 ; i <= v ; i++) {
			list.add(new ArrayList<Integer>());
		}
		
		for(int i = 0 ; i < num ; i++) {
			int ver = scan.nextInt();
			int edge = scan.nextInt();
			list.get(ver).add(edge);
		}
		
		ch[1] = 1;
		t.DFS(1);
		System.out.println(answer);
		// 입력값
		/*
		5 9
		1 2
		1 3
		1 4
		2 1
		2 3
		2 5
		3 4
		4 2
		4 5
		*/
		// 출력값 : 6
	}

}
