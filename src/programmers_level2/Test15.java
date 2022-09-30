package programmers_level2;

import java.util.Arrays;


public class Test15 {
	public int solution(int[] people, int limit) {
        int answer = 0;
        
        Arrays.sort(people);
        int min = 0;
        for(int max = people.length-1; min <= max ; max-- ){
            if(people[min] + people[max] <= limit) min++;
            answer++;
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		Test15 t = new Test15();
		
		int[] people = {70, 50, 80, 50};
		int limit = 100;
		System.out.println(t.solution(people, limit)); // 3
		
		int[] people2 = {70, 80, 50};
		int limit2 = 100;
		System.out.println(t.solution(people2, limit2)); // 3
	}

}
