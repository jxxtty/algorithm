package programmers_level1;
// 월간 코드 챌린지 시즌3_없는 숫자 더하기
public class Test06 {
	public int solution(int[] numbers) {
        int answer = 0;
        int[] check = new int[10];
        
        for(int num : numbers){
            check[num] = 1;
        }
        
        for(int i = 0 ; i < 10 ; i++){
            if(check[i] == 0) answer += i;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Test06 t = new Test06();
		int[] numbers = {1, 2, 3, 4, 6, 7, 8, 0};
		System.out.println(t.solution(numbers)); // 14
		int[] numbers2 = {5, 8, 4, 0, 6, 7, 9};
		System.out.println(t.solution(numbers2)); // 6
	}

}
