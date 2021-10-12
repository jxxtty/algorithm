package programmers_level1;
// 찾아라 프로그래밍 마에스터_폰켓몬
import java.util.HashMap;
import java.util.Map;

public class Test10 {
	public int solution(int[] nums) {
        int answer = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        
        int num = nums.length / 2;
        int size = map.size();
        answer = (size > num)? num : size;
        return answer;
    }
	
	public static void main(String[] args) {
		Test10 t = new Test10();
		
		int[] nums = {3, 1, 2, 3};
		System.out.println(t.solution(nums)); // 2
		
		int[] nums2 = {3, 3, 3, 2, 2, 4};
		System.out.println(t.solution(nums2)); // 3
		
		int[] nums3 = {3, 3, 3, 2, 2, 2};
		System.out.println(t.solution(nums3)); // 2
	}

}
