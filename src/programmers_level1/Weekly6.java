package programmers_level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
// 위클리6주차_복서 정렬하기
class Player implements Comparable<Player> {
    int num; // 선수 번호
    int weight; // 몸무게
    int win; // 승률
    int heavy_win; // 자기보다 무거운 복서를 이긴 횟수
    
    public Player(int num, int weight, int win, int heavy_win){
        this.num = num;
        this.weight = weight;
        this.win = win;
        this.heavy_win = heavy_win;
    }
    
    public int compareTo(Player p){
        if(this.win == p.win && this.heavy_win == p.heavy_win && this.weight == p.weight)
            return this.num - p.num; // 번호가 작은 사람이 앞
        if(this.win == p.win && this.heavy_win == p.heavy_win)
            return p.weight - this.weight; // 몸무게가 무거운 사람이 앞
        if(this.win == p.win) 
            return p.heavy_win - this.heavy_win; // 자기보다 무거운 복서를 이긴 횟수가 높은 사람이 앞
        else
            return p.win - this.win; // 승률이 높은 사람이 앞
        
    }
}
public class Weekly6 {
	public int[] solution(int[] weights, String[] head2head) {
        int[] answer = new int[weights.length];
        List<Player> list = new ArrayList<>();
        
        for(int i = 0 ; i < weights.length ; i++){
            int weight = weights[i];
            int win = 0, heavy_win = 0, play = 0;
            double heavy = 0.0;
            String[] buffer = head2head[i].split("");
            for(int j = 0 ; j < buffer.length ; j++){
                if(buffer[j].equals("W")){
                	play++;
                    win++;
                    if(weight < weights[j]) heavy_win++;
                } else if(!buffer[j].equals("N")){
                    play++;
                }
            }
            if(play != 0){
                heavy = (double)win/play * 1000000;
                list.add(new Player(i+1, weight, (int)heavy, heavy_win));
            } else {
                list.add(new Player(i+1, weight, win, heavy_win));
            }
        }
        Collections.sort(list);
        int i = 0;
        for(Player p : list){
            // System.out.println(p.num + " " + p.weight + " " + p.win + " " + p.heavy_win);
            answer[i] = p.num;
            i++;
        }
        
        return answer;
    }
	
	public int[] solution2(int[] weights, String[] head2head) { // 람다 사용
        int len = weights.length;
        int[][] rank = new int[len][4];
        for(int i = 0; i < len; i++) {
            int w = weights[i], cnt = 0, win = 0, over = 0;
            for(int j = 0; j < len; j++) {
                char c = head2head[i].charAt(j);
                cnt += c == 'N' ? 0 : 1;
                win += c == 'W' ? 1 : 0;
                over += c == 'W' && weights[i] < weights[j] ? 1 : 0;
            }
            rank[i][0] = i + 1;
            rank[i][1] = (int)((double)win / cnt * 10000000);
            rank[i][2] = over;
            rank[i][3] = weights[i];
        }
        Arrays.sort(rank, (a, b) -> {
            if(a[1] != b[1]) return b[1] - a[1];
            if(a[2] != b[2]) return b[2] - a[2];
            if(a[3] != b[3]) return b[3] - a[3];
            return a[0] - b[0];
        });
        int[] answer = new int[len];
        for(int i = 0; i < len; i++) answer[i] = (int)rank[i][0];
        return answer;
    }
	
	public static void main(String[] args) {
		Weekly6 w = new Weekly6();
		Scanner scan = new Scanner(System.in);
		
		int size = scan.nextInt();
		int[] weights = new int[size];
		String[] head2head = new String[size];
		for(int i = 0 ; i < size ; i++) {
			weights[i] = scan.nextInt();
		}
		for(int i = 0 ; i < size ; i++) {
			head2head[i] = scan.nextLine();
		}
		
		System.out.println(w.solution(weights, head2head));
		System.out.println(w.solution2(weights, head2head));
	}
}
