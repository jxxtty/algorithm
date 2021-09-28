package inflearn_section01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test09 {
	public int solution(String str) {
		int result = 0;
		String ans = "";
		char[] buf = str.toCharArray();
		List<Character> list = new ArrayList<>();
		for(int i = 0; i < buf.length ; i++) {
			if(buf[i] >= 48 && buf[i] <= 57) {
				list.add(buf[i]);
			}
		}
		
		for(int i = 0 ; i < list.size(); i++) {
			ans += list.get(i);
		}
		
		result = Integer.parseInt(ans);
		return result;
	}

	public static void main(String[] args) {
		Test09 t = new Test09();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		System.out.println(t.solution(str));
	}

}
