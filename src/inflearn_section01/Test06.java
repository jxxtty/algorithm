package inflearn_section01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test06 {
	public String solution(String str) {
		String result = "";
		List<String> list = new ArrayList<>();
		String[] buf = str.split("");
		
		list.add(buf[0]);
		for(int i = 1 ; i < buf.length ; i++) {
			int chk = 0;
			
			// list에 들어있는 값과 배열의 값이 동일하면 chk++를 한다.
			for(String s : list) {
				if(s.equals(buf[i])) {
					chk++;
				}
			}
			
			// chk값이 0이라면 동일한값이 없다는 것이기때문에 list에 buf[i]값을 추가해준다.
			if(chk == 0) {
				list.add(buf[i]);
			}
		}

		// list에 넣은 값들로 하나의 string으로 만들어준다.
		for(String s : list) {
			result += s;
		}
		return result;
	}

	public static void main(String[] args) {
		Test06 t = new Test06();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.println(t.solution(str));	
	}

}
