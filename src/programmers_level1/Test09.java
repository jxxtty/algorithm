package programmers_level1;

// 월간 코드 챌린지 시즌2_약수의 개수와 덧셈
// left ~ right까지 약수의 개수를 구하는데, 약수의 개수가 짝수라면 해당 숫자를 더하고 홀수라면 뺀다
public class Test09 {
	public int getDivisor(int num){
        int cnt = 1; // 절반까지만 약수의 개수를 구하므로, 본인은 무조건 포함되게 1로 설정
        for(int i = 1 ; i <= num/2 ; i++){
            if(num % i == 0) cnt++;
        }
        return cnt;
    }
	
    public int solution(int left, int right) {
        int answer = 0;
        for(int i = left ; i <= right ; i++){
            int result = getDivisor(i);
            if(result % 2 == 0) answer += i;
            else answer -= i;
        }
        return answer;
    }
    
	public static void main(String[] args) {
		Test09 t = new Test09();
		
		System.out.println(t.solution(13, 17)); // 43
		System.out.println(t.solution(24, 27)); // 52
	}

}
