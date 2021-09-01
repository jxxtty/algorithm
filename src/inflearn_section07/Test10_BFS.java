package inflearn_section07;

import java.util.LinkedList;
import java.util.Queue;
//최단거리 찾기
public class Test10_BFS {
	Node root;
	
	public int BFS(Node root) {
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		int L = 0;
		
		while(!queue.isEmpty()) {
			int len = queue.size();
			for(int i = 0 ; i < len ; i++) {
				Node cur = queue.poll();
				if(cur.lt == null && cur.rt == null) {
					// 말단 노드라면 최단경로 찾은거 -> 레벨값을 리턴한다.
					return L;
				}
				
				if(cur.lt != null) queue.offer(cur.lt);
				if(cur.rt != null) queue.offer(cur.rt);
			}
			L++;
		}
		
		return 0;
		
	}
	
	public static void main(String[] args) {
		Test10_BFS t = new Test10_BFS();
		t.root = new Node(1);
		t.root.lt = new Node(2);
		t.root.rt = new Node(3);
		t.root.lt.lt = new Node(4);
		t.root.lt.rt = new Node(5);
		
		System.out.println(t.BFS(t.root));
	}

}
