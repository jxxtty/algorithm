package programmers_level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
// 2019 카카오 블라인드 채용_실패율
public class Kakao2 {
	 public int[] solution(int N, int[] stages) {
	        int[] answer = new int[N];
	        Map<Integer, Double> map = new HashMap<>();
	        for(int i = 1 ; i <= N ; i++){
	            int notSolve = 0; // 도달했으나 풀지 못한 사람 수
	            int solve = 0;  // 도달한 사람 수
	            for(int j = 0 ; j < stages.length ; j++){
	                if(i == stages[j]) notSolve++; // 현재 스테이지 도달했으나 풀지못한 사람
	                if(i <= stages[j]) solve++; // 현재 스테이지를 도달했고 푼 사람
	               
	            }
	            double fail = 0.0;
	            if(solve != 0 && notSolve != 0) fail = (double) notSolve / solve;
	            map.put(i, fail);
	        }
	        
//	        List<Map.Entry<String,Integer>> entryList = new LinkedList<>(map.entrySet());
//	        entryList.sort(new Comparator<Map.Entry<String,Integer>>(){
//	            @Override
//	            public int compare(Map.Entry<String,Integer> m1, Map.Entry<String,Integer> m2){
//	                if(m1.getValue() == m2.getValue()) return Integer.parseInt(m1.getKey()) - Integer.parseInt(m2.getKey());
//	                else return m2.getValue() - m1.getValue();
//	            }
//	        });
	        
	        List<Integer> keySetList = new ArrayList<>(map.keySet());
	        Collections.sort(keySetList, (o1, o2) -> (map.get(o2).compareTo(map.get(o1)))); // 내림차순 정렬
	        
	        int idx = 0;
	        for(Integer key : keySetList){
	            answer[idx] = key;
	            idx++;
	        }
	        return answer;
	    }
	 
	public static void main(String[] args) {
		Kakao2 k = new Kakao2();
		int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};
		int[] stages2 = {4, 4, 4, 4, 4};
		
		for(int i : k.solution(5, stages)) {
			System.out.print(i + " ");
		}
		System.out.println();
		for(int i : k.solution(4, stages2)) {
			System.out.print(i + " ");
		}
	}

}
