package inflearn_section01;

import java.util.Scanner;

public class Test06_2 {
	public String solution(String str){
		String answer = "";
		for(int i = 0 ; i < str.length() ; i++){
			if(str.indexOf(str.charAt(i)) == i) answer += str.charAt(i);
		}
		return answer;
	}

	public static void main(String[] args) {
		Test06_2 t = new Test06_2();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.print(t.solution(str));
	}

}
