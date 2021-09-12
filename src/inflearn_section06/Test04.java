package inflearn_section06;

import java.util.Scanner;

public class Test04 {
	public void solution(int cSize, int num, int[] order) {
		int[] cache = new int[cSize];
		for(int i = 0 ; i < num ; i++) {
			int point = order[i];
			int idx = -1;
			for(int j = 0 ; j < cSize ; j++) {
				if(cache[j] == point) {
					idx = j; // 캐시에 이미 있으면
					break;
				}
			}
			if(idx > 0) { // 같은 값이 있다.
				for(int k = idx-1 ; k >= 0 ; k--) { // 같은 값의 현재 위치에서부터 앞으로 이동
					int tmp = cache[k];
					cache[k] = point;
					cache[k+1] = tmp;
				}
			} else { // 같은 값이 없다.
				for(int k = cSize-2 ; k >= 0 ; k--) { // 0이 아닐때만 뒤로 한칸씩 밀어
					int tmp = cache[k];
					if(tmp != 0) {
						cache[k+1] = tmp;
					}
				}
				cache[0] = point; // 그러고 맨 앞에 현재 작업을 넣어
			}
			
		}
		for(int i : cache) {
			System.out.print(i + " ");
		}
	}
	
	public static void main(String[] args) {
		Test04 t = new Test04();
		Scanner scan = new Scanner(System.in); 
		
		int cSize = scan.nextInt();
		int num = scan.nextInt();
		int[] order = new int[num];
		for(int i = 0 ; i < num ; i++) {
			order[i] = scan.nextInt();
		}
		t.solution(cSize, num, order);
	}

}
