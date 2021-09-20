package inflearn_section03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// �� �迭 ��ġ��
// Arrays.sort()�� ��� Dual-Pivot QuickSort�� O(nlogn)�� ���⵵�� ���´�.
// ���� �� �迭�� ��ģ �Ŀ� Array.sort�� �����ϸ� ��Ÿ�ӿ����� �߻��� �� �ִ�.
// ex) ��ģ �迭�� 6�������, �� 960,000�� ���ԵǹǷ�
public class Test01 {
	public void solution(int[] first, int[] second) {
		List<Integer> result = new ArrayList<>();

		int f = 0; // first�迭�� pointer
		int s = 0; // second�迭�� pointer

		while (f < first.length && s < second.length) {
			if (first[f] < second[s]) {
				result.add(first[f]);
				f++;
			} else if (first[f] > second[s]) {
				result.add(second[s]);
				s++;
			} else {
				result.add(second[s]);
				s++;
			}

		}

		if (f == first.length) {
			for(int i = s ; i < second.length ; i++) {
				result.add(second[i]);
			}
		} else {
			for(int i = f ; i < first.length ; i++) {
				result.add(first[i]);
			}
		}
		
		for(int i = 0 ; i < result.size() ; i++) {
			System.out.print(result.get(i) + " ");
		}

	}
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[] first = new int[num];
		for (int i = 0; i < num; i++) {
			first[i] = scan.nextInt();
		}
		num = scan.nextInt();
		int[] second = new int[num];
		for (int i = 0; i < num; i++) {
			second[i] = scan.nextInt();
		}

		t.solution(first, second);
	}

}
