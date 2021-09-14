package inflearn_section06;

import java.util.Arrays;
import java.util.Scanner;

// ���� �˰���
public class Test10 {
	public int count(int[] home, int distance) {
		int answer = 1;
		int endPoint = home[0]; // ���������� ���� �� ��ġ
		for(int i = 1 ; i < home.length ; i++) {
			if(home[i] - endPoint >= distance) {
				answer++;
				endPoint = home[i];
			}
		}
		
		return answer;
	}
	
	public int solution(int count, int horse, int[] home) {
		int answer = 0;
		Arrays.sort(home);
		
		int lt = 1;
		int rt = home[count-1];
		while(lt <= rt) {
			int mid = (lt+rt)/2;
			if(count(home, mid) >= horse) { // ��ȿ�� ���� ������ ���� �� ������ ũ�ų�����.
				answer = mid;
				lt = mid+1;
			} else {
				rt = mid-1;
			}
		}
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		Test10 t = new Test10();
		Scanner scan = new Scanner(System.in);
		
		int count = scan.nextInt();
		int horse = scan.nextInt();
		int[] home = new int[count];
		for(int i = 0 ; i < count ; i++) {
			home[i] = scan.nextInt();
		}
		
		System.out.println(t.solution(count, horse, home));
	}

}
