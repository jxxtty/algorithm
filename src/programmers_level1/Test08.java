package programmers_level1;
//2021 Dev-Matching:웹 백엔드 개발_로또의 최고 순위와 최저 순위
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.LongStream;

public class Test08 {
	
	public int getRank(int num){ // 맞힌 개수를 넣으면 몇등인지 반환
        if(num == 6) return 1;
        else if (num == 5) return 2;
        else if (num == 4) return 3;
        else if (num == 3) return 4;
        else if (num == 2) return 5;
        else return 6;
    }
    
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int zero = 0;
        List<Integer> list = new ArrayList<>();
        for(int i : lottos){
            list.add(i);
            if(i == 0) zero++;
        }
        
        if(zero == 6){ // 모두 0이라면 결과가 정해져있음
            answer[0] = 1;
            answer[1] = 6;
            return answer;
        }
        
        int correct = 0;
        for(int i : win_nums){
            if(list.indexOf(i) > -1) correct++;
        }
        
        answer[0] = getRank(correct+zero);
        answer[1] = getRank(correct);
        return answer;
    }
    
    public int[] solution2(int[] lottos, int[] winNums) {
        return LongStream.of(
                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l) || l == 0).count(),
                (lottos.length + 1) - Arrays.stream(lottos).filter(l -> Arrays.stream(winNums).anyMatch(w -> w == l)).count()
        )
                .mapToInt(op -> (int) (op > 6 ? op - 1 : op))
                .toArray();
    }
	
	public static void main(String[] args) {
		Test08 t = new Test08();
		
		int[] lottos = {44, 1, 0, 0, 31, 25};
		int[] win_nums = {31, 10, 45, 1, 6, 19};
		for(int i : t.solution(lottos, win_nums)) {
			System.out.print(i + " ");
		} // 3 5
		System.out.println();
		
		int[] lottos2 = {0, 0, 0, 0, 0, 0};
		int[] win_nums2 = {38, 19, 20, 40, 15, 25};
		for(int i : t.solution(lottos2, win_nums2)) {
			System.out.print(i + " ");
		} // 1 6
		System.out.println();
		
		int[] lottos3 = {45, 4, 35, 20, 3, 9};
		int[] win_nums3 = {20, 9, 3, 45, 4, 35};
		for(int i : t.solution(lottos3, win_nums3)) {
			System.out.print(i + " ");
		} // 1 1 
		System.out.println();
		
		
	}

}
