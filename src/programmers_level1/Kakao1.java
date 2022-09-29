package programmers_level1;

import java.util.Scanner;

// 2021 카카오 채용연계형 인턴십_숫자 문자열과 영단어
public class Kakao1 {
	public int solution(String s) {
        int answer = 0;
        String[] alpha = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        String[] number = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
        
        for(int i = 0 ; i < alpha.length ; i++){
            s = s.replaceAll(alpha[i], number[i]);
        }
        
        answer = Integer.parseInt(s);
        
        return answer;
    }

	public static void main(String[] args) {
		Kakao1 k = new Kakao1();
		Scanner scan = new Scanner(System.in);
		
		String s = scan.next();
		System.out.println(k.solution(s));
	}

}
