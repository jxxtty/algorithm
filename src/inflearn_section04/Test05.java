package inflearn_section04;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
// TreeSet
public class Test05 {
	public int solution(int cardNum, int num, int[] card) {
		int answer = -1;
		TreeSet<Integer> result = new TreeSet<>(Collections.reverseOrder()); // 내림차순
		for(int i = 0 ; i < cardNum ; i++) {
			for(int j = i+1 ; j < cardNum ; j++) {
				for(int k = j+1; k < cardNum ; k++) {
					result.add(card[i]+card[j]+card[k]);
				}
			}
		}
		
		int count = 0;
		for(int i : result) {
			count++;
			if(count == num) {
				answer = i;
				break;
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Test05 t = new Test05();
		Scanner scan = new Scanner(System.in);
		
		int cardNum = scan.nextInt();
		int num = scan.nextInt();
		int[] card = new int[cardNum];
		for(int i = 0 ; i < cardNum ; i++) {
			card[i] = scan.nextInt();
		}
		
		System.out.println(t.solution(cardNum, num, card));
	}

}
