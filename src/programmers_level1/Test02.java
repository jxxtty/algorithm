package programmers_level1;

import java.util.Scanner;

// 월간 코드 챌린지 시즌1_3진법 뒤집기
public class Test02 {
	public int solution(int n) {
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        while(n != 0){
            sb.append(n%3);
            n = n/3;
        }
        
        String buffer = sb.toString();
        int multi = 3;
        
        for(int i = buffer.length()-1 ; i >= 0 ; i--){
            int now = buffer.charAt(i) -'0';
            
            if(i == buffer.length()-1){
                answer += now;
            } else {
                answer += (now * multi);
                multi *= 3;
            }
            
        }
        
        return answer;
    }

	public static void main(String[] args) {
		Test02 t = new Test02();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		System.out.println(t.solution(n));
	}

}
