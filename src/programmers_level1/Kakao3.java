package programmers_level1;

import java.util.Arrays;
// 2018 īī�� ����ε� ä��_[1��]��Ʈ
public class Kakao3 {
	public int solution(String dartResult) {
        int answer = 0;
        char[] dart = dartResult.toCharArray();
        int[] sum = new int[3]; // ������ ��ȸ�� ����
        int num = 0;
        int idx = 0; // sum�� index��
        
        for(int i = 0 ; i < dart.length ; i++){
            if(Character.isDigit(dart[i])){
                num = dart[i] - '0'; // 0~9��
                if(dart[i] == '0' && i != 0){
                    if(Character.isDigit(dart[i-1]))  num = 10; // 10��
                }
            }
            else if(Character.isAlphabetic(dart[i])){
                if(dart[i] == 'D'){ // ����
                    num = num * num;
                } else if(dart[i] == 'T'){ // Ʈ����
                    num = num * num * num;
                }
                sum[idx] = num;
                idx++;
            } else {
                if(dart[i] == '*'){ // ��Ÿ��
                    sum[idx-1] = sum[idx-1] * 2;
                    if(idx != 1) sum[idx-2] = sum[idx-2] * 2; // ��Ÿ���� ó���� �°� �ƴѰ�츸
                } else { // ������
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
