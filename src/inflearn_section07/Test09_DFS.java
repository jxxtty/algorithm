package inflearn_section07;
// 최단거리 찾기
// 최단거리 찾기의 경우 BFS로 푸는게 맞음
// DFS에서 하려면 자식노드가 반드시 2개씩 있어야 한다(제약)
public class Test09_DFS {
	Node root;
	public int DFS(int L, Node root) {
		if(root.lt == null && root.rt == null) return L;
		else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt));
	}
	public static void main(String[] args) {
		Test09_DFS t = new Test09_DFS();
		t.root = new Node(1);
		t.root.lt = new Node(2);
		t.root.rt = new Node(3);
		t.root.lt.lt = new Node(4);
		t.root.lt.rt = new Node(5);
		
		System.out.println(t.DFS(0, t.root));
	}

}
