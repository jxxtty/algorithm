package inflearn_section04;

import java.util.HashMap;
import java.util.Scanner;

public class Test01_2 {
	public void solution(int num, String str) {
		HashMap<Character,Integer> map = new HashMap<>();
		for(char c : str.toCharArray() ) {
			map.put(c, map.getOrDefault(c, 0)+1); // getOrDefault
		}
		
		int max = Integer.MIN_VALUE;
		char answer=' ';
		for(char key : map.keySet()) {
			if(map.get(key) > max) {
				max = map.get(key);
				answer = key;
			}
		}
		System.out.println(answer);
	}
	
	public static void main(String[] args) {
		Test01_2 t = new Test01_2();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String str = scan.next();
		t.solution(num, str);
	}

}
