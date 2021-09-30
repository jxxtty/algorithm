package inflearn_section01;

import java.util.Scanner;

public class Test12 {
	public String solution(int num, String code) {
		String answer = "";
		code = code.replaceAll("#", "1");
		code = code.replaceAll("[*]", "0"); // 정규식때문에 *은 문자로 인식하려면 []로 감싸준다.
		for(int i = 0 ; i < num ; i++) {
			String sub = code.substring(7 * i, 7 * (i+1));
			int changeNum = Integer.parseInt(sub,2);
			char result = (char)changeNum;
			answer += result;
		}
		return answer;
	}

	public static void main(String[] args) {
		Test12 t = new Test12();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String code = scan.nextLine();
		System.out.println(t.solution(num, code));
	}

}
