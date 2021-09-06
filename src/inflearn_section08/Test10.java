package inflearn_section08;

import java.util.Scanner;

// 7*7 격자판 미로탐색_DFS이용
public class Test10 {
	static int[][] maze = new int[8][8];
	static int answer = 0;
	// 차례대로 [상 우 하 좌]
	int[] dx = {-1, 0, 1, 0};
	int[] dy = {0, 1, 0, -1};
	public void findRoute(int startX, int startY) {
		if(startX == 7 && startY == 7) {
			answer++;
		} else {
			for(int i = 0 ; i < 4 ; i++) {
				int positionX = startX + dx[i];
				int positionY = startY + dy[i];
				// maze배열 범위를 넘지않게 한다
				if(positionX >= 1 && positionX <= 7 && positionY >= 1 && positionY <= 7) {
					if(maze[positionX][positionY] == 0) {
						maze[positionX][positionY] = 1;
						findRoute(positionX, positionY);
						maze[positionX][positionY] = 0;
					}
				}
			}
		}
	}
	
	public static void main(String[] args) {
		Test10 t = new Test10();
		Scanner scan = new Scanner(System.in);
		
		for(int i = 1 ; i < 8 ; i++) {
			for(int j = 1 ; j < 8 ; j++) {
				maze[i][j] = scan.nextInt();
			}
		}
		maze[1][1] = 1;
		t.findRoute(1, 1);
		System.out.println(answer);
	}

}
