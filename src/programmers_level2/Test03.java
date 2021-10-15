package programmers_level2;
// 연습문제_숫자의 표현
public class Test03 {
	public int solution(int n) {
        int answer = 0;
        int lt = 1;
        int rt = 1;
        int sum = 1;
        while(rt <= n && lt <= n){
            if(sum == n){
                answer++;
                rt++;
                sum += rt;
            } else if(sum < n) {
                rt++;
                sum += rt;
            } else {
                sum -= lt;
                lt++;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Test03 t = new Test03();
		
		int n = 15;
		System.out.println(t.solution(n)); // 4
	}

}
