package programmers_level2;
// 연습문제_JadenCase 문자열 만들기
public class Test04 {
	public String solution(String s) {
        String answer = "";
        s = s.toLowerCase();
        
        char[] strArr = s.toCharArray();
        boolean flag = false;
        if(Character.isAlphabetic(strArr[0])) flag = true; // ù���ڰ� ���ĺ��̶�� true�� ����
        
        for(int i = 0 ; i < strArr.length ; i++){
            char tmp = strArr[i];
            if(tmp == ' '){
                flag = true;
                continue;
            }
            
            if(flag && Character.isAlphabetic(tmp)){
                strArr[i] = Character.toUpperCase(tmp);
                flag = false;
            }
        }
        answer = new String(strArr);
        return answer;
    }
	
	public static void main(String[] args) {
		Test04 t = new Test04();
		
		String s = "3people unFollowed me";
		System.out.println(t.solution(s)); // 3people Unfollowed Me
		
		String s2 = "for the last week";
		System.out.println(t.solution(s2)); // For The Last Week
	}

}
