package programmers_level2;
// 스택/큐 _ 기능개발
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Test05 {
	public int[] solution(int[] progresses, int[] speeds) {
        int[] answer = {};
        Queue<Integer> queue = new LinkedList<>();
        
        for(int i = 0 ; i < progresses.length ; i++){
            int rest = 100 - progresses[i];
            int day = (rest / speeds[i]);
            if(rest % speeds[i] != 0) day++;
            queue.offer(day);
        }
        
        int base = queue.poll();
        int progress = 1;
        List<Integer> answerList = new ArrayList<>();
        while(!queue.isEmpty()){
            int tmp = queue.poll();
           
            if(base >= tmp) progress++;
            else {
                answerList.add(progress);
                base = tmp;
                progress = 1;
            }
            
            if(queue.size() == 0) answerList.add(progress);
        }
        
        answer = new int[answerList.size()];
        int idx = 0;
        for(int i : answerList){
            answer[idx] = i;
            idx++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Test05 t = new Test05();
		
		int[] progresses = {93, 30, 55};
		int[] speeds = {1, 30, 5};
		for(int i : t.solution(progresses, speeds)) {
			System.out.print(i + " ");
		} // 2 1
		System.out.println();
		
		int[] progresses2 = {95, 90, 99, 99, 80, 99};
		int[] speeds2 = {1, 1, 1, 1, 1, 1};
		for(int i : t.solution(progresses2, speeds2)) {
			System.out.print(i + " ");
		} // 1 3 2
		System.out.println();
		
		int[] progresses3 = {99, 99, 99};
		int[] speeds3 = {1, 1, 1};
		for(int i : t.solution(progresses3, speeds3)) {
			System.out.print(i + " ");
		} // 3
		System.out.println();
		
		int[] progresses4 = {20, 90, 30, 65, 40};
		int[] speeds4 = {20, 5, 30, 9, 10};
		for(int i : t.solution(progresses4, speeds4)) {
			System.out.print(i + " ");
		} // 4 1
		System.out.println();
	}

}
