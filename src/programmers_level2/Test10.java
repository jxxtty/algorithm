package programmers_level2;
// 연습문제_땅따먹기
import java.util.Arrays;

public class Test10 {
	// n행4열로 열이 고정되어있어 가능한 풀이
	int solution(int[][] land) {
        int answer = 0;
        for(int i = 1 ; i < land.length ; i++){
            land[i][0] += Math.max(Math.max(land[i-1][1], land[i-1][2]), land[i-1][3]);
            land[i][1] += Math.max(Math.max(land[i-1][0], land[i-1][2]), land[i-1][3]);
            land[i][2] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][3]);
            land[i][3] += Math.max(Math.max(land[i-1][0], land[i-1][1]), land[i-1][2]);
        }
        
        answer = Arrays.stream(land[land.length-1]).max().getAsInt();
        return answer;
    }

	public static void main(String[] args) {
		Test10 t = new Test10();
		
		int[][] land = {
				{1, 2, 3, 5},
				{5, 6, 7, 8},
				{4, 3, 2, 1}
		};
		System.out.println(t.solution(land)); // 16 (5 + 7 + 4)
		
		int[][] land2 = {
				{1, 2, 3, 5},
				{5, 6, 7, 100},
				{4, 3, 2, 1}
		};
		System.out.println(t.solution(land2)); // 107 (3 + 100 + 4)
	}

}
