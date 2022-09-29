package programmers_level1;
// 월간 코드 챌린지 시즌1_내적
public class Test07 {
	public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i = 0 ; i < a.length ; i++){
            answer += (a[i] * b[i]);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Test07 t = new Test07();
		
		int[] a = {1, 2, 3, 4};
		int[] b = {-3, -1, 0, 2};
		System.out.println(t.solution(a, b)); // 3
		
		int[] a2 = {-1, 0, 1};
		int[] b2 = {1, 0, -1};
		System.out.println(t.solution(a2, b2)); // -2
	}

}
