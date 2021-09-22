package inflearn_section03;

import java.util.Scanner;
// 연속 부분 수열
public class Test04 {
	public int solution(int n, int m, int[] arr){
		int answer=0, sum=0, lt=0;
		for(int rt=0; rt<n; rt++){
			sum+=arr[rt];
			if(sum==m) answer++;
			while(sum>=m){
				sum-=arr[lt++];
				if(sum==m) answer++; 
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		Test04 t = new Test04();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr=new int[n];
		for(int i = 0 ; i < n ; i++){
			arr[i] = scan.nextInt();
		}
		System.out.print(t.solution(n, m, arr));
	}

}
