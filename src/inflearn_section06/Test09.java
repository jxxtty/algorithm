package inflearn_section06;

import java.util.Arrays;
import java.util.Scanner;

// 결정알고리즘 (lt와 rt사이에는 반드시 답이 있다)
public class Test09 {
	public int count(int[] arr, int capacity){
		int cnt=1, sum=0;
		for(int x : arr){
			if(sum+x>capacity){
				cnt++;
				sum=x;
			}
			else sum+=x;
		}
		return cnt;
	}
	
	public int solution(int n, int m, int[] arr){
		int answer=0;
		int lt=Arrays.stream(arr).max().getAsInt();
		int rt=Arrays.stream(arr).sum();
		while(lt<=rt){
			int mid=(lt+rt)/2;
			if(count(arr, mid)<=m){
				answer=mid;
				rt=mid-1;
			}
			else lt=mid+1;
		}
		return answer;
	}
	
	public static void main(String[] args) {
		Test09 t = new Test09();
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) arr[i] = scan.nextInt();
		System.out.println(t.solution(n, m, arr));
	}

}
