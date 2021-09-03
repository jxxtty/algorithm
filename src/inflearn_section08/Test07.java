package inflearn_section08;

import java.util.Scanner;

public class Test07 {

	public int combination(int n, int r) {
		if(n == r) return 1;
		if(r == 1) return n;
		else {
			return combination(n-1, r-1) + combination(n-1,r);
		}
	}
	public static void main(String[] args) {
		Test07 t = new Test07();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int r = scan.nextInt();
		
		System.out.println(t.combination(n, r));
		
	}

}
