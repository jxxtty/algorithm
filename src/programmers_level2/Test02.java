package programmers_level2;

import java.util.Stack;

// 2017 팁스타운_짝지어 제거하기

public class Test02 {
	public int solution(String s) {
        if(s.length() % 2 != 0) return 0;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0 ; i < s.length() ; i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }

            if(s.charAt(i) == stack.peek()){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
            
        }
        
        return stack.isEmpty() ? 1 : 0;
    }
	
	public static void main(String[] args) {
		Test02 t = new Test02();
		
		String s = "baabaa";
		System.out.println(t.solution(s)); // 1
		
		String s2 = "cdcd";
		System.out.println(t.solution(s2)); // 0
		
		String s3 = "cdc";
		System.out.println(t.solution(s3)); // 0
	}

}
