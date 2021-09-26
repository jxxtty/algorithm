package inflearn_section01;

import java.util.Scanner;

public class Test02 {
	public String solution(String str) {
		String result = "";
		char[] buf = str.toCharArray();
		
		for(int i = 0; i < buf.length ; i++) {
			if(Character.isUpperCase(buf[i])) {
				buf[i] = Character.toLowerCase(buf[i]);
			} else {
				buf[i] = Character.toUpperCase(buf[i]);
			}
		}
		result= String.valueOf(buf); 
		return result;
	}

	public static void main(String[] args) {
		Test02 t = new Test02();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.println(t.solution(str));
	}

}
