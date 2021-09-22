package inflearn_section03;

import java.util.Scanner;

// �ִ���� ���� �κм���
public class Test06 {
	public int solution(int[] arr, int zero) {
		int result = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			int length = 0;
			int count = 0; // 0�Ǽ��ڸ� ���ش�.
			for(int j = i ; j < arr.length ; j++) {
				if(arr[j] == 0) count++;
				if(count > zero) break;
				length++;
			}
			if(result < length) result = length;
		}
		
		
		return result;
	}

	public static void main(String[] args) {
		Test06 t = new Test06();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int zero = scan.nextInt();
		int[] arr = new int[num];
		for(int i = 0 ; i < num ; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println(t.solution(arr, zero));
	}

}
