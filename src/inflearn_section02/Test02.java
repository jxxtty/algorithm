package inflearn_section02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test02 {
	public int solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		int flag = arr[0];
		int max = arr[0];
		list.add(arr[0]); // �� �տ� �ִ� �л��� ������ ��������!
		for(int i = 1 ; i < arr.length ; i++) {
			if(flag < arr[i] && max < arr[i]) { // �ܼ��� �ٷ� �� �л����� ����
				list.add(arr[i]);
				max = arr[i];
			}
			flag = arr[i];
		}
		
		return list.size();
	}

	public static void main(String[] args) {
		Test02 t = new Test02();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		 int[] arr = new int[num];
		 for(int i = 0 ; i < num ; i++) {
			 arr[i] = scan.nextInt();
		 }
		 System.out.println(t.solution(arr));
	}

}
