package inflearn_section07;

public class Test06_DFS {
	// 1~num 으로 이루어진 집합의 부분집합을 출력한다.
	static int num;
	static int[] ch; // 포함여부를 체크한다
	public void DFS(int L) {
		if(L == num+1) {
			String tmp = "";
			for(int i = 1 ; i < num+1 ; i++) {
				if(ch[i] == 1) tmp += i + " ";
			}
			if(tmp.length() > 0) System.out.println(tmp);
		} else {
			ch[L] = 1;
			DFS(L+1);
			ch[L] = 0;
			DFS(L+1);
		}
	}
	public static void main(String[] args) {
		Test06_DFS t = new Test06_DFS();
		num = 3;
		ch = new int[num+1];
		t.DFS(1);
	}

}
