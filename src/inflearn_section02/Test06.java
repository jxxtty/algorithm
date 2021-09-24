package inflearn_section02;

import java.util.Scanner;

public class Test06 {
	public void solution(String[] strArr) {
		int[] buf = new int[strArr.length];
		
		for(int i = 0 ; i < strArr.length ; i++) {
			StringBuffer sb = new StringBuffer(strArr[i]);
			String reverseStr = sb.reverse().toString();
			buf[i] = Integer.parseInt(reverseStr);
			for(int j = 2 ; j < buf[i]-1 ; j++) {
				if(buf[i]%j == 0 && buf[i] != 2) {
					buf[i] = 0;
					break;
				}
			}
		}
		
		for(int i : buf) {
			if(i != 0 && i != 1) {
				System.out.print(i + " ");
			}
		}
		
	}
	
	public static void main(String[] args) {
		Test06 t = new Test06();
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();
		String[] strArray = new String[num];
		for(int i = 0 ; i < num ; i++) {
			strArray[i] = scan.next();
		}
		t.solution(strArray);
	}

}
