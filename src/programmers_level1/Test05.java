package programmers_level1;
// ����/�����ڵ�(~2018)_�Ҽ� �����
public class Test05 {
	public boolean isPrime(int num) {
        if(num == 1) return false;
        
        for(int i = 2 ; i < num ; i++){
            if(num % i == 0) return false;
        }
        
        return true;
    }
    
    public int solution(int[] nums) {
        int answer = 0;
        
        for(int i = 0 ; i < nums.length - 2 ; i++){
            for(int j = i+1 ; j < nums.length -1 ; j++){
                for(int k = j+1 ; k < nums.length ; k++){
                    if(isPrime(nums[i]+nums[j]+nums[k])) answer++;
                }
            }
        }
        
        return answer;
    }
	    
	public static void main(String[] args) {
		Test05 t = new Test05();
		int[] nums = {1, 2, 3, 4};
		System.out.println(t.solution(nums)); // 1
		
		int[] nums2 = {1, 2, 7, 6, 4};
		System.out.println(t.solution(nums2)); // 4
	}

}
