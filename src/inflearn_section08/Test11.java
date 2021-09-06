package inflearn_section08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//7*7 격자판 미로탐색_최단거리 찾기_BFS
class Position {
	int x;
	int y;
	
	public Position(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Test11 {
	static int[][] maze = new int[8][8];
	static int[][] distance = new int[8][8];
	
	// 차례대로 [상 우 하 좌]
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	public void findShortRoute() {
		Queue<Position> queue = new LinkedList<>();
		queue.offer(new Position(1,1));
		
		while(!queue.isEmpty()) {
			Position p = queue.poll();
			for(int i = 0 ; i < 4 ; i++) {
				int nextX = p.x + dx[i];
				int nextY = p.y + dy[i];
				if(nextX >= 1 && nextX <= 7 && nextY >= 1 && nextY <= 7 && maze[nextX][nextY] == 0) {
					maze[nextX][nextY] = 1;
					queue.offer(new Position(nextX, nextY));
					distance[nextX][nextY] = distance[p.x][p.y] + 1;
				}
			}
		}
		
	}
	
	public static void main(String[] args) {
		Test11 t = new Test11();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1 ; i < 8 ; i++) {
			for(int j = 1 ; j < 8 ; j++) {
				maze[i][j] = scan.nextInt();
			}
		}
		maze[1][1] = 1;
		t.findShortRoute();
		if(distance[7][7] == 0) System.out.println("-1");
		else System.out.println(distance[7][7]);
	}

}
