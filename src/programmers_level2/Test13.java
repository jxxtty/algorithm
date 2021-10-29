package programmers_level2;
// 월간코드챌린지 시즌1_삼각달팽이
public class Test13 {
	public int[] solution(int n) {
        int[] answer = new int[(n*(n+1))/2];
        int[][] buffer = new int[n][n];
        
        
        int x = -1, y = 0;
        int num = 1;
        
        for(int i = 0 ; i < n ; i++){
            for(int j = i ; j < n ; j++){
                if (i % 3 == 0) { // 아래
                    x++;
                } else if (i % 3 == 1) { // 오른쪽
                    y++;
                } else if (i % 3 == 2) { // 대각선
                    x--;
                    y--;
                }
                buffer[x][y] = num;
                num++;
            }
        }
        
        int idx = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(buffer[i][j] == 0) break;
                answer[idx] = buffer[i][j];
                idx++;
            }
        }
        return answer;
    }

	public static void main(String[] args) {
		Test13 t = new Test13();
		
		int n = 4;
		for(int i : t.solution(n)) {
			System.out.print(i + " ");
		} // 1 2 9 3 10 8 4 5 6 7 
		System.out.println();
		
		int n2 = 5;
		for(int i : t.solution(n2)) {
			System.out.print(i + " ");
		} // 1 2 12 3 13 11 4 14 15 10 5 6 7 8 9 
		System.out.println();
		
		int n3 = 6;
		for(int i : t.solution(n3)) {
			System.out.print(i + " ");
		} // 1 2 15 3 16 14 4 17 21 13 5 18 19 20 12 6 7 8 9 10 11 
		System.out.println();
	}

}
