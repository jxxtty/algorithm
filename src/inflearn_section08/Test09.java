package inflearn_section08;

import java.util.Scanner;

public class Test09 {
	static int n, m;
	static int[] ch;
	public void printResult(int start, int num) {
		if(num == m) {
			for(int i = 1 ; i <= n ; i++) {
				if(ch[i] == 1) System.out.print(i + " ");
			}
			System.out.println();
			return;
		} else {
			for(int i = start ; i <= n ; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					printResult(i+1, num+1);
					ch[i] = 0;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test09 t = new Test09();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		m = scan.nextInt();
		ch = new int[n+1];
		t.printResult(1, 0);
	}

}
