package inflearn_section06;

import java.util.Scanner;

public class Test04 {
	public void solution(int cSize, int num, int[] order) {
		int[] cache = new int[cSize];
		for(int i = 0 ; i < num ; i++) {
			int point = order[i];
			int idx = -1;
			for(int j = 0 ; j < cSize ; j++) {
				if(cache[j] == point) {
					idx = j; // ĳ�ÿ� �̹� ������
					break;
				}
			}
			if(idx > 0) { // ���� ���� �ִ�.
				for(int k = idx-1 ; k >= 0 ; k--) { // ���� ���� ���� ��ġ�������� ������ �̵�
					int tmp = cache[k];
					cache[k] = point;
					cache[k+1] = tmp;
				}
			} else { // ���� ���� ����.
				for(int k = cSize-2 ; k >= 0 ; k--) { // 0�� �ƴҶ��� �ڷ� ��ĭ�� �о�
					int tmp = cache[k];
					if(tmp != 0) {
						cache[k+1] = tmp;
					}
				}
				cache[0] = point; // �׷��� �� �տ� ���� �۾��� �־�
			}
			
		}
		for(int i : cache) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		Test04 t = new Test04();
		Scanner scan = new Scanner(System.in); 
		
		int cSize = scan.nextInt();
		int num = scan.nextInt();
		int[] order = new int[num];
		for(int i = 0 ; i < num ; i++) {
			order[i] = scan.nextInt();
		}
		t.solution(cSize, num, order);
	}

}
