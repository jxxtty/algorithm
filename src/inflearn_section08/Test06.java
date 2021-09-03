package inflearn_section08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
// 순열 구하기
// 3 <= n <= 10, 2 <= count <= n
// num : n개의 자연수가 오름차순으로 주어진다. 이때 n개의 자연수 중 count개를 뽑아 오름차순으로 출력
public class Test06 {
	static int[] ch;
	static int n, count;
	static int[] num;
	List<Integer> list = new ArrayList<>();
	public void printResult(int start, int level) {
		if(level == count) {
			for(Integer i : list) {
				System.out.print(i + " ");
			}
			System.out.println();
			return;
		}
		else {
			for(int i = 0 ; i < n ; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					list.add(num[i]);
					printResult(i, level+1);
					list.remove(Integer.valueOf(num[i]));
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test06 t = new Test06();
		Scanner scan = new Scanner(System.in);
		
		n = scan.nextInt();
		count = scan.nextInt();
		num = new int[n];
		ch = new int[n];
		for(int i = 0 ; i < n ; i++) {
			num[i] = scan.nextInt();
		}
		
		t.printResult(0, 0);
		
	}

}
