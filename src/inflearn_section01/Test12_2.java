package inflearn_section01;

import java.util.Scanner;

public class Test12_2 {
	public String solution(int n, String s){
		String answer = "";
		for(int i = 0 ; i < n ; i++){
			String tmp = s.substring(0, 7).replace('#', '1').replace('*', '0');
			int num = Integer.parseInt(tmp, 2);
			answer += (char)num;
			s = s.substring(7);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Test12_2 t = new Test12_2();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String code = scan.nextLine();
		System.out.println(t.solution(num, code));
	}

}
