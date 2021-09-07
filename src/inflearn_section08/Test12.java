package inflearn_section08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Tomato {
	int tX;
	int tY;
	int day;
	
	public Tomato(int tX, int tY, int day) {
		this.tX = tX;
		this.tY = tY;
		this.day = day;
	}
}
public class Test12 {
	static int m,n;
	static int[][] tomato;
	static int days = 0;
	static int zeroTomato = 0;
	static Queue<Tomato> queue = new LinkedList<>();
	// Â÷·Ê´ë·Î [»ó ¿ì ÇÏ ÁÂ]
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	public void findDays() {
		
		while(!queue.isEmpty()) {
			Tomato to = queue.poll();
			for(int i = 0 ; i < 4 ; i++) {
				int nextX = to.tX + dx[i];
				int nextY = to.tY + dy[i];
				if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < m && tomato[nextX][nextY] == 0) {
					tomato[nextX][nextY] = 1;
					zeroTomato--;
					queue.offer(new Tomato(nextX, nextY, to.day+1));
				}
			}
			days = to.day+1;
		}
		
		days = zeroTomato == 0 ? days-1 : -1;
		
	}
	
	public static void main(String[] args) {
		Test12 t = new Test12();
		Scanner scan = new Scanner(System.in);
		m = scan.nextInt();
		n = scan.nextInt();
		tomato = new int[n][m];
		
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				tomato[i][j] = scan.nextInt();
				if(tomato[i][j] == 1) queue.offer(new Tomato(i,j, 0));
				else if(tomato[i][j] == 0) zeroTomato++;
			}
		}
		t.findDays();
		System.out.println(days);
	}

}
