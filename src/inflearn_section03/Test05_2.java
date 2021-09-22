package inflearn_section03;

import java.util.Scanner;

public class Test05_2 {
	public int solution(int n){
		int answer = 0, sum = 0;
		int m = n/2+1;
		int[] arr = new int[m];
		for(int i=0; i<m; i++) arr[i] = i+1;
		int lt=0;
		for(int rt = 0 ; rt < m ; rt++){
			sum += arr[rt];
			if(sum == n) answer++;
			while(sum >= n){
				sum -= arr[lt++];
				if(sum == n) answer++; 
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Test05_2 t = new Test05_2();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		System.out.print(t.solution(n));
	}

}
