package inflearn_section04;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Test01 {
	public String solution(int num, String str) {
		String answer = "";
		String[] results = str.split("");
		HashMap<String,Integer> result = new HashMap<>();
		for(String s : results) {
			if(result.get(s) == null) {
				result.put(s, 1);
			} else {
				result.put(s, result.get(s)+1);
			}
		}
		int max = Integer.MIN_VALUE;
		Set<String> keys = result.keySet();
		for(String s : keys) {
			if(max < result.get(s)) {
				max = result.get(s);
				answer = s;
			}
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Test01 t = new Test01();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String str = scan.next();
		
		System.out.println(t.solution(num, str));
	}

}
