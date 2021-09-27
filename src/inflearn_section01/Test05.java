package inflearn_section01;

import java.util.Scanner;

public class Test05 {
	public String solution(String str) {
		String result = "";
		char[] buf = str.toCharArray();
		char[] ans = new char[buf.length];
		int index = buf.length-1;
		
		for(int i = 0 ; i < buf.length ; i++) {
			char c = buf[i];
			if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)) { // A:65 ~ Z:90, a:97 ~ z:122
				ans[index-i] = buf[i];
			} else {
				ans[i] = buf[i];
			}
		}
		
		for(char c : ans) { result += c; }
		
		return result;
	}

	public static void main(String[] args) {
		Test05 t = new Test05();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.println(t.solution(str));	
	}

}
