package inflearn_section02;

import java.util.Scanner;
// 격자판 최대합_이차원 배열
public class Test09 {
	public void solution(int[][] numArr) {
		int max = 0;
		int sumCross1 = 0;
		int sumCross2 = 0;
		int sumRow = 0;
		int sumCol = 0;
		int len = numArr.length - 1;
		
		for(int i = 0 ; i < numArr.length ; i++) {
			sumCross1 += numArr[i][i];
			sumCross2 += numArr[i][len-i];
		}
		max = sumCross1;
		max = (max > sumCross2)?max:sumCross2;
		
		for(int i = 0 ; i < numArr.length ; i++) {
			sumRow = 0;
			sumCol = 0;
			for(int j = 0 ; j < numArr.length ; j++) {
				sumRow += numArr[i][j];
				sumCol += numArr[j][i];
			}
			max = (max > sumRow)?max:sumRow;
			max = (max > sumCol)?max:sumCol;
		}
		System.out.println(max);
	}
	
	public static void main(String[] args) {
		Test09 t = new Test09();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		int[][] numArr = new int[num][num];
		for(int i = 0 ; i < num ; i++) {
			for(int j = 0 ; j < num ; j++) {
				numArr[i][j] = scan.nextInt();
			}
		}
		t.solution(numArr);
	}

}
