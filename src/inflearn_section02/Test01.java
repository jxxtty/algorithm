package inflearn_section02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test01 {
	public String solution(int[] arr) {
		String result = "";
		List<Integer> list = new ArrayList<>();
		int flag = arr[0];
		list.add(flag);
		
		for(int i = 1 ; i < arr.length ; i++) {
			if(flag < arr[i]) {
				list.add(arr[i]);
			}
			flag = arr[i];
		}
		
		for(int i : list) {
			result += (String.valueOf(i)+" ");
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		 int[] arr = new int[num];
		 for(int i = 0 ; i < num ; i++) {
			 arr[i] = scan.nextInt();
		 }
		 System.out.println(t.solution(arr));
	}

}
