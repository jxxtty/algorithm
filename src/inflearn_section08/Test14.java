package inflearn_section08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Pointer {
	int pX;
	int pY;
	
	public Pointer(int pX, int pY) {
		this.pX = pX;
		this.pY = pY;
	}
}
// 섬나라 아일랜드_BFS
public class Test14 {
	static int n;
	static int[][] map;
	static int island = 0;
	static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
	static Queue<Pointer> queue = new LinkedList<>();
	public void BFS() {
		while(!queue.isEmpty()) {
			Pointer p = queue.poll();
			for(int i = 0 ; i < 8 ; i++) {
				int nextX = p.pX + dx[i];
				int nextY = p.pY + dy[i];
				if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && map[nextX][nextY] == 1) {
					map[nextX][nextY] = 0;
					queue.offer(new Pointer(nextX, nextY));
				}
			}
		}
	}
	
	public void findIsland() {
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(map[i][j] == 1) {
					queue.offer(new Pointer(i,j));
					island++;
					map[i][j] = 0;
					BFS();
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test14 t = new Test14();
		Scanner scan = new Scanner(System.in);
		n = scan.nextInt();
		map = new int[n][n];
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				map[i][j] = scan.nextInt();
			}
		}
		t.findIsland();
		System.out.println(island);
	}

}
