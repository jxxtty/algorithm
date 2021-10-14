package programmers_level2;

import java.util.Stack;

// 2017 팁스타운_짝지어 제거하기
// 효율성테스트 2번만 통과못함...아직미해결
public class Test02 {
	public int solution(String s) {
        int answer = -1;
        if(s.length() % 2 != 0) return 0;
        
        Stack<String> stack = new Stack<>();
        String[] sArr = s.split("");
        stack.push(sArr[0]);
        
        for(int i = 1 ; i < sArr.length ; i++){
            String inStack = stack.peek();
            String now = sArr[i];
           
            if(inStack.equals(now)){
                stack.pop();
            } else {
                stack.push(now);
            }
            
            if(stack.isEmpty() && i+1 != sArr.length){
                stack.push(sArr[i+1]);
                i += 1;
            }
        }
        
        if(stack.isEmpty()) answer = 1;
        else answer = 0;
        
        return answer;
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
