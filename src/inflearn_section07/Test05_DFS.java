package inflearn_section07;

public class Test05_DFS {
	Node root;
	public void preorderDFS(Node root) { // 전위순회
		if(root == null ) return;
		else {
			System.out.print(root.data + " ");
			preorderDFS(root.lt);
			preorderDFS(root.rt);
		}
	}
	
	public void inorderDFS(Node root) { // 중위순회
		if(root == null ) return;
		else {
			inorderDFS(root.lt);
			System.out.print(root.data + " ");
			inorderDFS(root.rt);
		}
	}
	
	public void postorderDFS(Node root) { // 후위순회
		if(root == null ) return;
		else {
			postorderDFS(root.lt);
			postorderDFS(root.rt);
			System.out.print(root.data + " ");
		}
	}
	
	public static void main(String[] args) {
		Test05_DFS t = new Test05_DFS();
		t.root = new Node(1);
		t.root.lt = new Node(2);
		t.root.rt = new Node(3);
		t.root.lt.lt = new Node(4);
		t.root.lt.rt = new Node(5);
		t.root.rt.lt = new Node(6);
		t.root.rt.rt = new Node(7);
		
		System.out.print("전위순회 : ");
		t.preorderDFS(t.root);
		System.out.println();
		System.out.print("중위순회 : ");
		t.inorderDFS(t.root);
		System.out.println();
		System.out.print("후위순회 : ");
		t.postorderDFS(t.root);
	}

}
