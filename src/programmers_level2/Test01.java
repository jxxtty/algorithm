package programmers_level2;
// ±íÀÌ/³Êºñ ¿ì¼± Å½»ö(DFS/BFS)_Å¸°Ù ³Ñ¹ö
public class Test01 {
	static int answer = 0;
    public void makeTarget(int[] numbers, int target, int sum, int idx){
        if(idx == numbers.length){
            if(sum == target) answer++;  
        } else {
            makeTarget(numbers, target, sum+numbers[idx], idx+1);
            makeTarget(numbers, target, sum-numbers[idx], idx+1);
        }
    }
    
    public int solution(int[] numbers, int target) {
        makeTarget(numbers, target, 0, 0);
        return answer;
    }
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		
		int[] numbers = {1, 1, 1, 1, 1};
		int target = 3;
		System.out.println(t.solution(numbers, target)); // 5
	}

}
