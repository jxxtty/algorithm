package etc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Nhn_pretest_1 {
	static int[] dx = {-1, 0, 1, 0}; // 상 우 하 좌
	static int[] dy = {0, 1, 0, -1}; // 상 우 하 좌
	static int square = 0; // 영역 개수
	static int sizeM;
	static int squareSize = 1; // 영역 크기
	public void findSquare(int startX, int startY, int[][] matrix){
		for(int i = 0 ; i < dx.length ; i++){
			int nextX = startX + dx[i];
			int nextY = startY + dy[i];
			if(nextX >= 0 && nextX < sizeM && nextY >= 0 && nextY < sizeM && matrix[nextX][nextY] == 1){
				matrix[nextX][nextY] = 0;
				//findSquare(nextX, nextY, size+1);
				squareSize++;
				findSquare(nextX, nextY, matrix);
			}
		}
		
	}
	
	public void solution(int sizeOfMatrix, int[][] matrix) {
		List<Integer> sizeList = new ArrayList<>();
		sizeM = sizeOfMatrix;
		for(int i = 0 ; i < sizeOfMatrix ; i++){
			for(int j = 0 ; j < sizeOfMatrix ; j++){
				if(matrix[i][j] == 1){
					square++;
					matrix[i][j] = 0;
					findSquare(i,j, matrix);
					sizeList.add(squareSize);
					squareSize = 1;
				}
			}
		}
		
		System.out.println(square);
		Collections.sort(sizeList);
		for(int i : sizeList){
			System.out.print(i + " ");
		}
		square = 0; // 재호출용
	}
	
	public static void main(String[] args) {
		Nhn_pretest_1 n = new Nhn_pretest_1();
		
		int sizeOfMatrix = 6;
		int[][] matrix = {
				{0, 1, 1, 0, 0, 0},
				{0, 1, 1, 0, 1, 1},
				{0, 0, 0, 0, 1, 1},
				{0, 0, 0, 0, 1, 1},
				{1, 1, 0, 0, 1, 0},
				{1, 1, 1, 0, 0, 0}
		};
		n.solution(sizeOfMatrix, matrix);// 3, 4 5 7
		
		System.out.println();
		System.out.println("----------");
		
		int sizeOfMatrix2 = 4;
		int[][] matrix2 = {
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0},
				{0, 0, 0, 0}
		};
		
		n.solution(sizeOfMatrix2, matrix2); // 0
	}

}
