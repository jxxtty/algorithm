package programmers_level2;
// 연습문제_완전탐색_소수찾기
import java.util.ArrayList;
import java.util.List;

public class Test11 {
	static List<Integer> answerList = new ArrayList<>();
    static boolean[] visited;
    
    public boolean isPrime(int num){
        if(num == 0 || num == 1) return false;
        
        for(int i = 2 ; i <= Math.sqrt(num) ; i++){
            if(num % i == 0) return false;
        }
        
        return true;
    }
    
    public void permutation(int index, String str, String[] nums, int depth){
        if(index == depth){
            int num = Integer.parseInt(str);
            if(isPrime(num) && !answerList.contains(num)) answerList.add(num);
            return;
        }
        
        for(int i = 0 ; i < nums.length ; i++){
            if(!visited[i]){
                visited[i] = true;
                str = str + nums[i];
                permutation(index+1, str, nums, depth);
                
                str = str.substring(0, str.length()-1);
                visited[i] = false;
            }
        }
    }
    
    public int solution(String numbers) {
        int answer = 0;
        String[] nums = numbers.split("");
        visited = new boolean[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            permutation(0, "", nums, i+1);
        }
        answer = answerList.size();
        answerList.clear();
        return answer;
    }

	public static void main(String[] args) {
		Test11 t = new Test11();
		
		String numbers = "17";
		System.out.println(t.solution(numbers)); // 3 (7, 17, 71)
		
		String numbers2 = "011";
		System.out.println(t.solution(numbers2)); // 2(11, 101)
	}

}
