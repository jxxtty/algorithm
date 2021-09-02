package inflearn_section08;

import java.util.Scanner;
// 중복순열
public class Test04 {
	static int num, count;
	static int[] buffer;
	public void printResult(int c) {
		if(c == count) {
			for(int i = 0 ; i < count ; i++) {
				System.out.print(buffer[i] + " ");
			}
			System.out.println();
			return;
		} else {
			for(int i = 1 ; i <= num ; i++) {
				buffer[c] = i;
				printResult(c+1);
			}
		}
		
	}
	
	public static void main(String[] args) {
		Test04 t = new Test04();
		Scanner scan = new Scanner(System.in);
		
		num = scan.nextInt();
		count = scan.nextInt();
		buffer = new int[count];
		t.printResult(0);
	}

}
