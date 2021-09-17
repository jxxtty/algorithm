package inflearn_section05;

import java.util.Scanner;
import java.util.Stack;

// 후위식 연산
public class Test04 {
	public int solution(String str) {
		char[] strArr = str.toCharArray();
		Stack<Integer> stack = new Stack<>();
		
		for(char c : strArr) {
			if(Character.isDigit(c)) {
				stack.push(c-'0');
			} else {
				int rt = stack.pop();
				int lt = stack.pop();
				int buf = calculation(lt, rt, c);
				stack.push(buf);
			}
		}
		
		
		return stack.pop();
	}
	
	public int calculation(int x, int y, char cal) {
		if(cal == '+') return x+y;
		if(cal == '-') return x-y;
		if(cal == '*') return x*y;
		if(cal == '/') return x/y;
		return 0;
	}
	
	public static void main(String[] args) {
		Test04 t = new Test04();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		System.out.println(t.solution(str));
	}

}
