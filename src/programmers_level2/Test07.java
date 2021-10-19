package programmers_level2;

import java.util.ArrayList;
import java.util.List;

// ���/���� �ڵ�(~2018)_���� �����ձ�
public class Test07 {
	public int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> checkList = new ArrayList<>();
        
        String beforeWord = words[0]; // ó�� ���ϴ� ����� ������ ���
        checkList.add(beforeWord);
        int player = 0;
        
        for(int i = 1 ; i < words.length ; i++){
            String word = words[i];
            if(checkList.indexOf(word) != -1){ // �̹� ���� �ܾ ���ϸ� ����
                player = i;
                break;
            }
            
            
            char before = beforeWord.charAt(beforeWord.length()-1);
            char now = word.charAt(0);
            if(before != now){ // �����ձ⿡ ���յ��� ���� �ܾ ���ϸ� ����
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
