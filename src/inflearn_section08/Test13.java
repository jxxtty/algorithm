package inflearn_section08;

import java.util.Scanner;

// 섬나라 아일랜드_DFS
public class Test13 {
	static int n;
	static int[][] map;
	static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
	static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
	static int island = 0;
	public void DFS(int startX, int startY) {
		for(int i = 0 ; i < 8 ; i++) {
			int nextX = startX + dx[i];
			int nextY = startY + dy[i];
			if(nextX >= 0 && nextX < n && nextY >= 0 && nextY < n && map[nextX][nextY] == 1) {
				map[nextX][nextY] = 0;
				DFS(nextX, nextY);
			}
		}
	}
	
	public void findIsland() {
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < n ; j++) {
				if(map[i][j] == 1) {
					island++;
					map[i][j] = 0;
					DFS(i,j);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test13 t = new Test13();
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
