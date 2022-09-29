package programmers_level2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// 연습_정렬_가장 큰 수 -> 시간초과뜸 다시풀기
public class Test14 { 
    static boolean[] isVisited;
    static int[] buffer;
    static List<String> result;
    static int size;
    
    public void permutation(int num, int[] numbers){
        if(num == size){
        	String str = "";
        	for(int i : buffer) {
        		str += i;
        	}
            result.add(str);
            return;
        }
        
        for(int i = 0 ; i < size ; i++){
            if(isVisited[i]) continue;
            
            isVisited[i] = true;
            buffer[num] = numbers[i];
            permutation(num+1, numbers);
            isVisited[i] = false;
        }
    }
    
    public String solution(int[] numbers) {
        String answer = "";
        size = numbers.length;
        isVisited = new boolean[numbers.length];
        buffer = new int[numbers.length];
        result = new ArrayList<>();
        
        permutation(0, numbers);
        Collections.sort(result, Comparator.reverseOrder());
        answer = result.get(0);
        return answer;
    }
	public static void main(String[] args) {
		Test14 t = new Test14();
		
		int[] numbers = {6, 10, 2};
		System.out.println(t.solution(numbers)); // 6210
		
		int[] numbers2 = {3, 30, 34, 5, 9};
		System.out.println(t.solution(numbers2)); // 9534330
	}

}
