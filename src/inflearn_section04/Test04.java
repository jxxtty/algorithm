package inflearn_section04;

import java.util.HashMap;
import java.util.Scanner;

public class Test04 {
	public int solution(String sStr, String tStr) {
		int answer = 0;
		String[] sStrArr = sStr.split("");
		String[] tStrArr = tStr.split("");
		HashMap<String, Integer> tStrMap = new HashMap<>();
		HashMap<String, Integer> sStrMap = new HashMap<>();
		for(String s : tStrArr) { // T문자열 해시맵에 넣기
			tStrMap.put(s, tStrMap.getOrDefault(s, 0) + 1);
		}
		
		for(int i = 0 ; i < tStrArr.length-1 ; i++) { // S문자열 끊어서 해시맵에 넣기
			sStrMap.put(sStrArr[i], sStrMap.getOrDefault(sStrArr[i], 0) + 1);
		}
		
		int flag = 0;
		int lt = 0;
		int rt = tStrArr.length;
		for(int i = rt-1 ; i < sStrArr.length ; i++) {
			sStrMap.put(sStrArr[i], sStrMap.getOrDefault(sStrArr[i], 0)+1);
			flag = 0;
			for(String key : tStrMap.keySet()) {
				if(sStrMap.get(key) != tStrMap.get(key)) {
					flag++;
					break;
				}
			}
			if(flag == 0) answer++;
			
			sStrMap.put(sStrArr[lt], sStrMap.get(sStrArr[lt])-1);
			if(sStrMap.get(sStrArr[lt]) == 0) sStrMap.remove(sStrArr[lt]);
			lt++;
		}
		
		return answer;
	}
	

	public static void main(String[] args) {
		Test04 t = new Test04();
		Scanner scan = new Scanner(System.in);
		
		String sStr = scan.nextLine();
		String tStr = scan.nextLine();
		
		System.out.println(t.solution(sStr, tStr));
	}

}
