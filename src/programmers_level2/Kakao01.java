package programmers_level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 2019 카카오 블라인드 채용_오픈채팅방
public class Kakao01 {
	public String[] solution(String[] record) {
        String[] answer = {};
        Map<String, String> userMap = new HashMap<>();
        List<String> answerList = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        
        for(String s : record){
            String[] buffer = s.split(" ");
            if(!buffer[0].equals("Leave")){// Enter, Change
                userMap.put(buffer[1],buffer[2]);
            }
        }
        
        for(String s : record){
            String[] buffer = s.split(" ");
            if(buffer[0].equals("Enter")){
                sb.append(userMap.get(buffer[1]));
                sb.append("님이 들어왔습니다.");
                answerList.add(sb.toString());
                sb.setLength(0); // sb초기화
            } else if (buffer[0].equals("Leave")){
                sb.append(userMap.get(buffer[1]));
                sb.append("님이 나갔습니다.");
                answerList.add(sb.toString());
                sb.setLength(0); // sb초기화
            }
        }
        answer = answerList.toArray(new String[answerList.size()]);
        
        return answer;
    }
	
	public static void main(String[] args) {
		Kakao01 k = new Kakao01();
		
		String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234"
				, "Enter uid1234 Prodo","Change uid4567 Ryan"};
		
		for(String str : k.solution(record)) {
			System.out.println(str);
		}
		
	
	}

}
