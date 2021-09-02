package inflearn_section08;

import java.util.Scanner;

public class Test01 {
	boolean isFind = false;
	static String answer = "NO";
	static int total = 0;
	static int[] num;
	static int n;
	public void DFS(int index, int sum) {
		if(isFind) return;
		if(sum > total/2) return;
		if(index == n) {
			if(total-sum == sum) {
				isFind = true; // ���̻� ã�� �ʰ��ϵ��� �ϱ����ؼ�
				answer = "YES";
			}
				
		}
		else {
			DFS(index+1, sum + num[index]); // �κ��������� ���O
			DFS(index+1, sum); // �κ��������� ���X
		}
		
	}
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		num = new int[n];
		for(int i = 0 ; i < n ; i++) {
			num[i] = scan.nextInt();
			total += num[i];
		}
		t.DFS(0, 1);
		System.out.println(answer);
	}
}
