package programmers_level1;

import java.util.Arrays;
// 위클리 챌린지_8주차 최소직사각형
public class Weekly8 {
	public int solution(int[][] sizes) {
        int answer = 0;
        for(int i = 0 ; i < sizes.length ; i++){
            int garo = sizes[i][0];
            int sero = sizes[i][1];
            if(garo < sero){ // 큰 값을 가로로, 작은 값을 세로로
                sizes[i][0] = sero;
                sizes[i][1] = garo;
            }
        }
        
        int garoMax = Integer.MIN_VALUE;
        int seroMax = Integer.MIN_VALUE;
        for(int i = 0 ; i < sizes.length ; i++){
            if(garoMax < sizes[i][0]) garoMax = sizes[i][0];
            if(seroMax < sizes[i][1]) seroMax = sizes[i][1];
        }
        
        answer = garoMax * seroMax;
        return answer;
    }
	
	public int solution2(int[][] sizes) {
        int answer = 0;
		int length = 0;
        int height = 0;
        
        for (int[] card : sizes) {
            length = Math.max(length, Math.max(card[0], card[1]));
            height = Math.max(height, Math.min(card[0], card[1]));
        }
        answer = length * height;
        return answer;
    }
	
	public int solution3(int[][] sizes) {
        return Arrays.stream(sizes)
        		.reduce((a, b) -> new int[]{Math.max(Math.max(a[0], a[1]), Math.max(b[0], b[1])), Math.max(Math.min(a[0], a[1]), Math.min(b[0], b[1]))
        })
        		.map(it -> it[0] * it[1]).get();
    }
	
	public static void main(String[] args) {
		Weekly8 w = new Weekly8();
		
		int[][] sizes = { {60,50}, {30,70}, {60,30}, {80,40} };
		System.out.println(w.solution(sizes)); // 4000
		System.out.println(w.solution2(sizes));
		System.out.println(w.solution3(sizes));
		
		int[][] sizes2 = { {10,7}, {12,3}, {8,15}, {14,7}, {5,15} };
		System.out.println(w.solution(sizes2)); // 120
		System.out.println(w.solution2(sizes2));
		System.out.println(w.solution3(sizes2));
		
		int[][] sizes3 = { {14,4}, {19,6}, {6,16}, {18,7}, {7,11} };
		System.out.println(w.solution(sizes3)); // 133
		System.out.println(w.solution2(sizes3));
		System.out.println(w.solution3(sizes3));
	}

}
