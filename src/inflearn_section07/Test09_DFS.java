package inflearn_section07;
// �ִܰŸ� ã��
// �ִܰŸ� ã���� ��� BFS�� Ǫ�°� ����
// DFS���� �Ϸ��� �ڽĳ�尡 �ݵ�� 2���� �־�� �Ѵ�(����)
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
