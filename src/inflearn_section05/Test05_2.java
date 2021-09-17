package inflearn_section05;

import java.util.Scanner;
import java.util.Stack;

public class Test05_2 {
	public int solution(String str){
		int cnt=0;
		Stack<Character> stack=new Stack<>();
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i)=='(') stack.push('(');
			else{
				stack.pop();
				if(str.charAt(i-1)=='(') cnt+=stack.size();
				else cnt++;
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		Test05_2 t = new Test05_2();
		Scanner scan = new Scanner(System.in);
		
		String str=scan.next();
		System.out.println(t.solution(str));
	}
}
