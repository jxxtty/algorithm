package inflearn_section09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// ���ͽ�Ʈ�� �˰���
class Node implements Comparable<Node> {
	int vex;
	int cost;
	
	public Node(int vex, int cost) {
		this.vex = vex;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) { // Priority Queue���� ������(�������� -> �������� �켱���� �Ѵ�)
		return this.cost - o.cost;
	}
}
public class Test05 {
	static ArrayList<ArrayList<Node>> graph;
	static int[] dis;
	public void getMinDistance(int start) {
		PriorityQueue<Node> pQueue = new PriorityQueue<>();
		pQueue.offer(new Node(start, 0));
		dis[start] = 0;
		
		while(!pQueue.isEmpty()) {
			Node tmp = pQueue.poll();
			int now = tmp.vex;
			int nowCost = tmp.cost;
			if(nowCost > dis[now]) continue;
			for(Node n : graph.get(now)) {
				if(dis[n.vex] > nowCost+n.cost) {
					dis[n.vex] = nowCost + n.cost;
					pQueue.offer(new Node(n.vex, nowCost+n.cost));
				}
			}
		}
	}
	public static void main(String[] args) {
		Test05 t = new Test05();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		
		dis = new int[n+1]; // �ּҰŸ��� �����ϴ� �迭
		Arrays.fill(dis, Integer.MAX_VALUE);
		
		graph = new ArrayList<ArrayList<Node>>();
		for(int i = 0 ; i <= n ; i++) {
			graph.add(new ArrayList<Node>());
		}
		
		for(int i = 0 ; i < m ; i++) {
			int data = scan.nextInt();
			int vex = scan.nextInt();
			int cost = scan.nextInt();
			graph.get(data).add(new Node(vex, cost));
		}
		
		t.getMinDistance(1);
		for(int i = 2 ; i <= n ; i++) {
			if(dis[i] != Integer.MAX_VALUE) System.out.println(i + " : " + dis[i]);
			else System.out.println(i + " : impossible");
		}
	}
// ---�Է°�---
//6 9
//1 2 12
//1 3 4
//2 1 2
//2 3 5
//2 5 5
//3 4 5
//4 2 2
//4 5 5
//6 4 5
	
// ---��°�---
//2 : 11
//3 : 4
//4 : 9
//5 : 14
//6 : impossible
}
