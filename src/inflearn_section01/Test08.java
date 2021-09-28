package inflearn_section01;

import java.util.Scanner;

public class Test08 {
	public String solution(String s){
		String answer = "NO";
		s = s.toUpperCase().replaceAll("[^A-Z]", "");
		String tmp = new StringBuilder(s).reverse().toString();
		if(s.equals(tmp)) answer = "YES";
		return answer;
	}

	public static void main(String[] args) {
		Test08 t = new Test08();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.println(t.solution(str));
	}

}
