package inflearn_section01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test04_2 {
	public List<String> solution(int n, String[] str){
		List<String> answer = new ArrayList<>(); 
		for(String x : str){
			String tmp = new StringBuilder(x).reverse().toString();
			answer.add(tmp);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Test04_2 t = new Test04_2();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		String[] str=new String[n];
		for(int i = 0 ; i < n ; i++){
			str[i] = scan.next();
		}
		
		for(String s : t.solution(n, str)){
			System.out.println(s);
		}
	}

}
