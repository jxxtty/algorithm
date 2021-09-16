package inflearn_section05;

import java.util.Scanner;
import java.util.Stack;

// 올바른 괄호 찾기
public class Test01 {
	public String solution(String str){
		String answer="YES";
		Stack<Character> stack=new Stack<>();
		for(char x : str.toCharArray()){
			if(x=='(') stack.push(x);
			else{
				if(stack.isEmpty()) return "NO";
				stack.pop();
			}
		}
		if(!stack.isEmpty()) return "NO";
		return answer;
	}

	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner kb = new Scanner(System.in);
		String str=kb.next();
		System.out.println(t.solution(str));
	}

}
