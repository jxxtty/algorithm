package inflearn_section05;

import java.util.Scanner;
import java.util.Stack;

public class Test02 {
	public String solution(String str) {
		StringBuilder sb = new StringBuilder();
		char[] strArr = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		for(char c : strArr) {
			if(c != ')') stack.push(c);
			else {
				while(stack.peek() != '(') {
					stack.pop();
				}
				stack.pop(); // 현재 peek()하면 (가 들어있기때문에 한번 더 pop해준다.
			}
		}
		while(!stack.empty()) {
			sb.append(stack.pop());
		}
		
		return sb.reverse().toString();
	}
	public static void main(String[] args) {
		Test02 t = new Test02();
		Scanner scan = new Scanner(System.in); 
		
		String str = scan.nextLine();
		  
		System.out.println(t.solution(str));
	}

}
