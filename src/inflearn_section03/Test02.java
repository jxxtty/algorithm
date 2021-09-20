package inflearn_section03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
// 두 배열의 공통원소를 추출하여 오름차순으로 출력
public class Test02 {
	public List<Integer> solution(int n, int m, int[] a, int[] b){
		List<Integer> answer = new ArrayList<>();
		Arrays.sort(a);
		Arrays.sort(b);
		int p1=0, p2=0;
		while(p1<n && p2<m){
			if(a[p1]==b[p2]){
				answer.add(a[p1++]);
				p2++;
			}
			else if(a[p1]<b[p2]) p1++;
			else p2++;
		}
		return answer;
	}

	public static void main(String[] args) {
		Test02 t = new Test02();
		Scanner scan = new Scanner(System.in);
		
		int n=scan.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=scan.nextInt();
		}
		int m=scan.nextInt();
		int[] b=new int[m];
		for(int i=0; i<m; i++){
			b[i]=scan.nextInt();
		}
		for(int x : t.solution(n, m, a, b)) System.out.print(x+" ");
	}

}
