package inflearn_section02;

import java.util.Scanner;

public class Test03_2 {
	public String solution(int n, int[] a, int[] b){
		String answer="";
		for(int i = 0 ; i < n ; i++){
			if(a[i] == b[i]) answer+="D";
			else if(a[i] == 1 && b[i] == 3) answer+="A";
			else if(a[i] == 2 && b[i] == 1) answer+="A";
			else if(a[i] == 3 && b[i] == 2) answer+="A";
			else answer+="B";
		}
		return answer;
	}

	public static void main(String[] args) {
		Test03_2 t = new Test03_2();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i = 0 ; i < n ; i++){
			a[i] = scan.nextInt();
		}
		for(int i = 0 ; i < n ; i++){
			b[i]=scan.nextInt();
		}
		for(char x : t.solution(n, a, b).toCharArray()) System.out.println(x);
	}

}
