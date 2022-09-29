package programmers_level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
// 썸머/윈터 코딩(~2018)_스킬트리
public class Test06 {
	public int solution(String skill, String[] skill_trees) {
        int answer = 0;
        List<String> skillSeq = Arrays.asList(skill.split(""));
        List<String> availSkillSeq = new ArrayList<>(); // 선행스킬의 가능한 모든 경우
        StringBuilder sb = new StringBuilder();
        
        for(int i = skill.length() ; i >= 1 ; i--){
            availSkillSeq.add(skill.substring(0,i));
        }
        
        for(String sk : skill_trees){
            String[] skStr = sk.split("");
            for(int i = 0 ; i < skStr.length ; i++){
                if(skillSeq.indexOf(skStr[i]) != -1){
                    sb.append(skStr[i]);
                }
            }
            if(sb.toString().length() == 0) answer++; // 선행스킬관련 스킬이 하나도 포함되지 않은경우 -> 무조건 수행가능
            if(availSkillSeq.indexOf(sb.toString()) != -1) answer++;
            sb.setLength(0);
        }
        
        return answer;
    }
	
	public int solution2(String skill, String[] skill_trees) {
	    int answer = 0;
	    ArrayList<String> skillTrees = new ArrayList<String>(Arrays.asList(skill_trees));
	    Iterator<String> it = skillTrees.iterator();

	    while (it.hasNext()) {
	        if (skill.indexOf(it.next().replaceAll("[^" + skill + "]", "")) != 0) {
	            it.remove();
	        }
	    }
	    answer = skillTrees.size();
	    return answer;
	}
	
	public static void main(String[] args) {
		Test06 t = new Test06();
		
		String skill = "CBD";
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		System.out.println(t.solution(skill, skill_trees)); // 2
		
		String skill2 = "CBDK";
		String[] skill_trees2 = {"CB", "CXYB", "BD", "AECD", "ABC", "AEX", "CDB", "CBKD", "IJCB", "LMDK"};
		System.out.println(t.solution(skill2, skill_trees2)); // 4
		
		String skill3 = "REA";
		String[] skill_trees3 = {"OPS", "SQW"};
		System.out.println(t.solution(skill3, skill_trees3)); // 2
		
	}

}
