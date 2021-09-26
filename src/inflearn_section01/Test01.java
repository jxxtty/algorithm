package inflearn_section01;

import java.util.Scanner;

public class Test01 {
	public int solution(String str, String c) {
		String buf = str.toUpperCase();
		String[] bufArr = buf.split("");
		int result = 0;
		for(int i = 0 ; i < bufArr.length ; i++) {
			if(c.equals(bufArr[i])) result++;
		}
		return result;
	}

	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		String c = scan.next().toUpperCase();
		System.out.println(t.solution(str, c));
	}

}
