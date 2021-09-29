package inflearn_section01;

import java.util.Scanner;

public class Test10 {
	public void solution(String str, String s) {
		String[] buf = str.split("");
		int[] dis = new int[str.length()];
		int flag = 101;
		
		for(int i = buf.length - 1 ; i >= 0 ; i--) {
			if(buf[i].equals(s)) {
				flag = 0;
				dis[i] = flag;
			} else {
				flag++;
				dis[i] = flag;
			}
		}

		flag = 101;
		for(int i = 0 ; i < buf.length ; i++){
			if(buf[i].equals(s)) {
				flag = 0;
				dis[i] = flag;
				System.out.print(dis[i]+" ");
			} else {
				flag++;
				if(dis[i] > flag) {
					dis[i] = flag;
				}
				System.out.print(dis[i]+" ");
			}
		}
		
	}

	public static void main(String[] args) {
		Test10 t = new Test10();
		Scanner scan = new Scanner(System.in);
		
		String str = scan.next();
		String s = scan.next();
		t.solution(str, s);	
	}

}
