package inflearn_section07;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Test08 {

	int[] dis = {1, -1, 5};
	int[] ch;
	Queue<Integer> queue = new LinkedList<>();
	public int searchCow(int position, int cow) {
		ch = new int[10001]; // �������� ��ǥ���� 10,000������.
		ch[position] = 1;
		queue.offer(position);
		int L = 0; // level
		while(!queue.isEmpty()) {
			int len = queue.size(); // level�� ������ ����
			for(int i = 0 ; i < len ; i++) {
				int x = queue.poll();
				
				for(int d : dis) {
					int nextX = x+d;
					if(nextX == cow) return L+1;
					if(nextX >= 1 && nextX <= 10000 && ch[nextX] == 0) {
						ch[nextX] = 1;
						queue.offer(nextX);
					}
				}
			}
			L++; // level ����
		}
		
		return 0; // ���Ļ� ���� return
	}
	
	public static void main(String[] args) {
		Test08 t = new Test08();
		Scanner scan = new Scanner(System.in);
		int position = scan.nextInt();
		int cow = scan.nextInt();
		System.out.println(t.searchCow(position, cow));
	}

}
