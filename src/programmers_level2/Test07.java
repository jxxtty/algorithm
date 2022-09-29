package programmers_level2;

import java.util.ArrayList;
import java.util.List;

// 썸머/윈터 코딩(~2018)_영어 끝말잇기
public class Test07 {
	public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> checkList = new ArrayList<>();
        
        String beforeWord = words[0]; // 처음 말하는 사람은 무조건 통과
        checkList.add(beforeWord);
        int player = 0;
        
        for(int i = 1 ; i < words.length ; i++){
            String word = words[i];
            if(checkList.indexOf(word) != -1){ // 이미 나온 단어를 말하면 실패
                player = i;
                break;
            }
            
            
            char before = beforeWord.charAt(beforeWord.length()-1);
            char now = word.charAt(0);
            if(before != now){ // 끝말잇기에 부합되지 않은 단어를 말하면 실패
                player = i;
                break;
            }
            
            checkList.add(word);
            beforeWord = word;
        }
        
        if(player == 0) return answer;
        else {
            answer[0] = (player%n) + 1;
            answer[1] = (player/n) + 1;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		Test07 t = new Test07();
		
		int n = 3;
		String[] words = {"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"};
		for(int i : t.solution(n, words)) {
			System.out.print(i + " ");
		} // 3 3
		System.out.println();
		
		int n2 = 5;
		String[] words2 = {"hello", "observe", "effect", "take", "either", "recognize",
				"encourage", "ensure", "establish", "hang", "gather", "refer", 
				"reference", "estimate", "executive"};
		for(int i : t.solution(n2, words2)) {
			System.out.print(i + " ");
		} // 0 0
		System.out.println();
		
		int n3 = 2;
		String[] words3 = {"hello", "one", "even", "never", "now", "world", "draw"};
		for(int i : t.solution(n3, words3)) {
			System.out.print(i + " ");
		} // 1 3
		System.out.println();
	}

}
