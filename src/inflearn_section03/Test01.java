package inflearn_section03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 두 배열 합치기
// Arrays.sort()의 경우 Dual-Pivot QuickSort로 O(nlogn)의 복잡도를 갖는다.
// 따라서 두 배열을 합친 후에 Array.sort를 진행하면 런타임에러가 발생할 수 있다.
// ex) 합친 배열이 6만개라면, 총 960,000번 돌게되므로
public class Test01 {
	public void solution(int[] first, int[] second) {
		List<Integer> result = new ArrayList<>();

		int f = 0; // first배열의 pointer
		int s = 0; // second배열의 pointer

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
