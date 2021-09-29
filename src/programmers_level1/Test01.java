package programmers_level1;

import java.util.Scanner;
import java.util.TreeSet;

// 월간 코드 챌린지 시즌1_두 개 뽑아서 더하기
public class Test01 {
	public int[] solution(int[] numbers) {
        int[] answer = {};
        TreeSet<Integer> treeSet = new TreeSet<>();
        
        for(int i = 0 ; i < numbers.length ; i++){
            for(int j = 0 ; j < numbers.length ; j++){
                if(i != j)
                    treeSet.add(numbers[i] + numbers[j]);
            }
        }
        answer = new int[treeSet.size()];
        int i = 0;
        for(int num : treeSet){
            answer[i] = num;
            i++;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[] numbers = new int[size];
		for(int i = 0 ; i < size ; i++) {
			numbers[i] = scan.nextInt();
		}
		
		for(int i : t.solution(numbers)) {
			System.out.print(i + " ");
		}
	}

}
