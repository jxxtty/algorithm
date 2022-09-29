package programmers_level2;
// 연습문제_가장 큰 정사각형 찾기
public class Test09 {
	public int solution(int [][]board) {
        int garo = board[0].length;
        int sero = board.length;
        int answer = 0;
        
        if(garo == 1 && sero == 1){
            return board[0][0] == 1 ? 1 : 0;
        }
        
        for(int i = 1 ; i < sero ; i++){
            for(int j = 1 ; j < garo ; j++){
                if(board[i][j] != 0){
                    int getMin = Math.min(Math.min(board[i-1][j-1], board[i-1][j]), board[i][j-1]);
                    board[i][j] = getMin + 1;
                    if(answer < board[i][j]) answer = board[i][j];
                }
            }
        }
        
       
        return answer*answer;
    }
	
	public static void main(String[] args) {
		Test09 t = new Test09();
		
		int[][] board = {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}};
		System.out.println(t.solution(board)); // 9
		
		int[][] board2 = {{0,0,1,1}, {1,1,1,1}};
		System.out.println(t.solution(board2)); // 4

	}

}
