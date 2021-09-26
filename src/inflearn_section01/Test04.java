package inflearn_section01;

import java.util.Scanner;

public class Test04 {
	public String[] solution(String[] buffer) {
		String[] buf = new String[buffer.length];
		buf = buffer;
		for(int i = 0 ; i < buf.length ; i++) {
			String[] t = buf[i].split("");
			String str = "";
			for(int j = t.length-1 ; j >= 0 ; j--) {
				str += t[j];
			}
			buf[i] = str;
		}
		
		return buf;
		
	}

	public static void main(String[] args) {
		Test04 t = new Test04();
		Scanner scan = new Scanner(System.in);
		
		int buf = scan.nextInt();
		 String[] buffer = new String[buf];
		 for(int i = 0 ; i < buf ; i++) {
			 buffer[i] = scan.next();
		 }
		 
		 buffer = t.solution(buffer);
		 
		 for(String s : buffer) {
			 System.out.println(s);
		 }
	}

}
