package inflearn_section01;

import java.util.Scanner;

public class Test07 {
	public String solution(String str) {
		String result = "YES";
		str = str.toUpperCase(); // ���� �빮�ڷ� �����ؼ� ���ϼ��� �ش�.
		String[] buf = str.split("");
		int index = str.length() / 2;
		int x = str.length() - 1;
		int flag = 1; // ȸ�����ڿ��� �ƴ� ��� flag���� 0���� �����Ѵ�.
		
		for(int i = 0 ; i < index ; i++) {
			if(buf[i].equals(buf[x-i])) {
				continue;
			} else {
				flag = 0;
				break;
			}
		}
		
		if(flag == 0) {
			result = "NO";
		}
		
		return result;
	}
	public static void main(String[] args) {
		Test07 t = new Test07();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		System.out.println(t.solution(str));
	}

}
