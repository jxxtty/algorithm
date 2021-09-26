package inflearn_section01;

import java.util.Scanner;

public class Test03 {
	public String solution(String str) {
		String[] buf = str.split(" ");
		int index = 0;
		int maxLength = buf[0].length();
		for(int i = 1 ; i < buf.length ; i++) {
			if( maxLength < buf[i].length() ) {
				maxLength = buf[i].length();
				index = i;
			}
		}
		return buf[index];
	}

	public static void main(String[] args) {
		Test03 t = new Test03();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		System.out.println(t.solution(str));
	}

}
