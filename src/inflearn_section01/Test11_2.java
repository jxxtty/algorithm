package inflearn_section01;

import java.util.Scanner;

public class Test11_2 {
	public String solution(String str){
		String answer="";
		str = str + " ";
		int cnt = 1;
		for(int i = 0 ; i < str.length()-1 ; i++){
			if(str.charAt(i) == str.charAt(i+1)) cnt++;
			else{
				answer += str.charAt(i);
				if(cnt > 1) answer += String.valueOf(cnt);
				cnt = 1;
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Test11_2 t = new Test11_2();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		System.out.println(t.solution(str));
	}

}
