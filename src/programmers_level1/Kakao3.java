package programmers_level1;

import java.util.Arrays;
// 2018 카카오 블라인드 채용_[1차]다트
public class Kakao3 {
	public int solution(String dartResult) {
        int answer = 0;
        char[] dart = dartResult.toCharArray();
        int[] sum = new int[3]; // 던지는 기회는 세번
        int num = 0;
        int idx = 0; // sum의 index값
        
        for(int i = 0 ; i < dart.length ; i++){
            if(Character.isDigit(dart[i])){
                num = dart[i] - '0'; // 0~9점
                if(dart[i] == '0' && i != 0){
                    if(Character.isDigit(dart[i-1]))  num = 10; // 10점
                }
            }
            else if(Character.isAlphabetic(dart[i])){
                if(dart[i] == 'D'){ // 더블
                    num = num * num;
                } else if(dart[i] == 'T'){ // 트리플
                    num = num * num * num;
                }
                sum[idx] = num;
                idx++;
            } else {
                if(dart[i] == '*'){ // 스타상
                    sum[idx-1] = sum[idx-1] * 2;
                    if(idx != 1) sum[idx-2] = sum[idx-2] * 2; // 스타상이 처음에 온게 아닌경우만
                } else { // 아차상
                    sum[idx-1] = sum[idx-1] * (-1);
                }
            }
        }
        
        answer = Arrays.stream(sum).sum();
        
        return answer;
    }
	
	public static void main(String[] args) {
		Kakao3 k = new Kakao3();
		
		String dartResult = "1S2D*3T";
		System.out.println(k.solution(dartResult)); // 37
		
		String dartResult2 = "1D2S#10S";
		System.out.println(k.solution(dartResult2)); // 9
		
		String dartResult3 = "1D2S0T";
		System.out.println(k.solution(dartResult3)); // 3
		
		String dartResult4 = "1S*2T*3S";
		System.out.println(k.solution(dartResult4)); // 23
		
		String dartResult5 = "1D#2S*3S";
		System.out.println(k.solution(dartResult5)); // 5
		
		String dartResult6 = "1T2D3D#";
		System.out.println(k.solution(dartResult6)); // -4
		
		String dartResult7 = "1D2S3T*";
		System.out.println(k.solution(dartResult7)); // 59
	}

}
