package programmers_level2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

// 2021 카카오 블라인드 채용_순위 검색
class Candidate{
	String language;
	String position;
	String career;
	String soulFood;
	int score;
	
	public Candidate(String language, String position, String career, String soulFood, int score) {
		this.language = language;
		this.position = position;
		this.career = career;
		this.soulFood = soulFood;
		this.score = score;
	}

	@Override
	public String toString() {
		return "Candidate [language=" + language + ", position=" + position + ", career=" + career + ", soulFood="
				+ soulFood + ", score=" + score + "]";
	}

}

public class Kakao02 {
	
	public List<Candidate> checkScore(List<Candidate> list, int score){
		return list.stream().filter(c -> c.score >= score).collect(Collectors.toList());
	}
	
	public List<Candidate> checkLanguage(List<Candidate> list, String lan){
		if(lan.equals("-")) return list;
		else return list.stream().filter(c -> c.language.equals(lan)).collect(Collectors.toList());
	}
	
	public List<Candidate> checkPosition(List<Candidate> list, String posi){
		if(posi.equals("-")) return list;
		else return list.stream().filter(c -> c.position.equals(posi)).collect(Collectors.toList());
	}
	
	public List<Candidate> checkCareer(List<Candidate> list, String car){
		if(car.equals("-")) return list;
		else return list.stream().filter(c -> c.career.equals(car)).collect(Collectors.toList());
	}
	
	public List<Candidate> checkSoulFood(List<Candidate> list, String sf){
		if(sf.equals("-")) return list;
		else return list.stream().filter(c -> c.soulFood.equals(sf)).collect(Collectors.toList());
	}
	
	public int[] solution(String[] info, String[] query) {
        int[] answer = new int[query.length];
        List<Candidate> list = new ArrayList<>();
        for(String s : info) {
			String[] buffer = s.split(" ");
			list.add(new Candidate(buffer[0], buffer[1], buffer[2], buffer[3], Integer.parseInt(buffer[4])));
		}
        
        for(int i = 0 ; i < query.length ; i++){
            String[] buffer = query[i].replace(" and ", " ").split(" ");
            
            List<Candidate> result =
                checkSoulFood(
                		checkCareer(
                				checkPosition(
                						checkLanguage(
                								checkScore(list, Integer.parseInt(buffer[4])), buffer[0]
                						)
                				, buffer[1])
                		, buffer[2])
                , buffer[3]);
            answer[i] = result.size();
        }
        
        return answer;
    }

	public static void main(String[] args) {
		Kakao02 k = new Kakao02();
		
		String[] info = {
				"java backend junior pizza 150",
				"python frontend senior chicken 210",
				"python frontend senior chicken 150",
				"cpp backend senior pizza 260",
				"java backend junior chicken 80",
				"python backend senior chicken 50"
		};
		
		String[] query = {
				"java and backend and junior and pizza 100",
				"python and frontend and senior and chicken 200",
				"cpp and - and senior and pizza 250",
				"- and backend and senior and - 150",
				"- and - and - and chicken 100",
				"- and - and - and - 150"
		};
		
		for(int i : k.solution(info, query)) {
			System.out.print(i + " ");
		}// 1 1 1 1 2 4
		
		
		
	}

}
