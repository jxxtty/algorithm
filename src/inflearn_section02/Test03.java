package inflearn_section02;

import java.util.Scanner;

public class Test03 {
	public void solution(int[] arrA, int[] arrB) {
		String[] result = new String[arrA.length];
		for(int i = 0 ; i < arrA.length ; i++) {
			if(arrA[i] == 1) {
				if(arrB[i] == 2) result[i] = "B";
				else if(arrB[i] == 3) result[i] = "A";
				else result[i] = "D";
			} else if(arrA[i] == 2) {
				if(arrB[i] == 1) result[i] = "A";
				else if(arrB[i] == 3) result[i] = "B";
				else result[i] = "D";
			} else {
				if(arrB[i] == 1) result[i] = "B";
				else if(arrB[i] == 2) result[i] = "A";
				else result[i] = "D";
			}
		}
		
		for(int i = 0 ; i < result.length ; i++) {
			System.out.println(result[i]);
		}
	}

	public static void main(String[] args) {
		Test03 t = new Test03();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		 int[] arrA = new int[num];
		 int[] arrB = new int[num];
		 for(int i = 0 ; i < num ; i++) {
			 arrA[i] = scan.nextInt();
		 }
		 for(int i = 0 ; i < num ; i++) {
			 arrB[i] = scan.nextInt();
		 }
		 t.solution(arrA, arrB);
	}

}
