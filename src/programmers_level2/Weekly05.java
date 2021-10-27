package programmers_level2;

public class Weekly05 {
	public int solution(String word) {
        int answer = 0;
        
        int range = 781;
        char[] alpha = {'A', 'E', 'I', 'O', 'U'};
        for(int i = 0 ; i < word.length() ; i++){
            for(int j = 0 ; j < alpha.length ; j++){
                if(alpha[j] == word.charAt(i))
                    answer += 1 + (j * range);
            }
            range = (range-1)/alpha.length;
        }
        
        return answer;
    }
	
	public int solution2(String word) {
        int answer = 0, per = 3905;
        for(String s : word.split("")) answer += "AEIOU".indexOf(s) * (per /= 5) + 1;
        return answer;
    }
	
	public static void main(String[] args) {
		Weekly05 w = new Weekly05();
		
		String word = "AAAAE";
		System.out.println(w.solution(word)); // 6
		System.out.println(w.solution2(word)); // 6
		
		String word2 = "AAAE";
		System.out.println(w.solution(word2)); // 10
		System.out.println(w.solution2(word2)); // 10
		
		String word3 = "I";
		System.out.println(w.solution(word3)); // 1563
		System.out.println(w.solution2(word3)); // 1563
		
		String word4 = "EIO";
		System.out.println(w.solution(word4)); // 1189
		System.out.println(w.solution2(word4)); // 1189
	}

}
