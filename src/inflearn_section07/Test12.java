package inflearn_section07;

import java.util.Scanner;

public class Test12 {
	static int v, num;
	static int[][] graph;
	static int[] ch;
	static int answer = 0;
	public void DFS(int start) {
		if(v == start) answer++;
		else {
			for(int i = 1 ; i <= v ; i++) {
				if(graph[start][i] == 1 && ch[i] == 0) { // 연결되어있고, 방문한적없는
					ch[i] = 1;
					DFS(i);
					ch[i] = 0;
				}
			}
		}
		
		
	}

	public static void main(String[] args) {
		Test12 t = new Test12();
		Scanner scan = new Scanner(System.in);
		v = scan.nextInt();
		num = scan.nextInt();
		graph = new int[v+1][v+1];
		ch = new int[v+1];
		for(int i = 0 ; i < num ; i++) {
			int ver = scan.nextInt();
			int edge = scan.nextInt();
			graph[ver][edge] = 1;
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
